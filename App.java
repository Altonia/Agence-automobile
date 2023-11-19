public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("Hello, World!");

      
      //question 1
        voiture c1 = new voiture(true, "twingo",2023,10000,"AB­123­CD",'B');

        c1.afficherVoiture();
        //question 2

        camion c2 = new camion(25,"J9",2008,20000,"1234­AB­56",'B');

        c2.afficherCamion();

        if(c2.peutTransporterVolume(7)){
            System.out.println("le camion c2 peut transportzer 7 m cubes");
        }
        else  System.out.println("le camion c2 ne  peut pas transportzer 7 m cubes");

        //question 3

        System.out.println("le cout de location de la twingo est : "+c1.coutLocation());
        System.out.println("le cout de location du camion j9 est : "+c2.coutLocation());
        
        //question 4

        autocar c3 = new autocar(53,3,"FRI", 2005, 90000,"123­AB­45", 'D');

        if(c3.peutTransporterPassagers(40,0.1)){
            System.out.println("l'autocar peut transporter les 40 passagers");
        }
        else  System.out.println("l'autocar ne  peut pas transportzer les 40 passagers");
    }
}
//question 5 : mettre  tout les attribus et methoe en public 