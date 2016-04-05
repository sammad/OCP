package hackerrank.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParenthesisTest {
	private static Map<Character,Character> braces = new HashMap<>();
	static{
		braces.put('{', '}');
		braces.put('(', ')');
		braces.put('[', ']');
		
	}
	public static void main(String []argh)
	{
		try(Scanner sc = new Scanner(System.in)){;

		while (sc.hasNext()) {
			String input=sc.next();
			if(isInputStringBalanced(input)){
				System.out.println(Boolean.TRUE);
			}else{
				System.out.println(Boolean.FALSE);
			}   
		}
		}

	}

	private static boolean isInputStringBalanced(String input) {
		Deque<Character> stack = new ArrayDeque<>();
		
		for(Character character:input.toCharArray()){
			Character topElem =stack.peekFirst();
			if(topElem!=null 
					&& character.equals(braces.get(topElem))){
				stack.pop();
			}else{
				stack.push(character);
			}
		}
		
		return stack.size()==0;
	}
}
