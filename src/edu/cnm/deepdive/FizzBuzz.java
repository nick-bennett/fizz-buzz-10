package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      System.out.println(getStatus(counter));
    }
  }

  static String getStatus(int value) {
    String status = "";
    if (value % 3 == 0) {
      status += "fizz";
    }
    if (value % 5 == 0) {
      status += "buzz";
    }
    if (status.isEmpty()) {
      status += value;
    }
    return status;
  }

}
