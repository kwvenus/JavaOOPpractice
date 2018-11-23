public class iPhone extends Mobile{

    private int limit = 20;

    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        this.basicInfo();
        if (this.limitExceed(message,this.limit) == true){
            return;
        }
        System.out.println("<" + this.getBrand() + "> Message : " + message + "\n");
        return;
    }
}
