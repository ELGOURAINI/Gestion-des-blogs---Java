package Metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB_Connection.Connexion;
//cest la classe qui contient tous les methodes necessires pour les informations d'un blogger
public class Controler {
	
	private static final String SELECT_BLOGGER_BY_USERNAME = "SELECT * FROM Blogger WHERE Login = ? and Password = ?";
	private static final String SELECT_BLOGGER_BY_LOGIN = "SELECT * FROM Blogger WHERE Login = ?";
    private static final String INSERT_BLOGGER = "INSERT INTO Blogger (Nom, Prenom, Username, Login, Password) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_BLOGGER = "UPDATE Blogger SET Nom = ?, Prenom = ?, Username = ?, Login = ?, Password = ? WHERE Login = ?";
    private static final String SELECT_DOMAINE = "SELECT * FROM domaine";
    

    //c'est une methode qui cherche un blogger par son login ou email
    public Blogger getBloggerByUsername(String Login) {
    	Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BLOGGER_BY_LOGIN)) {
            preparedStatement.setString(1, Login);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
            	Blogger b=new Blogger(resultSet.getString("Nom"),
                        resultSet.getString("Prenom"),
                        resultSet.getString("Username"),
                        resultSet.getString("Login"),
                        resultSet.getString("Password"));
            	b.setId_Blogger(resultSet.getLong("Code_Blogger"));
                return b;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    //Retourne la liste de tous les domaines que j'ai
    public List<Domaine> getDomaine() {
    	List<Domaine> domainesList = new ArrayList<Domaine>();
    	Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DOMAINE)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
            	Domaine domaine = new Domaine(
                        resultSet.getString("Libelle_Domaine")
                );
                domainesList.add(domaine);
            }
            return domainesList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    //Chercher un blogger par son email et son mot de passe
    public Blogger getBloggerByLogin(String Login,String Password) {
    	Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BLOGGER_BY_USERNAME)) {
            preparedStatement.setString(1, Login);
            preparedStatement.setString(2, Password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
            	Blogger b=new Blogger(resultSet.getString("Nom"),
                        resultSet.getString("Prenom"),
                        resultSet.getString("Username"),
                        resultSet.getString("Login"),
                        resultSet.getString("Password"));
            	b.setId_Blogger(resultSet.getLong("Code_Blogger"));
                return b;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    //inserer un blogger dans la table blogger
    public void insertBlogger(Blogger blogger) {
    	Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BLOGGER)) {
            preparedStatement.setString(1, blogger.getNom());
            preparedStatement.setString(2, blogger.getPrénom());
            preparedStatement.setString(3, blogger.getUsername());
            preparedStatement.setString(4, blogger.getEmail());
            preparedStatement.setString(5, blogger.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //modifier les informations d'un bloggeur
    public void updateBlogger(Blogger blogger) {
        Connexion con = new Connexion();
        try (Connection connection = con.etablirconnection();
        		PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BLOGGER)) {
            preparedStatement.setString(1, blogger.getNom());
            preparedStatement.setString(2, blogger.getPrénom());
            preparedStatement.setString(3, blogger.getUsername());
            preparedStatement.setString(4, blogger.getEmail());
            preparedStatement.setString(5, blogger.getPassword());
            preparedStatement.setString(6, blogger.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
	

}
