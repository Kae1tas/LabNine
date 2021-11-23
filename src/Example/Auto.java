package Example;

public class Auto {
    private String firm;
    public String plateNumber;
    private int maxSpeed;

    public void setFirm(String firma){
        firm=firma;
    }
    public void setPlateNumber(String pNumber) {
        plateNumber = pNumber;
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public String getPlateNumber() {
        return plateNumber;
    }

    public Auto(){
        firm="Без названия";
        maxSpeed=0;
    }
    public Auto(String firma, int speed){
        firm=firma;
        maxSpeed=speed;
    }
}

