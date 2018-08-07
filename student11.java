public class student11 {
int id;
String name;
student11(int id,String name){
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+""+name);
}
public static void main(String[] args) {
	student11 s1=new student11(111,"karan");
	student11 s2=new student11(222,"Aryan");
	s1.display();
	s2.display();
}
}
