/**
 *
 * @author roudet
 */
public class Fraise{
    private double prix;
    private String origine;

    public Fraise()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Fraise(double prix, String origine)
    {
	if(prix < 0)public class Orange {
    private double prix;
    private String origine;

    public Fraise()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Fraise(double prix, String origine)
    {
	if(prix < 0)
	    System.out.println("impossible de creer les fruits avec le prix negative ");
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix()
    {
        if(this.prix<0)
        {
            System.out.println("impossible de faire des fruit avec un prix negative");

        }
        else
            {
            return prix;
        }
	   return 0;
    }
	    System.out.println("impossible de creer les fruits avec le prix negative ");
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix()
    {
        if(this.prix<0)
        {
            System.out.println("impossible de faire des fruit avec un prix negative");

        }
        else
            {
            return prix;
        }
	   return 0;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){

        //Ecrire ici vos tests

	     System.out.println("premier test Orange");
   }
}
