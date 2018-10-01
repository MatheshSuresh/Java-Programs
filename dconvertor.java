
package mypack1;

import java.util.Scanner;

public class dconvertor {
public dconvertor(){
int num;
double meters;
Scanner Keyboard= new Scanner(System.in);
System.out.println("enter a distance in meters,eg 100:");
meters=Keyboard.nextDouble();
while(meters<=0)
{
String error="please enter a num graeter than zero";
System.out.println(error);
meters= Keyboard.nextDouble();
}
System.out.println("\n Enter 1-4 menu options");
System.out.println("\n 1.convert to kilogram \n 2.convert to inches \n 3.convert to feet\n 4.End");
num=Keyboard.nextInt();
while(num<=0 || num>=5)
{
String invalid ="Invalid option ENtered .please use 1 through 4";
System.out.println(invalid);
meters =Keyboard.nextDouble();
}
switch(num)
{
case 1:
dpKilometers(meters);
case 2:
dpInches(meters);
case 3:
dpFeet(meters);
case 4:
System.exit(0);
}
}
public static void dpKilometers(double meters)
{
double km;
km =meters*.001;
System.out.println(+meters +"meters equals to "+km+"Kilomerters");
}
public static void dpInches(double meters)
{
double in;
in =meters*39.37;
System.out.println(+meters +"meters equals to "+in+"inches");
}
public static void dpFeet(double meters)
{
double ft;
ft =meters*3.281;
System.out.println(+meters +"meters equals to "+ft+"feet");
}

}
