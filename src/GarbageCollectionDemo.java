
public class GarbageCollectionDemo {
	public void finalize()
	{
		System.out.println("Garbage Collection Demo");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj1=nill;
		obj2=null;
		System.gc();

	}

}
