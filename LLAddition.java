//import java.util.LinkedList;

public class LLAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<String> ll = new LinkedList<String>();
		
		LLAddition obj = new LLAddition();
		
		obj.push(3, 1);
		obj.push(7, 1);
		obj.push(9, 1);
		obj.push(2, 1);
		obj.push(8, 1);
		obj.push(9, 1);
		
//		obj.push(1, 2);
//		obj.push(9, 2);
//		obj.push(7, 2);
//		obj.push(9, 2);
		
//		obj.printlist(Start1);
//		obj.printlist(Start2);
		
		obj.addLists();
		
		obj.printlist(result);

	}
//	where, start1 and start2 are 2 different linkedlists
	public static Node Start1, Start2, result; // result will contain the sum of 2 linkedlists

	void push(int val, int list)  
    { 
		Node newnode = new Node(val); 
        if (list == 1)  
        { 
            newnode.next = Start1; 
            Start1 = newnode; 
        }  
        else if (list == 2)  
        { 
            newnode.next = Start2; 
            Start2 = newnode; 
        }  
        else // push element to the resultant node
        { 
            newnode.next = result; 
            result = newnode; 
        } 
  
    }
	
	void addLists()
	{
		if(Start1 == null) // List1 is empty, then push all elements of list2 to resultant list
		{
			result = Start2;
			return;
		}
		else if(Start2 == null) // List2 is empty, then push all elements of list1 to resultant list
		{
			result = Start1;
			return;
		}
		
		int carry = 0, rem = 0, result = 0, temp = 0;
		
		while(Start1!=null || Start2!=null)
		{
			if(Start1 == null)
			{
				temp = Start2.data + carry;
				Start2 = Start2.next;
				carry = 0;
			}
			else if(Start2 == null)
			{
				temp = Start1.data + carry;
				Start1 = Start1.next;
				carry = 0;
			}
			else
			{
				temp = Start1.data + Start2.data + carry;
				Start1 = Start1.next;
				Start2 = Start2.next;
				carry = 0;
			}
//			temp = Start1.data + Start2.data;
			
			if(temp >= 10)
			{
				carry = temp/10;
				rem = temp%10;
				result = rem;
			}
			else
				result = temp;
			
			push(result,3);
			
//			Start1 = Start1.next; // increment both lists to the next element
//			Start2 = Start2.next;
		}
		
		if(Start1==null && Start2 == null && carry!=0)
		{
			push(carry,3);
		}
		
//		while(Start1 != null)
//		{
//			push(Start1.data,3);
//			Start1 = Start1.next;
//		}
//		
//		while(Start2 != null)
//		{
//			push(Start2.data,3);
//			Start2 = Start2.next;
//		}
	}
	
	void printlist(Node head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
    }

}

class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	public Node()  // default constructor
	{
		
	}
}
