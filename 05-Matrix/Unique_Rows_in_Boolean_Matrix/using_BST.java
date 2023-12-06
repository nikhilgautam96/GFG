// Time : O( row * col + row * log(row) ), Space: O(row). 

package Matrix.Unique_Rows_in_Boolean_Matrix;
import java.util.*;
class GFG{
  static class BST {
    int data;
    BST left,right;
    BST(int v){
      this.data = v;
      this.left = this.right = null;
    }
  }
  final  static int ROW = 4;
  final  static int COL = 5;
  // convert array to decimal
  static int convert(int arr[]) {
    int sum = 0;

    for(int i = 0; i < COL; i++)
    {
      sum += Math.pow(2,i)*arr[i];
    }
    return sum;
  }

  // print the column represented as integers
  static void print(int p) {
    for(int i = 0; i < COL; i++)
    {
      System.out.print(p%2+" ");
      p /= 2;
    }
    System.out.println();
  }



  // Insert function definition.
  static BST Insert(BST root, int value) { 
    if(root == null) { 
      // Insert the first node, if root is null. 
      return new BST(value); 
    } 

    //if the value is present
    if(value == root.data)
      return root;

    // Insert data. 
    if(value > root.data) { 
      // Insert right node data, if the 'value' 
      // to be inserted is greater than 'root' node data. 

      // Process right nodes. 
      root.right = Insert(root.right, value); 
    } 
    else { 
      // Insert left node data, if the 'value' 
      // to be inserted is greater than 'root' node data. 

      // Process left nodes. 
      root.left = Insert(root.left, value); 
    } 

    // Return 'root' node, after insertion. 
    return root; 
  }

  // Inorder traversal function.
  // This gives data in sorted order.
  static void Inorder(BST root) { 
    if(root == null) { 
      return; 
    } 
    Inorder(root.left); 
    print( root.data ); 
    Inorder(root.right); 
  }

  // The main function that prints
  // all unique rows in a given matrix.
  static void findUniqueRows(int M[][]) {

    BST b, root = null;

    // Traverse through the matrix
    for(int i = 0; i < ROW; i++) {
      // insert the row into BST
      root=Insert(root, convert(M[i]));
    }
    //print 
    Inorder(root); 
  }

  // Driver Code
  public static void main(String[] args) { 
    int M[][] = {{0, 1, 0, 0, 1}, 
                 {1, 0, 1, 1, 0}, 
                 {0, 1, 0, 0, 1}, 
                 {1, 0, 1, 0, 0}}; 

    findUniqueRows(M); 
  } 
}
