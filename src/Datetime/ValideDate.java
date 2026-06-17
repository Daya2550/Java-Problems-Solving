package Datetime;

import java.time.LocalDate;

public class ValideDate {
    public static void main(String[] args) {
        String d="2026-02-11";
      try {
          System.out.println(LocalDate.parse(d));
          System.out.println("ValideDate");
      }
      catch (Exception e) {
          System.out.println("Invalid date");
      }

    }
}
