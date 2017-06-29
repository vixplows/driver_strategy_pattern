package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {
  // String name;
  // String colour;
  // int productionYear;
  // int averageSpeed;
  private int numberOfSeats;

  public DodgemCar(String name, String colour, int productionYear, int averageSpeed, int numberOfSeats){
    super(name, colour, productionYear, averageSpeed);
    // super(colour);
    // super(productionYear);
    // super(averageSpeed);
    this.numberOfSeats = numberOfSeats;
  }

  // public String getName() {
  //   return this.name;
  // }

  // public String getColour() {
  //   return this.colour;
  // }

  // public int getProductionYear() {
  //   return this.productionYear;
  // }

  // public int getAverageSpeed() {
  //   return this.averageSpeed;
  // }

  public int getNumberOfSeats() {
    return this.numberOfSeats;
  }

  public Integer driveDistance(int distance){
    int timeRequired = (distance/this.averageSpeed)*60;
    return timeRequired;
  }

}