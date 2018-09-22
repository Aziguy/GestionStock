package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Article;

public interface IArticleService {
	
	public Article save(Article entitie);
	
	public Article update(Article entitie);

	public List<Article> selectAll();

	public List<Article> selectAll(String sortField, String sort);

	public Article getById(Long id);

	public void remove(Long id);

	public Article findOne(String paramName, Object paramValue);

	public Article findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
