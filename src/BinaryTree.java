
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
		public int key;
		public int value;
		private TreeNode(int key, int value)
		{
			this.key = key;
			this.value = value;
			left=null;
			right=null;
		}
	}
	
	public void insert(TreeNode root, int key, int value)
	{
		if(root == null)
			root = new TreeNode(key, value);
		else if(key < root.key)
			insert(root.left, key, value);
		else
			insert(root.right, key, value);
				
	}
	
	public void delete(int key)
	{
		
	}
	
}
