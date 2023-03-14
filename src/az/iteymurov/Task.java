package az.iteymurov;

import java.util.Scanner;
import java.util.regex.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("G-mail Checker");
        Matcher m;
        do {
            System.out.println("Enter a gmail adress..");
            String emailDefault = sc.nextLine();
            String elements = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            Pattern p = Pattern.compile(elements);
            m = p.matcher(emailDefault);

            if (emailDefault.isEmpty() || emailDefault.isBlank()) {
                System.out.println("You must not enter enterempty email adress! \n ");
            } else if (m.matches()) {
                System.out.println("Congrats, you entered a valid gmail adress :) \n hint: @ , . , 1-9 , a-z , A-Z \n ");
            } else {
                System.out.println("You entered an invalid gmail adress :/ \n");
            }
        } while (!m.matches());
    }
}
