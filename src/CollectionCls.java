import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionCls
{
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();

		list.add("Joshi");
		list.add("Joshi");
		list.add(null);

		System.out.println(list);
		System.out.println("*********************************");

		Set<String> set = new LinkedHashSet<>();

		set.add("Joshi");
		set.add("Joshi");
		set.add(null);

		System.out.println(set);
		System.out.println("*********************************");

		Map<String, String> map = new LinkedHashMap<>();

		map.put("Joshi", "A");
		map.put("Joshi", "B");
		map.put(null, "C");
		map.put(null, "D");
		map.put(null, null);
		map.put(null, null);

		System.out.println(map);
	}

}
