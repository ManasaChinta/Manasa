class mark
{
public static void main(String a[])
{
int telugu,hindi,english,maths,physics;
float total,Average,highest;
System.out.println("enter the five subjects marks:");
telugu=67;
hindi=80;
english=92;
maths=84;
physics=75;
total=telugu+hindi+english+maths+physics;
if(telugu>hindi&&telugu>english&&telugu>maths&&telugu>physics)
System.out.println("highest mark="+telugu);
else if(hindi>telugu&&hindi>english&&hindi>maths&&hindi>physics
System.out.println("highest mark="+hindi);
else if(english>telugu&&english>hindi&&english>maths&&english>physics
System.out.println("highest mark="+english);
else if(maths>telugu&&maths>hindi&&maths>english&&maths>physics)
System.out.println("highest mark="+maths);
else
System.out.println("highest mark="+physics);
Average=total/5;
System.out.println("Total marks="+total);
System.out.println("Average marks="+Average);
}
}