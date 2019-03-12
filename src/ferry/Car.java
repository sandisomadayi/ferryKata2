package ferry;

public class Car {
    private String color2;
    private int passengers;
    public Car(String color, int numberOfPassengers) {
        this.color2 = color;
        this.passengers = numberOfPassengers;
    }

    public String getColor2(){
        return color2;
    }
    public int getPassengers() {
        return passengers;
    }
}
