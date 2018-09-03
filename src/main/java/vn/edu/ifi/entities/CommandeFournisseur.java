package vn.edu.ifi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	/**
	 * Constructeur par d�faut de la class CommandeFournisseur
	 */
	public CommandeFournisseur() {
	}

	/**
	 * Cette m�thode permet d'obtenir l'identifiant de la commande d'un fournisseur
	 * @return idCommandeFournisseur
	 */
	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant de la commande d'un fournisseur
	 * @param id
	 */
	public void setIdCommandeFournisseur(Long id) {
		this.idCommandeFournisseur = id;
	}

	/**
	 * Cette m�thode permet d'obtenir la date d'une commande
	 * @return dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}

	/**
	 * Cette m�thode permet de modifier la date d'une commande
	 * @param dateCommande
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	/**
	 * Cette m�thode permet d'obtenir le fournisseur d'une commande
	 * @return fournisseur
	 */
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	/**
	 * Cette m�thode permet de modifier le founisseur d'une commande
	 * @param fournisseur
	 */
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	/**
	 * Cette m�thode permet d'obtenir la ligne de la commande d'un fournisseur
	 * @return ligneCommandeFournisseurs
	 */
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}

	/**
	 * Cette m�thode permet de modifier la ligne de la commande d'un fournisseur
	 * @param ligneCommandeFournisseurs
	 */
	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}	
	
}
