class Main {
  public static void main(String[] args) {
    int year = 2015;
    int month = 2;

    switch (month) {
      case 1:
        System.out.println("This month has 31 days.");
        break;
      case 2:
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
          System.out.println("This month has 29 days!");
        } else {
          System.out.println();
        }
        break;
      case 3: 
        System.out.println("This month has 31 days!");
        break;
      case 4:
        System.out.println("This month has 30 days!");
        break;
      case 5:
        System.out.println("This month has 31 days!");
        break;
      case 6:
        System.out.println("This month has 30 days!");
        break;
      case 7:
        System.out.println("This month has 31 days!");
        break;
      case 8:
        System.out.println("This month has 31 days!");
        break;
      case 9:
        System.out.println("This month has 30 days!");
        break;
      case 10:
        System.out.println("This month has 31 days!");
        break;
      case 11:
        System.out.println("This month has 30 days!");
        break;
      case 12:
        System.out.println("This month has 31 days!");
        break;
      default:
        System.out.println("This month is invalid!")
    }
  }
}