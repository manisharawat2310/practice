class FinalizeDemo
{
public static void main(String[] args)
{
FinalizeDemo t= new FinalizeDemo();
t.finalize();
t.finalize();
t=null;
System.gc();
System.out.println("End of main");
}
public void finalize()
{
System.out.println("finalize method call");
}
}