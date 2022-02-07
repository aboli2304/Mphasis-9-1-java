

package calculator;
import java.util.Scanner;

public class airthmaticcalculator {
        public static void main(String[] args) {
			  double n1;
		      double n2;
		      double ans;
		      char op;
		      Scanner reader = new Scanner(System.in);
		      System.out.print("Enter two numbers: ");
		      n1 = reader.nextDouble();
		      n2 = reader.nextDouble();
		      System.out.print("\nEnter an operator (+, -, *, /): ");
		      op = reader.next().charAt(0);
		      switch(op) {
		         case '+': ans = n1 + n2;
		            break;
		         case '-': ans = n1 - n2;
		            break;
		         case '*': ans = n1 * n2;
		            break;
		         case '/': ans = n1 / n2;
		            break;
		      default: System.out.printf("Error! Enter correct operator");
		         return;
		      }
		      System.out.print("\nThe result is given as follows:\n");
		      System.out.printf(n1 + " " + op + " " + n2 + " = " + ans);
		   }


	}


	