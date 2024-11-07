package Faker;



import java.util.Locale;

import com.github.javafaker.Faker;


public class Demo {
	
	
	public void d()
	{
		Locale local=new Locale("eng","INDIA");
		Faker fake=new Faker (local);
		
		String a=fake.name().fullName();
		int value=fake.number().randomDigitNotZero();
		String Address=fake.address().fullAddress();
		System.out.println(a);
		System.out.println(Address);
		System.out.println(value);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Demo obj = new Demo();
	obj.d();
	

	}

}
