package HashMapChaining;

public class App {
	
	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable();
		hashTable.put(1, 5);
		hashTable.put(3, 85);
		hashTable.put(1, 95);
		hashTable.put(1, 75);
		hashTable.put(6, 5);
		
		System.out.println(hashTable.get(1));
		System.out.println(hashTable.get(3));
		System.out.println(hashTable.get(2));
		System.out.println(hashTable.get(6));
	}

}
