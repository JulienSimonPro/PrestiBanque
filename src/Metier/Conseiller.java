package Metier;

import java.util.ArrayList;

public class Conseiller extends Employe {
	private Gerant gerant;
	private ArrayList<Client> listeClient;

	public Conseiller(String nom, String prenom, Agence agence, Gerant gerant, ArrayList<Client> listeClient) {
		super(nom, prenom, agence);
		this.gerant = gerant;
		this.listeClient = listeClient;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public ArrayList<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(ArrayList<Client> listeClient) {
		this.listeClient = listeClient;
	}
}
