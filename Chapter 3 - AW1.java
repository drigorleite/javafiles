public class Pet {
   private String name;
   private String animal;
   private int age;

   public void setName(String n) {
      name = n;
   }

   public void setAnimal(String a) {
      animal = a;
   }

   public void setAge(int a) {
      age = a;
   }

   public String getName() {
      return name;
   }

   public String getAnimal() {
      return animal;
   }

   public int getAge() {
      return age;
   }

   public static void main(String[] args) {
      Pet myPet = new Pet();
      myPet.setName("Buddy");
      myPet.setAnimal("Dog");
      myPet.setAge(3);

      System.out.println("Name: " + myPet.getName());
      System.out.println("Animal: " + myPet.getAnimal());
      System.out.println("Age: " + myPet.getAge());
   }
}
