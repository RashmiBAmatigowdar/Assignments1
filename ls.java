class ls{
 public static void main(String args[]){
  int a[] = {2,4,1,7,8},small=a[0],big=a[0],i;
   for(i=1;i<5;i++){
   if(a[i]<small)
    small=a[i];
  
  
    if(a[i]>big)
   big=a[i];
   }
   System.out.println("small ele");
   System.out.println(small);
   System.out.println("large ele");
   System.out.println(big);
   
   
 }
}