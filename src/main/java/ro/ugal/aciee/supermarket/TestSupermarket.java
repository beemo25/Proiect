package ro.ugal.aciee.supermarket;
import java.util.Scanner;

public class TestSupermarket {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Obiecte pentru fiecare categorie de produs
        Lactate lactate1 = new Lactate("Lapte", 5.95 , "Zuzu" , "Lapte Semidegresat" ,1.5, "Vaca", 1, "27.11.2023", 185);
        Lactate lactate2 = new Lactate("Lapte", 9.05 , "Laptaria cu Caimac" , "Lapte cu Caimac" ,2.8, "Vaca", 1, "28.11.2023", 64);
        Lactate lactate3 = new Lactate("Iaurt", 5.45, "Kolios" , "Iaurt Grecesc" ,10, "Vaca", 150, "27.11.2023", 132);
        Lactate lactate4 = new Lactate("Iaurt", 4.99, "Kolios" , "Iaurt cu Fructe" ,2, "Vaca", 150, "29.11.2023", 94);
        Lactate lactate5 = new Lactate("Branza", 20.49 , "Olympus" , "Telemea" ,20, "Capra", 350, "25.11.2023", 261);
        Lactate lactate6 = new Lactate("Branza", 38.29 , "Olympus" , "Feta" ,15, "Capra, Oaie", 400, "25.11.2023", 276);
        Lactate lactate7 = new Lactate("Branza", 6.89 , "LaDorna" , "Branza Proaspata" ,5.5, "Vaca", 170, "25.11.2023", 96);
      

        Carne carne1 = new Carne("Carne", 22.99, "Agricola" , "Piept de Pui" , "Pui", 650, "5 zile");
        Carne carne2 = new Carne("Carne", 27.99, "Carmangerie" , "Ceafa de porc" , "Porc", 650, "7 zile");
        Carne carne3 = new Carne("Carne", 37.99, "Carmangerie" , "Carne Tocata" , "Vita", 670, "3 zile");
        Carne carne4 = new Carne("Carne", 25.99, "Agricola" , "Carne Tocata" , "Pui", 650, "4 zile");
        Carne carne5 = new Carne("Carne", 16.99, "Agricola" , "Aripioare" , "Pui", 550, "7 zile");
        Carne carne6 = new Carne("Carne", 18.99, "Agricola" , "Pulpe" , "Pui", 650, "7 zile");
        Carne carne7 = new Carne("Carne", 77.99, "Carmangerie" , "Antricot Vita Angus" , "Vita", 750, "7 zile");
       
        
        Dulciuri dulciuri1= new Dulciuri("Ciocolata",3.99,28,"cocos,zahar,glucoza,lapte condensat,ciocolata","Bounty","30.11.2023",23.4,14,134);
        Dulciuri dulciuri2=new Dulciuri("Ciocolata",10.95,250,"unt de cacao,migdale,lapte condensat,zahar pudra,fulgi de cocos,ulei de palmier","Raffaello","21.12.2024",45,5.4,234);
        Dulciuri dulciuri3=new Dulciuri("Jeleuri",6.50,120,"zahar,coloranti alimentari,gelatina,glucoza,suc de portocala,suc de ananas,suc de lamaie","Haribo","12.12.2023",5.5,80,325);
        Dulciuri dulciuri4=new Dulciuri("Biscuiti",4.99,200,"zahar,cacao,lapte,faina de grau,ulei de palmier,sare,agenti de afanare","Oreo","23.02.2024",56.3,65,500);
        Dulciuri dulciuri5=new Dulciuri("Budinca",5.67,65,"zahar,lapte,ciocolata,vanilie","Milbona","21.11.2023",37,2.25,74);
        Dulciuri dulciuri6=new Dulciuri("Bomboane",7.56,76,"zahar,menta,sirop de glucoza,ulei de cocos,arome naturale","Mentos","23.10.2024",28,1.62,89);
        Dulciuri dulciuri7=new Dulciuri("Baton proteic",4.35,67,"cereale,zahar,bucati de ciocolatacu lapte,faina de orez","Fitness","14.05.2025",13,5.6,75);
       
       Patiserie patiserie1=new Patiserie("Foietaj cu caise",5.63,35,"foietaj,gluten,dulceata de caise,zahar pudra","22.11.2023");
       Patiserie patiserie2=new Patiserie("Placinta cu mere",3.55,46,"foi de placinta,gluten,mere,scortisoara,ahar pudra","23.11.2023");
       Patiserie patiserie3=new Patiserie("Covrig cu ciocolata",4.32,32,"aluat,gluten,ciocolata,zahar","21.11.2023");
       Patiserie patiserie4=new Patiserie("Strudel cu visine",3.99,43,"aluat,dulceata de visine,zahar pudra","24.11.2023");
       Patiserie patiserie5=new Patiserie("Melc cu nuca",3.25,33,"aluat,nuca tocata,zahar,crema de vanilie","30.11.2023");
       Patiserie patiserie6=new Patiserie("Branzoaica",2.56,25,"aluat,branza dulce,zahar,esenta de vanilie","25.12.2023");
       Patiserie patiserie7=new Patiserie("Gogoasa cu ciocolata",4.23,16,"drojdie,zahar pudra,ciocolata,sare","23.12.2023");
        
       
        Sucuri sucuri1 = new Sucuri("Suc", 5.25 , "Coca-Cola" , "Suc carbogazos", "Cola" ,0.5 , "27.12.2025", 200, 55);
        Sucuri sucuri2 = new Sucuri("Suc", 6.89 , "Fuzetea" , "Suc necarbogazos" , "Piersici", 1.5, "24.04.2024", 230, 44);
        Sucuri sucuri3 = new Sucuri("Suc", 11.63 , "Santal" , "Nectar ","portocale" , 1 , "27.11.2023", 350,90);
  

        Bere bere1 = new Bere("Bere", 7.91 , "Peroni" , "Bauturua alcoolica" , "Blonda", 5.1, "-", 0.66, "12.12.2023", 500);
        Bere bere2 = new Bere("Bere", 11.90 , "Timisoreana", "Bauturua alcoolica" , "Blonda", 5 , "-", 2.5 , "23.11.2024", 600);
        Bere bere3 = new Bere("Bere", 12.72, "Grivita", "Bautura alcoolica artizanala", "Gold", 4.6,"-", 0.5, "01.15.2025", 341);
        Bere bere4 = new Bere("Bere", 4.50, "Ciuc" , "Bautura racoritoare  nonacloolica", "Radler", 0, "Zmeura si lamaie", 0.33, "30.1.2025", 103);
        Bere bere5 = new Bere("Cidru", 6.43 , "Strongbow" , "Bautura racoritoare alcoolica" , "Cidru", 6, "Capsuni", 0.33,"25.8.2026", 162);

        
         Legume legume1= new Legume("Morcovi",3.29,"Romania",1.6,"portocaliu","radacinoasa",true,"Vitamina A,B6,B7","Martie");
       Legume legume2=new Legume("Rosii",8.49,"Belgia",1.2,"rosu","Salano-fructoase",false,"Vitamine C,E,K,B3,B6","Mai");
       Legume legume3=new Legume("Castraveti",10.99,"Olanda",1.8,"verde","Bostanoase",false,"Vitamine C,K,B2,B6","Iunie");
       Legume legume4=new Legume("Conopida",7.49,"Romania",2.5,"alb","Varzoase",true,"Vitamine C,K,B6","Iulie");
       Legume legume5=new Legume("Ardei gras",8.10,"Ungaria",800,"galben","Salano-fructoase",false,"Vitamine C,K,B6","Aprilie");
       Legume legume6=new Legume("Ceapa",2.49,"Romania",1.9,"rosie","Bulboase",true,"Vitamine C,A,K,Acid folic","Martie");
       Legume legume7=new Legume("Vanata",15.99,"Olanda",3.1,"mov","Salano-fructoase",true,"Vitamine C,K,B1","Mai");
       
       Fructe fructe1=new Fructe("Mere",5.99,"Romania",3.2,true,"Cultura locala","Vitamine C,E,B2,B6","Dulce-acrisor");
       Fructe fructe2=new Fructe("Portocale",7.55,"Africa de Sud",2.5,true,"Exotic","Vitamine C,A,B2,K","Dulce-acrisor");
       Fructe fructe3=new Fructe("Prune",4.30,"Romania",1.1,true,"Cultura locala","Vitamine C,K,B3,B6","Dulce");
       Fructe fructe4=new Fructe("Ananas",10.99,"Brazilia",759,false,"Exotic","Vitamine C,A,B,B1","Dulce-acrisor");
       Fructe fructe5=new Fructe("Struguri",12.50,"Romania",542,true,"Cultura locala","Vitamine C,B,B2","Dulce");
       Fructe fructe6=new Fructe("Piersici",9.99,"Spania",1.2,true,"Cultura locala","Vitamine C,A,K,B2,B6","Dulce-acrisor");
       Fructe fructe7=new Fructe("Pere",5.99,"Romania",1.3,true,"Cultura locala","Vitamine C,B2,K","Dulce");
       
       
        // Meniul principal
        System.out.println("Bun venit in Supermarket-ul nostru!");
        System.out.println("Cu ce va putem ajuta astazi?");
        System.out.println("1. Lactate");
        System.out.println("2. Carne");
        System.out.println("3. Dulciuri");
        System.out.println("4. Patiserie");
        System.out.println("5. Sucuri");
        System.out.println("6. Bere");
        System.out.println("7. Legume");
        System.out.println("8. Fructe");


        int alege=scanner.nextInt();
        // folosit pentru a executa diferite blocuri de cod în funcție de ce alegi. Matrice de obiecte
                switch(alege){
                    case 1: {
                        Lactate[] lactateArray = new Lactate[10];
                        lactateArray[0] = lactate1;
                        lactateArray[1] = lactate2;
                        lactateArray[2] = lactate3;
                        lactateArray[3] = lactate4;
                        lactateArray[4] = lactate5;
                        lactateArray[5] = lactate6;
                        lactateArray[6] = lactate7;
                        
                        System.out.println("Produse lactate:"); //Afisarea produselor
                        for (Lactate lactate : lactateArray) {
                            if (lactate != null) {
                                System.out.println(lactate);
                                System.out.println("-----------------------------");
                                System.out.println("                             ");
                            }
                        }  break; }
                    case 2: {
                        Carne[] carneArray = new Carne[10];
                        carneArray[0] = carne1;
                        carneArray[1] = carne2;
                        carneArray[2] = carne3;
                        carneArray[3] = carne4;
                        carneArray[4] = carne5;
                        carneArray[5] = carne6;
                        carneArray[6] = carne7;
                        
                        System.out.println("Produse carne:");
                        for (Carne carne : carneArray) {
                            if (carne != null) {
                                System.out.println(carne);
                                System.out.println("-----------------------------");
                                System.out.println("                             ");
                                
                            }}break;}
                            
                    case 3: {
                         Dulciuri[] dulciuriArray = new Dulciuri[10];
                 dulciuriArray[0]=dulciuri1;
                 dulciuriArray[1]=dulciuri2;
                 dulciuriArray[2]=dulciuri3;
                 dulciuriArray[3]=dulciuri4;
                 dulciuriArray[4]=dulciuri5;
                 dulciuriArray[5]=dulciuri6;
                 dulciuriArray[6]=dulciuri7;
                 
                 System.out.println("Dulciuri: ");
                 for(Dulciuri dulciuri : dulciuriArray){
                     if(dulciuri != null){
                         System.out.println(dulciuri);
                         System.out.println("----------------------");
                         System.out.println("                      ");
                     }
                 }
                 break;}
                    
                     case 4: {
                 Patiserie[] patiserieArray= new Patiserie[10];
                 patiserieArray[0]=patiserie1;
                  patiserieArray[1]=patiserie2;
                  patiserieArray[2]=patiserie3;
                   patiserieArray[3]=patiserie4;
                   patiserieArray[4]=patiserie5;
                    patiserieArray[5]=patiserie6;
                     patiserieArray[6]=patiserie7;
                     
                     System.out.println("Produse din patiserie: ");
                     for (Patiserie patiserie : patiserieArray){
                         if(patiserie != null){
                             System.out.println(patiserie);
                             System.out.println("----------------------");
                             System.out.println("                      ");
                             
                         }
                     }break;
             }
                    case 5: {
                        Sucuri[] sucuriArray = new Sucuri[10];
                        sucuriArray[0] = sucuri1;
                        sucuriArray[1] = sucuri2;
                        sucuriArray[2] = sucuri3;

                        System.out.println("Produse Racoritoare:");
                        for (Sucuri sucuri : sucuriArray) {
                            if (sucuri != null) {
                                System.out.println(sucuri);
                                System.out.println("-----------------------------");
                                System.out.println("                             ");
                            }
                        }  
                    break;}
                    
                    case 6: {
                        Bere[] bereArray = new Bere[10];
                        bereArray[0] = bere1;
                        bereArray[1] = bere2;
                        bereArray[2] = bere3;
                        bereArray[3] = bere4;
                        bereArray[4] = bere5;
                        
                        System.out.println("Produse alcoolice :");
                        for (Bere bere : bereArray) {
                            if (bere != null) {
                                System.out.println(bere);
                                System.out.println("-----------------------------");
                                System.out.println("                             ");
                                
                            }}
                            break;}
                    
                    case 7: {
                 Legume[] legumeArray = new Legume[10];
                 legumeArray[0]=legume1;
                 legumeArray[1]=legume2;
                 legumeArray[2]=legume3;
                 legumeArray[3]=legume4;
                 legumeArray[4]=legume5;
                 legumeArray[5]=legume6;
                 legumeArray[6]=legume7;
                 
                 System.out.println("Legume: ");
                 for(Legume legume : legumeArray){
                     if(legume != null){
                         System.out.println(legume);
                         System.out.println("----------------------");
                         System.out.println("                      ");
                     }
                 }break;
             }
                    case 8: {
                Fructe[] fructeArray= new Fructe[10];
                fructeArray[0]=fructe1;
                fructeArray[1]=fructe2;
                fructeArray[2]=fructe3;
                fructeArray[3]=fructe4;
                fructeArray[4]=fructe5;
                fructeArray[5]=fructe6;
                fructeArray[6]=fructe7;
                     
                     System.out.println("Fucte: ");
                     for (Fructe fructe : fructeArray){
                         if(fructe != null){
                             System.out.println(fructe);
                             System.out.println("----------------------");
                             System.out.println("                      ");
                             
                         }
                     }break;
             }
                            
                            
                            
                            default:
                            System.out.println("Nu avem acest produs. Ne cerem scuze!");
                            break;
                            
                        
            }
        
       



}}