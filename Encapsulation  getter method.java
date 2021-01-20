class Source {
   public static void main(String[] args) {
   
       // Write code here
       Person H = new Person("Ankit");
       System.out.println(H.getName());
   }
}
class Person {
   private String name;
   public Person(String name) 
   {       
       this.name = name;
   }

    public String getName()
   {
       return this.name;
   }
   
}
