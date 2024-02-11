package graphs.exercices.successor;

public class Successor {

   public static TreeNode inorderSucc(TreeNode node){
       if(node == null) {
           return null;
       }
       
       if(node.parent==null || node.right!=null){
           return leftMostChild(node.right);
       }else {
           TreeNode temp = node;
           TreeNode tempParent = temp.parent;
           while(tempParent!=null && tempParent.left != temp){
               temp = tempParent;
               tempParent = tempParent.parent;
           }
           return tempParent;
       }
   }

   public static TreeNode leftMostChild(TreeNode node){
       if(node==null){
           return null;
       }
       while(node.left!=null){
           node = node.left;
       }
       return node;
   }
}