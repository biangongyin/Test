import javax.swing.tree.TreeNode;

/**
 * 根据根节点的值计算树的高度
 * @author Administrator
 *
 */
public class Demo1 {

	public int height(TreeNode root) {
	       //如果根节点为空，直接返回树的深度为0
	        if(root == null){
	            return 0;
	        }
            TreeNode node = root;
            int leftHeight = 0;
            int rightHeight = 0;
            if (node!=null) {
                //利用递归，分别求左子树与右子树的深度
                leftHeight = height(node.left) + 1;
                rightHeight = height(node.right) + 1;
            }
            //取两深度的较大值
	        return leftHeight>rightHeight?leftHeight:rightHeight;
	    }
	

}
