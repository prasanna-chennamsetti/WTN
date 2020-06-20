package inheritance;
class Animal
{
void eat()
{
System.out.println("Animals are eating");
}
void sleep()
{
System.out.println("Animals are sleeping");
}
}
class Bird extends Animal
{
void eat()
{
System.out.println("Birds eat insects");
}
void sleep()
{
System.out.println("birds are sleeping");
}
void fly()
{
System.out.println("Birds are flying");
}
}
public class Ex1 {
	public static void main(String args[])
	{
	Animal a=new Animal();
	a.eat();
	a.sleep();
	Bird b=new Bird();
	b.eat();
	b.sleep();
	b.fly();
	}
}
