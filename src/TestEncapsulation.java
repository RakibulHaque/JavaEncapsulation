
public class TestEncapsulation {
	public static void main (String[] args)
	{
		Encapsulate obj = new Encapsulate();
		
		obj.setName("sadik");
		obj.setAge(25);
		obj.setRoll(100);
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Roll: "+obj.getRoll());
		
	}

}

