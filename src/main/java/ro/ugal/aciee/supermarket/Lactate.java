package ro.ugal.aciee.supermarket;

public class Lactate extends Produs {
    String marca;
    String tipLactat;
    String dataExpirare;
    public double procentGrasime;
    int calorii;
    String animal;
    
    public Lactate(){
        this.marca=" ";
        this.tipLactat=" ";
        this.dataExpirare=" ";
        this.procentGrasime=0.0;
        this.calorii=0;
        this.animal=" ";
       
        
    }
    
    public Lactate(String categorie, double pret, String marca, String tipLactat, double procentGrasime, String animal, int cantitate,String dataExpirare, int calorii){
        super(categorie, pret,cantitate);
        this.marca=marca;
        this.animal=animal;
        this.tipLactat=tipLactat;
        this.calorii=calorii;
        this.procentGrasime = procentGrasime;
        this.dataExpirare=dataExpirare;
    }
    
    public Lactate(Lactate lactate){
        super(lactate);
        this.marca=lactate.marca;
        this.animal=lactate.animal;
        this.tipLactat=lactate.tipLactat;
        this.calorii=lactate.calorii;
        this.procentGrasime=lactate.procentGrasime;
        this.dataExpirare=lactate.dataExpirare;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Marca: " +marca+"\n"+ 
                "Tip lactate: " +tipLactat+ "\n"+ 
                "Pret: " +pret+ " lei \n"+
                "Procent Grasime: " +procentGrasime+ "%\n"+ 
                "Animal provenienta: " +animal+"\n"+ 
                "Cantitate: " +cantitate+ " l/g \n"+ 
                "Calorii: " +calorii+ "\n"+ 
                "Data expirare: " +dataExpirare;
    }
    
    
    
    
}

