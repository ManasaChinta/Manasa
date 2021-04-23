class stack<T>
{
T e[];
int top;
Stack(T[] ia,int n)
{
e=ia;top=0;
}
public void push(T ele)
{
if(top<=10)
e[top++]=ele;
else
System.out.println("Stack is full");
}
public void pop()
{
if(top==0)
System.out.println("Stack is empty");
else
System.out.println("popped element:"+e[--top]);
}
public void display()
{
for(int i=0;i<top;i++)
{
System.out.println(e[i]+" ");
System.out.println();
}
}
class GSDemo
{
public static void main(String a[])
{
Integer ia[]=new Integer[10];
Stack<Integer>s1=new Stack<Integer>(ia,10);
Character ca[]=new Character[10];
Stack<Character>s2=new Staack<Character>(ca,10);
Student S[]=new Student[10];
Stack<Student>s3=new Stack<Student>(s,10);
s1.po();
s1.push(10);
s1.push(20);
s1.push(30);
s1.pop('a');
s2.push('a');
s2.push('e');
s2.push('o');
s2.push('u');
s2.display();
s3.push(new Student("Arun","BE"));
}
}
}
