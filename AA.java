
public class AA implements Cloneable{

	int rollno;  
	String name;  
	  
	AA(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
	AA s1=new AA(101,"Shiva");  
	  
	AA s2=(AA)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  

}
