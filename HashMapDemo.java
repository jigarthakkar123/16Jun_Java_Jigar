import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1,"Akshay");
		map.put(2,"Akshar");
		map.put(3,"Jainil");
		map.put(4,"Nisha");
		map.put(5,"Jinal");
		map.put(2,"Jigar");
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.replace(3, "Ajay"));
		System.out.println(map);
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
