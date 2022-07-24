class ThreadA
{
public synchronized void d1(ThreadB b)
{
System.out.println("Thread 1 start execution of d1 method");
try
{
Thread.sleep(5000);
}
catch(InterruptedException e)
{}
System.out.println("Thread 1 trying to call B's last method");
b.last();
}
public synchronized void last()
{
System.out.println("A's last method");
}
}
class ThreadB
{
public synchronized void d2(ThreadA a)
{
System.out.println("Thread 2 start execution of d2 method");
try{
Thread.sleep(5000);
}
catch(InterruptedException e)
{}
System.out.println("Thread 2 trying to call A's last method");
a.last();
}

public synchronized void last()
{
System.out.println("B's last method");
}
}
class ThreadC extends Thread
{
ThreadA a= new ThreadA();
ThreadB b= new ThreadB();
public void m1()
{
this.start();
b.d2(a);
}
public void run()
{
a.d1(b);
}
public static void main(String[] args)
{
ThreadC t=new ThreadC();
t.m1();
}
}