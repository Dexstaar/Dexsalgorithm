package com.dexstaar.algorithm.tree;

public class BinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 24, 15, 19, 2, 28, 27, 30 };
		
		
		Tree tree = new Tree();
		
		for( int i=0; i<arr.length; i++ ){
			tree.addNode( arr[i] );
		}
		
		System.out.print( " preOrder : " );
		tree.preOrder( tree.root );
		
		System.out.print( " | inOrder : ");
		tree.inOrder( tree.root );
		
		System.out.print( " | postOrder : ");
		tree.postOrder( tree.root );
		
		

	}

}
