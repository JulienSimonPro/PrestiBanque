 package Metier;

import java.util.Date;

public class Agence {
	private int id;
	private Date dateCreation;
	private Gerant gerant;

	public Agence(int id, Date dateCreation, Gerant gerant) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
}
