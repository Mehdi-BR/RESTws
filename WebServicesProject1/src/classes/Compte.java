package classes;

import java.util.Date;


public class Compte {

    public Long code;
    public Double solde;
    public Date dateDeCreation;

    public Compte(Long code, Double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }
}
