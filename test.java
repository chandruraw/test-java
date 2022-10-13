1.java is a platform indipendece ? Explane it using 100 or more words
  java a platform indipendent java is a case sentive language 
  depends on combination of  os and processer will be platform independent the 
  onely byte code is platform indipendent the os will  access  byte code as well.
  we can creat a java program in one platform and excegute  the aney another platform thets why java is platform indipendece.
  java is platform independent - do not have aney restriction /limitation.
  Ex. platform dependent programing language
        c 
 (c do not excegute other computers is depends on combination of OS and processor thats why is platform dependent)
 java will be platform independent thats why we can easy to use.
 
 java will pe excegute bytecode use to (java vartuval machine)
 JVM,JRE,JDK=this all will be platform dependent.
 onely byte is platform independent.
 thets why java will platform independent.
 
2. what is the diffrence between primitive and non primitive data types.
   Data type -it represnts diffrent values to be stored in a veriable.
   there are two types of datatypes
   we have 8 primitive datatypes
   1.primitive datatype:the data type will be using starts is lower case.
   ex:- char    
        byte
		short
		int
		float
		long
		double
		boolean.
   2.non primitive datatype.the data type will starts uppercase.
   they heve meny number of datatype
   ex:-classname,String,System .
   
3.Explane class and its members with an example.
  class:-it is a design or a buleprint it include states and behevior.
   class is inclouding the ststic
   to load static which include class is called as class load.
   Ex:-class will take design or blue print of a program.root map of a specipic task.
    
   class Test{
  
   }
  class members:- its (method,veriable) the starts represents variable & the behevior represents method.
  
6.the main method is set of ststment will used to  perform a task call as method.
   main will be name of a main method is executes the behevior of a class.
   EX:-  public satic void main(String a[]){  -head of the main 
    }                                         -call as body of a main
	this is a one type main method.
	
	           main(String a[])-signature of main.
			   
			   its executes run time.
	       
7.class ReverseNumber1{
  public static void main(String a[]){
  
  int number=1268,reverse=0;
  int reminder;
      
	  while(number>0){
	  reminder=number%10;
	  number=number/10;
	  reverse=(reverse*10)+reminder;

	  }
	  System.out.println(reverse);
  
  }




}
8. class Convert{

   public static void maina(String a[]){
   
   int a=2;
   int b=a*60;
   int c=b*60;
   
   System.out.println("conver hour into seconds"+c);
   
    }

} 

9. class Armstrong{

  public static void main(String a[]){
   
  int n = 3;
  int num=123;
  int lastDigit=0;
  
  for(;num>0;num=num/10){
    lastDigit=num#10;
	int Armstrong=lastDigit*lastDigit*lastDigit;
	System.out.println(Armstrong);
  
  
  }
  
  
  
  
  }





}
class Calculation{

  public static void main(String a[]){
  
   int totalMarks=700;
   int receivedMarks=600;
   
   
   double percentage=((receivedMarks/totalMarks)*100);
   
   
   System.out.println(percentage);
   
  
  }







}
   
5.class Duplicates{
 
 
  static int values[]={34,78,90,53,15,78,91,8,4,67,11};
  
  public static void main(String a[])
  
  for(int i=0;i<values.length;i++){
  
  if(values[i] == value){
      value !=value
	  value=delete;
	  true;
  
  System.out.println("the Duplicate valu is"+value);
  
  }else{
     System.out.println("ther are no Duplicate values");
	 
  }
  false;
  
  
  }

}

