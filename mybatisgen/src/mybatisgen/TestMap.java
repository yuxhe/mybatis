package mybatisgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {

		List<Map<String, Object>> dataMap = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 6; i++) {
			// 给list填充位置
			Map<String, Object> mm = new HashMap<String, Object>();
			mm.put(i + "", i);
			dataMap.add(mm);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("咪咕整体", 1);
		dataMap.add(0, map);
		Map<String, Object> infoFeeMap = new HashMap<>();
		infoFeeMap.put("咪咕视讯2", "mgys2");
		infoFeeMap.put("咪咕音乐", "mgyy");
		infoFeeMap.put("咪咕视讯", "mgys");
		if (infoFeeMap != null && infoFeeMap.size() > 0) {
			Set keys = infoFeeMap.keySet();
			Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				Object keyObject = iterator.next();
				Object value = infoFeeMap.get(keyObject);
				Map<String, Object> maps = new HashMap<String, Object>();
				maps.put(keyObject.toString(), value);
				String key = keyObject.toString();
				System.out.println("key="+key);
				if ("咪咕音乐".equals(key)) {
					dataMap.add(1, maps);
				} else if ("咪咕视讯".equals(key)) {
					dataMap.add(2, maps);
				} else if ("咪咕视讯2".equals(key)) {
					dataMap.add(3, maps);
				}
			}
		}

		System.out.println("dataMap="+dataMap);
	}
}
