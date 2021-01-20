class Source 
{
   public static void main(String[] args) 
   {
       // Write code here
       Person obj = new Person();
       obj.setName("Ankit");
   }
}

class Person {
   private String name;
   public String getName() {
       return name;
   }
   
   // Declare a setter method here
   public void setName(String newName) {
    this.name = newName;
  }
}
