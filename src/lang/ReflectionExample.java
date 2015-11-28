package lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({ "rawtypes", "unused" })
public class ReflectionExample {

	public static int intPrim;
	protected int[] arrayPrim;
	private List<String> listObject;

	ReflectionExample() {
		intPrim = 42;
		arrayPrim = new int[666];
		listObject = new ArrayList<>();
	}

	public void doSomething(int i, int j, int k, int l, int m) {
		intPrim = i;
		arrayPrim[0] = j;
		arrayPrim[1] = k;
		listObject.add(String.valueOf(l));
		listObject.add(String.valueOf(m));
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		ReflectionExample example = new ReflectionExample();
		Class d = Class.forName("lang.ReflectionExample");
		Field[] fa = d.getFields();
		System.out.println(Arrays.toString(fa));
		for(Field f : fa) {
			f.setAccessible(true);
			System.out.println(Modifier.toString(f.getModifiers()));
		}
		Field protectedField = d.getDeclaredField("arrayPrim");
		Field privateField = d.getDeclaredField("listObject");
		protectedField.setAccessible(true);
		privateField.setAccessible(true);
		System.out.println("prot "+Modifier.toString(protectedField.getModifiers()));
		System.out.println("priv "+Modifier.toString(privateField.getModifiers()));
		System.exit(0);
	}

	public static void classGetters(ReflectionExample example) throws ClassNotFoundException {
		Class c = example.getClass(); //returns the string class
		Class d = Class.forName("lang.ReflectionExample");
		String className = d.getCanonicalName();
		Class cStringArray = Class.forName("[[Ljava.lang.String;"); //two dimensional string array
		example.doSomething(5, 6, 7, 8, 9);
		String mod = Modifier.toString(d.getModifiers());
		TypeVariable[] tv = c.getTypeParameters();
		Class<?> ancestor = c.getSuperclass();
		Constructor[] con = d.getDeclaredConstructors(); 
		Method[] methods = d.getMethods();
		Field[] fields = d.getFields();
		Type[] intfs = c.getGenericInterfaces();
		Package p = c.getPackage();
	}

	/*
$ javac ClassWarning.java
Note: ClassWarning.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$ javac -Xlint:unchecked ClassWarning.java
ClassWarning.java:6: warning: [unchecked] unchecked call to getMethod
  (String,Class<?>...) as a member of the raw type Class
Method m = c.getMethod("m");  // warning
	 */
}