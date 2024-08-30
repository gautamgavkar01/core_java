public class Enh2 {
    public static void main(String[] args) {
        Enh1 obj = new Enh1();

//        System.out.println(obj.getName());
////        System.out.println(obj.rollNo); //CTE
//        System.out.println("Original : " + obj.getRollNo());
//        obj.setRollNo(20);
//        System.out.println("Updated : " + obj.getRollNo());
//
//        System.out.println("Original : " + obj.getContactNumber());
//        obj.setContactNumber(9356628982L);
//        System.out.println("Updated : " + obj.getContactNumber());


        if(obj.getAge() >= 18)
        {
            System.out.println("Your mobile number is : " + obj.getContactNumber());
        }
        else
        {
            System.out.println("You are now kid! play games!");
        }

    }
}
