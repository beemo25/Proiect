package ro.ugal.aciee.supermarket;

public class Legume extends Produs {
    String taraDeOrigine;
    public String culoare;
    String tipLeguma;
    boolean esteEcologic;
    String vitamine;
    String perioadaCultivare;

    // Constructor fara argumente
    public Legume() {
        super();
        this.culoare = " ";
        this.tipLeguma= " ";
        this.esteEcologic=false;
        this.vitamine=" ";
        this.perioadaCultivare=" ";
    
    }

    // Constructor cu toate argumentele
    public Legume(String categorie, double pret,String taraDeOrigine,double cantitate, String culoare, String tipLeguma,boolean esteEcologic,String vitamine, String perioadaCultivare) {
        super(categorie, pret,cantitate);
        this.taraDeOrigine=taraDeOrigine;
        this.culoare = culoare;
        this.tipLeguma= tipLeguma;
        this.esteEcologic=esteEcologic;
        this.vitamine=vitamine;
        this.perioadaCultivare=perioadaCultivare;
    }

    // Constructor de copiere
    public Legume(Legume Legume) {
        super(Legume);
        this.culoare = Legume.culoare;
        this.taraDeOrigine=Legume.taraDeOrigine;
        this.tipLeguma= Legume.tipLeguma;
        this.esteEcologic=Legume.esteEcologic;
        this.vitamine=Legume.vitamine;
        this.perioadaCultivare=Legume.perioadaCultivare;
    }

    // Metoda toString 
    @Override
    public String toString() {
       return super.toString()+ "\n"+ "Culoare: "+culoare+"\n"+"Tip leguma: "+tipLeguma+"\n"+"Este ecologic: "+esteEcologic+"\n"+"\n"+"Vitamine: "+vitamine+"\n"+"Perioada de cultivare: "+perioadaCultivare;
            
    }
}
