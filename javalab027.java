
public class javalab027 {

	void msg(){System.out.println("Hello");}  
} 
class java{  
void msg(){System.out.println("Welcome");}  
}  
class C extends javalab027{//suppose if it were  

public static void main(String args[]){  
C obj=new C();  
obj.msg();//Now which msg() method would be invoked?  
}

}
