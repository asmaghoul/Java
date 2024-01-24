import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String output;
        output = String.format("Hello %s, lovely to see you. How are you?", name);
            return output;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date now = new Date();
        return String.format("It is currently  %s", now);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")>=0) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
    }
    else if(conversation.indexOf("Alfred")>=0) {     
         return "At your service. As you wish, naturally.";   
        
    }

    else {      
        return "Right. And with that I shall retire."; 
    } 
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // Example Output: "Good evening, Beth Kane. Lovely to see you."
    public String guestGreeting(String name, String dayPeriod) {
        String output;
        output = String.format("Good %s , %s, Lovely to see you.",dayPeriod,name);
            return output;
    }
    
    // SENSEI BONUS SENSEI VERSION: Instead of a string for the day period, 
    //write the overloaded method with no parameters,
    // and use a Date object to determine the day period.
    public String guestGreeting() {
        Date today;
        String output;
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("EEE d MMM yy h:mm a");
        today = new Date();
        output = formatter.format(today);
        
        String dayPeriod;
        if (output.indexOf("pm")<0){
            dayPeriod="Evening";
        }
        else {
            dayPeriod="Morning";
        }
        String outputSensi;
        outputSensi = String.format("Good %s, Lovely to see you.",dayPeriod);
            return outputSensi;
    }


    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String angryAlfred(String name, String yellingWords) {
        String output;
        output = String.format("%s! %s",yellingWords,name);
            return output;
    }
}

