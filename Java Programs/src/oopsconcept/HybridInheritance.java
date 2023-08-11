package oopsconcept;
/* Program's aim is to show the use of HierarchicalInheritance. */
class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}
// Dog class inheriting from Animal class
class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}
// Cat class inheriting from Animal
class Cat extends Animal {
	void meow() {
		System.out.println("Cat is meowing");
	}
}
// Pet class inheriting from Dog
class Pet extends Dog {
	void play() {
		System.out.println("Pet is playing");
	}
}

public class HybridInheritance {

	public static void main(String args[]) {
		Pet pet = new Pet();
		pet.eat();
		pet.bark();
		pet.play();
	}

}