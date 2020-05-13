package PGO9;

public class Car extends Vehicle{
    int numberOfSeats;

    public Car(int a) {
        this.numberOfSeats = a;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
