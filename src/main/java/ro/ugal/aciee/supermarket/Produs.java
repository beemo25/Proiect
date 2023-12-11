package ro.ugal.aciee.supermarket;

public class Produs {
    String categorie;
    public double pret;
    public double cantitate;
    
//Constructorul fara argumente
    public Produs() {
        this.categorie = " ";
        this.pret = 0.0;
        this.cantitate=0.0;
    }
// Constructorul cu toate argumentele
    public Produs(String categorie, double pret,double cantitate) {
        this.categorie = categorie;
        this.pret = pret;
        this.cantitate=cantitate;
    }

    // Constructor de copiere
    public Produs(Produs produs) {
        this.categorie = produs.categorie;
        this.pret = produs.pret;
        this.cantitate=produs.cantitate;
    }

    //Getter pt pret
        public double getPret() {
        return pret;
    }
    
        
    //Subscrie o metoda din clasa parinte (java.lang.Object), este subscris la randul lui
  // Metoda toString         
    @Override
    public String toString() {
        return "Categorie: " + categorie +"\n";

    }
}