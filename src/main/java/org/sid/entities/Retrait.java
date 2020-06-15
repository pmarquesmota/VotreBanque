package org.sid.entities;

import java.util.Date;
import java.util.Optional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOperation, double montant, Compte cp) {
		super(dateOperation, montant, cp);
		// TODO Auto-generated constructor stub
	}

}
