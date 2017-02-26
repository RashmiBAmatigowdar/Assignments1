class bubble{
 public static void main(String args[]){
 int a[] = {2,6,1,9,3},n=5,i,j,temp;
 for(j=1;j<n;j++){
 for(i=0;i<n-j;i++){
  if(a[i]>=a[i+1]){
   temp = a[i];
   a[i] = a[i+1];
   a[i+1] = temp;
  }
 }
 }
 System.out.println("sorted ele");
 for(i=0;i<n;i++)
 System.out.println(a[i]);
 }
}