/*
 * Topic:3/3 第一次課堂練習
 * Date:2017/03/08
 * Author:105021019 林承鴻
 */



public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("AllahuAkbar","0800-092-000");
		stu.setGender('1');
		System.out.println(stu.getGender());		
		stu.setState(170.0f,70.0f);
		System.out.println("名字"+"="+stu.Name());
		System.out.println("ID"+"="+stu.ID());
		System.out.println("身高"+"="+stu.getHeight());
		System.out.println("體重"+"="+stu.getWeight());
	}

}
