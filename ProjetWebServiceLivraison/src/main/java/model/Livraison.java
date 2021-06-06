package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the livraison database table.
 * 
 */
@Entity
@NamedQuery(name="Livraison.findAll", query="SELECT l FROM Livraison l")
public class Livraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int code;

	private int etat;

	private int idColis;

	private int matriculeLivreur;

	private String nomLivreur;

	private int telephone;

	public Livraison() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getEtat() {
		return this.etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getIdColis() {
		return this.idColis;
	}

	public void setIdColis(int idColis) {
		this.idColis = idColis;
	}

	public int getMatriculeLivreur() {
		return this.matriculeLivreur;
	}

	public void setMatriculeLivreur(int matriculeLivreur) {
		this.matriculeLivreur = matriculeLivreur;
	}

	public String getNomLivreur() {
		return this.nomLivreur;
	}

	public void setNomLivreur(String nomLivreur) {
		this.nomLivreur = nomLivreur;
	}

	public int getTelephone() {
		return this.telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

}