
/**
 *  The SList class is a singly-linked implementation of the linked list
 *  abstraction.  SLists are mutable data structures, which can grow at either
 *  end.
 *
 *  @author Kathy Yelick and Jonathan Shewchuk
 **/
private SlistNode head;//////
private int size;//////
private SlistNode tail;////

public class SList {

  private SListNode head;
  private int size;

  /**
   *  SList() constructs an empty list.
   **/

  public SList() {
    size = 0;
    head = null;
    tail = null;///
  }

  /**
   *  isEmpty() indicates whether the list is empty.
   *  @return true if the list is empty, false otherwise.
   **/

  public boolean isEmpty() {
    return size == 0;
  }

  /**
   *  length() returns the length of this list.
   *  @return the length of this list.
   **/

  public int length() {
    return size;
  }

  /**
   *  insertFront() inserts item "obj" at the beginning of this list.
   *  @param obj the item to be inserted.
   **/

  public void insertFront(Object obj) {
    head = new SListNode(obj, head);
    size++;
  }

  /**
   *  insertEnd() inserts item "obj" at the end of this list.
   *  @param obj the item to be inserted.
   **/

  public void insertEnd(Object obj) {
    if (head == null) {
      head = new SListNode(obj);
    } else {
      SListNode node = head;
      while (node.getNext() != null) {
        node = node.getNext();
      }
      node.setNext(new SListNode(obj));
    }
    size++;
  }
  public void insertEnd(Object obj)
  {
    //need to keep track of => 
    //if we have an empty list = >
    //call node constructor
    //public SList() {
    //size = 0;
    //head = null;
      
    //we have to update tail to be tail .next
    if (head == null)
    {
      head = new SListNode(obj);
    }
    else{
      tail.setNext(new SlistNode(obj));
      tail = tail.getNext(); 
    }
    size++;
  }
  }

  /**
   *  nth() returns the item at the specified position.  If position < 1 or
   *  position > this.length(), null is returned.  Otherwise, the item at
   *  position "position" is returned.  The list does not change.
   *  @param position the desired position, from 1 to length(), in the list.
   *  @return the item at the given position in the list.
   **/

  public Object nth(int position) {
    SListNode currentNode;

    if ((position < 1) || (head == null)) {
      return null;
    } else {
      currentNode = head;
      while (position > 1) {
        currentNode = currentNode.getNext();
        if (currentNode == null) {
          return null;
        }
        position--;
      }
      return currentNode.getItem();
    }
  } 

  /**
   *  toString() converts the list to a String.
   *  @return a String representation of the list.
   **/

  public String toString() {
    Object obj;
    String result = "[  ";

    SListNode cur = head;

    while (cur != null) {
      obj = cur.item;
      result = result + obj.toString() + "  ";
      cur = cur.next;
    }
    result = result + "]";
    return result;
  }

  
  private class SListNode {
	  private Object item;
	  private SListNode next;

	  /**
	   *  SListNode() (with one parameter) constructs a list node referencing the
	   *  item "obj".
	   */

	  SListNode(Object obj) {
	    item = obj;
	    next = null;
	  }

	  /**
	   *  SListNode() (with two parameters) constructs a list node referencing the
	   *  item "obj", whose next list node is to be "next".
	   */

	  SListNode(Object obj, SListNode next) {
	    item = obj;
	    this.next = next;
	  }
	  
	  public SListNode getNext() {
		  return this.next;
	  }
	  
	  public void setNext(SListNode next) {
		  this.next = next;
	  }
	  
	  public Object getItem () {
		  return this.item;
	  }
	  
	  public void setItem(Object obj) {
		  item = obj;
	  }

	}


 
}