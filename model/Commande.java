package model;

import java.util.*;

public class Commande  {
	
	// Attributs
	
	public static int totalCom;
	private int idCom;
	private Date dateAchat;
	private String modePaiement;
	private Client client;
	public Set<Livre> listLivres;
	
	// Constructeur
	
	public Commande(Date dA, Client c, String mdp) {
		dateAchat= dA;
		modePaiement = mdp;
		client=c;
		idCom = totalCom;
		totalCom++;
	}
    
    public Date getDateAchat() {
    	return dateAchat;
    }
    
    public void setNom(Date a) {
    	dateAchat = a;
    }
    
    public String getModePaiement() {
    	return modePaiement;
    }
    
    public void setModePaiement(String a) {
    	modePaiement = a;
    }
    
    public String getClient() {
    	return modePaiement;
    }
    
    public void setClient(Client a) {
    	client = a;
    }
}
