class ClassClassLoaderDemo{
	public static void main(String[] args){
		Organization o = new Organization();
		Class c = o.getClass();
		
		Organization o1 = new Organization();
		Class c1 = o1.getClass();
		
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
		System.out.println(c == c1);
	}
}
