package GitHub_Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class feedback {

   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);
@Test public void testMessageLength() { 
  int expectedLength = message.length(); 
  int actualLength = messageUtil.getMessageLength(); 
   assertEquals(expectedLength, actualLength); }
   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
