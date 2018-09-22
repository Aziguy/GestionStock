package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Vente;

public interface IVenteService {
	
	public Vente save(Vente entitie);
	
	public Vente update(Vente entitie);

	public List<Vente> selectAll();

	public List<Vente> selectAll(String sortField, String sort);

	public Vente getById(Long id);

	public void remove(Long id);

	public Vente findOne(String paramName, Object paramValue);

	public Vente findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
