class q
{
	int ar[]=new int[5];
	int rear;
	int front;
	int size;
	public void enqueue(int x)
	{
		if(size==5)
		{
			System.out.println("full");
		}
		else{
		ar[rear]=x;
		rear=rear%ar.length+1;
		size++;
	}

	}
	public void dequeue()
	{
		System.out.println(ar[front]+"is dequeued");
		front=front%ar.length+1;;
		size--;
		// System.out.println(front+""+rear);
	}
	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(i+1+"th element"+ar[(front+i)%ar.length]);
		}

	}
}
class runners
{
	public static void main(String[] args) {
		q x=new q();
		x.enqueue(10);
		x.enqueue(110);
		x.enqueue(1110);
		x.enqueue(11110);
		x.enqueue(111110);
		
		x.dequeue();
		x.dequeue();
		x.dequeue();

		x.enqueue(11);
		x.enqueue(200);
		x.enqueue(20022);

		
		x.print();
		x.dequeue();
		x.print();
		System.out.println("size="+x.size);
	}
}