/** created by yacine morakeb */
import java.util.ArrayList;

public class VectorHelper {

    private ArrayList<Double> vecteur = new ArrayList<Double>();
    private int Max;
    private int Min;

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


    /////********************************		Min et Max d un vecteur 	*****************************///////

    public void Max_et_Min(ArrayList<Double> v){

        int i ;

        this.Max = v.get(0);
        this.Min = v.get(0);

        for (i = 1 ; i < v.size() ; i++){

            if ( this.Max < v.get(i) )	{		this.Max = v.get(i) ; 		}
            if ( this.Min > v.get(i) )  { 		this.Min = v.get(i) ; 		}
        }

        System.out.println("le maximum de ce vecteur est  :    "+this.Max);
        System.out.println("le minimum de ce vecteur est  :    "+this.Min);


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
