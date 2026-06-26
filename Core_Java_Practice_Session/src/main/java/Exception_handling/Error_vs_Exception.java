package Exception_handling;

public class Error_vs_Exception {

	public static void main(String[] args) {
		
		/*11. Error vs Exception ⭐⭐⭐⭐

		Examples:

		OutOfMemoryError
		StackOverflowError 
		
		
		
		
		| Exception                                      | Error                                              |
		| ---------------------------------------------- | -------------------------------------------------- |
		| Can be handled using `try-catch`               | Generally cannot be handled or recovered from      |
		| Caused by application/programming issues       | Caused by serious JVM or system problems           |
		| Subclass of `Exception`                        | Subclass of `Error`                                |
		| Usually recoverable                            | Usually not recoverable                            |
		| Examples: `IOException`, `ArithmeticException` | Examples: `OutOfMemoryError`, `StackOverflowError` |
		
		*
		*
		*
		*
		*
		*
		*2. OutOfMemoryError
          
          Definition

         OutOfMemoryError occurs when the JVM cannot allocate more memory because the 
         available heap memory has been exhausted.

         It is an Error, not an Exception.

         Real-life Example

          Imagine you have a cupboard that can hold 100 books.

          You keep adding books.
          After 100 books, the cupboard is full.
          If you still try to add more books, there is no space left.

          Similarly, the JVM heap becomes full, and it throws an 
          OutOfMemoryError.
		*
		*
		*
		*
		*
		*/

		
		

	}

}
