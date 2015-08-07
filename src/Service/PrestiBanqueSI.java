package Service;

import java.util.ArrayList;
import java.util.Iterator;

import Metier.*;

public class PrestiBanqueSI {

	public static Client creerClient(String nom, String prenom, ArrayList<CompteBancaire> listeCompteBancaire,
			int codePostal, String carte, String telephone, String ville, String adresse) {
		Client client = new Client(nom, prenom, adresse, ville, telephone, carte, codePostal, listeCompteBancaire);
		return client;
	}

	public static void modifierInformationsClient(Client client, String nom, String prenom, String adresse,
			int codePostal, String ville, String telephone, String carte,
			ArrayList<CompteBancaire> listeCompteBancaire) {
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setCodePostal(codePostal);
		client.setVille(ville);
		client.setTelephone(telephone);
		client.setCarte(carte);
		client.setListeCompteBancaire(listeCompteBancaire);
	}

	public static void lireInformationClient(ArrayList<Client> listeClients, String nom, String prenom) {
		Client client;
		try {
			client = rechercherClient(listeClients, nom, prenom);
			System.out.println(client.getPrenom() + " " + client.getNom() + " habitant à " + client.getVille() + " ("
					+ client.getCodePostal() + ") a une carte de type " + client.getCarte());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Client rechercherClient(ArrayList<Client> listeClients, String nom, String prenom) throws Exception {
		for (Client client : listeClients) {
			if (client.getNom().equals(nom) && client.getPrenom().equals(prenom)) {
				return client;
			}
		}

		// Si on n'a rien retourné plus tôt, alors le client n'existe pas dans
		// la liste
		throw new Exception("Le client n'existe pas dans la liste");
	}

	public static void supprimerClient(ArrayList<Client> listeClients, String nom, String prenom) throws Exception {
		for (Iterator iterator = listeClients.iterator(); iterator.hasNext();) {
			Client client = (Client) iterator.next();
			if (client.getNom().equals(nom) && client.getPrenom().equals(prenom)) {
				iterator.remove();
				System.out.println("Le client a été supprimé");
				return;
			}
		}

		// Si on n'a rien retourné plus tôt, alors le client n'existe pas dans
		// la liste
		throw new Exception("Le client n'a pas été supprimé");
	}
	
	public static void virementCompteACompte(ArrayList<Client> listeClients, String nom, String prenom, Double montant){
		for (Iterator iterator = listeClients.iterator(); iterator.hasNext();) {
			Client client = (Client) iterator.next();
			if (client.getNom().equals(nom) && client.getPrenom().equals(prenom)) {
				client.getListeCompteBancaire();
				return;
			}
		}
	}
}
