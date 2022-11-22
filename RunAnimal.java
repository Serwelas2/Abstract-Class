import java.util.Scanner;

public class RunAnimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bird brd = new Bird();
		Cat ct = new Cat();
		Dog dg = new Dog();
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String press = sc.nextLine();
        
        if (press.equalsIgnoreCase("B")){
        brd.eat();
        brd.sleep();
        brd.makeSound();
        }
        else if (press.equalsIgnoreCase("C")){
        ct.eat();
        ct.sleep();
        ct.makeSound();
        }
        else if(press.equalsIgnoreCase("D")){
        dg.eat();
        dg.sleep();
        dg.makeSound();
        } 
	}
}

