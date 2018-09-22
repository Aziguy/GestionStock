package vn.edu.ifi.gestionstock.model;

import java.util.Collection;
import java.util.Map;

import vn.edu.ifi.gestionstock.entities.Article;
import vn.edu.ifi.gestionstock.entities.Client;
import vn.edu.ifi.gestionstock.entities.CommandeClient;
import vn.edu.ifi.gestionstock.entities.LigneCommandeClient;

public interface ModelCommandeClient {

	void creerCommande();
	
	void modifierCommande(Client client);
	
	LigneCommandeClient ajouterLigneCommande(Article article);
	
	LigneCommandeClient supprimerLigneCommande(Article article);
	
	LigneCommandeClient modifierQuantite(Article article, double qte);
	
	String generateCodeCommande();
	
	CommandeClient getCommande();
	
	Map<Long, LigneCommandeClient> getLigneCde();
	
	Collection<LigneCommandeClient> getLignesCommandeClient(CommandeClient commande);
	
	void init();
}
