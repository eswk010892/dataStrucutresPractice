
public class BinaryTree {
	Node root;
class Node{
	int key;
	Node left,right;
	Node(int item){
		key = item;
		left = right = null; 
	}
	}
BinaryTree(int key){
	root = new Node(key);
	}
BinaryTree(){
	root = null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinaryTree tree = new BinaryTree(1);
      tree.root.left = tree.new Node(2);
      tree.root.right =tree.new Node(3);
      tree.root.left.left = tree.new Node(4);
      System.out.println(tree.root.left.left);
	}

}
