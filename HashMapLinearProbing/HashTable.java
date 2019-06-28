package HashMapLinearProbing;

public class HashTable {

	private HashItem[] hashTable;
	
	public HashTable() {
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	public int get(int key) {
		
		int hashArrayIndex = hash(key);
		
		while(hashTable[hashArrayIndex]!=null && hashTable[hashArrayIndex].getKey()!=key){
			hashArrayIndex = (hashArrayIndex+1)%Constants.TABLE_SIZE;
		}
		
		if(hashTable[hashArrayIndex]==null) {
			return -1;
		}else {
			return hashTable[hashArrayIndex].getValue();
		}
	}
	
	public void put(int key,int value) {
		
		int hashArrayIndex = hash(key);
		
		while(hashTable[hashArrayIndex]!=null) {
			hashArrayIndex = (hashArrayIndex+1)%Constants.TABLE_SIZE;
		}
		hashTable[hashArrayIndex] = new HashItem(key,value);
	}
	
	private int hash(int key){
		return key%Constants.TABLE_SIZE;
	}
}
