package tree;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        MyTree myTree = new MyTree();
        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(3);

        MyTree myTree1 = new MyTree();
        myTree1.insert(1);
        myTree1.insert(2);
        myTree1.insert(4);


        System.out.println(MyTree.isSameTree(myTree1.root,myTree.root));
    }
}
