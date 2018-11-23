public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Mobile mobile = new Mobile("Mobile","black","Mobile");
        mobile.call("your input message");

        Mobile iPhone = new iPhone("iPhone","white","iPhone");
        iPhone.call("your input message");

        Mobile android = new Android("Android","blue", "Andrioid");
        android.call("your input message");
        System.out.println(new App().getGreeting());
    }
}