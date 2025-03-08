
class Node {

  public int data;
  public Node next;

  Node(int data) {

    this.data = data;
    this.next = null;
  }

}

public class Demo {
  public static void main(String[] args) {

    Node f = new Node(11);
    Node s = new Node(22);
    Node l = new Node(33);

    f.next = s;
    s.next = l;
    l.next = null;

    System.out.println(f.data);
    System.out.println(f.next.data);
    System.out.println(f.next.next.data);

  }
}