class inter{
  public static void main(String args[]){
  int a[]={4,2,1,7,5},b[]={9,3,6,7,2},i,temp,j;
  for(j=1;j<5;j++){
  for(i=0;i<5-j;i++){
     if(a[i]>a[i+1]){
       temp=a[i];
       a[i]=a[i+1];
       a[i+1]=temp;
      }
     if(b[i]>b[i+1]){
        temp=b[i];
        b[i]=b[i+1];
        b[i+1]=temp;
        }
  }
  }
   i=0;
   j=0;
 while(i<5 && j<5){
  
  if(a[i]<b[j])
   i++;
  else if(a[i]>b[j])
  j++;
  else if(a[i] == b[j]){
  System.out.println(b[j]);
  i++;
  j++;
  }
  }
  }
}
