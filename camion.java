
public class camion extends vehicule {
    public double volume ;


    public boolean peutTransporterVolume (double x)
    {
        if(x <= this.volume )
        return true;
        else return false ;
    }

    public void afficherCamion ()
    {
        super.afficherVehicule();
        System.out.println(" et a comme volume :"+this.volume );
    }


    public camion (double vol ,String mod,int achat,float prx,String immat,char prm){
        super(mod, achat, prx, immat, prm);
        this.volume = vol ; 
    }

}
