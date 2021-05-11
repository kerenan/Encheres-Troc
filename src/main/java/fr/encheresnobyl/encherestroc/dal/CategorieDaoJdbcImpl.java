/**
 * 
 */
package fr.encheresnobyl.encherestroc.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.encheresnobyl.encherestroc.bo.Categorie;

/**
 * @author mlebris2021
 * class which implements the method from
 */
public class CategorieDaoJdbcImpl implements CategorieDao {
	
	private static final String SELECT_ALL_CATEGORIE = "SELECT * FROM categories;";

	/**
	 * {@inheritDoc}
	 * @throws SQLException 
	 */
	@Override
	public List<Categorie> getAllCategorie() throws SQLException {
		List<Categorie>lstCategorie = new ArrayList<>();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			ResultSet rs = conn.createStatement().executeQuery(SELECT_ALL_CATEGORIE);
			
			Categorie categorie = null;
			while (rs.next()) {
				int noCategorie = rs.getInt("no_categorie");
				String libelle = rs.getString("libelle");
				categorie = new Categorie(noCategorie,libelle);
				lstCategorie.add(categorie);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return lstCategorie;
	}

}
