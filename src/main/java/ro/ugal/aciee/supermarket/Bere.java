package ro.ugal.aciee.supermarket;

public class Bere extends Produs {
    String tipBere;
    String sortiment;
    double alcool;
    String aroma;
    String marca;
    String dataExpirare;
    int calorii;
    
    public Bere() {
        this.tipBere=" ";
        this.aroma=" ";
        this.sortiment=" ";
        this.alcool=0.0;
        this.marca=" ";
        this.dataExpirare=" ";
        this.calorii=0;
    }    
    

    public Bere (String categorie, double pret, String marca, String tipBere,String sortiment, double alcool, String aroma,double cantitate, String dataExpirare, int calorii){
        super (categorie, pret, cantitate);
        this.marca=marca;
        this.dataExpirare=dataExpirare;
        this.calorii=calorii;
        this.tipBere=tipBere;
        this.sortiment=sortiment;
        this.alcool=alcool;
        this.aroma=aroma;
    }
    
    public Bere(Bere bere){
        super(bere);
        this.marca=bere.marca;
        this.dataExpirare=bere.dataExpirare;
        this.calorii=bere.calorii;
        this.tipBere=bere.tipBere;
        this.sortiment=bere.sortiment;
        this.alcool=bere.alcool;
        this.aroma=bere.aroma;
    }

     @Override
    public String toString() {
        return super.toString()+"\n"+
                "Marca: " +marca+"\n"+ 
                "Tip Bere: " +tipBere+ "\n"+ 
                "Pret: " +pret+ " lei \n"+
                "Aroma: " +aroma+"\n"+
                "Sortiment:" +sortiment+ "\n"+
                "Cantitate: " +cantitate+ "litri \n"+ 
                "Calorii: " +calorii+ "kcal\n"+ 
                "Alcool:" +alcool+ "grame \n"+
                "Data expirare: " +dataExpirare;
    }
    
    
    
    
}
