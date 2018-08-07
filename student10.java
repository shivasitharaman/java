public class student10 {
		    int id;  
		    String name;  
		      
		    student10(int id,String name){  
		    id = id;  
		    name = name;  
		    }  
		    void display(){System.out.println(id+""+name);}  
		  
		    public static void main(String args[]){  
		    student10 s1 = new student10(111,"Karan");  
		    student10 s2 = new student10(321,"Aryan");  
		    s1.display();  
		    s2.display();  
		    }  

}
