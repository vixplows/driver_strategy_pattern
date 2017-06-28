import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {
  
  Driver driver;
  DodgemCar dodgemCar;
  QuadBike quadBike;

  @Before
  public void before() {
    driver = new Driver ("Penelope Pitstop", quadBike);
    dodgemCar = new DodgemCar("Bumper", "Blue", 2010, 10, 2);
  }

  @Test
  public void canGetName() {
    assertEquals("Penelope Pitstop", driver.getName());
  }

  @Test
  public void canGetVehicle() {
    assertEquals(quadBike, driver.getVehicle());
  }

  @Test
  public void canSetVehicle() {
    driver.setVehicle(dodgemCar);
    assertEquals(dodgemCar, driver.getVehicle());
  }

  @Test
  public void canGetDriveDistanceDodgemCar() {
    driver.setVehicle(dodgemCar);
    assertEquals((Integer)720, driver.driveDistance(120));
  }

  @Test
  public void canGetDriveDistanceQuadBike() {
    quadBike = new QuadBike("Quirky", "Magenta", 2015, 40, 250);
    driver.setVehicle(quadBike);
    assertEquals((Integer)180, driver.driveDistance(120));
  }

}