import java.util.*;
class Guhuns14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int a[]=new int[n];
        
         int i=0,j=0,c=0;
         for(i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    ++c;
                }
            }
            if(c==0)
            {
                System.out.print(a[i]);
                break;
            }
            else
            {
                c=0;
            }
        }
    }
}
