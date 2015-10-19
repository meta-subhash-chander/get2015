/****************************************************************************************
Name            : RequestForEnhancement
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             : Annotation RequestForEnhancement request with elements id, synopsis, 
                : engineer, and date. Specify the default value as unassigned for engineer and unknown for date.             
 ****************************************************************************************/
package com.assignment1;

public @interface RequestForEnhancement {

	int id();

	String synopsis();

	String engineer() default "[unassigned]";

	String date() default "[unknown]";

}

                                                                                                                                          
