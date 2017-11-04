package treepackage;


public interface BinaryTreeInterface<T> extends TreeInterface<T>, 
                                                TreeIteratorInterface<T>
{
  /** Sets an existing binary tree to a new one-node binary tree.
      @param rootData   an object that is the data in the new treeÕs root */
  public void setTree(T rootData);
  
  /** Sets an existing binary tree to a new binary tree.
      @param rootData   an object that is the data in the new treeÕs root
      @param leftTree   the left subtree of the new tree
      @param rightTree  the right subtree of the new tree */
  public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                  BinaryTreeInterface<T> rightTree);
} // end Bina