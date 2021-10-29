import junit.framework.*;  

public class TestGreet extends TestCase {

   public void testHello(){
      String hello = Greeter.greet("Nandhini");
      assertTrue(hello.equals("Hello Nandhini!"));
   }

}
