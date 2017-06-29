package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private int numberOfSeats;

  public DodgemCar(String name, String colour, int productionYear, int averageSpeed, int numberOfSeats){
    super(name, colour, productionYear, averageSpeed);
    this.numberOfSeats = numberOfSeats;
  }

  public int getNumberOfSeats() {
    return this.numberOfSeats;
  }

  public double driveDistance(double distance){
    double timeRequired = (distance/this.averageSpeed)*60;
    return timeRequired;
  }

}