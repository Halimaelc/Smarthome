package Commande;

public class Adresse {
	private int codePostale;
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	private String ville;

	public Adresse(int codePostale, String ville) {
		 this.codePostale = codePostale;
	        this.ville = ville;
		// TODO Auto-generated constructor stub
	}
	 public Adresse() {
	    }

}
