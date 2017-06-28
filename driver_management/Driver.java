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
}