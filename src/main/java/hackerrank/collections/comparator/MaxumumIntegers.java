package hackerrank.collections.comparator;

import java.util.*;
public class MaxumumIntegers {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			Deque<Integer> deque = new ArrayDeque<>();
			int n = in.nextInt();
			int m = in.nextInt();
			int maxSize=0;  
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();

				if(!deque.contains(num)){
					deque.push(num);
				}

				if(deque.size()==3 && deque.size()>maxSize){
					maxSize =deque.size();
					deque.clear();
				}
			}
			
			System.out.println("Max Size ="+maxSize);
		}
	}
}

