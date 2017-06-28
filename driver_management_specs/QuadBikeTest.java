import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadBike;

  @Before
  public void before() {
    quadBike = new QuadBike ("Quirky", "Magenta", 2015, 45, 250);
  }

  @Test
  public void hasName() {
    assertEquals("Quirky", quadBike.getName());
  }

  @Test
  public void hasColour() {
    assertEquals("Magenta", quadBike.getColour());
  }

  @Test
  public void hasProductionYear() {
    assertEquals(2015, quadBike.getProductionYear());
  }

  @Test
  public void hasAverageSpeed() {
    assertEquals(45, quadBike.getAverageSpeed());
  }

  @Test
  public void hasEngineCapacity() {
    assertEquals(250, quadBike.getEngineCapacity());
  }


}