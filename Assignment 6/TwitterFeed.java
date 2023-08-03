//Tushar Asthana, CS110 OL1, Assignment 6 

import java.util.ArrayList;
public class TwitterFeed 
{
   //decalre variables
   private String screenName;
   private ArrayList<Tweet> tweetList;
   public static final int INITIAL_CAPACITY=100;
   
   /**
   * @param the name of the tweeter
   */   public TwitterFeed(String name) 
   {
      screenName = name;
      tweetList = new ArrayList<Tweet>(INITIAL_CAPACITY);
   }
        
   // return the screenName
   public String getScreenName() 
   {
      return screenName;
   }
   
   
   // Creating array list and setting 100 tweet limit using constant
   public ArrayList<Tweet> getTweetList()
   {
      ArrayList<Tweet> list = new ArrayList<Tweet>();
      for(int i = 0; i<tweetList.size(); i++)
         list.add(tweetList.get(i));
         return list;
    }
   
   /**
   * @return the name and tweet text
   */
   public void addTweet(String name, String txt) 
   {
      Tweet twt = new Tweet(name,txt);
      tweetList.add(twt);
   }
   
   //overload method - not sure if this is the correct way to do it 
   public void addTweet(Tweet twt) 
   {
      tweetList.add(twt);
   }

   //implement toString method that prints the screen name of the owner of the feed, followed by all tweets on feed 
   public String toString() 
   {
      String str = screenName+"\n";
      for(int i = 0; i<tweetList.size(); i++) 
      {
         str += tweetList.get(i)+"\n";
      }
      return str;
   }
   
   
   //takes a String and returns a collection of Tweets in the feed, with the screen name specified by the parameter
   public ArrayList<Tweet> tweetBy(String name)
   {
      ArrayList<Tweet> list = new ArrayList<Tweet>();
      for(int i = 0; i<tweetList.size(); i++) 
      {
         if(tweetList.get(i).getScreenName().equals(name))
         list.add(tweetList.get(i));
      }
      return list;
    }
}