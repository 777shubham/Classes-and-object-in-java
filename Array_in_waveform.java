 class Array_in_waveform
 {
 public static void main(String args[])
    {
       
       int[]a={1,2,3,4,5,6,7,8,9,10};
	   int temp;
	   System.out.println("Present Element in Array");
	   for(int i=0;i<a.length;i++)
	   {
		 System.out.print(a[i]+" ");  
	   }
	   System.out.println();
      for(int i=0;i<a.length;i=i+2)
	   {
	   temp=a[i];
	   a[i]=a[i+1];
	   a[i+1]=temp;
	   }
	   System.out.println("Your Answer");
	   System.out.print("{ ");
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
	   System.out.print("} ");
    }
 }