package day02;
/*
对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

说明：
1.当多个case语句处理的语句块一致时，可以统一来书写
2.一定情况下switch-case与if-else之间可以相互转换。
*/
public class TestSwitch3 {
	public static void main(String[] args){
		int score = 67;
		if(score >= 60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		/*
		switch(score){
			case 100:
			...
			case 0:
			default:
		}
		*/
		switch(score / 10){
			case 10:
			case 9:
			case 8:
			case 7:
			case 6:
				System.out.println("及格");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("不及格");
				break;
			default:
				System.out.println("输入有误");
				break;
			
			
		}

		
	}
}
