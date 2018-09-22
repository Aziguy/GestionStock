package vn.edu.ifi.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vn.edu.ifi.gestionstock.dao.IClientDao;
import vn.edu.ifi.gestionstock.entities.Client;
import vn.edu.ifi.gestionstock.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService {
	
	private IClientDao dao;
	
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client entitie) {
		return dao.save(entitie);
	}

	@Override
	public Client update(Client entitie) {
		return dao.update(entitie);
	}

	@Override
	public List<Client> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
