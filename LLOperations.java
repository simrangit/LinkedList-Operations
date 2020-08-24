
public class LLOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addFront(4);
		addFront(5);
		addFront(3);
		deleteFront();
		append(10);
		addFront(9);
		addAtPosition(3,12);
		deleteEnd();
		printList();
		deleteFromPosition(2);
//		deleteEnd();
//		deleteEnd();
		printList();
	}
	
	public static Node start;
	
	LLOperations()
	{
		start = null;
	}
	
	public static void addFront(int data)
	{
		Node newnode = new Node(data);
		if(start == null)
		{
			// no node exist
			// this is the first node in the list
			start = newnode;
		}
		else // add new node in the sequence of LL at first position
		{
			newnode.next = start;
			start = newnode;
		}
	}
	
	public static void append(int data)
	{
		// make a new node and allocate data
		Node newnode = new Node(data);
		
		if(start == null) // if LL is empty
		{
			start = newnode;
		}
		else // traverse till end and append at last
		{
			Node temp = start;
			while((temp.next)!=null)
			{
				temp = temp.next;
			}
			temp.next = newnode;

		}
	}
	
	public static void addAtPosition(int pos, int data)
	{
		Node newnode = new Node(data);
		
		Node prev = null;
		Node current = start;
		
		int i = 0; // count for incrementing position index
		
		if(pos < 0)
		{
			System.out.println("Invalid position");
			return;
		}
		
		if(pos == 1) // that means, we add at front
		{
			addFront(data);
		}
		else
		{
			while(current!=null && i < pos-1)
			{
				prev = current;
				current = current.next;
				i++;
			}
			newnode.next = prev.next;
			prev.next = newnode;
		}
	}
	
	public static int deleteFront()
	{
		if(start == null)
		{
			System.out.println("Linked List is empty");
			return 0;
		}
		else // delete from front
		{
			int data = start.data;
			start = start.next;
			System.out.println("Element deleted from front is: "+data);
			return data;
		}
	}
	
	public static int deleteEnd()
	{
		if(start == null)
		{
			System.out.println("Linked List is empty");
			return 0;
		}
		else // delete from End
		{
			Node temp = start;
			Node prev = null;
			while(temp.next!=null)
			{
				prev = temp;
				temp = temp.next;
			}
			int data = temp.data;
			prev.next = null;
			System.out.println("Element deleted from front is: "+data);
			return data;
		}
	}
	
	public static int deleteFromPosition(int pos)
	{
		if(start == null)
		{
			System.out.println("Linked List is empty");
			return 0;
		}
		else if(pos < 0)
		{
			System.out.println("Invalid position");
			return pos;
		}
		else if(pos == 1) // delete from Front
		{
			deleteFront();
			return 0;
		}
		else // delete Node from position
		{
			Node current = start;
			Node prev = null;
			
			int i = 0;
			while(current!=null && i < pos-1)
			{
				prev = current;
				current = current.next;
				i++;
			}
			
			int data = current.data; // store data which is to be deleted
			prev.next = current.next;
			
			System.out.println("Element deleted from Position "+pos+" is: "+data);
			return data;
		}
	}
	
	public static void printList()
	{
		Node temp = start;
		
		while(temp!=null)
		{
			System.out.print("-->"+temp.data);
//			System.out.print("-->");
			temp = temp.next;
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
	
	public Node()
	{
		
	}
	
}
