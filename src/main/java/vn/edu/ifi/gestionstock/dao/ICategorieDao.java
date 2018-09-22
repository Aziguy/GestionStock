package vn.edu.ifi.gestionstock.dao;

import java.util.List;

import vn.edu.ifi.gestionstock.entities.Article;
import vn.edu.ifi.gestionstock.entities.Categorie;



public interface ICategorieDao extends IGenericDao<Categorie> {
	
	public List<Article> selectAllArticlesByCategorie(Long idCategorie);

}
