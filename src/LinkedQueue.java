import java.util.ArrayList;

public class LinkedQueue implements Queue{
	private ArrayList list;
	
	public LinkedQueue(){
		list = new ArrayList();
	}
	
	public Object peekFront(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Queue is empty");
		return list.get(0);
	}
	
	public Object dequeue(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Queue is empty");
		return list.remove(0);
	}
	
	public void enqueue(Object obj){
		list.add(obj);
	}
	
	public int size(){
		return list.size();
	}
}