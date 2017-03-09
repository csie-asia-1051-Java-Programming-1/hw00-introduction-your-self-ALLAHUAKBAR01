public class Animal {

	private String name,food,fly;
	private float height;
	

	public Animal(String name1,String food1)
	{
		name = name1;
		food = food1;
		
	}
	public void setState(float height1)
	{
		height = height1;
		
	}
	public void Wings(String fly1)
	{
		fly = fly1;
	}
	public String setName()
	{
		return name;
	}
	public String setFood()
	{
		return food;
	}
	
	public float setState()
	{
		return height;
	}
	public String setWings()
	{
		return fly;
	}
	
}