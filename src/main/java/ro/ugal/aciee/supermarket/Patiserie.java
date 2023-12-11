
package ro.ugal.aciee.supermarket;

public class Patiserie extends Produs{
   
    String dataExpirare;
    String ingrediente;
  
    
    public Patiserie(){

        this.dataExpirare=" ";
        this.ingrediente=" ";
       
        
    }
    
    
    public Patiserie(String categorie,double pret,double cantitate,String ingrediente,String dataExpirare)
    {
        super(categorie, pret,cantitate);
        this.dataExpirare=dataExpirare;
        this.ingrediente=ingrediente;
 
      
      
        
        
        
    }
    
    public Patiserie(Patiserie patiserie)
    {
        super(patiserie);
        this.ingrediente=patiserie.ingrediente;
        this.cantitate=patiserie.cantitate;
        this.dataExpirare=patiserie.dataExpirare;
       
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Pret: "+pret+" lei \n"+
                "Cantitate: "+cantitate+ " g \n"+
                "Ingrediente: "+ingrediente+"\n"+
                "Sa se consume pana la data de: "+dataExpirare;
    }
}
