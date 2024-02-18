package Metier;

public class Domaine {

	private long id_domaine;
	private String Libelle_Domaine;
	
	Domaine(long id,String Domaine){
		this.setId_domaine(id);
		this.Libelle_Domaine=Domaine;
	}
	Domaine(String Domaine){
		this.Libelle_Domaine=Domaine;
	}
	public String getLibelle_Domaine() {
		return Libelle_Domaine;
	}
	public void setLibelle_Domaine(String libelle_Domaine) {
		Libelle_Domaine = libelle_Domaine;
	}
	public long getId_domaine() {
		return id_domaine;
	}
	public void setId_domaine(long id_domaine) {
		this.id_domaine = id_domaine;
	}
	
	
}
