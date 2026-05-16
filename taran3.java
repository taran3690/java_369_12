chapter26
public class chapter26{
    public static void main (String[]args){
        int savings=100;
        savings +=50;
        System.out.println("total savings:"+savings);
    }
}
chapter27
public class chpater27 {
    public static void main (String[]args){
        int x=5;
        int y=3;
        System.out.println(x>y);
        System.out.println(x<y);
    }
}
chapter28
public class chpater28 {
    public static void main (String[]args){
        int age =18;
        System.out.println(age>=18);
        System.out.println(age<18);
    }
}
chapter29
public class chapter29{
    public static void main(String[]args){
        int passwordlength=5;
        System.out.println(passwordlength >=8);//false
         System.out.println(passwordlength < 8);//true
    }
}
chapter30
public class chapter30{
    public static void main(String[]args){
       boolean isloggedin=true;
       boolean isadmin =false;
        System.out.println("regular user:"+(isloggedin&&!isadmin));
         System.out.println("has access;"+(isloggedin||isadmin));
         System.out.println("not logged in :"+(!isloggedin));
    }
}
chapter31
public class chappter31{
    public static void main (String[]args){
        int result1=2+3*4;
        int result2=(2+3)*4;
        System.out.println(result1);
         System.out.println(result2);
    }
}
chapter32
public class chapter32{
    public static void main(String[]args){
    int result1 =10-2+5;
    int result2 =10-(2+5);
    System.out.println(result1);
    System.out.println(result2);
    }    
}
chapter33
public class chapter33{
    public static void main(String[]args){
    String greeting="hello";
    String txt="yvvghvujhgbuyjgugukgujujgu";
    String txt1="hello world ";
    System.out.println(txt1);
    System.out.println(greeting);
    System.out.println(txt);
    }    
}
chapter34
public class chapter34{
    public static void main(String[]args){
     String firstname="taran";
    String lastname="dolu";
    int age=25;
    String a="java";
    String b="is";
    String c="fun!";
    System.out.println(firstname);
    System.out.println(lastname);
    System.out.println(age);
     System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    }    
}
chapter35
public class chapter35 {
    public static void main(String[]args){
     int r=10;
     int s=20;
     int t=r+s;
    String x="10";
    String y="20";
    String z=x+y;
    String a="10";
    int b=20;
    String c=a+b;
    System.out.println(t);
    System.out.println(z);
    System.out.println(c);
    }    
}
chapter36
public class chapter36 {
    public static void main(String[]args){
     int r=10;
     int s=20;
     int t=r+s;
    String x="hello \'world"; 
    String y="hello \"world"; 
    String a="hello \\world"; 
    System.out.println(x);
    System.out.println(y);
    System.out.println(a);
    }    
}
chapter37
public class chapter37 {
    public static void main(String[]args){
     int r=10;
     int s=20;
     int t=r+s;
    String x="hello\nworld"; 
    String y="hello\tworld"; 
    String a="hello\bloworld";
   
    System.out.println(x);
    System.out.println(y);
    System.out.println(a);
    
    }    
}
chapter38
public class chapter38{
    public static void main (String[]args){
        System.out.println("hinghest");
        System.out.println(Math.max(5,10));// (x,Y) highest
         System.out.println("lowest");
          System.out.println(Math.min(5,10));//(x,y) lowest
             System.out.println("sqrt");
          System.out.println(Math.sqrt(64)); //(x)  sqrt
             System.out.println("abs");
          System.out.println(Math.abs(-4.7));//(x)  abs
              System.out.println("pow");
          System.out.println(Math.max(5,10));//(x,y) pow
    }
}
chapter39
public class chapter39{
    public static void main (String[]args){
        System.out.println("round");
        System.out.println(Math.round(5.10));// (x) rount
         System.out.println("ceil");
          System.out.println(Math.ceil(5.1));//(x) ceil
             System.out.println("floor");
          System.out.println(Math.sqrt(4.9)); //(x)  floor
             System.out.println("random");
          System.out.println(Math.random());//(x)  random
              System.out.println("randow 0 to 100");
              int randomnum=(int)(Math.random() *101);
          System.out.println(randomnum);// random
    }
}
chapter40
public class chapter40{
    public static void main (String[]args){
       System.out.println("boolean");
        boolean isjavefun = true;
       boolean isfishtasty =false;
        System.out.println(isjavefun);
        System.out.println(isfishtasty);
        System.out.println("greater");
        int x=10;
        int y=9;
        System.out.println(x>9);
         System.out.println(10>9);
         int c=10;
       
             System.out.println(10==5);
          
            
    }
}
