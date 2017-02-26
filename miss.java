class miss{
 public static void main(String args[]){
  int a[] = {1,5,2,3},r,res,sum=0,i,n=0,big=a[0];
  for(i=0;i<4;i++){
   if(a[i]>big)
    big = a[i];
  }
  n = big;
  for(i=0;i<4;i++)
  sum=sum + a[i];
  r = ( n * (n+1))/2;
  res = r -sum;
  System.out.println("missing term");
  System.out.println(res);
  }
}
  