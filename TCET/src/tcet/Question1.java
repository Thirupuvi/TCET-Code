package tcet;


@FunctionalInterface 
interface Sayable {
    
    String say(String message);
}

public class Question1 {
    public static void main(String[] args) {
    
        Sayable sayable = (message) -> {
            
            return "haii, " + message + "😀 welcom.";
        };

    
        String greeting = sayable.say("Thiru");

      
        System.out.println(greeting);
    }
}
