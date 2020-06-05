public class Main
{
	class fruit
{
protected char name, taste, size ;
Scanner sc = new Scanner(System.in);
public void eat()
{
Scanner sc = new Scanner(System.in);
System.out.println ("name of the fruit") ;
name=nextChar();
System.out.println ("taste of the fruit") ;
taste = nextChar();
System.out.println ("Name of the fruit is" +name);
System.out.println ("Taste of the fruit is" +taste) ;
}
}
class apple extends fruit
{
void eat()
{
System.out.println("Name of the fruit is Apple");
System.out.println("Taste of the fruit is sweet");
}
}
class orange extends fruit
{
public void eat()
{
System.out.println("Name of the fruit is Orange");
System.out.println("Taste of the fruit is sour");
}
}
class main_class
{
public static void main(String[] args)
{
apple A = new apple();
A.eat();
orange O = new orange();
O.eat();
}
}
}
