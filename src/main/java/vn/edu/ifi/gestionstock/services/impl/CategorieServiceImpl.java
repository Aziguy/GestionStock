package vn.edu.ifi.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vn.edu.ifi.gestionstock.dao.ICategorieDao;
import vn.edu.ifi.gestionstock.entities.Article;
import vn.edu.ifi.gestionstock.entities.Categorie;
import vn.edu.ifi.gestionstock.services.ICategorieService;

@Transactional
public class CategorieServiceImpl implements ICategorieService {
	
	private ICategorieDao dao;
	
	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}

	@Override
	public Categorie save(Categorie entitie) {
		return dao.save(entitie);
	}

	@Override
	public Categorie update(Categorie entitie) {
		return dao.update(entitie);
	}

	@Override
	public List<Categorie> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Categorie> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Categorie getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Categorie findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Categorie findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<Article> selectAllArticlesByCategorie(Long idCategorie) {
		return dao.selectAllArticlesByCategorie(idCategorie);
	}

}
