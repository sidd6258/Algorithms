package hashMapImpl;

public class SidHashMap {
	private  int BUCKET_SIZE;
	private Node bucket[];
	
	public SidHashMap(int initialize){
		this.bucket=new Node[initialize];
		this.BUCKET_SIZE=initialize;
	}
	
	public SidHashMap() {
		// TODO Auto-generated constructor stub
	}

	public void put(String key,String value){
		int hash=Math.abs((key.hashCode() % BUCKET_SIZE));
		
		Node entry=new Node(key, value);
		
		if(bucket[hash]==null){
			bucket[hash]=entry;
		}
		else{
			Node current=bucket[hash];
			while(current.getNext()!=null){
				if(current.getKey().equals(entry.getKey())){
					current.setValue(entry.getValue());
					return;
				}
				current=current.getNext();
			}
			current.setNext(entry);
		}		
	}
	public String get(String key){
		int hash=Math.abs((key.hashCode() % BUCKET_SIZE));
		Node n=bucket[hash];
		
		while(n!=null){
			if(n.getKey().equals(key)){
				return n.getValue();
			}
			n=n.getNext();
		}
		return null;
	}
	
	public static void main(String []args){
		SidHashMap shm=new SidHashMap(16);
		shm.put("user1", "user1Value");
		shm.put("user2", "user2Value");
		shm.put("user3", "user3Value");
		shm.put("user4", "user4Value");
		shm.put("user5", "user5Value");
		System.out.println(shm.get("user2"));
	}
}
