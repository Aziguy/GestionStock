package vn.edu.ifi.gestionstock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStk implements Serializable{
	
	public static final int ENTREE = 1;
	
	public static final int SORTIE = 2;

	@Id
	@GeneratedValue
	private Long idMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	/**
	 * Constructeur par d�faut de la class MvtStk
	 */
	public MvtStk() {
	}

	/**
	 * Cette m�thode permet d'obtenir l'identifiant du mouvement d'un stock
	 * @return idMvtStk
	 */
	public Long getIdMvtStk() {
		return idMvtStk;
	}

	/**
	 * Cette m�thode permet de modifier l'identifiant du mouvement d'un stock
	 * @param id
	 */
	public void setIdMvtStk(Long id) {
		this.idMvtStk = id;
	}

	/**
	 * Cette m�thode permet d'obtenir la date d'un mouvement
	 * @return dateMvt
	 */
	public Date getDateMvt() {
		return dateMvt;
	}

	/**
	 * Cette m�thode permet de modifier la date d'un mouvement
	 * @param dateMvt
	 */
	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	/**
	 * Cette m�thode permet d'obtenir la quantit� du mouvement d'un stock
	 * @return quantite
	 */
	public BigDecimal getQuantite() {
		return quantite;
	}

	/**
	 * Cette m�thode permet de modifier la quantit� du mouvement d'un stock
	 * @param quantite
	 */
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	/**
	 * Cette m�thode permet d'obtenir le type de mouvement d'un stock
	 * @return typeMvt
	 */
	public int getTypeMvt() {
		return typeMvt;
	}

	/**
	 * Cette m�thode permet de modifier le type de mouvement d'un stock
	 * @param typeMvt
	 */
	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	/**
	 * Cette m�thode permet d'obtenir l'article du mouvement d'un stock
	 * @return article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * Cette m�thode permet de modifier l'article du mouvement d'un stock
	 * @param article
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
}
