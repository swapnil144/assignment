import java.util.*;
public class TowerOfHan{

  public static int makeTower(Stack A,Stack B){
    int a,b;
    a=Integer.parseInt(A.peek().toString());
    b=Integer.parseInt(B.peek().toString());
    if(a==b)
    return 0;
    if(a==0){
    A.push(B.pop());
    return 2;
    }
    else if(b==0){
    B.push(A.pop());
    return 1;
    }
    if(a>b){
    A.push(B.pop());
    return 2;
    }
   else if(a<b){
   B.push(A.pop());
   return 1;
   }
   return -1;
 }
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  try{
  Stack s1=new Stack();
  Stack s2=new Stack();
  Stack s3=new Stack();
  int k=0;
  int n=0;

  System.out.print("Enter no Of Disk:");
  int disk=Integer.parseInt(sc.nextLine());

  if(disk<=0){
   System.out.println("Invalid Disk Size");
   System.exit(1);
  }
  for(int i=disk;i>0;i--)
   s1.push(i);
  int m=disk%2;
  do{
   if(m==1){
    n=makeTower(s1,s3);
    if(n==1){
     System.out.println((++k)+"s1 --> s3");
    }
    else if(n==2){
     System.out.println((++k)+"s3 --> s1");
    }
    n=makeTower(s1,s2);
    if(n==1){
     System.out.println((++k)+"s1 -->s2");
    }
    else if(n==2){
     System.out.println((++k)+"s2 --> s1");
    }else
     break;
   }else{
    n=makeTower(s1,s2);
    if(n==1){
     System.out.println((++k)+"s1 -->s2");
    }
    else if(n==2){
     System.out.println((++k)+"s2 --> s1");
    }
    n=makeTower(s1,s3);
    if(n==1){
     System.out.println((++k)+"s1 --> s3");
    }
    else if(n==2){
     System.out.println((++k)+"s3 --> s1");
    }
   }

   n=makeTower(s2,s3);
   if(n==1){
    System.out.println((++k)+"s2 --> s3");
   }
   else if(n==2){
    System.out.println((++k)+"s3 --> s2");
   }

  }while(s3.size()!=disk);
  System.out.println("\nfinish");
  }catch(Exception ex){}
 }
}