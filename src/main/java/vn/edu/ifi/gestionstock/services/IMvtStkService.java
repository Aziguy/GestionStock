package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.MvtStk;

public interface IMvtStkService {
	
	public MvtStk save(MvtStk entitie);
	
	public MvtStk update(MvtStk entitie);

	public List<MvtStk> selectAll();

	public List<MvtStk> selectAll(String sortField, String sort);

	public MvtStk getById(Long id);

	public void remove(Long id);

	public MvtStk findOne(String paramName, Object paramValue);

	public MvtStk findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
