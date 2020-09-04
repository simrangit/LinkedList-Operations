
public class LLKNodeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		append(3);
		append(5);
		append(12);
		append(2);
		append(0);
		append(33);
		append(9);
		System.out.println(KNodeElement(2)); // this function takes input the K Node and returns the Node value from the last
		printList();

	}
	
	public static Node start;
	
	public static int KNodeElement( int KNode) // KNode is the node index, for which this function is finding the node value
	{
		if(start == null)
		{
			System.out.println("Linked List is empty");
		}
		
		Node fast = start;
		Node slow = start;
		
		int count = 1;
			
			while(fast.next != null)
			{
				count++;
				fast = fast.next;
				
				if(count > KNode)
					slow = slow.next;
			}
		
		
		return slow.data;
	}
	
	public static void append(int data)
	{
		Node newnode = new Node(data);
		
		Node temp = start;
		
		if(start == null) // Linked list is empty
		{
			start = newnode;
		}
		
		else // traverse till end and append at last
		{
//			Node temp = start;
			while((temp.next)!=null)
			{
				temp = temp.next;
			}
			temp.next = newnode;

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
