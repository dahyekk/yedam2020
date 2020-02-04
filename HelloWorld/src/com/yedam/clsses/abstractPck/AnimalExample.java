package com.yedam.clsses.abstractPck;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal();	추상클래스-> 인스턴스 생성불가.
		Cat cat = new Cat();
		cat.sound();
		cat.breath();
		cat.sleep();
		
		Dog dog = new Dog();
		dog.sound();
		dog.breath();
		
		//직접 만들수 없어서. 상속받은애들을 통해서 사용가능
		Animal animal = null;
		animal = cat;
		animal.sound();
		animal = dog;
		animal.sound();
	}
}
