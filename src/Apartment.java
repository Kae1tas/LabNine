public class Apartment extends Room{
    private String type = "Apartment";
    public Apartment(String floor, String colour, int square){
        super(floor, colour, square);
    }
    public String toString(){
        return type+" "+getColour()+" "+getFloor()+" "+getSquare();
    }
}
