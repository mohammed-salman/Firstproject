package basi.java.hashmap1;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> hmap=new HashMap<Integer,String>();
       hmap.put(1, "Stringmap");
       hmap.put(2, "Stringmap2");
       hmap.put(3, "Stringmap3");
      // hmap.forEach(Map.Entry<n,k> e :hmap.entrySet()) -> System.out.println(n+"  "+k);
       
       
       for(Map.Entry<Integer, String>entry : hmap.entrySet())
       {
    	   int key=entry.getKey();
    	   String value=entry.getValue();
    	   System.out.println(key+"  "+value);
    	   
       }
       
       
	}

}
