package arrayInJava;

import java.util.ArrayList;

public class ArrayListinjava {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("abc");
		al.add('D');
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.set(4,"satara");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.contains(null));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
	}

	}

