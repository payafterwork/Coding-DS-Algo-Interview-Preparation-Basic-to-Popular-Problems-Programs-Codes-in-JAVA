
public class LinkedListAddLast {
   
    	private class Node{
    		int data;
    		Node next;
    	}
    	    private int size;
    	    private Node head;
    	    private Node tail;
    	    
    	public int size() {
    		return this.size;		        	 
		}
    	public void AddLast(int val) {
    		Node node = new Node(); //Creates Node of Type Node
    		node.data = val; // Adds Val to Data Property of Node
    		 
    		if(this.size==0) { //If first one is being added
    		  this.head = this.tail = node;	// Head, Tail is initialized to node
    		}else {
    		  	tail.next = node; //Tail's address points to added node
    		  	this.tail = node;
    		  	node.next = null; //Added node's address is null to signify last element of linked list
    		}   		
         this.size++;
         
    	}
    	public void display() {
    	 Node temp = this.head;
	    	 while(temp!=null) {
	    	   System.out.print(temp.data + "->");
	    	   temp = temp.next;
	    	 }
	    	System.out.println();
    	
    	}
	
}


