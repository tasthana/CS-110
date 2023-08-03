//Tushar Asthana, CS110 OL1, Assignment 6 - Tweet.java 


public class Tweet 
   {    
      //declare variables 
      private String screenName;
      private String text;        
      // declare final for character limit 
      public static final int MAX_CHARS=140;
        
      /**
      * @return the name and tweet text
      * @param name and tweet text 
      */
      public Tweet(String name, String txt) 
      {   
          //setting screen name, if-else loop for max chars validation 
          screenName = name;
          if(txt.length()>MAX_CHARS)
             text = txt.substring(0, 140);
          else
             text = txt;
      }
        
      
      public Tweet(Tweet twt) 
      {    
          screenName = twt.screenName;
          text=twt.text; 
      }
      
      /**
      * @return toString method 
      */
      public String toString() 
      {
          String str = "@";
          str += screenName+"\n";
          str += "\""+text+"\"";
          return str;
      }
      
      /**
      * @return boolean value
      * @param tweet 
      */
      public boolean equals(Tweet twt) 
      {
          if(screenName.equals(twt.screenName) && text.equals(twt.text))
             return true;
             return false;
      }
       
      //getter  
      public String getScreenName() 
      {
          return screenName;
      }
        
      //setter
      public void setScreenName(String screenName) 
      {
          this.screenName = screenName;
      }
        
      //getter
      public String getText() 
      {
          return text;
      }
        
      //setter 
      public void setText(String text) 
      {
          this.text = text;
      }
        
   }