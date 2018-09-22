package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.LigneVente;

public interface ILigneVenteService {
	
	public LigneVente save(LigneVente entitie);
	
	public LigneVente update(LigneVente entitie);

	public List<LigneVente> selectAll();

	public List<LigneVente> selectAll(String sortField, String sort);

	public LigneVente getById(Long id);

	public void remove(Long id);

	public LigneVente findOne(String paramName, Object paramValue);

	public LigneVente findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
