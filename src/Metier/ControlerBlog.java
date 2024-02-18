package Metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import DB_Connection.Connexion;
// cette classe contient des methodes qu jouent l'intermediaire entre mon app et la BD
public class ControlerBlog {
	
	private static final String SELECT_DOMAINE_BY_LIBELLE = "SELECT * FROM domaine WHERE Libelle_Domaine = ?";
	private static final String SELECT_IMAGESS_BY_IDBLOG = "SELECT * FROM image WHERE Id_Blog = ?";
	private static final String SELECT_BlOG_BY_blogger_id  = "SELECT b.Id_Blog , b.Titre , b.Contenu_Texte , b.Date_Publication , d.Libelle_Domaine " +
            "FROM blog b " +
            "JOIN domaine d ON b.domaine_blog = d.Id_Domaine " +
            "WHERE b.blogger_id = ?";
	private static final String SELECT_BLOG = "SELECT b.Id_Blog , b.Titre , b.Contenu_Texte , b.Date_Publication , d.Libelle_Domaine , blg.Login " +
	        "FROM blog b " +
	        "JOIN domaine d ON b.domaine_blog = d.Id_Domaine " +
	        "JOIN blogger blg ON b.blogger_id = blg.Code_Blogger";
	private static final String SELECT_BLOG_WTHOUT_MyBLOGS = "SELECT b.Id_Blog , b.Titre , b.Contenu_Texte , b.Date_Publication , d.Libelle_Domaine , blg.Login " +
	        "FROM blog b " +
	        "JOIN domaine d ON b.domaine_blog = d.Id_Domaine " +
	        "JOIN blogger blg ON b.blogger_id = blg.Code_Blogger "+
	        "WHERE blogger_id <> ?";
	private static final String INSERT_IMAGE = "INSERT INTO image (Image_Path, Description, Id_Blog ) VALUES (?, ?, ?)";
	private static final String UPDATE_IMAGE = "UPDATE image SET Image_Path = ? WHERE Image_Path = ?";
	private static final String INSERT_BLOG = "INSERT INTO blog (Id_Blog, Titre, Contenu_Texte, Date_Publication,domaine_blog,blogger_id ) VALUES (?, ?, ?, ?, ?, ?)";
	private static final String UPDATE_BLOG = "UPDATE blog SET Titre = ?, Contenu_Texte = ?, domaine_blog = ? WHERE Id_Blog = ?";
	private static final String INSERT_COMMENT = "INSERT INTO commentaire (Content, Code_Blogger, Id_Blog) VALUES (?, ?, ?)";
	private static final String SELECT_COMMENT = "SELECT c.Content, b.Login FROM commentaire c JOIN Blogger b ON c.Code_Blogger = b.Code_Blogger WHERE c.Id_Blog = ?";
	
	//Trouver le domaine qui le libellé passé en parametres
	public Domaine getDomaineByLibelle(String libelle) {
        Domaine domaine = null;

        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DOMAINE_BY_LIBELLE)) {
            preparedStatement.setString(1, libelle);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                domaine = new Domaine(
                		 resultSet.getLong("Id_Domaine"),
                        resultSet.getString("Libelle_Domaine")
                );
            }
            return domaine;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
	
	//Ajouter une image à la table Image de la base de donnée
	public void addImageBlog(ImageB img) {

		Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_IMAGE)) {
	            preparedStatement.setString(1, img.getChemin());
	            preparedStatement.setString(2, img.getDescription());
	            preparedStatement.setString(3, img.getBlog().getId_blog());

	            preparedStatement.executeUpdate();
	       
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
	}
	
	//Modifier le chemin d'une image avec un nouvel chemin
	public boolean updateImagePath(ImageB im, String newPath) {
        boolean success = false;

        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement statement = connection.prepareStatement(UPDATE_IMAGE)) {
                statement.setString(1, newPath);
                statement.setString(2, im.getChemin());
                int rowsAffected = statement.executeUpdate();

                // Vérifier si la mise à jour a réussi
                if (rowsAffected > 0) {
                    success = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }
	
	//Trouver tous les blogs à part les blogs du blogger passé en parametre
	public List<Blog> getBlogsWithoutMine(Blogger blogger) {
		List<Blog> blogs = new ArrayList<Blog>();
		Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement statement = connection.prepareStatement(SELECT_BLOG_WTHOUT_MyBLOGS)) {
            	statement.setLong(1, blogger.getId_Blogger());
            	try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                    	String blogId = resultSet.getString("Id_Blog");
                        String title = resultSet.getString("Titre");
                        String content = resultSet.getString("Contenu_Texte");
                        Timestamp date = resultSet.getTimestamp("Date_Publication");
                        String domainName = resultSet.getString("Libelle_Domaine");
                        String Username = resultSet.getString("Login");
                        Domaine domaine = new Domaine(domainName);
                        Controler CTRL=new Controler();
                        Blog blog = new Blog(blogId, title, content, date,CTRL.getBloggerByUsername(Username) ,domaine);
                        blogs.add(blog);
                        //String id,String titre,String Texte,Timestamp dat,Blogger Auteur,Domaine domaine
                    }
                  }
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }
	
	//Retouner tous les blogs
	public List<Blog> getAllBlogs() {
		List<Blog> blogs = new ArrayList<Blog>();
		Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement statement = connection.prepareStatement(SELECT_BLOG)) {
            	try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                    	String blogId = resultSet.getString("Id_Blog");
                        String title = resultSet.getString("Titre");
                        String content = resultSet.getString("Contenu_Texte");
                        Timestamp date = resultSet.getTimestamp("Date_Publication");
                        String domainName = resultSet.getString("Libelle_Domaine");
                        String Username = resultSet.getString("Login");
                        Domaine domaine = new Domaine(domainName);
                        Controler CTRL=new Controler();
                        Blog blog = new Blog(blogId, title, content, date,CTRL.getBloggerByUsername(Username) ,domaine);
                        blogs.add(blog);
                        //String id,String titre,String Texte,Timestamp dat,Blogger Auteur,Domaine domaine
                    }
                  }
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }
	
	//Ajouter un blog 
	public void addBlog(Blog b) {

		Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
        		
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BLOG)) {
	            preparedStatement.setString(1, b.getId_blog());
	            preparedStatement.setString(2, b.getTitre());
	            preparedStatement.setString(3, b.getTexte());
	            preparedStatement.setTimestamp(4, b.getTimestamp());
	            preparedStatement.setLong(5, b.getDomaine().getId_domaine());
	            preparedStatement.setLong(6, b.getAuteur().getId_Blogger());
	            preparedStatement.executeUpdate();
	       
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
	}
	
	//Modifier Blog d'un bloggeur
	public boolean updateBlog(Blog blog, String newTitle, String newText, long l) {
        boolean success = false;

        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement statement = connection.prepareStatement(UPDATE_BLOG)) {
                statement.setString(1, newTitle);
                statement.setString(2, newText);
                statement.setLong(3, l);
                statement.setString(4, blog.getId_blog());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }
	
	//Trouver tous Images d'un blog
	public List<ImageB> ImageBlog(Blog B)
	{
		List<ImageB> ListImage = new ArrayList<ImageB>();
    	Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_IMAGESS_BY_IDBLOG)) {
        	preparedStatement.setString(1, B.getId_blog());
        	ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
            	ImageB img = new ImageB(
                        resultSet.getLong("Id_Img"),
                        resultSet.getString("Image_Path"),
                        resultSet.getString("Description")
                );
            	ListImage.add(img);
            }
            return ListImage;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
	}
	
	//Trouver les blogs du blogger passé en parametre
	public List<Blog> getBlogsByBloggerId(Blogger BB) {
        List<Blog> blogs = new ArrayList<>();

        // Connexion à la base de données (assurez-vous d'ajuster les détails de connexion)
        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection()) {
            try (PreparedStatement statement = connection.prepareStatement(SELECT_BlOG_BY_blogger_id)) {
                statement.setLong(1, BB.getId_Blogger());
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String blogId = resultSet.getString("Id_Blog");
                        String title = resultSet.getString("Titre");
                        String content = resultSet.getString("Contenu_Texte");
                        Timestamp date = resultSet.getTimestamp("Date_Publication");
                        String domainName = resultSet.getString("Libelle_Domaine");

                        Domaine domaine = new Domaine(domainName);

                        Blog blog = new Blog(blogId, title, content, date,BB, domaine);
                        blogs.add(blog);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return blogs;
    }
	
	//Ajouter un commentaire
	public void addComment(Blogger blogger, Blog blog , String commentText) {
		
        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COMMENT)) {
                preparedStatement.setString(1, commentText);
                preparedStatement.setLong(2, blogger.getId_Blogger());
                preparedStatement.setString(3, blog.getId_blog());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	//La liste des commentaires d'un blogg
	public List<Commentaire> getComments(Blog blog) {
		List<Commentaire> comm = new ArrayList<Commentaire>();
		Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();) {
            try (PreparedStatement statement = connection.prepareStatement(SELECT_COMMENT)) {
            	statement.setString(1, blog.getId_blog());
            	try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                    	String content = resultSet.getString("Content");
                        String Username = resultSet.getString("Login");

                        Controler CTRL=new Controler();
                        Commentaire C=new Commentaire(content,blog,CTRL.getBloggerByUsername(Username));
                        System.out.println();
                        comm.add(C);
                        //c.Content, b.Login
                    }
                  }
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comm;
    }
	
	

	

}
