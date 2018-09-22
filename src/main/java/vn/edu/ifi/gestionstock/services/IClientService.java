package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Client;

public interface IClientService {
	
	public Client save(Client entitie);
	
	public Client update(Client entitie);

	public List<Client> selectAll();

	public List<Client> selectAll(String sortField, String sort);

	public Client getById(Long id);

	public void remove(Long id);

	public Client findOne(String paramName, Object paramValue);

	public Client findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
