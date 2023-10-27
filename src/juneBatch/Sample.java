package juneBatch;

public class Sample {
	
	public int age = 25;
	public String batch = "juneBatch";
	public long salary = 20000;
	
	public String getBatch() {
		
		return batch;
	}
	public int getAge() {
		
		return age;
	}
	public Sample() {
	
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.getAge());
		System.out.println(sample.getBatch());
		
	}

}
