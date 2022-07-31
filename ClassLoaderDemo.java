import java.lang.reflect.*;
class ClassLoader{

	public static void main(String[] args){
		try{
			Class c = Class.forName("Employee");
			Method[] m = c.getDeclaredMethods();
			Field[] f = c.getDeclaredFields();
			int count = 0, countF = 0;
														
			for(Method m1: m){
				System.out.println(m1.getName());
				count++;
			}
			for(Field f1: f){
				System.out.println(f1.getName());
				countF++;
			}
			System.out.println("Total no of methods: " + count
						+ "\n Total no. of fields = " + countF);

		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
