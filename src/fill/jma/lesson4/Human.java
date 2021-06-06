package fill.jma.lesson4;

public class Human {
   private String surname = "?";
   private  String name = "?";
   private boolean sex;
   private int age;
   private int height;
   private int weight;

   public Human() {
   }

   public Human(String surname, String name, boolean sex){
      if (surname !=null){
         this.surname = surname;
      }
      else {
         System.out.println("Invalid surname");
      }
      if (name != null){
         this.name = name
      }
      else {
         System.out.println("Invalid name");
      }
      this.sex = sex;
   }

   public Human

}
