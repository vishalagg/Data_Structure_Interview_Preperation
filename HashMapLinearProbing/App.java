package HashMapLinearProbing;

public class App {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put(1, 10);
		hashTable.put(2, 20);
		hashTable.put(4, 30);
		hashTable.put(1, 90);
		
		System.out.println(hashTable.get(1));
		System.out.println(hashTable.get(2));
		System.out.println(hashTable.get(3));
		System.out.println(hashTable.get(4));
	}
}
