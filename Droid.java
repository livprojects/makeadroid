public class Droid {
    String name;
    int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void performsTask(String task) {
    System.out.println(name + " " + task + ".");
    batteryLevel = batteryLevel - 10;
  }

  public void energyReport() {
    System.out.println(name + "'s battery level is " + batteryLevel + "%.");
  }

  public String toString() {
    return "Let me introduce you to " + name + ", our new droid.";
  }
  public static void main(String [] args) {
    // Here you can choose your droid name //
    Droid newDroid = new Droid ("Karim");
    System.out.println(newDroid);
    /* Here you can choose what the droid does - please use present tense at the 3rd person singular, don't forget the 's' ! */    
    newDroid.performsTask("dances");
    newDroid.energyReport();

    newDroid.performsTask("sings");
    newDroid.energyReport();

    newDroid.performsTask("twirls");
    newDroid.energyReport();

    newDroid.performsTask("jumps");
    newDroid.energyReport();

    newDroid.performsTask("dances");
    newDroid.energyReport();

    /*Be careful not to drain all the droid's energy !*/

    if (newDroid.batteryLevel <= 0) {
      System.out.println("Unfortunately, " + newDroid.name + " has run out of battery. Please come back later.");
    } else {
      System.out.println("You can try another action !");
    }

  }
}