package workA;

public class Demo {

	public static void findA(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray是由字符串str转化过来的字符数组
		int num=0;
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
			}
		}
		System.out.println("字符串中含有"+num+"个a");
	}
	
	public static void findB(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray是由字符串str转化过来的字符数组
		int num=0;				//用于保存字符个数
		int firstnum=0;			//用于保存起始下标
		int endnum=0;			//用于保存结尾下标
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
				if(num==2){ firstnum=i;}
				if(num==3){ endnum=i;}
			}
		}
		String newStr=str.substring(firstnum+1, endnum);			//进行截取操作
		System.out.println("第二个和第三个a之间的字符串为"+newStr);
	}
	
	public static void findC(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray是由字符串str转化过来的字符数组
		int num=0;				//用于保存字符个数
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
				if(num==2){
					chrArray[i]='1';
				}
			}
		}
		String newStr=String.valueOf(chrArray);			//进行转换操作
		System.out.println("将第二个a转换为1之后的字符串为"+newStr);
	}
	
	public static void findD(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray是由字符串str转化过来的字符数组
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				chrArray[i]='b';
			}
		}
		String newStr=String.valueOf(chrArray);			//进行转换操作
		System.out.println("将所有a替换为b之后的字符串为"+newStr);
	}
	
	public static void main(String[] args) {
		String str="abcafgakkal";
		findA(str);
		findB(str);
		findC(str);
		findD(str);
	}

}
