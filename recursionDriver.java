public class recursionDriver
{
 
     public static int count(int n)
    {
        // Base case AKA Stop Condition
         if (n==1)
             return 1; 
             return n+count(n-1);
            }
            
            public static void main(String[] args)
     {

    int counted=1;
     counted = count(5);
     System.out.println(counted);
        }
    }