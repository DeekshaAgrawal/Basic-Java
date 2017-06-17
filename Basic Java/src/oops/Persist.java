package oops;
import java.io.*;  
class Persist{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success"); 
  
  FileInputStream fin= new FileInputStream("f.txt");
  ObjectInputStream oin= new ObjectInputStream(fin);
  Student s=(Student)oin.readObject();
  System.out.println(s.id);
  System.out.println(s.name);
 }  
}  