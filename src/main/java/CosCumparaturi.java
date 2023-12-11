import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import ro.ugal.aciee.supermarket.Bere;
import ro.ugal.aciee.supermarket.Carne;
import ro.ugal.aciee.supermarket.Dulciuri;
import ro.ugal.aciee.supermarket.Fructe;
import ro.ugal.aciee.supermarket.Lactate;
import ro.ugal.aciee.supermarket.Legume;
import ro.ugal.aciee.supermarket.Patiserie;
import ro.ugal.aciee.supermarket.Produs;
import ro.ugal.aciee.supermarket.Sucuri;


public class CosCumparaturi {
   
      
    private ArrayList<Object> produse; //pentru a stoca produsele in cos
    private double total; //totalul de plata

        
    //constructor fara argumente
    public CosCumparaturi() {
        this.produse = new ArrayList<>();
        this.total = 0.0;
    }
    //metoda adauga produsul in cos si adauga valoarea acestuia la total
    public void adaugaProdus(Object produs) {
        produse.add(produs);
        if (produs instanceof Produs) {
            total += ((Produs) produs).getPret();
        }

        System.out.println("Produs adaugat in cosul de cumparaturi.");

    }
//metoda afiseaza continutul cosului si totalul de plata, se va afisa cu doar 2 zecimale
    public void afiseazaCos() {
         if (produse.isEmpty()) {
            System.out.println("Cosul de cumparaturi este gol.");
        } else {
            System.out.println("Cosul de cumparaturi:");
            for (Object produs : produse) {
                System.out.println(produs);
                System.out.println("-----------------------------");
            }
             DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("Total: " + df.format(total) + " lei");
        }
    }
//afiseaza cosul cu metoda afiseazaCos, intreaba daca se doreste finalizarea cumparaturilor
    public void finalizeazaCumparaturi() {
        afiseazaCos();
        System.out.println("Doriti sa finalizati cumparaturile? (Da/Nu)");
        Scanner scanner = new Scanner(System.in);
        String raspuns = scanner.next();

        if (raspuns.equalsIgnoreCase("Da")) {
            System.out.println("Va multumim pentru cumparaturi! Mergi la plata.");
            produse.clear(); 
        } else {
            System.out.println("Continuati sa adaugati produse.");
        }
    }
//initializeaza obiecte pentru categoriile de produse, are un loop care se termina cand utilizatorul alege sa nu mai adauge produse
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CosCumparaturi cos = new CosCumparaturi();
        boolean continuaCumparaturile = true;
        boolean afisatMesaj = false;
        
        
         Lactate lactate1 = new Lactate("Lapte", 5.95 , "Zuzu" , "Lapte Semidegresat" ,1.5, "Vaca", 1, "27.11.2023", 185);
        Lactate lactate2 = new Lactate("Lapte", 9.05 , "Laptaria cu Caimac" , "Lapte cu Caimac" ,2.8, "Vaca", 1, "28.11.2023", 64);
        Lactate lactate3 = new Lactate("Iaurt", 5.45, "Kolios" , "Iaurt Grecesc" ,10, "Vaca", 150, "27.11.2023", 112);
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
       
       
        ArrayList<Lactate> lactateList = new ArrayList<>();
        lactateList.add(lactate1);
        lactateList.add(lactate2);
        lactateList.add(lactate3);
        lactateList.add(lactate4);
        lactateList.add(lactate5);
        lactateList.add(lactate6);
        lactateList.add(lactate7);
        
        ArrayList<Carne> carneList = new ArrayList<>();
        carneList.add(carne1);
        carneList.add(carne2);
        carneList.add(carne3);
        carneList.add(carne4);
        carneList.add(carne5);
        carneList.add(carne6);
        carneList.add(carne7);

        ArrayList<Legume> legumeList = new ArrayList<>();
        legumeList.add(legume1);
        legumeList.add(legume2);
        legumeList.add(legume3);
        legumeList.add(legume4);
        legumeList.add(legume5);
        legumeList.add(legume6);
        legumeList.add(legume7);

       ArrayList<Fructe> fructeList = new ArrayList<>();
        fructeList.add(fructe1);
        fructeList.add(fructe2);
        fructeList.add(frcute3);
        fructeList.add(fructe4);
        frcuteList.add(fructe5);
        fructeList.add(fructe6);
        fructeList.add(fructe7);
    

ArrayList<Dulciuri> dulciuriList=new ArrayList<>();
        dulciuriList.add(dulciuri1);
        dulciuriList.add(dulciuri2);
        dulciuriList.add(dulciuri3);
        dulciuriList.add(dulciuri4);
        dulciuriList.add(dulciuri5);
        dulciuriList.add(dulciuri6);
        dulciuriList.add(dulciuri7);


     ArrayList<Patiserie> patiserieList=new ArrayList<>();
       patiserieList.add(patiserie1);
       patiserieList.add(patiserie2);
       patiserieList.add(patiserie3);
       patiserieList.add(patiserie4);
       patiserieList.add(patiserie5);
       patiserieList.add(patiserie6);
       patiserieList.add(patiserie7);
    
        

        while (continuaCumparaturile) {
            System.out.println("Bun venit in Supermarket-ul nostru!");
            System.out.println("Cu ce va putem ajuta astazi?");
            System.out.println("1. Lactate");
            System.out.println("2. Carne");
            System.out.println("3. Patiserie");
            System.out.println("4. Dulciuri");
            System.out.println("5. Sucuri");
            System.out.println("6. Bere");
            System.out.println("7. Legume");
            System.out.println("8. Fructe");
            System.out.println("9. Oferte Lactate");
            System.out.println("10. Oferte Carne");
            System.out.println("11. Oferte Suc");
            System.out.println("12. Oferte Bere");
            System.out.println("13. Afiseaza cosul de cumparaturi");
            System.out.println("14. Finalizeaza cumparaturile");
           

            int alege = scanner.nextInt();

            switch (alege) {
                case 1: {
           
            
                System.out.println("Produse lactate disponibile:");
                System.out.println("1. " + lactate1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + lactate2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + lactate3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + lactate4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + lactate5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + lactate6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + lactate7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeLactate = scanner.nextInt();
                
                switch (alegeLactate) {
                    
                    case 1:
                        cos.adaugaProdus(lactate1);
                        break;
                    case 2:
                        cos.adaugaProdus(lactate2);
                        break;
                    case 3:
                        cos.adaugaProdus(lactate3);
                        break;
                    case 4:
                        cos.adaugaProdus(lactate4);
                        break;
                    case 5:
                        cos.adaugaProdus(lactate5);
                        break;
                    case 6:
                        cos.adaugaProdus(lactate6);
                        break;
                    case 7:
                        cos.adaugaProdus(lactate7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }

                
                case 2: {
                    
                  
                    
                    
                System.out.println("Produse carne disponibile:");
                System.out.println("1. " + carne1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + carne2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + carne3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + carne4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + carne5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + carne6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + carne7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeți un produs (introduceti numarul corespunzator):");
                int alegeCarne = scanner.nextInt();

                switch (alegeCarne) {
                    case 1:
                        cos.adaugaProdus(carne1);
                        break;
                    case 2:
                        cos.adaugaProdus(carne2);
                        break;
                    case 3:
                        cos.adaugaProdus(carne3);
                        break;
                    case 4:
                        cos.adaugaProdus(carne4);
                        break;
                    case 5:
                        cos.adaugaProdus(carne5);
                        break;
                    case 6:
                        cos.adaugaProdus(carne6);
                        break;
                    case 7:
                        cos.adaugaProdus(carne7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                case 3: {

                System.out.println("Produse de patiserie disponibile:");
                System.out.println("1. " + patiserie1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + patiserie2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + patiserie3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + patiserie4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + patiserie5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + patiserie6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + patiserie7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegePatiserie = scanner.nextInt();
                
                switch (alegePatiserie) {
                    
                    case 1:
                        cos.adaugaProdus(patiserie1);
                        break;
                    case 2:
                        cos.adaugaProdus(patiserie2);
                        break;
                    case 3:
                        cos.adaugaProdus(patiserie3);
                        break;
                    case 4:
                        cos.adaugaProdus(patiserie4);
                        break;
                    case 5:
                        cos.adaugaProdus(patiserie5);
                        break;
                    case 6:
                        cos.adaugaProdus(patiserie6);
                        break;
                    case 7:
                        cos.adaugaProdus(patiserie7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                case 4: {

                System.out.println("Dulciuri disponibile:");
                System.out.println("1. " + dulciuri1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + dulciuri2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + dulciuri3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + dulciuri4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + dulciuri5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + dulciuri6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + dulciuri7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeDulciuri = scanner.nextInt();
                
                switch (alegeDulciuri) {
                    
                    case 1:
                        cos.adaugaProdus(dulciuri1);
                        break;
                    case 2:
                        cos.adaugaProdus(dulciuri2);
                        break;
                    case 3:
                        cos.adaugaProdus(dulciuri3);
                        break;
                    case 4:
                        cos.adaugaProdus(dulciuri4);
                        break;
                    case 5:
                        cos.adaugaProdus(dulciuri5);
                        break;
                    case 6:
                        cos.adaugaProdus(dulciuri6);
                        break;
                    case 7:
                        cos.adaugaProdus(dulciuri7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                
                case 7: {

                System.out.println("Sucuri disponibile:");
                System.out.println("1. " + sucuri1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + sucuri2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + sucuri3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeSucuri = scanner.nextInt();
                
                switch (alegeSucuri) {
                    
                    case 1:
                        cos.adaugaProdus(sucuri1);
                        break;
                    case 2:
                        cos.adaugaProdus(sucuri2);
                        break;
                    case 3:
                        cos.adaugaProdus(sucuri3);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                case 6: {

                System.out.println("Bere disponibila:");
                System.out.println("1. " + bere1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + bere2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + bere3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + bere4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + bere5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeBere = scanner.nextInt();
                
                switch (alegeBere) {
                    
                    case 1:
                        cos.adaugaProdus(bere1);
                        break;
                    case 2:
                        cos.adaugaProdus(bere2);
                        break;
                    case 3:
                        cos.adaugaProdus(bere3);
                        break;
                    case 4:
                        cos.adaugaProdus(bere4);
                        break;
                    case 5:
                        cos.adaugaProdus(bere5);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                
                case 5: {

                System.out.println("Sucuri disponibile:");
                System.out.println("1. " + legume1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + legume2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + legume3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                 System.out.println("4. " + legume4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + legume5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + legume6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + legume7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeLegume = scanner.nextInt();
                
                switch (alegeLegume) {
                    
                    case 1:
                        cos.adaugaProdus(legume1);
                        break;
                    case 2:
                        cos.adaugaProdus(legume2);
                        break;
                    case 3:
                        cos.adaugaProdus(legume3);
                        break;
                    case 4:
                        cos.adaugaProdus(legume4);
                        break;
                    case 5:
                        cos.adaugaProdus(legume5);
                        break;
                    case 6:
                        cos.adaugaProdus(legume6);
                        break;
                    case 7:
                        cos.adaugaProdus(legume7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                
                case 8: {

                System.out.println("Fructe disponibile:");
                System.out.println("1. " + fructe1);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("2. " + fructe2);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("3. " + fructe3);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("4. " + fructe4);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("5. " + fructe5);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("6. " + fructe6);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("7. " + fructe7);
                System.out.println(" ");
                System.out.println("------------");
                System.out.println(" ");
                System.out.println("Alegeti un produs (introduceti numarul corespunzator):");
                int alegeBere = scanner.nextInt();
                
                switch (alegeBere) {
                    
                    case 1:
                        cos.adaugaProdus(fructe1);
                        break;
                    case 2:
                        cos.adaugaProdus(fructe2);
                        break;
                    case 3:
                        cos.adaugaProdus(fructe3);
                        break;
                    case 4:
                        cos.adaugaProdus(fructe4);
                        break;
                    case 5:
                        cos.adaugaProdus(fructe5);
                        break;
                    case 6:
                        cos.adaugaProdus(fructe6);
                        break;
                    case 7:
                        cos.adaugaProdus(fructe7);
                        break;
                    default:
                        System.out.println("Optiune invalida.");
                        break;
                }
                break;
            }
                case 9: 
                    for (Lactate lactate : lactateList) {
            if (lactate.pret < 10 && lactate.procentGrasime < 5) {
                 if (!afisatMesaj) {
            System.out.println("Lactatele care costa mai putin de 10 lei si au un procent de grasime mai mic de 5% sunt: \n");
            afisatMesaj = true;  
            }

           System.out.println(lactate);  
           System.out.println(" ");
           System.out.println(" ");
            }
              }
                  break;
                case 10:
                    for (Carne carne : carneList) {
            if (carne.animal.equals("Pui") && carne.cantitate >= 600) {
                 if (!afisatMesaj) {
            System.out.println("Carnea de pui cu gramaj mai mare de 600 de grame este : \n");
            afisatMesaj = true;  
            }

           System.out.println(carne);  
           System.out.println(" ");
           System.out.println(" ");
            }
              }
                  break;
                    
                
                case 11:{
           Sucuri[] sucuri={sucuri1,sucuri2,sucuri3};
        for(int i=0;i<3;i++){
            if(sucuri[i].calorii>200 && sucuri[i].pret>6 ){
                System.out.println("Sucurile cu mai mult de 200 calorii si mai scumpe de 6 lei sun " + (i+1)+'\n'+ sucuri[i]+'\n' );
            }
                
        }
        break;
       }  
                
                case 12:{
                     Bere[] bere={bere1,bere2,bere3,bere4,bere5};
        for(int i=0;i<5;i++){
            if(bere[i].calorii<300 || bere[i].pret<8){
                System.out.println("Berile cu mai putin de 300 calorii sunt si mai ieftine decat 5" + (i+1)+'\n'+ bere[i]+'\n' );
            }
        }
         break;
                    
                }
                    case 13:{
                  for (Dulciuri dulciuri : dulciuriList){
                      if(dulciuri.calorii<500 && dulciuri.pret<6.50){
                          if(!afisatMesaj){
                              System.out.println("Dulciurile care au mai putin de 500 kcal si pretul mai mic de 6.50 sunt :\n");
                                 afisatMesaj = true;  
                          }
                          
                            System.out.println(dulciuri);  
           System.out.println(" ");
           System.out.println(" ");
                      }
                }
                }
                case 14:{
                    for (Patiserie patiserie : patiserieList){
                    if(patiserie.ingrediente.equals("zahar")&& patiserie.cantitate >30){
                     if (!afisatMesaj) {
            System.out.println("Produsele de patiserie care contin zahar si care au cantintatea mai mare de 30 g sunt: \n");
            afisatMesaj = true; 
                }
                        System.out.println(patiserie);  
           System.out.println(" ");
           System.out.println(" ");
                }
                }
                    break;
                }
                case 15: {
                    cos.afiseazaCos();
                    break;
                }
                case 16:{

                    cos.finalizeazaCumparaturi();
                    continuaCumparaturile = false;
                    break;
                }
                default:
                    System.out.println("Optiune invalida.");
            }
        }
    }
}

    }
}
