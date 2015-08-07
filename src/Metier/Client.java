package Metier;

import java.util.HashMap;

public class Client {
	private String nom, prenom, adresse, ville, telephone, carte;
	private int codePostal;
	private HashMap<String, CompteBancaire> listeCompteBancaire;
	
	public static final String COMPTE_COURRANT = "COMPTE_COURRANT";
	public static final String COMPTE_EPARGNE = "COMPTE_EPARGNE";

	public Client(String nom, String prenom, String adresse, String ville, String telephone, String carte,
			int codePostal, HashMap<String, CompteBancaire> listeCompteBancaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.telephone = telephone;
		this.carte = carte;
		this.codePostal = codePostal;
		this.listeCompteBancaire = listeCompteBancaire;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCarte() {
		return carte;
	}

	public void setCarte(String carte) {
		this.carte = carte;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public HashMap<String, CompteBancaire> getListeCompteBancaire() {
		return listeCompteBancaire;
	}

	public void setListeCompteBancaire(HashMap<String, CompteBancaire> listeCompteBancaire) {
		this.listeCompteBancaire = listeCompteBancaire;
	}

}
