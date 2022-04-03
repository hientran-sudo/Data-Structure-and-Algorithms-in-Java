import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(8, "Cupcake");
		map.put(1, "Chocolate");
		map.put(9, "Apple pie");
		map.put(5, "Brownie");
		String text = map.get(9);
		System.out.println(text);
		for (Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}

	}

}
