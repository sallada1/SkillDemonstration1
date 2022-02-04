import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoAbsProdTest {
   @Test
   public void product(){
       assertEquals(10,SkillDemoAbsProd.absproduct(2, -5));
   } 
}
