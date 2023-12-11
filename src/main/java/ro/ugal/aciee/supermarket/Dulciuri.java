package ro.ugal.aciee.supermarket;


public class Dulciuri extends Produs {
    String marca;
    String dataExpirare;
    double carbohidrati;
    double proteine;
    String ingrediente;
    int calorii;
    
public Dulciuri(){
        this.marca=" ";
        this.carbohidrati=0.0;
        this.dataExpirare=" ";
        this.proteine=0.0;
        this.calorii=0;
        this.ingrediente=" ";
       
        
}

public Dulciuri(String categorie,double pret,double cantitate,String ingrediente,String marca,String dataExpirare,double carbohidrati, double proteine,int calorii)
{
    super(categorie,pret,cantitate);
    this.marca=marca;
    this.dataExpirare=dataExpirare;
    this.carbohidrati=carbohidrati;
    this.ingrediente=ingrediente;
    this.proteine=proteine;
    this.calorii=calorii;
   
    
}


public Dulciuri(Dulciuri dulciuri)
{
    super(dulciuri);
     this.marca=dulciuri.marca;
    this.proteine=dulciuri.proteine;
    this.carbohidrati=dulciuri.carbohidrati;
    this.ingrediente=dulciuri.ingrediente;
    this.dataExpirare=dulciuri.dataExpirare;
     this.calorii=dulciuri.calorii;
     
} 


@Override
public String toString()
{
    return super.toString()+ "\n"+ 
            "Marca: "+marca+"\n"+
            "Pret: "+pret+" lei \n"+
            "Categorie dulce: "+categorie+"\n"+
            "Cantitate produs: "+cantitate+" g \n"+
            "Proteine: "+proteine+"\n"+
            "Carbohidrati: "+carbohidrati+"\n"+
            "Valoare Energetica per 100 g:" +calorii +" kcal"+"\n"+
            "Valoare energetica per "+cantitate+" g:" +calorii+" kcal \n"+
            "Ingrediente produs: "+ingrediente+"\n"+
            "Data expirarii: "+dataExpirare;
            
            
}
}