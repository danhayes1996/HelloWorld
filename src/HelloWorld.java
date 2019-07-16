import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	private Map<Integer, String> map;
	
	public HelloWorld() {
		map = new HashMap<>();
	}
	
	public boolean add(int id, String string) {
		if(!map.containsKey(id)) {
			map.put(id, string);
			return true;
		}
		return false;
	}
	
	public String get(int id) {
		return map.get(id);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		HelloWorld h = new HelloWorld();
		h.add(1, "Hello World");
		System.out.println(h.get(1));
		
	}
	
}
