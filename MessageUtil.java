package GitHub_Test;

public class MessageUtil {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message){
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage(){
	      System.out.println("Hello World");
	      return message;
	   }
		// returns the length of the message
	    public int getMessageLength() {
	       return message.length();
	}
}
