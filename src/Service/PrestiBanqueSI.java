package Service;

import java.util.ArrayList;

import Metier.*;

public class PrestiBanqueSI {
	public static void creerClient(Client client, String nom, String prenom, String adresse, int codePostal,
			String ville, String telephone, String carte, ArrayList<CompteBancaire> listeCompteBancaire) {
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setCodePostal(codePostal);
		client.setVille(ville);
		client.setTelephone(telephone);
		client.setCarte(carte);
		client.setListeCompteBancaire(listeCompteBancaire);
	}
}
