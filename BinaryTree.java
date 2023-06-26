import java.util.PriorityQueue;
import java.util.ResourceBundle.Control;

import tools.Controls;
import tools.Colors;

public class BinaryTree {
    public Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value,0);
        }
    
        if (value < current.intvalue) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.intvalue) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
    
        if (value == current.value) 
        {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            
            if (current.left == null) {
                return current.right;
            }  

            int smallestValue = findSmallestValue(current.right);
            current.intvalue = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        } 
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public void printnodes(Node node,int x, int y, int w, int h) {
        if (node != null) 
        {
            Controls.Box(x-2,y-1,6,3,91,Colors.RED,Colors.BLACK_BACKGROUND);
            Controls.SetForegroundBackgroundColor(Colors.YELLOW,Colors.RED_BACKGROUND);
            Controls.printxy(x,y,node.get_intValue());            
            Controls.SetForegroundBackgroundColor(Colors.WHITE,Colors.BLACK_BACKGROUND);
            printnodes(node.left,x - (w/2),y + (h/2), w, h);
            printnodes(node.right,x + (w/2),y + (h/2), w, h);
        }
    }

    public void DisplayInfo()
    {
        //CreateNodes();
        Controls.cls();
        add(100);
        add(50);
        add(150);
        printnodes(root,10,5,10,10);
        //traverseInOrder(root);
        //delete(100);
        //traverseInOrder(root);
        //add(1);
        //traverseInOrder(root);
    }

    public void CreateNodes()
    {
        PriorityQueue<Node> Q = new PriorityQueue<Node>();
        
        Q.add(new Node('A',5));
        Q.add(new Node('Z',1));
        Q.add(new Node('X',9));
        Q.add(new Node('T',2));
        Q.add(new Node('R',13));

        while (!Q.isEmpty())
        {
            Node x = Q.poll();
            System.out.println(x.value + " : " + String.valueOf(x.weight));
        }
    }
}
