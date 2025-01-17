/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
      int age;
	  String Name;
	  public void setName(String Name) 
	   { 
	       this.Name = Name; 
	   }
	   public void setAge(String age) 
	   { 
	       this.age = age; 
	   }
	   public String getName(){
	       return this.Name;
	   }
	   public String getAge(){
	       return this.age;
	   }
	public static void main(String[] args) {
	    Main m1=new Main();
	    m1.setName("Deepshikha");
	    m1.setAge(20);
	    System.out.println(m1.getName()+" "+m1.getAge());
	  
	   
	   }
}
