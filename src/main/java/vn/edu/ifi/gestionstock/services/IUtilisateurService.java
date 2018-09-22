package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur save(Utilisateur entitie);
	
	public Utilisateur update(Utilisateur entitie);

	public List<Utilisateur> selectAll();

	public List<Utilisateur> selectAll(String sortField, String sort);

	public Utilisateur getById(Long id);

	public void remove(Long id);

	public Utilisateur findOne(String paramName, Object paramValue);

	public Utilisateur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
