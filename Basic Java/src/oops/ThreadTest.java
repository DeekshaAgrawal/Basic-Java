package oops;
class Thread1 extends Thread
{static int s=0;
	public void run(){
		Thread.currentThread().setName(String.valueOf(s));
		s++;
		System.out.println("shdgr"+Thread1.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadTest extends Thread {
	static int s=0;
	public void run(){
		synchronized (this){
		ab();
		}
	}
	 void ab(){
		Thread.currentThread().setName(String.valueOf(s));
		s++;
		System.out.println("shdgr"+Thread1.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadTest t= new ThreadTest();
		ThreadTest t1= new ThreadTest();
		t.start();
		t1.start();
		
		try {
			t.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println();
		
	}

}
