class Rotation{
   public static void main(String args[]){
    String str1 = "ABCD";
    String str2 = "BCDA";
    String str3;
    str3 = str1 + str1;
    if(str3.contains(str2))
      System.out.println("strings equal");
    else
      System.out.println("strings are not rotationally equal");
   }
}