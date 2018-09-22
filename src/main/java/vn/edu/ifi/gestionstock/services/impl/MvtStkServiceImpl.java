package vn.edu.ifi.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vn.edu.ifi.gestionstock.dao.IMvtStkDao;
import vn.edu.ifi.gestionstock.entities.MvtStk;
import vn.edu.ifi.gestionstock.services.IMvtStkService;

@Transactional
public class MvtStkServiceImpl implements IMvtStkService {
	
	private IMvtStkDao dao;
	
	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStk save(MvtStk entitie) {
		return dao.save(entitie);
	}

	@Override
	public MvtStk update(MvtStk entitie) {
		return dao.update(entitie);
	}

	@Override
	public List<MvtStk> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<MvtStk> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtStk getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public MvtStk findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStk findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
