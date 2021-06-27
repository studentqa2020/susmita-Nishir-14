package com.smoke;



public class PracticeException {
 static int a;
String name;
public static void main(String[] args)  {
	
try {	
	System.out.println(10/a);
	System.out.println("");
}catch(ArithmeticException a) {
a.printStackTrace();	
}catch(NullPointerException n) {
	n.printStackTrace();
}finally {
//System.exit(0);	
}

System.out.println("Hi");





System.out.println(a);
System.out.println("bye");//bye

try {
System.out.println(20/a);

}catch(ArithmeticException a){
	a.printStackTrace();
}catch(NullPointerException n){

	
}finally {
	
}
















}

}
