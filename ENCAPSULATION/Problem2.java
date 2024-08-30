public class Problem2 {
  public static void main(String[] args) {
    Problem1 var = new Problem1();

    // var.name = "Nidhi"; //In case you will get one compile time error

    // Set name and get Name
    System.out.println(var.getName());
    var.setName("Nidhi");
    System.out.println(var.getName());

    // Set age and get age
    System.out.println(var.getAge());
    var.setAge(21);
    System.out.println(var.getAge());

  }
}
