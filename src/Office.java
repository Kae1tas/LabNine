public class Office extends Room{
    private String type = "Office";
    public Office(String floor, String colour, int square){
        super(floor, colour, square);
    }

    public String toString(){
        return type+" "+getColour()+" "+getFloor()+" "+getSquare();
    }
}
