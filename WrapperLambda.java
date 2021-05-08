class WrapperLambda
{
	public static void main(String[] args) {
	Print p=(x)->System.out.println(x.getName());
		Person p1=new Person("foo",115);
		printall(p1,wrapperlambda(p));

	}
	public static void printall(Person p1,Print p)
	{
		p.print(p1);
	}
	public static Print wrapperlambda(Print p)
	{
		Print p1=(x)->{p.print(x);System.out.println(x.getId());};
		return p1;
	}
}
interface Print
{
	public void print(Person p);
}
class Person
{
	String name;
	int id;
	Person(String name,int id)
	{
		this.name=name;
		this.id=id;
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
