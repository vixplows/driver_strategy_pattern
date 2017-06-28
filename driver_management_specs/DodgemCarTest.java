import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar("Bumper", "Blue", 2010, 5, 2);
  }

  @Test
  public void hasName() {
    assertEquals("Bumper", dodgemCar.getName());
  }

  @Test
  public void hasColour() {
    assertEquals("Blue", dodgemCar.getColour());
  }

}
