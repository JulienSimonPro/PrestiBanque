package Metier;

import java.util.Date;

public class CompteEpargne extends CompteBancaire {
	private int tauxRemuneration;

	public CompteEpargne(int numeroCompte, int solde, Date dateOuverture, int tauxRemuneration) {
		super(numeroCompte, solde, dateOuverture);
		this.tauxRemuneration = tauxRemuneration;
	}

	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
