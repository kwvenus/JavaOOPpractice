public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Mobile mobile = new Mobile("Mobile","black","Mobile");
        mobile.call("your input message");

        iPhone iPhone = new iPhone("iPhone","white","iPhone");
        iPhone.call("your input message");

        Android android = new Android("Android","blue", "Android");
        android.call("your input message");
        System.out.println(new App().getGreeting());

        Person venus = new Person("Venus", iPhone);
        venus.call("Hi I am Venus.");
        venus.call("Hi I am Venus. Hi I am Venus. Hi I am Venus.");

        Person alex = new Person("Alex", android);
        alex.call("Hi I am Alex.");
        alex.call("Hi I am Alex. Hi I am Alex. Hi I am Alex.");

        iPhoneRobot iPhoneRobot = new iPhoneRobot("iPhoneRobot1", iPhone, 1);
        iPhoneRobot.call("Hi I am iPhoneRobot1.");
    }
}