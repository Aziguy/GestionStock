package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	
	public CommandeFournisseur save(CommandeFournisseur entitie);
	
	public CommandeFournisseur update(CommandeFournisseur entitie);

	public List<CommandeFournisseur> selectAll();

	public List<CommandeFournisseur> selectAll(String sortField, String sort);

	public CommandeFournisseur getById(Long id);

	public void remove(Long id);

	public CommandeFournisseur findOne(String paramName, Object paramValue);

	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
