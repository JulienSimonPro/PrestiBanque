package Metier;

import java.util.Date;

public class CompteCourrant extends CompteBancaire {
	private int decouvertMax;

	public CompteCourrant(int numeroCompte, int solde, Date dateOuverture, int decouvertMax) {
		super(numeroCompte, solde, dateOuverture);
		this.decouvertMax = decouvertMax;
	}

	public int getDecouvertMax() {
		return decouvertMax;
	}

	public void setDecouvertMax(int decouvertMax) {
		this.decouvertMax = decouvertMax;
	}
}
