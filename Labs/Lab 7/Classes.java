

class A {
   private int variable;
   public A()
   {
      System.out.println("class A default constructer");
   }
   public void function1(int a)
   {
      System.out.println("class A function 1 ");
   }
   public void function2(int a)
   {
      System.out.println("class A function 2");
   }
   public void function3(int a)
   {
      System.out.println("class A function 3");
   }
    
class B extends A
{
   private int a;
   private int b;
   
   public B() 
   {
      System.out.println("class B default constructor");
   }
   public void function2(int b)
   {
      System.out.println("class B function 2");
   }
   public void function3(double b)
   {
      System.out.println("class B function 3");
   }
   public void function4(int b)
   {
      System.out.println("class B function 4");
   }
}

}
