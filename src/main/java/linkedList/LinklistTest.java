package linkedList;

public class LinklistTest {
    public static void main(String[] args) {

        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(1);
        myLinkList.add(2);
        myLinkList.add(3);
        myLinkList.add(4);
        myLinkList.add(5);
        myLinkList.add(6);
        myLinkList.add(7);


        myLinkList.printNode();
        Node node = new Node(1);
        myLinkList.linkDelete(node,2,3);
        System.out.println();
        myLinkList.printNode();
    }
}
