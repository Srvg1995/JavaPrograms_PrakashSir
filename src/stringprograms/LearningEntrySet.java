package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class LearningEntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer>hs=new HashMap(); //Here we took Generic HashMap(ie,HashMap<String, Integer>) ,bcz 'entrySet' is applicable only for Generic HashMap. 
		hs.put("SKY",63);
		hs.put("VK", 18);
		hs.put("RS", 45);
		for(Map.Entry<String,Integer>data:hs.entrySet()) {
			System.out.print(data.getKey()+"-");
			System.out.print(data.getValue());
			System.out.println(data.getKey());
		}
	}
}

