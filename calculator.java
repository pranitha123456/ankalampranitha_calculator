class method
{
void add(int x,int y)
{
int z=x+y;
System.out.println("addition of two numbers is "+z);
}
void sub(int a,int b)
{
int c=a-b;
System.out.println("substraction of two numbers is "+c);
}
void mul(int p,int q)
{
int r=p*q;
System.out.println("multiplication of two numbers is "+r);
}
void div(int s,int t)
{
int v=s/t;
System.out.println("division of two numbers is "+v);
}
}
class calculator
{
public static void main(String args[])
{
method m=new method();
m.add(2,4);
m.sub(5,2);
m.mul(2,3);
m.div(8,4);
}
}
