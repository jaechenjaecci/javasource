package collection;

import java.util.Stack;

public class StackEx {
public static void main(String[] args) {
	Stack<String> stack = new Stack<>();
	
	//데이터삽입
	stack.push("사과");
	stack.push("딸기");
	stack.push("바나나");
	stack.push("감");
	
	System.out.println(stack);
	System.out.println();
	
	while(!stack.empty()) {
		System.out.println(stack.pop());
	}
}
}
