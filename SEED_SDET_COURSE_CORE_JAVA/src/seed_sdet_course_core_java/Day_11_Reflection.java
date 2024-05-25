package seed_sdet_course_core_java;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Day_11_Reflection {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("seed_sdet_course_core_java.Day_2_Student");

			Method[] methods = c.getDeclaredMethods();
			System.out.println("Number of methods: " + methods.length);

			for (Method method : methods) {
				System.out.println("Method name: " + method.getName());
				System.out.println("Return type: " + method.getReturnType().getSimpleName());

				Parameter[] parameters = method.getParameters();
				System.out.println("Parameter count: " + parameters.length);
				if (parameters.length > 0) {
					System.out.println("Parameters:");
					for (Parameter parameter : parameters) {
						System.out.println(
								"\tType: " + parameter.getType().getSimpleName() + ", Name: " + parameter.getName());
					}
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
