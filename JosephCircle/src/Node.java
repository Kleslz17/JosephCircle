/**
 * @author Nov17_
 * 节点类-为了构成环形链表而创建的节点
 */
public class Node {
    private int no;
    private Node next;

    public Node(int no){this.no = no;}

    public int getNo() {return no;}

    public void setNo(int no) {this.no = no;}

    public Node getNext() {return next;}

    public void setNext(Node next) {this.next = next;}
}
