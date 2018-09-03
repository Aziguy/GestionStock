package vn.edu.ifi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class Client implements Serializable{

	@Id
	@GeneratedValue
	private Long idClient;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String photo;
	
	private String mail;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> listeCommandeClient;
	
	/**
	 * Constructeur par d�faut de la class Client
	 */
	public Client() {
		super();
	}

	/**
	 * Cette m�thode permet d'obtenir l'identifiant d'un client
	 * @return idClient
	 */
	public Long getIdClient() {
		return idClient;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant d'un client
	 * @param id
	 */
	public void setIdClient(Long id) {
		this.idClient = id;
	}

	/**
	 * Cette m�thode permet d'obtenir le nom d'un client
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Cette m�thode permet de modifier le nom d'un client
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Cette m�thode permet d'obtenir le pr�nom d'un client
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Cette m�thode permet de modifier le nom d'un client
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Cette m�thode permet d'obtenir l'adresse d'un client
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Cette m�thode permet de modifier l'adresse d'un client
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Cette m�thode permet d'ontenir la photo d'un client
	 * @return photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Cette m�thode permet de modifier la photo d'un client
	 * @param photo
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Cette m�thode permet d'obtenir le mail d'un client
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Cette m�thode permet de modifier l'adresse d'un client
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Cette m�thode permet d'obtenir l'ensemble des commandes d'un client
	 * @return listeCommandeClient
	 */
	@JsonIgnore
	public List<CommandeClient> getCommandeClients() {
		return listeCommandeClient;
	}

	/**
	 * Cette m�thode permet de modifier la liste des commandes d'un cleint
	 * @param listeCommandeClient
	 */
	public void setCommandeClients(List<CommandeClient> listeCommandeClient) {
		this.listeCommandeClient = listeCommandeClient;
	}
}
