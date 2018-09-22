package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	
	public LigneCommandeClient save(LigneCommandeClient entitie);
	
	public LigneCommandeClient update(LigneCommandeClient entitie);

	public List<LigneCommandeClient> selectAll();

	public List<LigneCommandeClient> selectAll(String sortField, String sort);

	public LigneCommandeClient getById(Long id);

	public void remove(Long id);

	public LigneCommandeClient findOne(String paramName, Object paramValue);

	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient);

}
