import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class feedbackTest {

   String message = "Hello World";    
   MessageUtil messageUtil = new MessageUtil(message);
  
   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
    /*
     * @Test public void testMessageLength() {int expectedLength =
     * message.length(); int actualLength = messageUtil.getMessageLength();
     * assertEquals(expectedLength, actualLength); }
     */
   @Test
   public void testPrintMessageWithDifferentMessage() {
      String differentMessage = "Goodbye";
      MessageUtil differentMessageUtil = new MessageUtil(differentMessage);
      assertEquals(differentMessage, differentMessageUtil.printMessage());
   }
}

