class repeat{
 public static void main(String args[]){
 int a[] = {2,4,5,6,5,2},i=0,j,b[] = {0};
 for(i=1;i<6;i++){
 for(j=0;j<i;j++){
 
 if( a[i] == a[j]){
 
 System.out.println(a[j]);
 return;
 }
 
 }
 }
 
 
   }

 
 
}
