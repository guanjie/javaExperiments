package chapter2;

public class Q4 {

	public static Node partitionList(int num, Node node){
		if (node == null)
			return null;
		Node runner = node;
		Node left = null;//Initialize the node first.
		Node right = null;

		if(runner.data<num)
			left = new Node(runner.data);
		else if(runner.data>=num)
			right = new Node(runner.data);

		if(runner.next == null){//Starting Pt needs Special Attention.
			return Q4.addTwoList(left, right);
		}
		
		while(runner.next!=null){//if next not null
			if(runner.data<num){
				left.appendNode(runner.data);
			} else if(runner.data >=num){
				right.appendNode(runner.data);
			}
			
			runner = runner.next;
		}
		
		return addTwoList(left, right);
	}

	public static Node addTwoList(Node left, Node right){
		if(left == null){
			return right;
		} else if ( right == null ){
			return left;
		} else {
			Node runner = left;
			while(runner.next!=null){
				runner = runner.next;
			}
			runner.next = right;
			return left;
		}
	}
}
