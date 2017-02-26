class reverse{
 public static void main(String args[]){
 int a[] = {2,4,6,7},b[] = new int[4],i;
 for(i=0;i<4;i++){
 b[3-i] = a[i];
 }
 System.out.println("reversed array is");
 for(i=0;i<4;i++){
System.out.println(b[i]);
 }
 }
}