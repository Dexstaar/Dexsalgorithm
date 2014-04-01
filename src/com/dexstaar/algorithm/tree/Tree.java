package com.dexstaar.algorithm.tree;

import com.dexstaar.algorithm.tree.Node;

public class Tree {
	Node root;
	
	public void addNode( int value ){
		if( root == null ){
			//root가 비어있으면 root에 넣고
			Node node = new Node();
			node.setValue( value );
			root = node;
		}else{
			//있으면 자식 추가하기 위한 호출 
			addNode( value, root );
		}
	}
	
	public void addNode( int value, Node root ){
		//root 보다 작으면 왼쪽에 넣는다.
		if( value <= root.getValue() ){
			if( root.getLeft() == null ){
				Node node = new Node();
				node.setValue(value);
				root.setLeft(node);
			}else{
				addNode( value, root.getLeft() );
			}
			
		}else{
			if( root.getRight() == null ){
				Node node = new Node();
				node.setValue(value);
				root.setRight(node);
			}else{
				addNode( value, root.getRight() );
			}
		}
	}
	
	//root -> left -> right 
	public void preOrder( Node root ){
		if( root == null ) return;
		
		System.out.print( root.getValue() + " " );
		preOrder( root.getLeft() );
		preOrder( root.getRight() );
	}
	
	public void inOrder( Node root ){
		if( root == null ) return;
		
		inOrder( root.getLeft() );
		System.out.print( root.getValue() + " " );
		inOrder( root.getRight() );
	}
	
	public void postOrder( Node root ){
		if( root == null ) return;
		
		postOrder( root.getLeft() );
		postOrder( root.getRight() );
		System.out.print( root.getValue() + " " );
	}

}
