
class Node {
  public int data;
  public Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }


}

class SinglyLinkedList {
  private Node first;
  private Node last;
  private int count;

  public SinglyLinkedList() {
    first = null;
    last = null;
    count = 0;
  }

  // Method of add element in the LinkedList
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

  // Mehtod of Size of LinkedList
  public int size() {
    return count;
  }

  // Method of display LinkedList
  public void display() {
    for (Node temp = first; temp != null; temp = temp.next) {
      System.out.print(temp.data + " --> ");
    }
    System.out.println("null");
  }

}

public class LLDemo {
  public static void main(String[] args) {

    SinglyLinkedList L = new SinglyLinkedList();

    L.add(11);
    L.add(22);
    L.add(33);

    System.out.print("LinkedList : ");
    L.display();

    System.out.println("Size : " + L.size());

  }
}
