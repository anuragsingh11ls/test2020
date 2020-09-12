

//This is the class for Singleton class Example.And it's implementation class is Pattern

final class Test 
{
	private static Test t;
	private Test()
	{
		System.out.println("Object Created at First Time");
	}
	public static Test create() 
	{
		if(t == null)
		{
			t=new Test();
		}
		else
		{
			System.out.println("Object Already Created "+t);
		}

		return  t;
	}
	public Object clone()  {
		return t;
	}
}



//This is  the implementation class of Stest Singleton class or main class for singleton design patteren implementation.
//or main program for singleton design pettern.
public class SingletonDesignpattern 
{

	public static void main(final String[] args) throws CloneNotSupportedException
	{
		
		final Test t1= Test.create();
		final Test t2= Test.create();
		final Test t3= Test.create();
		
		final Test tobj=(Test)t1.clone();
		final Test tobj1=(Test)t2.clone();
		System.out.println("fff"+tobj);
		System.out.println("fff"+tobj1);
		
		

		if((t1==t2)&&(t2==t3)&&(t3==t1))
		{
			System.out.println("All Created Object are Same");
		}
		else
		{
			System.out.println("All Created  Object are not Same");
		}
		//clone object check
		if((tobj==tobj1))
        {
            System.out.println("All Created Object are Same clone");
        }else{
            System.out.println("aaaaaaaaaaaaaaaa");
        }
		
		//String s=new String();
	
	}



}



