public class Room {
    private String floor;
    private String colour;
    private double square;

    public void setColour(String colours){
        colour = colours;
    }
    public void setFloor(String floorM){
        floor = floorM;
    }
    public void setSquare(double squares){
        square = squares;
    }

    public String getFloor(){ return floor; }
    public String getColour(){
        return colour;
    }
    public double getSquare(){
        return square;
    }


    public Room(){
        floor = "отсутствует";
        colour = "без цвета";
        square = 0;
    }
    public Room(String floorM, String colours, int squares){
        floor = floorM;
        colour = colours;
        square = squares;
    }
}
