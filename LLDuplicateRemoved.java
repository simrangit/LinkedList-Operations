import java.util.*;

public class LLDuplicateRemoved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			append(2);
			printList();
			
			append(7);
			append(9);
			append(1);
			append(2);
			append(7);
			append(3);
			
			System.out.println();
			removeDuplicates();
			printList();
		}
		catch(Exception e)
		{
			System.out.println("Error Message "+e.getMessage());
		}
		

	}
	
	public static Node start;
	
	public static void removeDuplicates()
	{
		if(start == null)
		{
			// Linked list is empty
			System.out.println("Linked List is empty");
			return;
		}
		
		HashSet<Integer> hs = new HashSet<>();
		
		Node temp = start;
		Node prev = null; // used for back up previous node of linked list
		
		while(temp != null)
		{
			if(hs.contains(temp.data))
			{
				prev.next = temp.next;
//				temp = temp.next;
			}
			else
			{
				hs.add(temp.data);
				prev = temp;
//				temp = temp.next;
			}
			temp = temp.next;
		}
		
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
