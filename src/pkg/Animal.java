package pkg;

class Dog
{
	public void eating()
	{
		System.out.println("dog is eating");
	}
}

class cat extends Dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}

class Lion extends cat
{
	public void running()
	{
		System.out.println("lion is running");
	}
}







public class Animal {

	public static void main(String[] args) {
		cat ob=new cat();
		ob.eating();
		ob.sleeping();
		Lion li=new Lion();
		li.eating();
		li.sleeping();
		li.running();

	}

}
