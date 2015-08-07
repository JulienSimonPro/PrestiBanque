package DAO;

import java.util.HashMap;
import Metier.*;;

public class DAOClient {
	private static HashMap<Integer, Client> listeClient;

	public void ajoutClient(Client client) {
		// TODO DAO : Vérifier si le client existe avant de l'ajouter
		listeClient.put(listeClient.size(), client);
	}

//	public Client rechercherClient(String nom, String prenom) {
//		
//	}

}
