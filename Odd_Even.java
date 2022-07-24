
class Odd_Even
{
public static void main(String[] args)
{
int a =7;
check_number(a);
System.out.println(check_number(a));
} 
public static String check_number(int i)
{
if(i%2==0)
{
return "True";
}
else
{
return"false";
}
}
}