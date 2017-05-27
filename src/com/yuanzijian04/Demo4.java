package com.yuanzijian04;

/*
���� ����һ��ͼ�Ρ�Բ�Ρ� ���������ࡣ��������ͼ�ζ���߱��������
���ܳ�����Ϊ������ÿ��ͼ�μ���ķ�ʽ��һ�¶��ѡ�

�����������淶��ȫ����ĸ��д�������뵥�� ֮�� ʹ���»��߷ָ���


abstract���������¹ؼ��ֹ�ͬ����һ��������
	1. abstract������private��ͬ����һ��������
	2. abstract ������static��ͬ����һ��������
	3. abstract ������final��ͬ����һ��������

*/
//abstract ����

abstract class MyShape{ 

	String name;

	public MyShape(String name){
		this.name = name;
	}

	public  abstract void getArea();
	
	public abstract void getLength();
}

//Բ�� ������ͼ�����һ��
class Circle extends MyShape{
	
	double r;

	public static final double PI = 3.14;

	public Circle(String name,double r){
		super(name);
		this.r =r;
	}

	public  void getArea(){
		System.out.println(name+"������ǣ�"+PI*r*r);
	}
	
	public  void getLength(){
		System.out.println(name+"���ܳ��ǣ�"+2*PI*r);
	}
}

class Circle1 extends MyShape{
	
	double r;
	
	public static final double PI=3.14;
	
	public Circle1(String name,double r){
	super(name);
	this.r=r;
	}
	public void getArea(){
	System.out.println(name+"������ǣ�"+PI*r*r);
	}
	public void getLength(){
	System.out.println(name+"���ܳ��ǣ�"+2*PI*r);
	}
}

//���� ����ͼ���е� һ��
class Rect extends MyShape{

	int width;

	int height;

	public Rect(String name,int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public  void getArea(){
		System.out.println(name+"������ǣ�"+width*height);
	}
	
	public  void getLength(){
		System.out.println(name+"���ܳ��ǣ�"+2*(width+height));
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		Circle c = new Circle("Բ��",4.0);
		c.getArea();
		c.getLength();

		//����
		Rect r = new Rect("����",3,4);
		r.getArea();
		r.getLength();
	
	}
}