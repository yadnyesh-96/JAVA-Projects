


import java.util.*;
public class LinkedList_List{
	public static void main(String x[]){
		
		LinkedList ls=new LinkedList();
		
		ls.add(10);
		ls.add(20);
		ls.addFirst(30);
		ls.addLast(40);
		ls.add(50);
		ls.addLast(60);
		ls.addFirst(70);
		
		for(Object obj:ls){
			System.out.println(obj);
		}
	}
}