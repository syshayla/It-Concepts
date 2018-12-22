package chapter_03.p91;

import java.util.Scanner;

public class ComputeTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("(0-single filter, 1-married jointly or" + "qualifying widow(er), 2-married separately, 3-head of"
                + "household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350) {
                tax = income * .10;
            } else if (income <= 33950) {
                tax = 8350 * .10 + (income - 8350) * .15;
            } else if (income <= 82250) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 33950) * .25;
            } else if (income <= 171550) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (income - 82250) * .28;
            } else if (income <= 372950) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 + (income - 171550) * .33;
            } else {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250) * .28 + (372950 - 171550) * .33 + (income - 372950) * .35;
            }

        } else if (status == 1) {

        } else if (status == 2) {

        } else if (status == 3) {

        } else {
            System.out.println("Error, invalid Status");
            System.exit(1);
        }
        System.out.println("Tax is" + (int) (tax * 100) / 100);

    }
}
