package vn.edu.ifi.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class LigneCommandeClient implements Serializable {

	@Id
	@GeneratedValue
	private Long idLigneCdeClt;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	
	/**
	 * Constructeur par défaut de la class LigneCommandeClient
	 */
	public LigneCommandeClient() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant de la ligne de commande d'un client
	 * @return idLigneCdeClt
	 */
	public Long getIdLigneCdeClt() {
		return idLigneCdeClt;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant de la ligne de commande d'un client
	 * @param id
	 */
	public void setIdLigneCdeClt(Long id) {
		this.idLigneCdeClt = id;
	}

	/**
	 * Cette méthode permet d'obtenir l'article commandé par un client
	 * @return article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * Cette méthode permet de modifier l'article commandé par un client
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * Cette méthode permet d'obtenir la commande d'un client
	 * @return commandeClient
	 */
	@JsonIgnore
	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	/**
	 * Cette méthode permet de modifier la commande d'un client
	 * @param commandeClient
	 */
	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	/**
	 * Cette méthode permet d'obtenir la quantité d'article commandé par un client
	 * @return quantite
	 */
	public BigDecimal getQuantite() {
		return quantite;
	}

	/**
	 * Cette méthode permet de modifier la quantité d'article commandé par un client
	 * @param quantite
	 */
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	/**
	 * Cette méthode permet d'obtenir le prix unitaire d'un article commandé
	 * @return prixUnitaire
	 */
	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	/**
	 * Cette méthode permet de modifier le prix unitaire d'un article commandé
	 * @param prixUnitaire
	 */
	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
}
