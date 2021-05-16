
public class QueueUsingLinkedList {
	
	private Node front,rear;
	private int current_size;
	
	public class Node{
		int data;
		Node next;
	}
	
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		current_size = 0;
	}
	
	public boolean isEmpty() {
		return(current_size == 0);
	}
	
	public int dequeue() {
		int data = front.data;
		front = front.next;
		if(isEmpty()) {
			rear = null;
		}
		current_size--;
		System.out.println(data + " " +"removed from the queue");
		return data;
		
	}
	
    public void enqueue(int data) {
		Node oldrear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		}
		else {oldrear.next = rear;}
		current_size++;
		System.out.println(data + " " +"added to the queue");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(6);
		 queue.dequeue();
		 queue.enqueue(3);
		 queue.enqueue(99);
		 queue.enqueue(56);
		 queue.dequeue();
		 queue.enqueue(43);
		 queue.dequeue();
		 queue.enqueue(89);
		 queue.enqueue(77);
		 queue.dequeue();
		 queue.enqueue(32);
		 queue.enqueue(232);
	}

}
