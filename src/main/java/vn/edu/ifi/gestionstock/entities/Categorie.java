package vn.edu.ifi.gestionstock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
public class Categorie implements Serializable{

	@Id
	@GeneratedValue
	private Long idCategorie;
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy = "categorie")
	private List<Article> listeArticles;
	
	/**
	 * Constructeur par d�faut de la class Categorie
	 */
	public Categorie() {
	}

	//GETTERS AND SETTERS
	
	
	/**
	 * Cette m�thode permet d'obtenir l'identifiant d'une cat�gorie
	 * @return idCategorie
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant d'une cat�gorie
	 * @param id
	 */
	public void setIdCategorie(Long id) {
		this.idCategorie = id;
	}

	/**
	 * Cette m�thode permet d'obtenir le code d'une cat�gorie
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Cette m�thode permet de modifier le code d'une cat�gorie
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Cette m�thode permet d'obtenir la designation d'une cat�gorie
	 * @return designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Cette permet de modifier la designatio d'une cat�gorie
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Cette m�thode permet d'obtenir l'ensemble d'article d'une cat�gorie
	 * @return listeArticles
	 */
	@JsonIgnore
	public List<Article> getArticle() {
		return listeArticles;
	}

	/**
	 * Cette m�thode permet de modifier la liste d'article d'une cat�gorie
	 * @param article
	 */
	public void setArticles(List<Article> article) {
		this.listeArticles = article;
	}
}
