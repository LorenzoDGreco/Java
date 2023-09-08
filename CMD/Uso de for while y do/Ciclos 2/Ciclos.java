public class Ciclos
{
  public static void main(String args[])
  {
   int i = 1, j=99;
   System.out.println("Serie con for: ");
   for(i=1 , j=99; i<= 5 && j>=95; i++ , j--)
   {
    if(i<5 && j>95)
    {
     System.out.print(i + ", " + j + ", ");
    }
     else
     {
      System.out.print(i + ", " + j);
     }
    
   }









   System.out.println(""); 
   i=1;
   j=99;
   System.out.println("Serie con While");
   while(i <=5 && j>=95)
   {
    if(i<5 && j>95)
    {
     System.out.print(i + ", " + j + ", ");
    }
     else
     {
      System.out.print(i + ", " + j);
     }
    i++;
    j--;     
   }



   System.out.println("");
   i=1;
   i=99;
   System.out.println("Serie con Do-While: ");
   do   
   {
    if(i < 5)
    {
     System.out.print(i + " ,");
     System.out.print(j + " ,");
    }
    else
    {
     System.out.print(i + " ,");
     System.out.print(j);
    }
    i++;
    j--;
   } 
    while(i <=5);
  }
}