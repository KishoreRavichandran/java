import java.util.*;

/**
 *
 * @author Acer
 */
public class Index {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==a[i])
            {
                System.out.print(a[i]);
            }
        }
        
    }
    
}
