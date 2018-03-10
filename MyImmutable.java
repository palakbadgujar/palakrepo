final class Hello
{
private final int id;
private final String name;
Hello(int id,String name)
{
this.id=id;
this.name=name;
}
public String getName()
{
return name;
}
public int getId()
{
return id;
}
}
public class MyImmutable
{
public static void main(String[]args)
{
Hello obj=new Hello(12,"palak");
int a=obj.getId();
System.out.println("ID IS"+a);
String name1=obj.getName();
System.out.println("NMAE"+name1);
//System.out.println(obj.id);
}
}

