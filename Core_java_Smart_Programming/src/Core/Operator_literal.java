package Core;

public class Operator_literal {
    int a =10;//10 is literal means value assigned to variable
    static int b=20;
	public static void main(String[] args) {
		Operator_literal obj=new Operator_literal();
     System.out.println("divide:"+b/obj.a);
//     System.out.println("pre increment:"+(++b));
//     System.out.println("post increment:"+(b++));
     if(obj.a==b) {
    	 System.out.println("equal");
     }
     if(obj.a!=b) {
    	System.out.println("not equal"); 
     }
     if((obj.a+b<=10) || (obj.a+b<=30 ) ){
    	 System.out.println("or condition sataisfied");
     }
     if((obj.a+b<=30) || (obj.a+b<=30 ) ){
    	 System.out.println("and condition sataisfied");
     }
     boolean b=true;
     System.out.println("not operator:"+!true);
     //ternary operator
//     condition ? expression_if_true : expression_if_false;
     int c;
     boolean new1;
      new1= (obj.a > Operator_literal.b) ?true:false;
      System.out.println("ternary:"+new1);
	}
   
}
