public class Room {
    private String floor;
    private String colour;
    private double square;

    //public void setType(String types){
   //     type = types;
   // }
    public void setColour(String colours){
        colour = colours;
    }
    public void setFloor(String floorM){
        floor = floorM;
    }
    public void setSquare(double squares){
        square = squares;
    }

    //public String getType(){return type;}
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
        //type = "черновая";
    }
    public Room(String floorM, String colours, int squares){
        floor = floorM;
        colour = colours;
        square = squares;
        //type = types;
    }
}
