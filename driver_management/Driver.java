package driver_management;
import behaviours.*;

public class Driver {
  String name;
  Driveable vehicle;

  public Driver(String name, Driveable vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName() {
    return this.name;
  }

  public Driveable getVehicle() {
    return this.vehicle;
  }

  public void setVehicle(Driveable vehicle) {
    this.vehicle = vehicle;
  }

  public double driveDistance(double distance) {
    double timeRequired = this.vehicle.driveDistance(distance);
    return timeRequired;
  }

}