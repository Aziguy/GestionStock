package vn.edu.ifi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idFournisseur;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String photo;
	
	private String mail;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;
	
	/**
	 * Constructeur par défaut de la class Fournisseur
	 */
	public Fournisseur() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant d'un fournisseur
	 * @return idFournisseur
	 */
	public Long getIdFournisseur() {
		return idFournisseur;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant d'un fournisseur
	 * @param id
	 */
	public void setIdFournisseur(Long id) {
		this.idFournisseur = id;
	}

	/**
	 * Cette méthode permet d'obtenir le nom d'un fournisseur
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette méthode permet de modifier le nom d'un fournisseur
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Cette méthode permet d'obtenir le prenom d'un fournisseur
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette méthode permet de modifier le prenom d'un fournisseur
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Cette méthode permet d'obtenir l'adresse d'un fournisseur
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Cette méthode permet de modifier l'adresse d'un fournisseur
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Cette méthode permet d'obtenir la photo d'un fournisseur
	 * @return photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Cette méthode permet de modifier la photo d'un fournisseur
	 * @param photo
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Cette méthode permet d'obtenir le mail d'un fournisseur
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Cette méthode permet de modifier le mail d'un fournisseur
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Cette méthode permet d'obtenir la liste des commandes d'un fournisseur
	 * @return commandeFournisseurs
	 */
	public List<CommandeFournisseur> getCommandeFournisseurs() {
		return commandeFournisseurs;
	}

	/**
	 * Cette méthode permet de mofifier la liste des commandes d'un fournisseur
	 * @param commandeFournisseurs
	 */
	public void setCommandeFournisseurs(List<CommandeFournisseur> commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}
}
