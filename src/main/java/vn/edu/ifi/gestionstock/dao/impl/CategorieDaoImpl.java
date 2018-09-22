package vn.edu.ifi.gestionstock.dao.impl;

import java.util.List;

import javax.persistence.Query;

import vn.edu.ifi.gestionstock.dao.ICategorieDao;
import vn.edu.ifi.gestionstock.entities.Article;
import vn.edu.ifi.gestionstock.entities.Categorie;

@SuppressWarnings("unchecked")
public class CategorieDaoImpl extends GenericDaoImpl<Categorie> implements ICategorieDao {

	@Override
	public List<Article> selectAllArticlesByCategorie(Long idCategorie) {
		Query query = em.createQuery("select a from " + Article.class.getSimpleName() + " a where a.categorie.idCategorie = :x");
		query.setParameter("x", idCategorie);
		return query.getResultList();
	}

}
