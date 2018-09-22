package vn.edu.ifi.gestionstock.services;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Article;
import vn.edu.ifi.gestionstock.entities.Categorie;

public interface ICategorieService {
	
	public Categorie save(Categorie entity);
	
	public Categorie update(Categorie entity);

	public List<Categorie> selectAll();

	public List<Categorie> selectAll(String sortField, String sort);

	public Categorie getById(Long id);

	public void remove(Long id);

	public Categorie findOne(String paramName, Object paramValue);

	public Categorie findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
	
	public List<Article> selectAllArticlesByCategorie(Long idCategorie);

}
