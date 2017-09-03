/***Project test crate by Starks1971*/

import static java.lang.Math.*;

import java.nio.file.Paths;
import java.sql.Date;
import java.util.*;

import java.io.*; 

public class test
{
   public static void main(String[] args)
   {
	   /*
      String greeting = "Welcome to Core Java!";
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
      System.out.println();

	   test TTT = new test();
	   TTT.te();
	         */
	   test TTT2 = new test();
	   TTT2.tt();
	   
   }//public static void main(String[] args)
   
  /*private void te() {
	      String greeting = "\"Welcome to JAVA world! ";
	      System.out.println(greeting);
	      for (int i = 0; i < greeting.length(); i++)
	         System.out.print("=");
	      System.out.println();
	   int n = 8;
	   int f4 = (n & 0b1000) / 0b1000;
	   System.out.println(f4);
	   int f5 =(n&(1<<35)) >>3;
	   System.out.println(f5);
	   
	   String all1=String.join("/","s","k","l","1");
	   System.out.println(all1);
	   String a2 = "s/k/l/1";
	   //////////////////////////////////////////////
	   System.out.println(all1.equals("s/k/l/1"));
	   if(all1.compareTo(a2)==0) {
		   System.out.println("equal");
	   }
	   /////////////////////////////////////////////////
	   if((all1.length()==0) && (all1 == null)) {
		   System.out.println("empty or null string!");
	}
	   else	{
		   System.out.println("none empty or null string!");   
	   }
	  //Old code
	   //System.out.printf("%tc",new Date());
	   System.out.printf("%.2f",10000.0/3.0);
 
	   
   }//   private void te()
  */
  
   public void tt() {
	  // Scanner in = new Scanner(.get(myfile.txt),"UTF-8");
       // TODO Auto-generated method stub  
       // file(内存)----输入流---->【程序】----输出流---->file(内存)  
	
		 File file1 = new File("f:\\temp", "addfile.txt");  // File file =new File(path+filename);   
	 //如果文件夹不存在则创建   
/*	 if  (!file .exists())     
	 {     
	     file .mkdir();   
 
           try {   
               file.createNewFile();   
           } catch (IOException e) {   
               // TODO Auto-generated catch block   
               e.printStackTrace();   
           }   
       } 
  */
	judeDirExists(flie1);	 
       
   
	   
   }//public void tt()
   
   public static void judeDirExists(File file) {
		
       if (file.exists()) {
	             if (file.isDirectory()) {
	                  System.out.println("dir exists");
	               } else {
                 System.out.println("the same name file exists, can not create dir");
	              }
	          } else {
	             System.out.println("dir not exists, create it ...");
	              file.mkdir();
	          }
	  
	       } 
   public static void judeFileExists(File file) {

	     if (file.exists()) {
	         System.out.println("file exists");
	     } else {
	         System.out.println("file not exists, create it ...");
	         try {
	             file.createNewFile();
	         } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         }
	     }

	 }   
   
   
}//public class test