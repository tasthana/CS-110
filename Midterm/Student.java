// Tushar Asthana, CS110 0L1, Midterm Coding Question 3 

public class Student
{
   private String name;       // Student name
   private String idNumber;   // Student ID (95#)
   private int year;          // Year admitted

   /**
      The Constructor sets the student's name,
      ID number, and year admitted.
      @param n The student's name.
      @param id The student's ID number.
      @param year The year the student was admitted.
   */

   public Student(String n, String id, int year)
   {
      name = n;
      idNumber = id;
      this.year = year;
   }

   /** getName()
       @return The Student's name
   */
   public String getName()
   {
      return name;
   }
   /** getId()
       @return The Student's id
   */
   public String getId()
   {
      return idNumber;
   }
   /** getYear()
       @return The Student's year admitted
   */
   public int getYear()
   {
      return year;
   }
   
   
   /**
    Copy Constructor copies all the fields from the previous passed student into new student 
   */
   public Student(Student student)
   {
      this.name = student.getName();
      this.idNumber = student.getId();
      this.year = student.getYear();
   } 
   
   /**        
   This method creates and compares students name and year
   @return a boolean 
   */

   public boolean equal(Student student)
   {
      return this.name.equals(student.getName()) && this.year == student.getYear(); 
   } 
   
   
   
   


}