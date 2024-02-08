// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************


public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?


    public Labrador(String name,  String color)
    {
        //this has to call the parent constructor
        super(name);
        this.color = color;
    }


    public String bark()
    {
        return "Labrador barking";
    }

    public void waddle()
    {
        System.out.println(name + " is doing a York waddle");
    }

    public void eat(){
        System.out.println(name + " is eating a banana");
    }



}
