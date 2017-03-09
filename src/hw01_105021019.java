/*
 * Topic:2017/3/3 回家作業_1
 * Date:2017/3/3
 * Author:105021019 林承鴻
 */

import java.util.Scanner;
public class hw01_105021019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String n,f,fly;
        float h;
        System.out.println("輸入動物名稱");
        n = scn.nextLine();
        System.out.println("食性");
        f = scn.nextLine();
        System.out.println("會不會飛");
        fly = scn.nextLine();
        System.out.println("高度");
        h = scn.nextFloat();
        
		Animal ani = new Animal(n,f);
		ani.setState(h);
		ani.Wings(fly);
		System.out.println("名字"+"="+ani.setName());
		System.out.println("食性"+"="+ani.setFood());
		System.out.println("飛？"+"="+ani.setWings());
		System.out.println("身高"+"="+ani.setState());
	}

}
