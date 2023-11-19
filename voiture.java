
public class voiture extends vehicule {

//attribus 
    public boolean autoradio ; 
    
    public void ajouterAutoradio ()
    {
        this.autoradio = true ;
    }

    public void enleverAutoradio ()
    {
        this.autoradio = false ;
    }

    public void afficherVoiture ()
    {
        super.afficherVehicule();
        if(this.autoradio)
        System.out.println("et dispose d'une autoradio ");
        else 
        System.out.println("et ne dispose pas d'une autoradio ");

    }

    public voiture (boolean auto ,String mod,int achat,float prx,String immat,char prm) {
        super(mod,achat,prx,immat,prm);
        this.autoradio = auto ;
    }
}
