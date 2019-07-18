package neusoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s =new HashSet();
		s.add("hello");
		s.add("world");
//		s.add(new Name("f1","f2"));
		s.add(new Integer(100));
//		s.add(new Name("f1","f2"));
		s.add("hello");
		s.add(new Integer(100));
		System.out.println(s);
		Set s2 =new HashSet();
		s2.add("hello");
		s2.add("world");
		s2.add("yeah!");
		s2.add(new Integer(90));
		System.out.println(s2);
		Set s3 =new HashSet(s);
		s3.retainAll(s2);
		Set s4 =new HashSet(s);
		s4.addAll(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		List  l1=new ArrayList();
		l1.add("one");
		l1.add("two");
		l1.add(3);
		l1.add(new Float(4.0F));
		l1.add("two");
		l1.add(new Integer(3));
		System.out.println(l1);
		
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<6;i++) {
			set.add(new Integer(i));
		}
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			Integer j =(Integer)it.next();
			System.out.println(j);
		}
		
		System.out.println(set);
		
		
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		for(int i=0;i<3;i++) {
			al.add(i+5);
		}
		Iterator<Integer> iter=al.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(al);
		
		LinkedList<String> ls =new LinkedList<String>();
		for(int i=0;i<3;i++) {
			ls.add("hahaha");
		}
		Iterator<String> iterator =ls.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(ls);
		
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("------------------------------------------------------------------------------");
		Map m1 =new HashMap();
		Map m2 =new HashMap();
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		m2.put("C", new Integer(3));
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(new Integer(2)));
		if(m1.containsKey("two")) {
			int i =((Integer)m1.get("two")).intValue();
			System.out.println(i);
		}
		
		Map m3 =new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
		
	}
	
	

}
