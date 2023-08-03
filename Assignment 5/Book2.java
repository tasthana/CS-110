

public class Book
{
   private String isbn;
   private String title;
   private String publisher; 
   Author author;
   private int pages; 
   
   public Book(String bkIsbn, String bkTitle, String bkPub, Author author, int numPages)
   {
      isbn = bkIsbn;
      title = bkTitle;
      publisher = bkPub;
      author = author;
      pages = numPages; 
   }
      
   public String getBkIsbn()
   {
      return isbn;
   }
   
   public String getBkTitle()
   {
      return title;
   }
   
   public String getBkPub()
   {
      return publisher;
   }
   
   public Author getAuthor()
   {
      return author;
   } 
   
   public int getNumPages()
   {
      return pages;
   } 
   
   
   public Book(Book Book)
   {
      title = Book.getBkTitle();
      isbn = Book.getBkIsbn();
      publisher = Book.getBkPub();
      author = Book.getAuthor();
      pages = Book.getNumPages(); 
   } 
   
   public String toString()
   {
      String info = title + "," + author + "," + isbn;
      return info; 
   } 
   
   public boolean equals(Author author2)
   {
      if (author.equals(Author2.getFirstName()))
      {
         if (author.equals(Author2.getLastName()))
         {
            return true;
         }
         return false;
      }
      return false;
   } 
}  