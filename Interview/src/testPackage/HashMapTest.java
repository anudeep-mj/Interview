package testPackage;

import java.util.*;

public class HashMapTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, List> Map = new HashMap<Integer, List>();
		List<Integer> testList = new ArrayList<Integer>();
		HashMapTest(Map, testList);
	}

	private static void HashMapTest(HashMap<Integer, List> Map,
			List<Integer> testList) {
		// TODO Auto-generated method stub
		testList.add(1);
		testList.add(2);
		Map.put(1, testList);
		System.out.println(Map);
	}

}
