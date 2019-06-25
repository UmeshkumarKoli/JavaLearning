package umeshK;

import java.util.HashMap;
import java.util.Set;


public class CollectionAssignmentEx8 {

	public static void main(String[] args) {
		/*WAP to compare two Hash map for equality ?*/
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("Umesh", 20);
		hm.put("Maulik", 30);
		hm.put("Harsh", 10);
		hm.put("Krishna", 50);
		//HashMap<String, Double> hm1= new HashMap<String, Double>();
		HashMap<String, Integer> hm1= new HashMap<String, Integer>();
		hm1.put("Umesh", 20);
		hm1.put("Maulik", 30);
		hm1.put("Harsh", 10);
		hm1.put("Krishna", 50);
		//hm1.put("Shef", 50);

		if(hm.size()==hm1.size()){
			boolean flag=true;
			Set<String>hm_keys=hm.keySet();
			Set<String>hm1_keys=hm1.keySet();
			for(String s:hm1_keys){
				if(hm1.containsKey(s)){
					if(hm.get(s)==hm1.get(s)){
						continue;
					}
					else{
						flag=false;
						break;
					}
				}
			}
			if(flag==true){
				System.out.println("Both hash maps are equal");
			}
			else
				System.out.println("Both hash maps are not equal");
		}
		else
			System.out.println("Both hash maps are not equal");
	}

}
