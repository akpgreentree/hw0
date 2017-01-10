package uchidb;

import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;


public class adamContainers<T,S> implements Containers<T,S>{
	public Map<S,T> storedMap;

	public Set<T> initSet(T[] tArray){
		HashSet<T> tSet = new HashSet<T>(Arrays.asList(tArray));
		return tSet;
	}

	public List<T> initList(T[] tArray){
		List<T> tList = Arrays.asList(tArray);
		return tList;
	}

	public Map<S,T> initEmptyMap(){
		Map<S,T> hmap = new HashMap<S,T>();
		return hmap;
	}

	public void storeMap(Map<S,T> mapToStoreInClass){
		this.storedMap = mapToStoreInClass;
	}

	public boolean addToMap(S key, T value, boolean overwriteExistingKey){
		if(!this.storedMap.containsKey(key) || overwriteExistingKey){
			this.storedMap.put(key, value);
			if (this.storedMap.get(key)==value){
				return true;
			}
		}
		return false;
	}
	public T getValueFromMap(S key){
		return this.storedMap.get(key);
	}
	public T getValueFromMap(S key, T defaultValue){
		if (this.storedMap.containsKey(key)){
			return defaultValue;
		}
		return this.storedMap.get(key);
	}

}
