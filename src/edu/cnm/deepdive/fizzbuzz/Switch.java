package edu.cnm.deepdive.fizzbuzz;

public class Switch {

  public static void main(String[] args) {
    String function = args[0].toLowerCase();
    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
   /* if (function.equals("add")) {
      System.out.println(a + b);
    } else if (function.equals("subtract")) {
      System.out.println(a - b);
    } else if (function.equals("multiply")) {
      System.out.println(a * b);
    } else if (function.equals("divide")) {
      System.out.println(a / b);
    }*/
    switch(function) {
      case "add":
        System.out.println(a + b);
        break;
      case "subtract":
        System.out.println(a - b);
        break;
      case "multiply":
      case "mult":
        System.out.println(a * b);
        break;
      case "divide":
        System.out.println(a / b);
        break;
        default:
          System.out.println("Not a valid function");
          break;
    }
  }

}
