package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Fournisseur;

public interface IFournisseurService {
	
	public Fournisseur save(Fournisseur entitie);
	
	public Fournisseur update(Fournisseur entitie);

	public List<Fournisseur> selectAll();

	public List<Fournisseur> selectAll(String sortField, String sort);

	public Fournisseur getById(Long id);

	public void remove(Long id);

	public Fournisseur findOne(String paramName, Object paramValue);

	public Fournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
