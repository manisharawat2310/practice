import java.util.*;
class ArrayListDemo
{
public static void main(String[] args)
{
TreeSet t = new TreeSet();
t.add("A");
t.add("B");
t.add("C");
t.add("D");
t.add("E");
t.add("F");
System.out.println(t);
System.out.println(t.first());
System.out.println(t.last());
System.out.println(t.headSet("C"));
System.out.println(t.tailSet("C"));
System.out.println(t.subSet("A","D"));
}
}