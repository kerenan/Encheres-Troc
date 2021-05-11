/**
 * 
 */
package fr.encheresnobyl.encherestroc.dal;

import java.util.List;

import fr.encheresnobyl.encherestroc.bo.Utilisateur;

/**
 * Classe en charge
 * @author Pierre
 * @version Encheres-Troc - v1.0
 * @date 11 mai 2021 - 10:26:40
 */
public class UtilisateurDaoJdbcImpl implements UtilisateurDao{

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public Utilisateur selectByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public Boolean selectByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public Utilisateur selectByPseudoOrMail(String pseudo, String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
