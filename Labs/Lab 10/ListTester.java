//CS110, Tushar Asthana 

// This Program runs five different functions over 100,000 times, to find the difference between the starting and ending times, thus showing 
//effiency of each function using ADT. 

import java.util.Random;

public class ListTester 
{

   public static void main(String[] args) 
   {
       // given code 
       final int N=100000;
       long time1,time2,diff;
       ListInterface<Integer> list1 = new ListArrayBased<>();
       ListInterface<Integer> list2 = new ListReferenceBased<>();
       
       Random r=new Random(12);
       
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list1.addBack(r.nextInt());
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in addition to the back of the list through Array based list : "+ diff + "ms");
       
       
       //time 1, for loop to run program, and time 2 to find difference 
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list2.addBack(r.nextInt());
       }
       
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in addition to the back of the list through Reference based list : "+diff + "ms");
       
       
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list1.addFront(r.nextInt());
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in addition to the front of the list through Array based list : "+diff + "ms");
       
       
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list2.addFront(r.nextInt());
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in addition to the front of the list through Reference based list : "+diff + "ms");
       
       
      //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list1.get(i);
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in getting index through Array based list : "+diff + "ms");
       
       
      //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N;i++)
       {
           list2.get(i);
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in getting index through Reference based list : "+diff + "ms");
       
       
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N/2;i++)
       {
           list1.removeFront();
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in removal from the front of the list through Array based list : "+diff + "ms");
      
      
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       
       for(int i=0;i<N/2;i++)
       {
           list2.removeFront();
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in removal from the front of list through Reference based list : "+diff + "ms");
      
      
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       
       for(int i=0;i<N/2;i++)
       {
           list1.removeBack();
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in removal from the back of the list through Array based list : "+diff + "ms");
      
      
       //time 1, for loop to run program, and time 2 to find difference
       time1=System.currentTimeMillis();
       for(int i=0;i<N/2;i++)
       {
           list2.removeBack();
       }
       time2=System.currentTimeMillis();
       diff=time2-time1;
       System.out.println("Time taken in removal from the back of the list through Reference based list : "+diff + "ms");
   }

}