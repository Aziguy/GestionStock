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
	 * Constructeur par défaut de la class Utilisateur
	 */
	public Utilisateur() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant d'un utilisateur
	 * @return idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant d'un utilisateur
	 * @param id
	 */
	public void setIdUtilisateur(Long id) {
		this.idUtilisateur = id;
	}

	/**
	 * Cette méthode permet d'obtenir un nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette méthode permet de modifier le nom d'un utilisateur
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Cette méthode permet d'obtenir le prenom d'un utilisateur
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette méthode permet de modifier le prenom d'un utilisateur
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Cette méthode permet d'obtenir le mail d'un utilisateur
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Cette méthode permet de modifier le mail d'un utilisateur
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Cette méthode permet d'obtenir le mot de passe d'un utilisateur
	 * @return motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Cette méthode permet de modifier le mot de passe
	 * @param motDePasse
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Cette méthode permet d'obtenir la photo d'un utilisateur
	 * @return photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Cette méthode permet de modifier la photo d'un utilisateur
	 * @param photo
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Cette méthode permet de voir l'état d'un utilisateur (activé/désactivé)
	 * @return actived
	 */
	public boolean isActived() {
		return actived;
	}

	/**
	 * Cette méthode permet de modifier l'état d'un utilisateur (activé/désactivé)
	 * @param actived
	 */
	public void setActived(boolean actived) {
		this.actived = actived;
	}

	/**
	 * Cette méthode permet d'obtenir la liste des roles d'un utilisateur
	 * @return roles
	 */
	public List<Roles> getRoles() {
		return roles;
	}

	/**
	 * Cette méthode permet de modifier la liste des roles d'un utilisateur
	 * @param roles
	 */
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
}
