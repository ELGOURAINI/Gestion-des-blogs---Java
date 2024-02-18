package Metier;

public class Commentaire {
	
	private long id_Commentaire;
	private String Content;
	private Blog blog;
	private Blogger blogger;
	
	Commentaire(String C,Blog B,Blogger bl){
		this.setBlog(B);
		this.setBlogger(bl);
		this.setContent(C);
	}

	public long getId_Commentaire() {
		return id_Commentaire;
	}

	public void setId_Commentaire(long id_Commentaire) {
		this.id_Commentaire = id_Commentaire;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public Blogger getBlogger() {
		return blogger;
	}

	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	

}
