public class Bank {
    public static void main(String[] args) {
        Person1 obj = new Person1();
//        System.out.println(obj);

//        System.out.println(obj.getName());
//        System.out.println(obj.getDOB());
//        System.out.println(obj.getBankName());
//        System.out.println(obj.getBranch());
//        System.out.println(obj.getAccountNumber());
//        System.out.println(obj.getIFSC());

        /*
        * 1. Check the bank -
        * 3. Check Its branch
        * 4. Check name and DOB
        * 5. provide bank details
        *
        * */


        /*
        * Q. Check the bank if it is your bank then check branch if branch is if it is also correct then check accountNumber if acc no is wrong
        * then print message "your account number does not exists!" if it is correct change your name and birthdate after changing
        * Display all the bank details.
        *
        * Q. Create 4 class called student1,2,3,4 each student class having their name, marks and create one more class called school, "Develop price ceremony system"
        * Create one more class called Price, firstPrice = 10000, 5000, 1000
        * if marks >= 95, then give one award "Price, Student of the year and Certificate"  price(value)
        * if marks >= 80, "price, certifiate"
        * if marks < 80, "price, certificate"
        * */

        if(obj.getBankName() == "BOI")
        {
            if(obj.getBranch() == "chandgad")
            {
                if(obj.getName() == "sandhya jayvant gavkar" && obj.getDOB() == "03-03-2005")
                {
                    //Do some task
                    System.out.println("Your account number is : " + obj.getAccountNumber());
                    System.out.println("Your IFSC code is " + obj.getIFSC());
                }
                else
                {
                    System.err.println("Account does not exists!");
                }
            }
            else
            {
                System.err.println("This is not your head/main branch, Contact your main branch!");
            }
        }
        else
        {
            System.err.println("Your bank is different please visit your proper bank");
        }
    }
}
