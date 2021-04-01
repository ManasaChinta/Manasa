class armstrong
{
public static void main(String args[])
{
int c=0,b,temp;
int n=371;
temp=n;
while(n>0)
{
b=n%10;
n=n/10;
c=c+(b*b*b);
}
if(temp==c)
System.out.println("armstrong number");
else
System.out.println("not armstrong number");
}
}