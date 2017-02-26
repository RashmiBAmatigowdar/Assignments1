class small{
 public static void main(String args[]){
  int a[] = {3,6,9,1,4},i,j;
  for(j=1;j<5;j++){
  for(i=0;i<5-j;i++){
     if(a[i]>a[i+1]){
       a[i] = a[i] ^ a[i+1];
       a[i+1] = a[i] ^ a[i+1];
       a[i] = a[i] ^ a[i+1];
   }
   }
   }
  System.out.println("2nd small ele");
  System.out.println(a[1]);
 }
}