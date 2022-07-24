class Mythread extends Thread 
{
//static Thread mt;
public void run() 
{
for (int i=0; i<10; i++)
{
try{
Thread.sleep(2000);
}
catch(InterruptedException e){}
System.out.println("Child Thread");
} 
}
}
class ThreadDemo
{
public static void main(String[] args) throws InterruptedException
{ 
//Mythread.mt= Thread.currentThread();
Mythread t = new Mythread();
t.start();
t.join();
for (int i=0; i<10; i++)
{
System.out.println("Main Thread");
} 
}
}