import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar("Bumper", "Blue", 2010, 10, 2);
  }

  @Test
  public void hasName() {
    assertEquals("Bumper", dodgemCar.getName());
  }

  @Test
  public void hasColour() {
    assertEquals("Blue", dodgemCar.getColour());
  }

  @Test
  public void hasProductionYear() {
    assertEquals(2010, dodgemCar.getProductionYear());
  }

  @Test
  public void hasAverageSpeed() {
    assertEquals(10, dodgemCar.getAverageSpeed());
  }

  @Test
  public void hasNumberOfSeats() {
    assertEquals(2, dodgemCar.getNumberOfSeats());
  }

  @Test
  public void getDriveDistance() {
    assertEquals((Integer)720, dodgemCar.driveDistance(120));
  }



}
