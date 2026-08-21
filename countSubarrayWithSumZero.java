import java.util.*;
class countSubarrayWithSumZero
{
    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int []arr=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();

}
for(int i=0;i<n;i++)
{
    int temp=0;
    for(int j=i;j<n;j++)
    {
        temp+=arr[j];
        if(temp==0)
        {
            count++;
        }
    }
}
System.out.println(count);

    }
}