
public class Student {

	private String name,id;
	private char gender;
	private float height,weight;
	
	

public Student(String name1,String id1)
{
	name = name1;
	id = id1;
	
}

public void setGender (char gender1)
{
	gender = gender1;
	
}
public char getGender()
{
	return gender;
	
}
public void setState (float height1,float weight1)
{
	height = height1;
	weight = weight1;
}
public float getHeight()
{
	return height;
	
}
public float getWeight()
{
	return weight;
	
}
public String Name()
{
	return name;
	
}
public String ID()
{
	return id;
	
}
}

