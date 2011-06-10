package ordenaPatos;

public class Duck implements Comparable{
	private String name;
	private int weight;
	
	
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object object) {
		Duck otherDuck = (Duck) object;
		if(this.weight<otherDuck.weight){
			return -1;
		}else if(this.weight==otherDuck.weight){
			return 0;	
		}else{
			return 1;
		}		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}
	
	

}
