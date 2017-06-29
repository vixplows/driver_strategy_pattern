package driver_management;
import behaviours.*;

public class QuadBike extends Vehicle implements Driveable {
 
  private int engineCapacity;

  public QuadBike(String name, String colour, int productionYear, int averageSpeed, int engineCapacity){
    super(name, colour, productionYear, averageSpeed);

    this.engineCapacity = engineCapacity;
  }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }

 public double driveDistance(double distance){
    double timeRequired = (distance/this.averageSpeed) * 60;
    return timeRequired;
  }


}