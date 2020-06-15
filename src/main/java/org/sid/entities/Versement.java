package org.sid.entities;

import java.util.Date;
import java.util.Optional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double montant, Compte cp) {
		super(dateOperation, montant, cp);
		// TODO Auto-generated constructor stub
	}

}
