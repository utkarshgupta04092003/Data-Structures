// Implement stack using Array
/***************************************************
we cannot make it generic bcoz-
Arrays in Java contains information about their 
component type for allocating memory during 
runtime. Now, if the component type is not known
at runtime, we cannot instantiate the array. 
Consider,

E[] arr = new E[capacity];

This uses generics. We know that generics are not
present in the byte code generated by the compiler
because of type erasure in Java. That means the 
type information is erased at the runtime, and 
new E[capacity] won’t know what type needs to be
instantiated. To avoid this behavior, we should use
List provided by the Java Collections Framework
wherever we need generics.

 
But there are ways to create a generic array-like 
data structure in Java, which are covered below:

**************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Stack st =  new Stack();
		
		System.out.println(st.isEmpty());
		System.out.println(st.size());
        System.out.println();
        
        
		st.push(5);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.top());
		System.out.println();
		
		st.push(10);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.top());
		System.out.println();

		
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.top());
		System.out.println();
		
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.top());
		System.out.println();

		// stack is empty till here
		

	    // we can store as much as we want with the help of resizing
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
        st.push(11);


	    while(!st.isEmpty()){
		    System.out.print(st.pop()+" ");
		}
		System.out.println();
		
		
	}
}
