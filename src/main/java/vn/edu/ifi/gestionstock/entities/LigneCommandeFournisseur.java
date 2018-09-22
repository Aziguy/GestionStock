package vn.edu.ifi.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCdeFrs;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	/**
	 * Constructeur par défaut de la class LigneCommandeFournisseur
	 */
	public LigneCommandeFournisseur() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant de la ligne de commande d'un fournisseur
	 * @return idLigneCdeFrs
	 */
	public Long getIdLigneCdeFrs() {
		return idLigneCdeFrs;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant de la ligne de commande d'un fournisseur
	 * @param id
	 */
	public void setIdLigneCdeFrs(Long id) {
		this.idLigneCdeFrs = id;
	}

	/**
	 * Cette méthode permet d'obtenir l'article de la ligne d'une commande
	 * @return article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * Cette méthode permet de modifier l'article de la ligne d'une commande 
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * Cette méthode permet d'obtenir la commande d'un fournisseur
	 * @return commandeFournisseur
	 */
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	/**
	 * Cette méthode permet de modifier la commande d'un fournisseur
	 * @param commandeFournisseur
	 */
	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
}
