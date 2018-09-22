package vn.edu.ifi.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "vente")
	private Vente vente;
	
	
	/**
	 * Constructeur par défaut de la class LigneVente
	 */
	public LigneVente() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant de la ligne d'un vente
	 * @return idLigneVente
	 */
	public Long getIdLigneVente() {
		return idLigneVente;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant de la ligne d'un vente
	 * @param id
	 */
	public void setIdLigneVente(Long id) {
		this.idLigneVente = id;
	}

	/**
	 * Cette méthode permet d'obtenir l'article d'une ligne de vente
	 * @return article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * Cette méthode permet de modifier l'article d'une ligne de vente
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
}
