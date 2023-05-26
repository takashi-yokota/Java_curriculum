package lesson1_5;

public class Curriculum_New_1_5 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "山田太郎";
		int num = 18;
		double height = 170.5;
		double weight = 62.2;
		String like = "寿司";
		
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+num+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+like+"です");
		
		
		double bmi = (weight / (height * height)) *10000;
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		System.out.println();
		
		name = "鈴木一郎";
		num = 24;
		height =168.5;
		weight = 64.2;
		like ="オムライス";
		bmi =(weight/(height*height))*10000;
		
		System.out.println("初めまして"+name+"鈴木一郎です");
		System.out.println("年齢は"+num+"歳です");
		System.out.println("身長は"+height+"です");
		System.out.println("体重は"+weight+"です");
		System.out.println("好きな食べ物は"+like+"です");
		System.out.println("BMIは"+String.format("%.1f", bmi)+"です");
	}

}
