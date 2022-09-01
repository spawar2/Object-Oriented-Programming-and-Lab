class ThirdJavaProgram {
    public static void main(String[] args) {
        int [] a;
   // int a[];         // alternative
    a = new int[10]; // allocate

    int i;
    for (i = 0;  i < 10;  i++)
      System.out.println(
        "a[" + i + "] = " + a[i]);
    //    a = null;

    }
}
