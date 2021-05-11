/**
 * 
 */
package fr.encheresnobyl.encherestroc.bo;

import java.time.LocalDate;

/**
 * Classe en charge
 * @author Pierre
 * @version Encheres-Troc - v1.0
 * @date 11 mai 2021 - 09:06:05
 */
public class ArticleVendu {

	int noArticle;
	String nomArticle;
	String description;
	LocalDate dateDebutEncheres;
	LocalDate dateFinEncheres;
	int miseAPrix;
	int prixVente;
	boolean etatVente;
	
	
	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int miseAPrix) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
	}
	
	// -- GETTERS --
	
	/**
	 * Constructeur.
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 */
	public int getNoArticle() {
		return noArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}
	public int getMiseAPrix() {
		return miseAPrix;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public boolean isEtatVente() {
		return etatVente;
	}
	
	// -- SETTERS --
	
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	public void setEtatVente(boolean etatVente) {
		this.etatVente = etatVente;
	}
	
	
	
	
}
