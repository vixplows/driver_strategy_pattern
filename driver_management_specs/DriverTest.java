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
  }

  @Test
  public void canGetName() {
    assertEquals("Penelope Pitstop", driver.getName());
  }

  @Test
  public void canGetVehicle() {
    assertEquals(quadBike, driver.getVehicle());
  }

}