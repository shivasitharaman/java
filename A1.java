
public class A1 {

	private int data=40;  
	void msg(){System.out.println("Hello java");}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}  
	}  
	  
	
public class Simple{  
	 public static void main(String args[]){  
	   A1 obj=new A1();  
	   System.out.println(obj.getData());
	   obj.msg();
	   }  

}
