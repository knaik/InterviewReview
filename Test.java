public class Test{
	static class MyArr{
		protected int[] thisArr = new int[10];
		
		public MyArr(){
			for (int i = 0; i < thisArr.length; i++){
				thisArr[i] = 0;
			}
		}
		
		public String toString(){
			String temp = "[";
			
			for (int i = 0; i < thisArr.length; i++){
				temp += thisArr[i] + " "; 
			}
			temp += "\b]";
			return temp;
		}
		
		
		
	}
	
	static class Stack extends MyArr{
		private int front = 0;
		private int last = 0;
		
		public boolean push(int n){
			if (last == thisArr.length){
				return false;
			}
			
			thisArr[last] = n;
			last++;
			return true;
			
		}
		
		public int pop(){
			if (last == front){
				return -1;
			}
			
			int temp = thisArr[last-1];
			thisArr[last-1] = 0;
			last--;
			return temp;
			
		}
		
		
	}
	
	static class Queue extends MyArr{
		private int front = 0;
		private int last = 0;
		
		public boolean enqueue(int n){
			if (last == thisArr.length){
				return false;
			}
			
			thisArr[last] = n;
			last++;
			return true;
			
		}
		
		public int dequeue(){
			
			
			int temp = thisArr[front];
			thisArr[front] = 0;
			front++;
			return temp;
			
		}
		
		
	}
	
	
	public static void main(String[] args){
		System.out.println("running");
		MyArr newArr = new MyArr();
		System.out.println(newArr);
		
		Stack myStack = new Stack();
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 5 " + myStack.push(5));
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 6 " + myStack.push(6));
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("popped "+ myStack.pop());
		System.out.println(myStack);
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
		System.out.println("pushed 3 " + myStack.push(3));
				System.out.println(myStack+ "2");
				System.out.println("pushed 3 " + myStack.push(3));
		System.out.println(myStack + "1");

				System.out.println("pushed 3 " + myStack.push(3));
	}

}