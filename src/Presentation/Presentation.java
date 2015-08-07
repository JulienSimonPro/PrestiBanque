package Presentation;

import Metier.Client;

public interface Presentation {

	public Client creerClient();
	
	public void modifierInformationsClient();
	
	public void lireInformationClient();
	
	public Client rechercherClient();
	
	public void supprimerClient();

}
