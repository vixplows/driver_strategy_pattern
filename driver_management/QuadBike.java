package driver_management;
import behaviours.*;

public class QuadBike {
  String name;
  String colour;
  int productionYear;
  int averageSpeed;
  int engineCapacity;

  public QuadBike(String name, String colour, int productionYear, int averageSpeed, int engineCapacity){
    this.name = name;
    this.colour = colour;
    this.productionYear = productionYear;
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
  }

  // public Integer driveDistance(Integer distance){
  //   return ((distance) / this.averageSpeed) * 60;
  // }


}