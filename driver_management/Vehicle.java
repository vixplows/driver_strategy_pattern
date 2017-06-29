package driver_management;

public abstract class Vehicle {

  protected String name;
  protected String colour;
  protected int productionYear;
  protected int averageSpeed;

  public Vehicle(String name, String colour, int productionYear, int averageSpeed){
    this.name = name;
    this.colour = colour;
    this.productionYear = productionYear;
    this.averageSpeed = averageSpeed;
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

}