package ferry;

public class Ferry {
    private int cars;
    private int people;
    private int usedSpace;
    private int usedSeats;
    public Ferry(int numberOfCars, int peopleCount) {
        this.cars = numberOfCars;
        this.people = peopleCount;
    }

    public int getCars() {
        return cars;
    }

    public int getPeople() {
        return people;
    }

    public String board() {
        if (usedSeats < people) {
            if (usedSpace < cars) {
                return "accept";
            }
            else {
                return "rejected";
            }
        }
        else {
            return "rejected";
        }
    }
}
