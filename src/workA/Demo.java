package workA;

public class Demo {

	public static void findA(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray�����ַ���strת���������ַ�����
		int num=0;
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
			}
		}
		System.out.println("�ַ����к���"+num+"��a");
	}
	
	public static void findB(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray�����ַ���strת���������ַ�����
		int num=0;				//���ڱ����ַ�����
		int firstnum=0;			//���ڱ�����ʼ�±�
		int endnum=0;			//���ڱ����β�±�
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
				if(num==2){ firstnum=i;}
				if(num==3){ endnum=i;}
			}
		}
		String newStr=str.substring(firstnum+1, endnum);			//���н�ȡ����
		System.out.println("�ڶ����͵�����a֮����ַ���Ϊ"+newStr);
	}
	
	public static void findC(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray�����ַ���strת���������ַ�����
		int num=0;				//���ڱ����ַ�����
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				num++;
				if(num==2){
					chrArray[i]='1';
				}
			}
		}
		String newStr=String.valueOf(chrArray);			//����ת������
		System.out.println("���ڶ���aת��Ϊ1֮����ַ���Ϊ"+newStr);
	}
	
	public static void findD(String s) {
		// TODO Auto-generated method stub
		String str=s;
		char []chrArray=str.toCharArray();  //chrArray�����ַ���strת���������ַ�����
		for(int i=0;i<str.length();i++){
			if(chrArray[i]=='a'){
				chrArray[i]='b';
			}
		}
		String newStr=String.valueOf(chrArray);			//����ת������
		System.out.println("������a�滻Ϊb֮����ַ���Ϊ"+newStr);
	}
	
	public static void main(String[] args) {
		String str="abcafgakkal";
		findA(str);
		findB(str);
		findC(str);
		findD(str);
	}

}
