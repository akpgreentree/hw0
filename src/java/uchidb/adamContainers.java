package uchidb;

import java.util.Map;

public class adamContainers implements Containers{
	public Map<S,T> storedMap;
	public Set<T> initSet(T[] tArray){
		HashSet<T> tSet = new HashSet<T>();
		for(int i=0;i<tArray.length){
			tSet.add(tArray);
		}
		return tSet;
	}
	public List<T> initList(T[] tArray){
		LinkedList<T> tList = new LinkedList<T>();
		for(int i=0;i<tArray.length){
			tSet.add(tArray);
		}
		return tList;
	}
	public Map<S,T> initEmptyMap(){
		HashMap<S,T> hmap = new HashMap<S,T>();
		return hmap;
	}
	public void storeMap(Map<S,T> mapToStoreInClass){
		storedMap = mapToStoreInClass;
	}
	public boolean addToMap(S key, T value, boolean overwriteExistingKey){
		if(!Map.containsKey(key) || overwriteExistingKey){
			Map.put(key, value);
			if (Map.get(key)==value){
				return true;
			}
		}
		return false;
	}
	
	
}
