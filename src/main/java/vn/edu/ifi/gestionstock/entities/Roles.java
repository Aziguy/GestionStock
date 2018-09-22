package vn.edu.ifi.gestionstock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Roles {

	@Id
	@GeneratedValue
	private Long idRole;
	private String roleName;
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	
	/**
	 * Constructeur par d�faut de la class Roles
	 */
	public Roles() {
	}

	/**
	 * Cette m�thode permet d'obtenir un role
	 * @return idRole
	 */
	public Long getIdRole() {
		return idRole;
	}

	/**
	 * Cette m�thode permet de modifier un role
	 * @param idRole
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	/**
	 * Cette m�thode permet d'obtenir le nom d'un role
	 * @return roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Cette m�thode permet de modifier le nom d'un role
	 * @param roleName
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Cette m�thode permet d'obtenir l'utilisateur d'un role
	 * @return utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Cette m�thode permet de modifier l'utilisateur d'un role
	 * @param utilisateur
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
