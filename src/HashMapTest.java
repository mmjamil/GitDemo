import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("china", 120);
		map.put("India", 180);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey() +" "+e.getValue());
		}
		
		
		
		//print map key value using set 
		
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key+ " "+map.get(key));
		}
	}

}
