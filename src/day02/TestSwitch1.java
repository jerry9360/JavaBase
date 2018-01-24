package day02;
/*
switch(变量){
	case 值1:

	case 值2:

	case 值3:

	default:

}
1.根据变量的值，选择相应的case去判断，一旦满足case条件，就执行case的相应语句。如果没有break或者已经
到结尾的话，会继续执行其下的case语句。
2.default:是可选的，而且位置是灵活的。
3.变量可以是哪些类型？char byte short int 枚举 String(jdk1.7)
4.case 条件:其中条件只能是值，不能是取值范围！
*/
public class TestSwitch1 {
	public static void main(String[] args) {
		int i = 2;
		switch(i){
			
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("other");
				break;
		}
		/*
		switch(i){
			case (i > 2):
				System.out.println("a");
				break;
			case (i > 5):
				System.out.println("b");
				break;
			default:
				System.out.println("c");
				break;
		}
		*/
	}
}
