/*

we can compile himself java code without use any id like vs code,dev++,trubo c etc. !
**-> HOW <-**
java is both(compiled and interpreted) it means after compiled we can excuted any platform(ios,window,linux,etc.) ths code 
    1-> firstly we can compile any code on terminal ya cmd command ya powershell with "javac" command
        and after compiletion the file convert in class file   
    2-> secondly we can interpreted this class file with of "java file_name"
         and programme excuted succesfully
         
    */

/*
 what is packages
 "packages means collection of multiple classses,multiple function and multiple framework"
 1):- packages two type
      (1) built-in             ->java awt,java util,java swing etc
      (2) user-defined         ->user make itself
       
      we can store multiple file in own user-defined packages
      other way we can store multiple file in a packages by commanline 
      for store all file of any folder we can use this command => "-d . *.java"
      for store any choosen file we can use this command => "-d . file_name"
 */
public class java_packages {
    public static void main(String args[]) {
        System.out.println("hello world");
    }
}
