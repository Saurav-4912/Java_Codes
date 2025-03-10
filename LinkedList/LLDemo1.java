import java.util.StringJoiner;

class SinglyLinkedListt {
  private Node first;
  private Node last;
  private int count;

  // Inner class for Node
  private static class Node {

    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // constructor of SinglyLinkedList class
  public SinglyLinkedListt() {
    first = null;
    last = null;
    count = 0;
  }

  // Add into LinkedList
  public void add(int element) {
    if (first == null) {
      Node temp = new Node(element);
      first = temp;
      last = temp;
      count++;
    } else {
      Node temp = new Node(element);
      last.next = temp;
      last = last.next;
      count++;
    }

  }

  // size of LinkedList
  public int size() {
    return count;
  }

  // Display Of LinkedList
  public void display() {
    for (Node temp = first; temp != null; temp = temp.next) {
      System.out.print(temp.data + " -> ");
    }
    System.out.println("null");
  }

   // toString method to display LinkedList
   public String toString() {
		
    // Attempt-1 //No. of times you are creating object and immediatly you are destroying 
  //   String s = "[";
  //    for(Node T = first ; T!=null; T=T.next)
  //     {
  //      s = s + T.data + ",";
    
  //  }
  //    s = s.substring(0,s.length()-1); 
  //    s=s+"]"; 
  //    return s.toString();
    
   

		StringJoiner sj = new StringJoiner(",", "[", "]");

		for (Node T = first; T != null; T = T.next) {
			sj.add(String.valueOf(T.data));
		}

		return sj.toString();
}



public void addLast(int element){
  add(element);
}
 

}

public class LLDemo1 {
  public static void main(String[] args) {
    SinglyLinkedListt L = new SinglyLinkedListt();

    L.add(11);
    L.add(22);
    L.add(33);

    System.out.println(L);
    System.out.println("Size : " + L.size());
    L.display();

    L.addLast(99);
    System.out.println(L);
  }
}
