package vn.edu.ifi.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vn.edu.ifi.gestionstock.dao.ILigneCommandeClientDao;
import vn.edu.ifi.gestionstock.entities.LigneCommandeClient;
import vn.edu.ifi.gestionstock.services.ILigneCommandeClientService;

@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {
	
	private ILigneCommandeClientDao dao;
	
	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient entitie) {
		return dao.save(entitie);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entitie) {
		return dao.update(entitie);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient) {
		return dao.getByIdCommande(idCommandeClient);
	}

}
