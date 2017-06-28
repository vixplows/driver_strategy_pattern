package driver_management;
import behaviours.*;

public class QuadBike implements Driveable {
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

  public String getName() {
    return this.name;
  }

  public String getColour() {
    return this.colour;
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public int getAverageSpeed() {
    return this.averageSpeed;
  }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }

 public Integer driveDistance(int distance){
    int timeRequired = (distance/this.averageSpeed) * 60;
    return timeRequired;
  }


}