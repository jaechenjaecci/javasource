package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("id_0123", "홍길동");
	map.put("id_0124", "장길동");
	map.put("id_0125", "송길동");
	map.put("id_0126", "최길동");
	
	//가져오기
	Set<String> keys = map.keySet();
	//List,Set,Map에 담겨진 데이터를 표준화된 방법으로 가져올 수 있도록 제공
	//List,Set은 iterrator를 사용하는게 더 번거로움, 향상된 포문이 편함
	Iterator<String> iter = keys.iterator();
	while(iter.hasNext()) {
	//다음에 가져올 것이 있다면
	//System.out.println(iter.next());
	//가져오기
	String userId = iter.next();	
	String value = map.get(userId);
	System.out.println(userId +" : "+value);
	}
	System.out.println();
	
	//Map.entry 객체 사용
	Set<Entry<String, String>>entrySet = map.entrySet();
	//set안에 엔트리 구조로 담아내겠다란 뜻
	//맵 구조로 바로 넣을 수 없어서 엔트리 구조로 바꿔서 넣음
	Iterator<Entry<String,String>> iter2 = entrySet.iterator();
	while(iter2.hasNext()) {
		Entry<String, String> entry = iter2.next();
		System.out.println(entry.getKey()+" ; "+entry.getValue());
	}

}
}