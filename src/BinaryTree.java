
public class BinaryTree {

	public TreeNode head;
	public BinaryTree()
	{
		head = null;
	}
	
	public class TreeNode
	{

		public TreeNode left;
		public TreeNode right;
		public int data;
		private TreeNode(int data)
		{
			this.data = data;
			left=null;
			right=null;
		}
	}
	
	public void addNode(int data)
	{
		TreeNode newNode = new TreeNode(data);
		if (head == null)
			head = newNode;
		else insert(head, newNode);
			
	}
	
	private void insert(TreeNode head, TreeNode newNode)
	{
		if(newNode.data < head.data)
			if(head.left == null)
				head.left=newNode;
			else
				insert(head.left, newNode);
		else
			if(head.right==null)
				head.right=newNode;
			else
				insert(head.right, newNode);
				
	}
	
	public void deleteNode()
	
}
