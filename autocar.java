public class autocar extends camion {

     public int nbPassagers ;

   public boolean peutTransporterPassagers (int nbPassagers,double volumeMoy )
   {
        if(super.peutTransporterVolume(volumeMoy*nbPassagers) && (this.nbPassagers >= nbPassagers))
        {
            return true ;
        }
        else return false ;
   }

   public void afficherAutocar ()
   {
        super.afficherCamion();
        System.out.println("et a : "+this.nbPassagers+"nombre de passagers " );
   }

   public autocar (int nbp,double vol ,String mod,int achat,float prx,String immat,char prm){
    super(vol, mod, achat, prx, immat, prm);
    this.nbPassagers = nbp ; 
   }
}
