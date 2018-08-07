public class student13 {
int id;
String name;
student13(){
	System.out.println("default constructor is invoked");
}
student13(int id,String name){
	this();
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+""+name);
}
public static void main(String[] args) {
	student13 e1=new student13(111,"Karan");
	student13 e2=new student13(222,"Aryan");
	e1.display();
	e2.display();
}
}
