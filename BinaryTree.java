// import java.util.Scanner;

// public class BinaryTree {
//     static Scanner sc=null;
//     public static void main(String[] args) {
        
//         sc=new Scanner(System.in);
//         createTree();
//     }

//     static Node createTree()
//     {
//         Node root=null;
//         System.out.println("Enter the data of Node:");
//         int x=sc.nextInt();
//         if(x==-1)
//         return null;
//         root=new Node(x);
//         System.out.println("Enter the data of left Node:"+x);
//         root.left=createTree();
//         System.out.println("Enter the data of right Node:"+x);
//         root.right=createTree();
//         return root;
//     }
// }

// class Node
// {
//     Node left,right;
//     int data;

//     public Node(int data){
//         this.data=data;
//     }
// }