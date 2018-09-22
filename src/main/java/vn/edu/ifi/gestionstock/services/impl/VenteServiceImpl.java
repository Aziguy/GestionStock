package vn.edu.ifi.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vn.edu.ifi.gestionstock.dao.IVenteDao;
import vn.edu.ifi.gestionstock.entities.Vente;
import vn.edu.ifi.gestionstock.services.IVenteService;

@Transactional
public class VenteServiceImpl implements IVenteService {
	
	private IVenteDao dao;
	
	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente entitie) {
		return dao.save(entitie);
	}

	@Override
	public Vente update(Vente entitie) {
		return dao.update(entitie);
	}

	@Override
	public List<Vente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Vente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
