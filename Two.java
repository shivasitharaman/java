public class Two {
		 int length;  
		 int width;  
		  
		 void insert(int l,int w){  
		  length=l;  
		  width=w;  
		 }  
		  
		 void calculateArea(){System.out.println(length*width);}  
		  
		 public static void main(String args[]){  
		  Two r1=new Two(),r2=new Two();  
		    
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  
		  r1.calculateArea();  
		  r2.calculateArea();  
		}  

}
