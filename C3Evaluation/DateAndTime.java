package com.C3Evaluation;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Date of Birth in dd/MM/YYYY");
        String dob = scanner.next();
        try {
            LocalDate ld = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate today = LocalDate.now();
            Period diff = Period.between(ld,today);
//          System.out.println(diff.getDays());
            if(diff.getDays() > 0)
            {
                System.out.println(diff.getYears() );

            }else
            {
                System.out.println("Date of Birth Should Not be in future");
            }
        }
        catch(Exception e)
        {
            System.out.println("please pass the date in the proper format");
        }
    }
}
