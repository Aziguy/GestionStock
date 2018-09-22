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
	 * Constructeur par défaut de la class Categorie
	 */
	public Categorie() {
	}

	//GETTERS AND SETTERS
	
	
	/**
	 * Cette méthode permet d'obtenir l'identifiant d'une catégorie
	 * @return idCategorie
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant d'une catégorie
	 * @param id
	 */
	public void setIdCategorie(Long id) {
		this.idCategorie = id;
	}

	/**
	 * Cette méthode permet d'obtenir le code d'une catégorie
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Cette méthode permet de modifier le code d'une catégorie
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Cette méthode permet d'obtenir la designation d'une catégorie
	 * @return designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Cette permet de modifier la designatio d'une catégorie
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Cette méthode permet d'obtenir l'ensemble d'article d'une catégorie
	 * @return listeArticles
	 */
	@JsonIgnore
	public List<Article> getArticle() {
		return listeArticles;
	}

	/**
	 * Cette méthode permet de modifier la liste d'article d'une catégorie
	 * @param article
	 */
	public void setArticles(List<Article> article) {
		this.listeArticles = article;
	}
}
