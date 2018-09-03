package vn.edu.ifi.entities;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Entity
public class CommandeClient implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;
	
	@Transient
	private BigDecimal totalCommande;
	
	/**
	 * Constructeur par défaut de la class CommandeClient
	 */
	public CommandeClient() {
	}

	/**
	 * Cette méthode permet d'obtenir l'identifiant de la commande d'un client
	 * @return idCommandeClient
	 */
	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	/**
	 * Cette méthode permet de modifier l'identifiant de la commande d'un client
	 * @param id
	 */
	public void setIdCommandeClient(Long id) {
		this.idCommandeClient = id;
	}

	/**
	 * Cette méthode permet d'obtenir le code de la commande d'un client
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Cette méthode permet de modifier le code de la commande d'un client
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Cette méthode permet d'obtenir la date d'une commande
	 * @return dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}

	/**
	 * Cette méthode permet de modifier la date d'une commande
	 * @param dateCommande
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	/**
	 * Cette méthode permet d'obtenir le client ayant passé une commande
	 * @return client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Cette méthode permet de modifier le client ayant passé une commande
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Cette méthode permet d'obtenir la ligne de la commande d'un client
	 * @return ligneCommandeClients;
	 */
	@JsonIgnore
	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	/**
	 * Cette méthode permet de modifier la ligne de la commande d'un client
	 * @param ligneCommandeClients
	 */
	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
	/**
	 * Cette méthode permet d'obtenir le total d'une commande
	 * @return totalCommande
	 */
	public BigDecimal getTotalCommande() {
		totalCommande = BigDecimal.ZERO;
		if (!ligneCommandeClients.isEmpty()) {
			for (LigneCommandeClient ligneCommandeClient : ligneCommandeClients) {
				if (ligneCommandeClient.getQuantite() != null && ligneCommandeClient.getPrixUnitaire() != null) {
					BigDecimal totalLigne = ligneCommandeClient.getQuantite().multiply(ligneCommandeClient.getPrixUnitaire());
					totalCommande = totalCommande.add(totalLigne);
				}
			}
		}
		return totalCommande;
	}
	
	/**
	 * Cette méthode permet 
	 * @return 
	 */
	@Transient
	public String getLigneCommandeJson() {
		if (!ligneCommandeClients.isEmpty()) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writeValueAsString(ligneCommandeClients);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
}
