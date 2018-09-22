package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
	
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entitie);
	
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entitie);

	public List<LigneCommandeFournisseur> selectAll();

	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort);

	public LigneCommandeFournisseur getById(Long id);

	public void remove(Long id);

	public LigneCommandeFournisseur findOne(String paramName, Object paramValue);

	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
