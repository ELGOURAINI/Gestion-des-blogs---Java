package Metier;

import java.sql.Date;

public class Blogger {
	
	private long id_Blogger;
	private String Nom;
	private String Prénom;
	private String Username;
	private String Email;
	private String Password;
	
	public Blogger(String N,String P,String Username,String Email,String Pass){
		this.setNom(N);
		this.setPrénom(P);
		this.Username=Username;
		this.Email=Email;
		this.Password=Pass;	
	}
	
	public boolean Control_Info(String email,String Password)
	{
		
		
		return false;
		
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrénom() {
		return Prénom;
	}

	public void setPrénom(String prénom) {
		Prénom = prénom;
	}


	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public long getId_Blogger() {
		return id_Blogger;
	}

	public void setId_Blogger(long id_Blogger) {
		this.id_Blogger = id_Blogger;
	}

	
	
	
	

}
