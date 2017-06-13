package com.apiccini.EntrainementJDBC.Domaine;



public class Humain {

	private String nom, prenom;
	private int secu;
	
	
	
	
	public Humain(String nom, String prenom, int secu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getSecu() {
		return secu;
	}
	public void setSecu(int secu) {
		this.secu = secu;
	}
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", secu=" + secu
				+ "]";
	}
	
	
	
}
