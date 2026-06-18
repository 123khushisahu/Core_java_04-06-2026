package com.core.operator;
public class Operator_all_examples {
public static void main(String[] args) {
		
		
		/*
		| S.No | Operator Type        | Examples                         |             |        |
		| ---- | -------------------- | -------------------------------- | ----------- | ------ |
		| 1    | Arithmetic Operators | `+`, `-`, `*`, `/`, `%`          |             |        |
		| 2    | Unary Operators      | `++`, `--`, `!`, `+`, `-`        |             |        |
		| 3    | Assignment Operators | `=`, `+=`, `-=`, `*=`, `/=`      |             |        |
		| 4    | Relational Operators | `==`, `!=`, `>`, `<`, `>=`, `<=` |             |        |
		
		| 5    | Logical Operators    | `&&`,|| `                        |             | `, `!` |
		| 6    | Bitwise Operators    | `&`, `                           | `, `^`, `~` |        |
		| 7    | Shift Operators      | `<<`, `>>`, `>>>`                |             |        |
		| 8    | Ternary Operator     | `?:`                             |             |        |

		*/
		
		
		
		

       // 1.Arithmatic operator
		int m1=200;
		int m2=100;
		
		System.out.println(m1+m2);
		System.out.println(m1-m2);
		System.out.println(m1*m2);
		System.out.println(m1/m2);
		System.out.println(m1%m2);
		
		
		//2. Unary Operators

		/*Types of Unary Operators in Java

       There are 6 unary operators in Java:

Unary Plus (+)
Unary Minus (-)
Increment (++)
Decrement (--)
Logical NOT (!)
Bitwise Complement (~) */
		
		
		//Unary Plus (+)
		int m=120;
		System.out.println(+m);
		
		
		//2. Unary Minus (-)
		//Definition

		//Changes the sign of a number.
		
		int val=429;
		System.out.println(-val);
		
		
		//3. Increment Operator (++)
		
	//	++a (pre increment)  First increases the value, then uses it.
	//	a++ (post increment) First uses the current value, then increases it.
		
//		++a (pre increment) 
		Long mobileNo=8953164600L;
		System.out.println(++mobileNo);
		
		
		  int val1=-1;
		  
		  System.out.println(++val1);
		  
		 
		  
		  // a++ (post increment)
		 // First uses the current value, then increases it.
			
			
			  int obj=10;
			  
			  System.out.println(obj++);
			  System.out.println(obj);
			  
			  int val11=-1;
			  
			  System.out.println(val11++);
			  System.out.println(val11);
			  
			  
			 /* 5. Logical NOT Operator (!)
			  Definition

			  Reverses a boolean value.

			  true becomes false
			  false becomes true  */
			  
			  int c1=200;
			  int c2=201;
			  
			//  ( ) parathesis
			//  [ ]  square
		    //  { } curlie
			//  <> angle 
			  
			  
			  
			  
			  if(!(c1==c2)) {
				  System.out.println("both are initialized value same number");
			  }
			  else {
				  System.out.println("not same value");
			  }
			  
			  
			  
			  
			  
			  //3.)assignment operator
			  
			 /*
			  | Operator | Meaning                         | Example                  |    |       |
			  | -------- | ------------------------------- | ------------------------ | -- | ----- |
			  | `+=`     | Add and assign                  | `x += 5;` → `x = x + 5;` |    |       |
			  | `-=`     | Subtract and assign             | `x -= 5;` → `x = x - 5;` |    |       |
			  | `*=`     | Multiply and assign             | `x *= 5;` → `x = x * 5;` |    |       |
			  | `/=`     | Divide and assign               | `x /= 5;` → `x = x / 5;` |    |       |
			  | `%=`     | Modulus and assign              | `x %= 5;` → `x = x % 5;` |    |       |
			  
			  |'
			  
			  */
			  
			  
			       //Add and assign   
			     int x = 10;

		        x += 5;  // x = 15
		        System.out.println(x);
		        
		        x *= 2;  // x = 30
		        System.out.println(x);
		        
		        x -= 10; // x = 20
		        x /=2;    // x=10
		        
		        x %=3;   
		        System.out.println(x);
		        
		        
		       // 4    | Relational Operators | `==`, `!=`, `>`, `<`, `>=`, `<=`
		        
		       // Relational Operators in Java

		       // Relational operators are used to compare two values. They always return a boolean value (true or false).
		        
		       /* | Operator | Meaning                  | Example  |
		        | -------- | ------------------------ | -------- |
		        | `==`     | Equal to                 | `a == b` |
		        | `!=`     | Not equal to             | `a != b` |
		        | `>`      | Greater than             | `a > b`  |
		        | `<`      | Less than                | `a < b`  |
		        | `>=`     | Greater than or equal to | `a >= b` |
		        | `<=`     | Less than or equal to    | `a <= b` |
		        */
		        
		        
		        int c3=30;
		        int c4=60;
		        
		        // first way
		        if(c3==c4) {
		        	System.out.println("true");
		        }
		        else {
		        	System.out.println("false");
		        }

		     // second way
		        if(!(c3==c4)) {
		        	System.out.println("true");
		        }
		        else {
		        	System.out.println("false");
		        }

		        // third way
		        if(c3 !=c4) {
		        	System.out.println("true");
		        }
		        else {
		        	System.out.println("false");
		        }
		        
		        
		       // Greater than or equal to
		        if(c3>=c4) {
		        	System.out.println("dfdsfhgsdhfgds");
		        }
		        
		        
		        
		       // Less than or equal to 
		        if (c3<=c4) {
		        	System.out.println("sdfjsdjfghjs");
					
				}
		        
		        

		   //  ternary operator  
		        
		        int x1=420;
		        int x2=421;
		       
		    /*    Ternary Operator (? :) in Java

		        Ternary Operator is a shortcut of if-else that returns a value based on a condition.

			  
		        condition ? value_if_true : value_if_false; */
		        
		   String x3= (x1 < x2) ? "YES" :"NO";
		   
		   System.out.println(x3);
		
		
		/* 6.)Bitwise Operators         |

Bitwise AND Operator (&) Kya Hai?

& ek Bitwise AND Operator hai jo numbers ki binary bits par kaam karta hai.

Rule:

1 & 1 = 1
1 & 0 = 0
0 & 1 = 0
0 & 0 = 0

		
		=========================
BITWISE OPERATOR TABLE
=========================

1. AND (&)

A    B    OUTPUT
----------------
0    0      0
1    0      0
0    1      0
1    1      1

Rule:
Both bits must be 1 to get 1.


2. OR (|)

A    B    OUTPUT
----------------
0    0      0
1    0      1
0    1      1
1    1      1

Rule:
At least one bit must be 1 to get 1.


3. XOR (^)

A    B    OUTPUT
----------------
0    0      0
1    0      1
0    1      1
1    1      0

Rule:
Bits are different = 1
Bits are same = 0


4. NOT (~)

A    OUTPUT
------------
0      1
1      0

Rule:
0 becomes 1
1 becomes 0


=========================
JAVA EXAMPLE
=========================

int a = 5;   // 0101
int b = 3;   // 0011

System.out.println(a & b);  // 1
System.out.println(a | b);  // 7
System.out.println(a ^ b);  // 6
System.out.println(~a);     // -6
		    */
		
		
		

	}

}

