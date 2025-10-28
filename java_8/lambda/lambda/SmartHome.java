package lambda;
public class SmartHome{
 interface LightBehavior {
     void activate();
 }
public static void simulateTrigger(String triggerName, LightBehavior behavior) {
     System.out.println("Trigger: " + triggerName);
     behavior.activate();
     System.out.println();
 }

 public static void main(String[] args) {

     simulateTrigger("Motion", () -> {
         System.out.println("Motion detected: Turning on hallway lights.");
     });

     simulateTrigger("Time of Day", () -> {
         System.out.println("Evening time: Activating warm ambient lighting.");
     });

     simulateTrigger("Voice Command", () -> {
         System.out.println("Voice command received: Setting party mode lights.");
     });
 }
}



