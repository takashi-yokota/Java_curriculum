package curriculum_B;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scanner = new Scanner(System.in);
		 
		 String name = scanner.nextLine();
		 scanner.close();
		 
		 Matcher result = Pattern.compile("^[A-Za-z0-9]+$").matcher(name);
		 
		 if(Objects.isNull(name) | name == "") {
			 //メッセージを表示
			 System.out.println("名前を入力してください");
			 return;
		 }
		 //名前が10文字以上の場合
		 if(name.length() > 10) {
			//メッセージを表示
			 System.out.println("名前を10文字いないにしてください");
			 return;
		 }
		 //名前が半角英数字以外の場合
		 if(!result.matches()) {
//			 //メッセージを表示
			 System.out.println("半角英数字のみで名前を入力してください");
			 return;
		 }
		//メッセージを表示
		 System.out.println("ユーザー名"+name+"を登録しました");
	}

}
