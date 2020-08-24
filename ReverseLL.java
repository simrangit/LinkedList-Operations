
public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		append(1);
		append(7);
		append(3);
		append(4);

		printList();
		
		reverseList();
		
		System.out.println();
		
		printList();
		
	}
	
	public static Node start;
	
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
	
	public static void reverseList()
	{
		Node prev = null;
		Node current = start;
		Node next = null;
		
		while(current!=null)
		{
			// before changing next node of current, save the next node of current
			next = current.next;
			
			// below is where the actual reversing takes place
			current.next = prev;
			prev = current;
			current = next;
		}
		start = prev;
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
