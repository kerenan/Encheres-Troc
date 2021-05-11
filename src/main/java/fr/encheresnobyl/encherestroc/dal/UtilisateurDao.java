/**
 * 
 */
package fr.encheresnobyl.encherestroc.dal;

import java.util.List;

import fr.encheresnobyl.encherestroc.bo.Utilisateur;

/**
 * Interface en charge de définir les méthodes du DAO Utilisateur
 * @author Pierre
 * @version Encheres-Troc - v1.0
 * @date 11 mai 2021 - 10:23:49
 */
public interface UtilisateurDao {
	
	/**
	 * Méthode en charge de récupérer une liste de l'ensemble des utilisateurs
	 * @return
	 */
	List<Utilisateur> selectAll();
	
	/**
	 * Méthode en charge de récupérer un utilisateur en fonction de son pseudo
	 * @param pseudo
	 * @return
	 */
	Utilisateur selectByPseudo(String pseudo);
	
	/**
	 * Méthode en charge de renvoyer un boolean en fonction de si l'email existe en BDD
	 * @param mail
	 * @return
	 */
	Boolean selectByMail(String mail);
	
	/**
	 * Méthode en charge de récupérer un utilisateur en fonction de son identifiant (pseudo ou mail)
	 * @param pseudo
	 * @return
	 */
	Utilisateur selectByIdentifiant(String identifiant);

}
