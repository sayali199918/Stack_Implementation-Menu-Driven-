import java.util.Scanner;
class StackDemo {
	int stack[]=new int[5];
	int top=0;
	
	public void push(int data)
	{
		 if(top==5)
		  {
			  System.out.println("Stack is Full");
		  }
		  else {
			  stack[top]=data;
			  top++;
		  }
		 
	}
	 public int pop()
	  {
		  int data=0;
		  if(isEmpty())
		  {
			  System.out.println("Stack is Empty");
		  }
		  else
		  {
		  top--;
		  data=stack[top];
		  stack[top]=0;
		  }
		  return data;
	  }
	 public int peek()
	  {
		  int data;
		  data=stack[top-1];
		  return data;
	  }
	 public int size()
	  {
		  return top;
	  }
	 public boolean isEmpty()
	  {
		  return top<=0;
	  }
	  public void show()
	  {
		  for(int n : stack )
		  {
			  System.out.print(n +" ");
		  }
		  System.out.println();
	  }
}
public class Stack1{
	StackDemo s=new StackDemo();
	static Scanner sc=new Scanner(System.in);
	 void menu()
	 {
		 int choice=0;
		 do {
			 System.out.println("\nPress....\n\t1 for Push \n\t2 for Pop \n\t3 for peek \n\t4 for Size \n\t5 for isEmpty \n\t6 for Show\n\tAny other key to EXIT...");
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter a Number :");
			     int n=sc.nextInt();
			     s.push(n);
			     break;
			  case 2:
				  System.out.println("Pop : "+s.pop());
			  	  break;
			  case 3:
				  System.out.println("peek : "+s.peek());
			  	  break;
			  case 4:
				  System.out.println("size : "+s.size());
			  	  break;
			  case  5:
				  System.out.println("Empty : "+s.isEmpty());
		  	      break;
		  	  case 6:
		  		  s.show();
		  	      break;
				  
			 }
			
			 
		 }while( choice<=6 || choice > 0);
		 
	 }

	 public static void main(String args[])
	 {
		 Stack1 Sc= new Stack1();
		 Sc.menu();
	 }
	
	
	
}
