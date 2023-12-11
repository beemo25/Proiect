package ro.ugal.aciee.supermarket;

public class Carne extends Produs {
     String marca;
     String tipCarne;
     public String animal;
     String valabilitate;
    
     public Carne(){
        this.marca=" ";
        this.tipCarne=" ";
        this.valabilitate=" ";
        this.animal=" ";
       
        
    }
     
    public Carne (String categorie,double pret, String marca, String tipCarne, String animal, double cantitate, String valabilitate){
        super(categorie,pret,cantitate);
        this.marca=marca;
        this.tipCarne=tipCarne;
        this.animal=animal;
        this.valabilitate=valabilitate;
    }
    
    public Carne(Carne carne){
        super(carne);
        this.marca=carne.marca;
        this.tipCarne=carne.tipCarne;
        this.valabilitate=carne.valabilitate;
    }
    
     @Override
    public String toString() {
        return super.toString() +"\n"+
                "Pret: " +pret+" lei \n"+
                "Marca: " +marca+"\n"+ 
                "Tip Carne: " +tipCarne+ "\n"+ 
                "Animal provenienta: " +animal+"\n"+ 
                "Cantitate: " +cantitate+ " g \n"+ 
                "Data expirare: " +valabilitate;
    }
    
    
    
    
}
