package Metier;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Blog {
	
	private String id_blog;
	private String titre;
	private Timestamp timestamp;
	private Blogger Auteur;
	private ArrayList<ImageB> liste_Images;
	private String Texte;
	private Domaine domaine;
	private ArrayList<Commentaire> Liste_Commentaire;
	
	public Blog()
	{
		this.id_blog=UUID.randomUUID().toString();
		Date utilDate = new Date();
        this.setTimestamp(new Timestamp(utilDate.getTime()));
	}
	public Blog(String titre,String Texte,Blogger Auteur,Domaine domaine){
		this.id_blog=UUID.randomUUID().toString();
		Date utilDate = new Date();
        this.setTimestamp(new Timestamp(utilDate.getTime()));
		this.Auteur=Auteur;
		this.domaine=domaine;
		this.Texte=Texte;
		this.titre=titre;
	}
	public Blog(String id,String titre,String Texte,Blogger Auteur,Domaine domaine){
		Date utilDate = new Date();
        this.setTimestamp(new Timestamp(utilDate.getTime()));
		this.Auteur=Auteur;
		this.domaine=domaine;
		this.Texte=Texte;
		this.titre=titre;
		if(id != null)
		{
			this.id_blog=id;
		}
		else
		{
			this.id_blog=UUID.randomUUID().toString();
		}
		
	}	
	public Blog(String id,String titre,String Texte,Timestamp dat,Blogger Auteur,Domaine domaine){

        this.timestamp=dat;
		this.Auteur=Auteur;
		this.domaine=domaine;
		this.Texte=Texte;
		this.titre=titre;
		if(id != null)
		{
			this.id_blog=id;
		}	
	}

	public Blogger getAuteur() {
		return Auteur;
	}

	public void setAuteur(Blogger auteur) {
		Auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public ArrayList<ImageB> getListe_Images() {
		return liste_Images;
	}

	public void setListe_Images(ArrayList<ImageB> liste_Images) {
		this.liste_Images = liste_Images;
	}

	public ArrayList<Commentaire> getListe_Commentaire() {
		return Liste_Commentaire;
	}

	public void setListe_Commentaire(ArrayList<Commentaire> liste_Commentaire) {
		Liste_Commentaire = liste_Commentaire;
	}

	public String getTexte() {
		return Texte;
	}

	public void setTexte(String texte) {
		Texte = texte;
	}

	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getId_blog() {
		return id_blog;
	}
	public void setId_blog(String id_blog) {
		this.id_blog = id_blog;
	}
	
	public Blog AjouterBlog(String Domaine,String titre,String Texte,Blogger Auteur)
	{
		ControlerBlog CB =new ControlerBlog();
		Blog B=new Blog(titre,Texte,Auteur,CB.getDomaineByLibelle(Domaine));
		return B;
		
	}
	
	public Blog ModifierBlog(Blog blog,String Domaine,String titre,String Texte)
	{
		ControlerBlog CB =new ControlerBlog();
		CB.updateBlog(blog, titre, Texte, CB.getDomaineByLibelle(Domaine).getId_domaine());
		return blog;
		
	}

}
