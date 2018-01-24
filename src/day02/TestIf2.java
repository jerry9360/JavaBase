package day02;
/*

从键盘输入小明的期末成绩。
当成绩为100分时，奖励一辆BMW；
当成绩为（80，99]时，奖励一个台iphone5s；
当成绩为[60,80]时，奖励一本参考书；
其它时，什么奖励也没有。

1.条件判断之间可以嵌套
2. ①如果多个条件之间是“互斥”关系，多个条件语句上下顺序是自由的。
   ②如果多个条件之间存在“包含”关系，要求范围小的写在范围大的上面。
*/
import java.util.Scanner;
public class TestIf2{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入小明的期末成绩：（分）");
		int score = s.nextInt();
		
		if(score >100 || score < 0){
			System.out.println("你输入的数值有误！");
		}else{
			if(score == 100){
				System.out.println("奖励一辆BMW");//be my wife!  MSN!
			}else if(score > 80){
				System.out.println("奖励一个台iphone5s");
			}else if(score >= 60){
				System.out.println("奖励一本参考书");
			}else{
				System.out.println("什么也没有");
			}
		}

		

	}
}
