package vn.edu.ifi.gestionstock.dao;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.LigneCommandeClient;



public interface ILigneCommandeClientDao extends IGenericDao<LigneCommandeClient> {
	
	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient);

}
