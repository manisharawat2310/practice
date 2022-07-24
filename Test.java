import java.util.*;
class Test
{
public static void main(String[] args)
{
String s ="hello dev";
System.out.println("String before reverse opertion:"+s);
int a=s.length();
for(int i=a-1;i>=0;i--)
{
System.out.print(s.charAt(i));
}
}
}