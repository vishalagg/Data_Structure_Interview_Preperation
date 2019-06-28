package HashMapChaining;

public class HashTable {

	private HashItem[] hashTable; 
	
	public HashTable() {
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	public int get(int key) {
		
		int generatedIndex = hash(key);
		if (hashTable[generatedIndex]==null) {
			return -1;
		}else {
			HashItem hashItem = hashTable[generatedIndex];
			
			while (hashItem!=null && hashItem.getKey()!=key) {
				hashItem = hashItem.getNextHashItem();
			}
			
			if (hashItem==null) {
				return -1;
			} else {
				return hashItem.getValue();
			}
		}
	}
	
	public void put(int key,int value) {
		
		int hashArrayIndex = hash(key);
		if(hashTable[hashArrayIndex]==null) {
			System.out.println("No collision for key : "+ key +", Simple Insertion");
			hashTable[hashArrayIndex] = new HashItem(key,value);
		}else {
			System.out.println("Collision here for the key : "+key);
			HashItem hashItem = hashTable[hashArrayIndex];
			while(hashItem.getNextHashItem()!=null){
				hashItem = hashItem.getNextHashItem();
				System.out.println("Checking next Item in linked list : "+ hashItem.getValue());
			}
			System.out.println("We found the location to insert");
			hashItem.setNextHashItem(new HashItem(key, value));
		}
	}
	
	private int hash(int key) {
		return key%Constants.TABLE_SIZE;
	}
}
