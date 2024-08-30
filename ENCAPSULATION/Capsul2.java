public class Capsul2 {
  public static void main(String[] args) {
    Capsul1 ref = new Capsul1();
    // System.out.println(ref.name); //CTE

    System.out.println(ref.getName());

    /*
     * ----Compile time error when you try to update the value
     * which is present inside the private variable------
     * 
     * System.out.println(ref.name);
     * ref.name = "Nidhi";
     * System.out.println(ref.name);
     */

    ref.setName("Nidhi");
    System.out.println(ref.getName());
  }
}
