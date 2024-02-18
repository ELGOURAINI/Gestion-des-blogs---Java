package Metier;

public class ImageB {
	
	private long id_image;
	private String path;
	private String description;
	private Blog blog;
	
	public ImageB(long id_image,String path,String description,Blog b)
	{
		this.id_image=id_image;
		this.blog=b;
		this.description=description;
		this.path=path;

	}
	public ImageB(long id_image,String path,String description)
	{
		this.id_image=id_image;
		this.description=description;
		this.path=path;

	}
	public ImageB(String path,String description,Blog b)
	{
		this.blog=b;
		this.description=description;
		this.path=path;
	}
	public String getChemin() {
		return path;
	}
	public void setChemin(String chemin) {
		this.path = chemin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	

}
