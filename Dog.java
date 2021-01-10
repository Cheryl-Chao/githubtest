public class Dog {
	private String name;
	private int ID;
	private int weight;
	private int age;
	private int height;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
