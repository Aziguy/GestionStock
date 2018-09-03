package vn.edu.ifi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente implements Serializable{

	@Id
	@GeneratedValue
	private Long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;
	
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;

	/**
	 * Constructeur par défaut de la class Vente
	 */
	public Vente() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant des ventes
	 * @return idVente
	 */
	public Long getIdVente() {
		return idVente;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant des ventes
	 * @param id
	 */
	public void setIdVente(Long id) {
		this.idVente = id;
	}

	/**
	 * Cette méthode permet d'obtenir le code d'une vente
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Cette méthode permet de modifier le code d'une vente
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Cette méthode permet d'obtenir la date d'une vente
	 * @return dateVente
	 */
	public Date getDateVente() {
		return dateVente;
	}

	/**
	 * Cette méthode permet de modifier la date d'une vente
	 * @param dateVente
	 */
	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	/**
	 * Cette méthode permet d'obtenir la liste des ventes
	 * @return ligneVentes
	 */
	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	/**
	 * Cette méthode permet de modifier la liste des ventes
	 * @param ligneVentes
	 */
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
}
