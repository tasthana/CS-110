

class Node<E> 
{
   public E val;
   public Node<E> next;

   public Node(E val) 
   {
       this.val = val;
       this.next = null;
   }
}

public class ListReferenceBased<E> implements ListInterface<E> 
{
   private Node<E> head;
   private Node<E> tail;

   @Override
   public void addFront(E element) 
   {
       if (head == null) 
       {
           head = new Node<>(element);
           tail = head;
       } 
       
       else 
       {
           Node<E> n = new Node<>(element);
           n.next = head;
           head = n;
       }

   }

   @Override
   public void addBack(E element) 
   {
       Node<E> n=new Node<>(element);
       if (head == null) 
       {
           head = n;
           tail = head;
       } 
       
       else 
       {
           tail.next = n;
           tail = tail.next;
       }

   }

   @Override
   public E removeFront() 
   {
       if (head == null) 
       {
           return null;
       } 
       
       else 
       {
           E ret = head.val;
           if (head == tail)
               tail = null;
           head = head.next;
           return ret;
       }
   }

   @Override
   public E removeBack() 
   {
       Node<E> a = head;
       if (a == null)
           return null;
           
       if (head == tail)
           return removeFront();
           
       E ret = null;
       
       while (a.next.next != null) 
       {
           a = a.next;
       }
       
       ret = a.next.val;
       a.next = null;
       tail = a;
       return ret;
   }

   @Override
   public E get(int index) 
   {
       int i = 0;
       Node<E> a = head;
       while (a != null && i < index) 
       {
           a = a.next;
           i++;
       }
       if (a == null)
           return null;
       else
           return a.val;
   }

}