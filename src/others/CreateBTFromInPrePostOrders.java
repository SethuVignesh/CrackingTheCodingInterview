package others;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

class CreateBTFromInPrePostOrders {

    public static void main(String[] args) {
        //          7
        //      2        4
        //  3       5 6       1

        int[] preOrder={7,2,3,5,4,6,1};
        int[] postOrder={3,5,2,6,1,4,7};
        int[] inOrder={3,2,5,7,6,4,1};


       Node root= buildTree(inOrder,postOrder,0,postOrder.length-1);
        System.out.println(root);

    }

    private static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int i) {

            this.data=i;
        }
    }

    @Nullable
    public static Node buildTree(int[] inOrder, int[] postOrder, int startIndex, int endIndex){

        if (startIndex==endIndex) return new Node(inOrder[endIndex]);
        if(startIndex>endIndex) return null;

        //root
        Node root=new Node(postOrder[findRootIndex(postOrder,inOrder,startIndex,endIndex)]);

        int rootIndexFromInorder=-1;
        for(int i=0;i<inOrder.length;i++)
        {
            if(inOrder[i]==root.data){
                rootIndexFromInorder=i;
                break;
            }
        }
        //left subtree
        Node leftNode=buildTree(inOrder,postOrder,startIndex,rootIndexFromInorder-1);
        //right subtree
        Node rightNode= buildTree(inOrder,postOrder,rootIndexFromInorder+1,endIndex);

        root.leftNode=leftNode;
        root.rightNode=rightNode;
        return root;
    }

    public static int findRootIndex(int[] postOrder, int[] inOrder, int inOrderStartIndex, int inOrderEndIndex){


        ArrayList al=  new ArrayList();
        for(int i=0;i<inOrder.length;i++){{
            if(i>=inOrderStartIndex && i<=inOrderEndIndex){
                al.add(inOrder[i]);
            }
        }

        for(int j=0;j<postOrder.length;j++){

            if(al.contains(postOrder[j])){
                return j+(inOrderEndIndex-inOrderStartIndex);

            }
        }

        }
        return -1;

    }
}
