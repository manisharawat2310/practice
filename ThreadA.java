class ThreadA
{
public static void main(String[] args) throws InterruptedException
{
ThreadB b= new ThreadB();
b.start();
synchronized(b)
{
System.out.println("main thread calling wait method");
b.wait();
System.out.println("main thread get the notification");
System.out.println(b.total);
}
}
}
class ThreadB extends Thread
{
int total=0; 
public void run(){
synchronized (this)
{ 
for(int i=0;i<=100;i++)
{
total=total+i;
}
System.out.println("Child thread giving the notification") ;
this.notify(); 
}
}
}