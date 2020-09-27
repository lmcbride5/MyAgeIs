class CheckMyAge {
  public static void main(String[] args) {
    int myAge = 15;
    int myBirthday = 1125;
    int todaysDate = 921;
    if (myBirthday == todaysDate)
    {
      System.out.println(myAge +1);
      System.out.println("I am" + myAge + "years old.");
    }else{
      System.out.println("I am stil " + myAge + " years old");
    }
  }
}