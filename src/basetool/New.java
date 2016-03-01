package basetool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class New {
	public static <K,V> HashMap<K,V> map(){
		return new HashMap<K,V>();
	}
	public static <T> LinkedList<T> List(){
		return new LinkedList<T>();
	}
	public static <T> HashSet<T> Set(){
		return new HashSet<T>();
	}
	public static <T> ArrayList<T> ArrayList(){
		return new ArrayList<T>();
	}
}
