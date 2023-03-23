package com.shinhan.day08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
​
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; //value값을 안주면 default로 -값을 가져오겠다.
	int number() default 7;//number인데 안들어오면 7을 넣어줌
	String jin() default "람";
	 
	
}