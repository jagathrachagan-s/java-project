package javaobj;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter the fruit number");
      int fruit=sc.nextInt();
      
      String fruitString;
      switch (fruit) 
      {
      case 1 : fruitString="butter fruit"; break;
      case 2 : fruitString="lichi"; break;
      case 3 : fruitString="drogen"; break;
      case 4 : fruitString="banana"; break;
      case 5 : fruitString="mango"; 
      break;
      default:fruitString="invalid fruit";
      }
      System.out.println(fruitString);
      }

} 
