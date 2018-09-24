
public abstract class car56 {

	car56(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	 class Honda23 extends car56{  
	 void run(){System.out.println("running safely..");}  
	 }  
	 class TestAbstraction2{  
	 public static void main(String args[]){  
	  car56 obj = new Honda23();  
	  obj.run();  
	  obj.changeGear();  
	 } 

}
