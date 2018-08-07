public class studnet5 {
		    int id;  
		    String name;  
		    int age;  
		    studnet5(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		    studnet5(int i,String n,int a){  
		    id = i;  
		    name = n;  
		    age=a;  
		    }  
		    void display(){System.out.println(id+" "+name+" "+age);}  
		   
		    public static void main(String args[]){  
		    studnet5 s1 = new studnet5(111,"Karan");  
		    studnet5 s2 = new studnet5(222,"Aryan",25);  
		    s1.display();  
		    s2.display();  
		   }  

}
