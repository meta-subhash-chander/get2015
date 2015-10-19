/****************************************************************************************
Name            : AnnotationRunnerMain
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             :main class which instantiates an object of AnnotationRunner, 
                :and executes all the methods with annotation CanRun.
 ****************************************************************************************/
package com.assignment3;

import java.lang.reflect.Method;

public class AnnotationRunnerMain {
	public static void main(String[] args) {

		try {
			Class<?> cls = Class.forName("com.assignment3.AnnotationRunner");
			Object obj = cls.newInstance();

			Method method;

			method = cls.getDeclaredMethod("method1");
			if (method.isAnnotationPresent(CanRun.class)) {
				method.invoke(obj);
			}

			method = cls.getDeclaredMethod("method2");
			if (method.isAnnotationPresent(CanRun.class)) {
				method.invoke(obj);
			}
			method = cls.getDeclaredMethod("method3");
			if (method.isAnnotationPresent(CanRun.class)) {
				method.invoke(obj);
			}
			method = cls.getDeclaredMethod("method4");
			if (method.isAnnotationPresent(CanRun.class)) {
				method.invoke(obj);
			}
			method = cls.getDeclaredMethod("method5");
			if (method.isAnnotationPresent(CanRun.class)) {
				method.invoke(obj);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
