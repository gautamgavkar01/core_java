public class Example1 {

    private String name = "Sandhya";
    private int age = 20;
    private long mobile = 9356628982L;
    private boolean status = true;

    public boolean getStatus()
    {
        return this.status;
    }

    public long getMobile()
    {
        return this.mobile;
    }

    public String getName()
    {
        return this.name;
    }

    public int getter(){
        return age;
    }

    public static void main(String[] args) {
        Example1 var = new Example1();
        System.out.println(var.age);
    }

}
