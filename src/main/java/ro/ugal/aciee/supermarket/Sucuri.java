package ro.ugal.aciee.supermarket;

public class Sucuri extends Produs {
    String tipSuc;
    String aroma;
    double zahar;
    String marca;
    String dataExpirare;
    int calorii;
    
    public Sucuri() {
        this.tipSuc=" ";
        this.aroma=" ";
        this.zahar=0.0;
        this.marca=" ";
        this.dataExpirare=" ";
        this.calorii=0;
    }

    public Sucuri (String categorie, double pret, String marca, String tipSuc,String aroma, double cantitate, String dataExpirare, int calorii,double zahar){
        super (categorie, pret, cantitate );
        this.marca=marca;
        this.dataExpirare=dataExpirare;
        this.calorii=calorii;
        this.tipSuc=tipSuc;
        this.aroma=aroma;
        this.zahar=zahar;
        
    }
    
    public Sucuri(Sucuri sucuri){
        super(sucuri);
        this.marca=sucuri.marca;
        this.dataExpirare=sucuri.dataExpirare;
        this.calorii=sucuri.calorii;
        this.tipSuc=sucuri.tipSuc;
        this.aroma=sucuri.aroma;
        this.zahar=sucuri.zahar;
    }

     @Override
    public String toString() {
        return super.toString()+"\n"+
                "Marca: " +marca+"\n"+ 
                "Tip Suc: " +tipSuc+ "\n"+ 
                "Pret: " +pret+ " lei \n"+
                "Aroma: " +aroma+"\n"+ 
                "Cantitate: " +cantitate+ "litri \n"+ 
                "Calorii: " +calorii+ "kcal\n"+ 
                "Zahar:" +zahar+ "grame \n"+
                "Data expirare: " +dataExpirare;
    }
    
    
    
    
}
