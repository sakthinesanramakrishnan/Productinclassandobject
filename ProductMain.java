package com.edu;

class Product{
	//variable are called fields or instance variable
	int pid;
	String pname;
	float pprice;
	
	Product(){  //constructed is used to initialize instance variable of class
		pid=8;
		pname="TV";
		pprice=35000.34f;
	}
	Product(int i,String s, float p){ //i=10    s="Laptop"   p-5400.56f 
		pid=i;
		pname=s;
		pprice=p;
	}
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
		System.out.println("Product price="+pprice);
	}
}

public class ProductMain {

	public static void main(String[] args) {
		//int sum; //local variable
		Product ob=new Product();
		System.out.println("pid="+ob.pid);
		System.out.println("pname="+ob.pname);
        System.out.println("pprice="+ob.pprice);
        
        Product ob1=new Product(10,"Laptop",5400.56f);
        		ob.display();
        		ob.display();
	}

}
