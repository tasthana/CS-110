

// An author has instance variables to represent first name, last name and an email address (all strings).
// The Author class has two constructors; one constructor that takes three strings representing the names and email address 
// and a copy constructor.

public class Author 
{
    //declare instances 
	 private String name; 
	 private String email;
	 private String namep2;

    //method header with all the paramaters
	 public Author(String firstName, String emailListed, String lastName) 
    
    {
	 	name = firstName;
	 	email= emailListed;
	 	namep2 = lastName;
	 }
    
    //getter for First Name 
	 public String getFirstName()
    {
	 	return name;
	 }
	 
    //getter for Email 
    public String getEmail() 
    
    {
	 	return email;
	 }
    
    //getter for Last Name 
	 public String getLastName()
    {
	 	return namep2;
	 }
    
    //returns string line with all author information combined 
    //to string() method requireded in instruction 
	 public String toString()
    {
	 	String info = name + " "+ email + " <" + namep2 + ">";
	 	return info;
	 }
    
    //testing to see if author names match 
    //equals() method required in instructions 
    public boolean equals(Author Author2)
    {
      //if loop to find matches for Author first names
       if(name.equals(Author2.getFirstName()))
       {
         //if loop to find matches for Author last name 
         if(namep2.equals(Author2.getLastName()))
         {
            return true;
         }
         return false; 
        } 
      return false; 
    }
    
    
    //Copy Constructor 
    public Author(Author Author2)
    {
    
      name = Author2.getFirstName();
      email = Author2.getLastName();
      namep2 = Author2.getEmail();
    
    }
    
     
 }
      
      
    
    
    
    