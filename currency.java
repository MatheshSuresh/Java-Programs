package mypack;
import java.util.*;
//import java.io.PrintStream;
public class currency {
public currency()
{
char us_dollar_sym=36;
char rupee_sym=163;
char yen_sym=165;
char euro_sym=8364;
String us_dollar="Dollar";
String rupee="Rupees";
String yen="Yen";
String euro="Euro";
double rate=0;
System.out.println("Welcome to the currency converter program \n");
System.out.println("Use the following code to input your curency choices:\n 1-us dollars \n 2-Euros \n 3_Indian rupees \n 4-Japense Yen\n");
System.out.println("Please choose  the input currency");
Scanner in = new Scanner(System.in);
int choice =in.nextInt();
String inType=null;
switch(choice)
{
case 1:
inType="US Dollar>>"+ us_dollar_sym;
break;
case 2:
inType="Euros>>"+ euro_sym;
break;
case 3:
inType="Indian rupees>>"+ rupee_sym;
break;
case 4:
inType="Japanese Yen" + yen_sym;
break;
default:
System.out.println("Please restart the program & enter a number from a list");
return;
}
System.out.println("please choose the output currency");
int output=in.nextInt();
System.out.println("Now enter the input in" + inType);
double input=in.nextDouble();
if(choice ==1 && output ==2)
{
double dollar_euro_rate=83;
rate=input*dollar_euro_rate;
System.out.printf("%s"+ input+"at A conversion rate of "+ dollar_euro_rate +"Dollar to %s = %.2f\n",(char)us_dollar_sym,euro,rate);
}
else if(choice==1 && output==3)
{
double dollar_rupee_rate=66.82;
rate=input*dollar_rupee_rate;
System.out.printf("%s"+ input+"at A conversion rate of "+ dollar_rupee_rate +"Dollar to %s = %.2f\n",(char)us_dollar_sym,rupee,rate);
}
else if(choice==1 && output==4)
{
double dollar_yen_rate=109.12;
rate= input*dollar_yen_rate;
System.out.printf("%s"+ input + "at a conversion rate of" + dollar_yen_rate +"Dollar to %s = %.2f\n",(char)us_dollar_sym,yen,rate);
}
if(choice ==2 && output ==1)
{
double euro_dollar_rate=1.20;
rate=input*euro_dollar_rate;
System.out.printf("%s"+ input+"at A conversion rate of "+ euro_dollar_rate +"euro to %s = %.2f\n",(char)euro_sym,us_dollar,rate);
}
else if(choice==2 && output==3)
{
double euro_rupee_rate=80.03;
rate=input*euro_rupee_rate;
System.out.printf("%s"+ input+"at A conversion rate of "+ euro_rupee_rate +"euro to %s = %.2f\n",(char)euro_sym,rupee,rate);
}
else if(choice==2 && output==4)
{
double euro_yen_rate=130.69;
rate= input*euro_yen_rate;
System.out.printf("%s"+ input + "at a conversion rate of" + euro_yen_rate +"Euro to %s= %.2f\n",(char)euro_sym,yen,rate);
}
if(choice ==3 && output ==1)
{
double rupee_dollar_rate=0.015;
System.out.printf("%s"+ input+"at A conversion rate of "+ rupee_dollar_rate +"pounds to %s = %.2f\n",(char)rupee_sym,us_dollar,rate);
}
else if(choice==3 && output==3)
{
double rupee_euro_rate=0.012;

System.out.printf("%s"+ input+"at A conversion rate of "+ rupee_euro_rate +"pounds to %s = %.2f\n",(char)rupee_sym,euro,rate);
}
else if(choice==3 && output==4)
{
double rupee_yen_rate=1.641;
System.out.printf("%s"+ input + "at a conversion rate of" + rupee_yen_rate +"pounds to %s= %.2f\n",(char)rupee_sym,yen,rate);
}
if(choice==4 && output==1)
{
double yen_dollar_rate=0.0092;
System.out.printf("%s"+input+"at a conversion rate of"+ yen_dollar_rate+"yen to %s=%.2f\n",(char)yen_sym,us_dollar,rate);
}
else if(choice==4 && output==2)
{
double yen_euro_rate=0.0077;
System.out.printf("%s"+input+"at a conversion rate of"+ yen_euro_rate+"yen to %s=%.2f\n",(char)yen_sym,euro,rate);
}
else if(choice==4 && output==3)
{
double yen_rupee_rate=0.61;
System.out.printf("%s"+input+"at a conversion rate of"+ yen_rupee_rate+"yen to %s=%.2f\n",(char)yen_sym,rupee,rate);
}
System.out.println("Thanks you for using the currency converter");
}
}
