public class Problem1 {

    private String name = "Sandhya";
    private int age = 20;
    private long mobileNo = 8989898989L;
    private boolean status = true;

    //Set name and get name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Set age and get age
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age1)
    {
        this.age = age1;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); //10
        a = 20;
        System.out.println(a); //20
    }
}
