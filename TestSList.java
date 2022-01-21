//Elena Buldo
//Maxime Sotsky
public class TestSList {
	 /**
	   *  main() runs test cases on the SList2 class.  Prints summary
	   *  information on basic operations and halts with an error (and a stack
	   *  trace) if any of the tests fail.
	   **/

	  public static void main (String[] args) {
	    // Fill in your solution for Part I here.
		
		SList newList = new SList();
		//lst1.insertEnd(new Integer(4));
		newList.insertFront(new Integer (12));
		newList.insertFront(new Integer(9));
		newList.insertFront(new Integer(6));
		
		System.out.println(newList.toString());

		newList.insertEnd(new Integer(15));
		newList.insertFront( new Integer(3));

		System.out.println(newList.toString());

	    testEmpty();
	    testAfterInsertFront();
	    testAfterInsertEnd();
	  }

	    
	  /**
	   *  testEmpty() tests toString(), isEmpty(), length(), insertFront(), and
	   *  insertEnd() on an empty list.  Prints summary information of the tests
	   *  and halts the program if errors are detected.
	   **/

	  private static void testEmpty() {
	    SList lst1 = new SList();
	    SList lst2 = new SList();
	    System.out.println();
	    System.out.println("Here is a list after construction: "
			       + lst1.toString());
	    TestHelper.verify(lst1.toString().equals("[  ]"),
			      "toString on newly constructed list failed");

	    System.out.println("isEmpty() should be true. It is: " +
			       lst1.isEmpty());
	    TestHelper.verify(lst1.isEmpty() == true,
			      "isEmpty() on newly constructed list failed");    

	    System.out.println("length() should be 0. It is: " +
			       lst1.length());
	    TestHelper.verify(lst1.length() == 0, 
			      "length on newly constructed list failed");    
	    lst1.insertFront(new Integer(3));
	    System.out.println("Here is a list after insertFront(3) to an empty list: "
			       + lst1.toString());
	    TestHelper.verify(lst1.toString().equals("[  3  ]"),
			      "InsertFront on empty list failed");
	    lst2.insertEnd(new Integer(5));
	    System.out.println("Here is a list after insertEnd(5) on an empty list: "
			       + lst2.toString());
	    TestHelper.verify(lst2.toString().equals("[  5  ]"),
			      "insertEnd on empty list failed");
	  }

	  /**
	   *  testAfterInsertFront() tests toString(), isEmpty(), length(),
	   *  insertFront(), and insertEnd() after insertFront().  Prints summary
	   *  information of the tests and halts the program if errors are detected.
	   **/

	  private static void testAfterInsertFront() {
	    SList lst1 = new SList();
	    lst1.insertFront(new Integer(3));
	    lst1.insertFront(new Integer(2));
	    lst1.insertFront(new Integer(1));
	    System.out.println();
	    System.out.println("Here is a list after insertFront 3, 2, 1: "
			       + lst1.toString());
	    TestHelper.verify(lst1.toString().equals("[  1  2  3  ]"),
			      "InsertFronts on non-empty list failed");
	    System.out.println("isEmpty() should be false. It is: " +
			       lst1.isEmpty());
	    TestHelper.verify(lst1.isEmpty() == false,
			      "isEmpty() after insertFront failed");    
	    System.out.println("length() should be 3. It is: " +
			       lst1.length());
	    TestHelper.verify(lst1.length() == 3, 
			      "length() after insertFront failed");
	    lst1.insertEnd(new Integer(4));
	    System.out.println("Here is the same list after insertEnd(4): "
			       + lst1.toString());
	    TestHelper.verify(lst1.toString().equals("[  1  2  3  4  ]"),
			      "insertEnd on non-empty list failed");
	  }
	    
	  /**
	   *  testAfterInsertEnd() tests toString(), isEmpty(), length(),
	   *  insertFront(), and insertEnd() after insertEnd().  Prints summary
	   *  information of the tests and halts the program if errors are detected.
	   **/

	  private static void testAfterInsertEnd() {
	    SList lst1 = new SList();
	    lst1.insertEnd(new Integer(6));
	    lst1.insertEnd(new Integer(7));
	    System.out.println();
	    System.out.println("Here is a list after insertEnd 6, 7: "
			       + lst1.toString());
	    System.out.println("isEmpty() should be false. It is: " +
			       lst1.isEmpty());
	    TestHelper.verify(lst1.isEmpty() == false,
			      "isEmpty() after insertEnd failed");    
	    System.out.println("length() should be 2. It is: " +
			       lst1.length());
	    TestHelper.verify(lst1.length() == 2, 
			      "length() after insertEndfailed");
	    lst1.insertFront(new Integer(5));
	    System.out.println("Here is the same list after insertFront(5): "
			       + lst1.toString());
	    TestHelper.verify(lst1.toString().equals("[  5  6  7  ]"),
			      "insertFront after insertEnd failed");
	  }

}
