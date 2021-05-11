/**
 * 
 */
package fr.encheresnobyl.encherestroc.bo;

import java.time.LocalDate;

/**
 * Classe en charge
 * @author Pierre
 * @version Encheres-Troc - v1.0
 * @date 11 mai 2021 - 10:24:38
 */
public class Enchere {
	
	LocalDate dateEnchere;
	int montantEnchere;
	
	
	
	 //--GETTERS--
	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	
	//--SETTERS--
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	
	
}
