package day01;
//变量：基本数据类型（8个） vs 引用数据类型（类、接口、数组）
//1.java中的变量定义的格式：数据类型  变量名 = 初始化值
public class TestVeriable {
	public static void main(String[] args) {
		//2.变量得先定义，后使用
		int myInt1 = 10;
		double d = 12.3;
		
		System.out.println(myInt1);
		System.out.println(myInt1 + d);
		//i1超出了其作用的范围，不可使用。
		//System.out.println(i1);

		//3.整型：byte(-128~+127)  short  int（默认类型） long
		byte b1 = 12;
		//byte b2 = 128;
		short s1 = 128;
		int i1 = 12;
		//定义long型变量，值的末尾加“L”或“l”
		long l1 = 2134123351345325L;
		System.out.println(l1);

		//4.浮点型（带小数点的数值）：float   double（默认类型）
		double d1 = 12.3;
		//声明float类型的浮点型数据，末尾要加“F”或者“f”
		float f1 = 12.3F;
		System.out.println(f1);

		//5.字符型（=两个字节）：char 只能表示一个字符(英文、中文、标点符号、日文、。。。)
		char c1 = 'a';
		//char c2 = 'ab';
		String str = "ab";
		char c3 = '中';
		String str1 = "中国";
		//可以表示转义字符
		char c4 = '\t';
		char c5 = '\n';
		System.out.println("abc" + c5 + "def");
		//了解
		char c6 = '\u1234';
		System.out.println(c6);

		//6.布尔类型：boolean  只能够取值为true 或 false 。不能取值null
		boolean bool1 = true;
		if(bool1){
			System.out.println("佟老师是个\"帅\"哥");
		}else{
			System.out.println("你在说谎！");
		}

	}

	public void method1(){
		int i1 = 10;
		System.out.println(i1);
	}
}
