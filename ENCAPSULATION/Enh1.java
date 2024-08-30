public class Enh1 {

    private String name = "Sandhya";
    private int rollNo = 23;
    private int age = 16;
    private long contactNumber = 9898989898L;


    //Getter method for age

    public int getAge()
    {
        return this.age;
    }

    //Getter & Setter method for name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Getter & Setter method for rollNo

    public int getRollNo()
    {
        return this.rollNo;
    }

    public void setRollNo(int num)
    {
        this.rollNo = num;
    }

    //Getter & Setter method for ContactNumber

    public long getContactNumber()
    {
        return this.contactNumber;
    }

    public void setContactNumber(long number)
    {
        this.contactNumber = number;
    }




    public static void main(String[] args) {
        Enh1 obj = new Enh1();
        System.out.println("Original value : " + obj.name);
        obj.name = "Nidhi";
        System.out.println("Updated value : " + obj.name);
        System.out.println("Original value : " + obj.rollNo);
        obj.rollNo = 10;
        System.out.println("Updated value : " + obj.rollNo);
        System.out.println(obj.contactNumber);
    }

}
