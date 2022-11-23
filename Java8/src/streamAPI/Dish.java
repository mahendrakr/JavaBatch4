package streamAPI;

public class Dish {

	private   String name;
	private   boolean vegetaeian;
	private   int  calories;
	private   Type type;
	
	public Dish(String name, boolean vegetaeian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetaeian = vegetaeian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetaeian() {
		return vegetaeian;
	}

	public void setVegetaeian(boolean vegetaeian) {
		this.vegetaeian = vegetaeian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
    
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetaeian=" + vegetaeian + ", calories=" + calories + ", type=" + type + "]";
	}

	public enum Type {
		MEAT , FISH, OTHER 
	}
}
