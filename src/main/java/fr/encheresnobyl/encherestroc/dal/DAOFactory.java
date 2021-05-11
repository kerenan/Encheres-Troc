/**
 * 
 */
package fr.encheresnobyl.encherestroc.dal;

/**
 * @author mlebris2021
 * Class which return an instance of each DaoJdbcImplementation
 */
public class DAOFactory {
	
	private DAOFactory() {}
	
	public static UtilisateurDao getUtilisateurDAO() {
		return new UtilisateurDaoJdbcImpl;
	}
	
	public static EnchereDao getEnchereDAO() {
		return new EnchereDaoJdbcImpl;
	}
	
	public static ArticleVenduDao getArticleVenduDOA() {
		return new ArticleVenduDaoJdbcImpl;
	}
	
	public static CategorieDao getCategorieDOA() {
		return new CategorieDaoJdbcImpl;
	}
	
	public static RetraitDao getRetraitDOA() {
		return new RetraitDaoJdbcImpl;
	}
}
