public class Capsul1 {

    private String name = "Sandhya";
    //Getter method --> Getter method it is used to get the data
    // which is present inside the private member
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
       this.name = name;   //We trying to inialize the value from local variable to global variable
    }

    public static void main(String[] args) {
        Capsul1 obj = new Capsul1();
        System.out.println(obj.name);
    }

}
