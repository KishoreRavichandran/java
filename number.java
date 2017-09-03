import java.util.*;

/**
 *
 * @author Acer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0)
        {
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=in.nextInt();
        }
      
      HashSet<Integer>hs=new HashSet<Integer>();
      
      for(int i=0;i<c.length-1;i++)
      {
          for(int j=i+1;j<c.length;j++)
          {
              if(c[i]==c[j])
              {
              hs.add(c[i]);
          }
      }
      }  
      
      Iterator itr=hs.iterator();
      while(itr.hasNext())
      {
          System.out.print(itr.next());
      }
        }
 // TODO code application logic here
    }
    
}
