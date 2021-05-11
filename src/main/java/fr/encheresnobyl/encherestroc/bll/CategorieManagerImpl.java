/**
 * 
 */
package fr.encheresnobyl.encherestroc.bll;

import java.util.List;

import fr.encheresnobyl.encherestroc.bo.Categorie;
import fr.encheresnobyl.encherestroc.dal.CategorieDao;
import fr.encheresnobyl.encherestroc.dal.DAOFactory;

/**
 * @author mlebris2021
 *
 */
public class CategorieManagerImpl implements CategorieManagerInt {
	private CategorieDao categorieDAO = DAOFactory.getCategorieDAO();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Categorie> getAllCategorie() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
