package vn.edu.ifi.gestionstock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{

	@Id
	@GeneratedValue
	private Long idUtilisateur;
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	private String motDePasse;
	
	private String photo;
	
	private boolean actived;
	
	@OneToMany(mappedBy = "utilisateur")
	List<Roles> roles;
	
	
	/**
	 * Constructeur par d�faut de la class Utilisateur
	 */
	public Utilisateur() {
	}

	/**
	 * Cette m�thode permet d'obtenir l'identifiant d'un utilisateur
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant d'un utilisateur
	 * @param id
	 */
	public void setIdUtilisateur(Long id) {
		this.idUtilisateur = id;
	}

	/**
	 * Cette m�thode permet d'obtenir un nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette m�thode permet de modifier le nom d'un utilisateur
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Cette m�thode permet d'obtenir le prenom d'un utilisateur
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette m�thode permet de modifier le prenom d'un utilisateur
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Cette m�thode permet d'obtenir le mail d'un utilisateur
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Cette m�thode permet de modifier le mail d'un utilisateur
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Cette m�thode permet d'obtenir le mot de passe d'un utilisateur
	 * @return motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Cette m�thode permet de modifier le mot de passe
	 * @param motDePasse
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Cette m�thode permet d'obtenir la photo d'un utilisateur
	 * @return photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Cette m�thode permet de modifier la photo d'un utilisateur
	 * @param photo
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Cette m�thode permet de voir l'�tat d'un utilisateur (activ�/d�sactiv�)
	 * @return actived
	 */
	public boolean isActived() {
		return actived;
	}

	/**
	 * Cette m�thode permet de modifier l'�tat d'un utilisateur (activ�/d�sactiv�)
	 * @param actived
	 */
	public void setActived(boolean actived) {
		this.actived = actived;
	}

	/**
	 * Cette m�thode permet d'obtenir la liste des roles d'un utilisateur
	 * @return roles
	 */
	public List<Roles> getRoles() {
		return roles;
	}

	/**
	 * Cette m�thode permet de modifier la liste des roles d'un utilisateur
	 * @param roles
	 */
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
}
