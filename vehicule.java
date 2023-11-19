import java.util.Calendar;
import java.util.FormatFlagsConversionMismatchException;




public class vehicule {
    //attribus
    public String  modele ; 
    public int anneeAchat ; 
    public float prix ; 
    public String immatriculation ;
    public char permis ;

    //methode
    public int age()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear-anneeAchat);
    }

    public void afficherVehicule() {
        System.out.println("le modele de la voiture est : "+this.modele+" et son immatriculation est :"+this.immatriculation);
    }

    public float coutLocation()
    {
        int age = this.age();

        if(age <1)
        {
            return  (this.prix / 200) ;
        }
        else 
        {
            return ( this.prix / 250 );
        }
    }




    public vehicule(String mod,int achat,float prx,String immat,char prm) {
        this.modele = mod;
        this.anneeAchat = achat;
        this.prix = prx ;
        this.immatriculation = immat ; 
        this.permis = prm ; 
    }
}
