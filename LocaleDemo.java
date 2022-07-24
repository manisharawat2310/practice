import java.util.*;
class LocaleDemo
{
public static void main(String[] args)
{
Locale l = Locale.getDefault();
System.out.println(l.getCountry()+"...."+l.getLanguage());
System.out.println(l.getDisplayCountry()+"...."+l.getDisplayLanguage());
Locale l1 = new Locale("pa","IN");
Locale.setDefault(l1);
System.out.println(l1.getDisplayCountry()+"...."+l1.getDisplayLanguage());
Locale s []= Locale.getAvailableLocales();
for(Locale s1:s)
{
System.out.println(s1);
}
}
}