class Animal{
void eat(){
System.out.println("Eating..");
}
}
class Dog extends Animal {
void bark(){
System.out.println("Barking..");
}
}
class InheritanceEx {
public static void main(String[]args){
Dog dog=new Dog();
dog.eat();//Inherited method from Animal
dog.bark();//Method from Dog class
}
}
