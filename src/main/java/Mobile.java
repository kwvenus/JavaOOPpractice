public class Mobile{

    private String name;
    private String color;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message){
        this.basicInfo();
        System.out.println("Message : " + message + "\n");
        return;
    }

    public void basicInfo(){
        System.out.println("name: " + this.name + ", color: " + this.color + ", brand: " + this.brand);
        return;
    }
}
