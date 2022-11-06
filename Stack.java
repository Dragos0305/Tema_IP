class Stack {

  // store elements of stack
  private int arr[];
  // represent top of stack
  private int top;
  // total capacity of the stack
  private int capacity;

  // Creating a stack
  Stack(int size) {
    // initialize the array
    // initialize the stack variables
    arr = new int[size];
    capacity = size;
    top = -1;
  }

}

// push elements to the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack OverFlow");

      // terminates the program
      System.exit(1);
    }

    // insert element on top of stack
    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  // check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  // pop elements from top of stack
  public int pop() {

    // if stack is empty
    // no element to pop
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      // terminates the program
      System.exit(1);
    }

    // pop element from top of stack
    return arr[top--];
  }

   // check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  public void printStack() {
  
	  for(int i=0;i<arr.length;i++)
		  System.out.println(arr[i]);
  
  }
}

public class Main{

public static void main(String[] args) {

}
	Stack MyStack = new Stack(5);
	MyStack.push(1);
	MyStack.push(3);
	MyStack.push(5);
	MyStack.printStack();
	MyStack.pop();
	MyStack.printStack();
	
}
