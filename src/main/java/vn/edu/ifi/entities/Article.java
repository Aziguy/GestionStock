package vn.edu.ifi.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable{

	@Id
	@GeneratedValue
	private Long idArticle;
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHT;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;
	
	/**
	 * Constructeur par d�faut de la class Article
	 */
	public Article() {
	}

	/**
	 * Cette m�thode permet d'obtenir l'identifiant d'un article
	 * @return idArticle
	 */
	public Long getIdArticle() {
		return idArticle;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant d'un article
	 * @param idArticle
	 */
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	/**
	 * Cette m�thode permet d'obtenir le code d'un article
	 * @return codeArticle
	 */
	public String getCodeArticle() {
		return codeArticle;
	}

	/**
	 * Cette m�thode permet de modifier le code d'un article
	 * @param codeArticle
	 */
	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	/**
	 * Cette m�thode permet d'obtenir la d�signation d'un article
	 * @return designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Cette m�thode permet de modifier la d�signation d'un article
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Cette m�thode permet d'obtenir le prix unitaire hors taxe d'un article
	 * @return prixUnitaireHT
	 */
	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	/**
	 * Cette m�thode permet de modifier le prix hors taxe d'un article
	 * @param prixUnitaireHT
	 */
	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	/**
	 * Cette m�thode permet d'obtenir le taux de tva d'un article
	 * @return tauxTva
	 */
	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	/**
	 * Cette m�thode permet de modifier le taux de tva d'un article
	 * @param tauxTva
	 */
	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	/**
	 * Cette m�thode permet d'ontenir le prix unitaire tout taxe comprise d'un article
	 * @return prixUnitaireTTC
	 */
	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	/**
	 * Cette m�thode permet de modifier le prix unitaire tout taxe comprise d'un article
	 * @param prixUnitaireTTC
	 */
	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	/**
	 * Cette m�thode permet d'obtenir l'image d'un article
	 * @return photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Cette m�thode permet de modifier l'image d'un article
	 * @param photo
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Cette m�thode permet d'obtenir la cat�gorie d'un article
	 * @return categorie
	 */
	public Categorie getCategories() {
		return categorie;
	}

	/**
	 * Cette m�thode permet de mofifier la cat�gorie d'un article
	 * @param categorie
	 */
	public void setCategories(Categorie categorie) {
		this.categorie = categorie;
	}	
}
