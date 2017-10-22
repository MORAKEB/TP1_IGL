import java.util.ArrayList;

public class VectorHelper {

    private ArrayList<Double> vecteur = new ArrayList<Double>();


    /////**************************************   Somme 2 vecteurs 	*********************************///////


    public ArrayList<Double> Sommer_deux_vecteur(ArrayList<Double> V1 , ArrayList<Double> V2)throws Tail_DiffException
    {

        if (V1.size() != V2.size())
        {
            throw new Tail_DiffException();
        }
        else{

            int i ;

            for( i = 0 ; i < V1.size(); i++) {
                this.vecteur.add( V1.get(i) + V2.get(i)) ;
            }

        }

        return vecteur ;
    }



    /////**********************************	  Inverser elements d un vecteur   ************************///////

    public ArrayList<Double>  Inverser_Vector(ArrayList<Double>  v)
    {
        int i ;			int j = v.size();



        for(i = 0 ; i < v.size() ; i++)
        {
            this.vecteur.add(v.get(j-1));
            j--;
        }

        return vecteur;
    }


    /////********************************		Afficher un vecteur 	*****************************///////

    public void AffichVector(){
        int i ;

        for(i = 0 ; i < this.vecteur.size() ; i++)
        {
            System.out.println("T["+i+"] = "+this.vecteur.get(i));
        }

    }



}
