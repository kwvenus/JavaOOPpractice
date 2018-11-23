public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void call(String message){
        System.out.println("Person: " + this.name + ", Mobile: " + this.mobile.getBrand());
        this.mobile.call(message);
        return;
    }

    public void changePhone(Mobile mobile){
        this.mobile = mobile;
    }
}
