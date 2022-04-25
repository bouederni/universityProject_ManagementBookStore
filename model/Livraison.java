package model;

import java.io.Serializable;
import java.util.*;

public class Livraison extends Commande implements Serializable  {
	
	// Attributs
	
    public String etat;
    public Employe livreur;
    public Date dateLiv;
    public float prixLiv = 0;
    
    // Constructeurs
    
    public Livraison(String dA, Client c, Vector<Livre> set, Magasin m, Employe l, Date dl) {
    	super(dA,c,set);
    	livreur = l;
    	dateLiv = dl;
	}
    
    public String getEtat() {
    	return etat;
    }
    
    public void setEtat(String a) {
    	etat = a;
    }
    
    public Date getDateLiv() {
    	return dateLiv;
    }
    
    public void setDateLiv(Date a) {
    	dateLiv = a;
    }
    
    public float getPrixLiv() {
    	return prixLiv;
    }
    
    public void setPrixLiv(int a) {
    	prixLiv = a;
    }
}
