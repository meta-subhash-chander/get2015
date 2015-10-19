/****************************************************************************************
Name            : AnnotationRunner
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             : have 5 methods , printing unique text to console in each method   
                : Put CanRun annotation on methods 1, 3 and 5.
 ****************************************************************************************/
package com.assignment3;


public class AnnotationRunner {

	/**
	 * method1 method : used to  printing unique text to console having annotation
	 * 
	 */
	@CanRun
	public void method1(){
		System.out.println("Executing method-1 ");
	}
	/**
	 * method2 method : used to  printing unique text to console
	 * 
	 */
	public void method2(){
		System.out.println("Executing method-2");
	}
	/**
	 * method3 method : used to  printing unique text to console having annotation
	 * 
	 */
	@CanRun
	public void method3(){
		System.out.println("Executing method-3");
	}
	/**
	 * method4 method : used to  printing unique text to console
	 * 
	 */
	public void method4(){
		System.out.println("Executing method-4");
	}
	/**
	 * method5 method : used to  printing unique text to console having annotation
	 * 
	 */
	@CanRun
	public void method5(){
		System.out.println("Executing method-5");
	}

}
