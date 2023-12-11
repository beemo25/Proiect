package ro.ugal.aciee.supermarket;


public class Fructe extends Produs {
    String taraDeOrigine;
    boolean areSamburi;
    public String tipFruct;
    public String vitamine;
    String gustSpecific;

    public Fructe() {
        super();
        this.areSamburi = false;
        this.tipFruct = " ";
        this.vitamine = " ";
        this.gustSpecific = " ";
    }

    public Fructe(String categorie, double pret,String taraDeOrigine,double cantitate, boolean areSamburi, String tipFruct,String vitamine,String gustSpecific) {
        super(categorie, pret, cantitate);        
        this.taraDeOrigine=taraDeOrigine;
        this.areSamburi = areSamburi;
        this.tipFruct = tipFruct;
        this.vitamine = vitamine;
        this.gustSpecific = gustSpecific;
    }

    public Fructe(Fructe Fructe) {
        super(Fructe);
        this.areSamburi = Fructe.areSamburi;
        this.taraDeOrigine=Fructe.taraDeOrigine;
        this.tipFruct = Fructe.tipFruct;
        this.vitamine = Fructe.vitamine;
        this.gustSpecific = Fructe.gustSpecific;
    }

    @Override
    public String toString() {
        return "Fructe{ " + super.toString() +
               ", areSamburi=" + areSamburi + ", tipFruct='" + tipFruct +
               "', vitamine='" + vitamine + "',gustSpecific='" + gustSpecific + "'}";
    }
}
