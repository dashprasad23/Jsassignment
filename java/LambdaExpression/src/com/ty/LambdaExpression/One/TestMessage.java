package com.ty.LambdaExpression.One;

public class TestMessage {

	public static void main(String[] args) {
		MessageInterface msg=(message)->{
			System.out.println("hellow");
			return message;
		};
	   String msg1=msg.greet("World");
	   System.out.println(msg1);

	}

}
