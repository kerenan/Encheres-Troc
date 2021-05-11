/**
 * 
 */
package fr.encheresnobyl.encherestroc.dal;

import java.util.List;

import fr.encheresnobyl.encherestroc.bo.Categorie;

/**
 * @author mlebris2021
 * Interface which list the DAO method for accessing Categorie table
 */
public interface CategorieDao {
	
	/**
	 * Method to get all Categorie from the db
	 * @return a List of Categorie
	 */
	List<Categorie> getAllCategorie();

}
