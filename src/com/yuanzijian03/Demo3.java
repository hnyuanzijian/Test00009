package com.yuanzijian03;

/*
�����ࣺ

Ŀǰ���ڵ����⣺
	1. �������run���������Ĳ���ȷ��
	2. û��ǿ��Ҫ����һ��Ҫ��дrun������

�������Ӧ�ó�����
	����������һ�������ʱ�򣬷��ָ�������ȷʵ������ĳ����Ϊ��
����������ΪĿǰ�ǲ�����ģ���ô���ǿ��Գ�ȡ������Ϊ ������������
��ȥʵ�ָ�����Ϊ����ʱ��������Ϊ���ǳ���Ϊ�������Ϊ�����Ǿ���Ҫʹ�ó����ࡣ

������ĺô�: ǿ��Ҫ������һ��Ҫʵ��ָ���ķ�����

������Ҫע���ϸ�ڣ�
	1. ���һ������û�з����壬��ô�ú�������Ҫʹ��abstract����,�Ѹú������γɳ��� �ĺ�������
	2. ���һ��������˳���ĺ�������ô����Ҳ���� ʹ��abstract���Ρ�
	3. ���һ���ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ȫ��ʵ�֡�
	4. ��������Դ��ڷǳ��󷽷���Ҳ���Դ��ڳ���ķ���.
	5. ��������Բ����ڳ��󷽷��ġ� 
	5. �������ǲ��ܴ�������ġ�
		���ʣ�Ϊʲô�����಻�ܴ��������أ�
		��Ϊ�������Ǵ��ڳ��󷽷��ģ�������ó����ഴ������Ļ�����ôʹ�ó���Ķ���
		���ó��󷽷���û���κ�����ġ�
	6. �������Ǵ��ڹ��캯���ģ��乹�캯�����ṩ�����ഴ�������ʱ���ʼ����������Եġ�
*/
//������--->������
abstract class Animal{
	
	String name;

	String  color;

	public Animal(String  name,String color){
		this.name = name;
		this.color = color;
	}
	

	//�ǳ���ķ���
	public void eat(){
		System.out.println(name+"����ʳ");
	}

	//�ƶ�...
	public abstract void run();
}



//�� �����ڶ�����һ�� 
class Dog extends Animal{

	public Dog(String name,String color){
		super(name,color);
	}

	public void run(){
		System.out.println(name+"�������ܵúܿ�...");
	}
}


//�� �����ڶ�����һ��
class Fish extends Animal{


	public Fish(String name,String color){
		super(name,color);
	}


	public void run(){
		System.out.println(name+"ҡҡβ���ΰ��Σ�");
	}
}


class Demo3 {

	public static void main(String[] args) 
	{
		
		Dog d = new Dog("����Ȯ","��ɫ");
		d.run();
/*
		//����һ�������
		Fish f  = new Fish("����","���ɫ");
		f.run();
		*/


	}
}
