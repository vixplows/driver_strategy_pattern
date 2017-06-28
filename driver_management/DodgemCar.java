package driver_management;
import behaviours.*;

public class DodgemCar {
  String name;
  String colour;
  int productionYear;
  int averageSpeed;
  int numberOfSeats;

  public DodgemCar(String name, String colour, int productionYear, int averageSpeed, int numberOfSeats){
    this.name = name;
    this.colour = colour;
    this.productionYear = productionYear;
    this.averageSpeed = averageSpeed;
    this.numberOfSeats = numberOfSeats;
  }

  public String getName() {
    return this.name;
  }

  // public Integer driveDistance(Integer distance){
  //   return ((distance) / this.averageSpeed) * 60;
  // }

}