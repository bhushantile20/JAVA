public class BinarySearch 
{
	public int binarySearch(String[] sorted.String key)
	{
		int first=0;
        int last=sorted.length;
        while(first<last)
       {
           int mid=(first+last)/2;
           if(key.compareTo(sorted[mid])<0)
				{
					last=mid;
				}
         else if(key.compareTo(sorted[mid])>0)
        {
          first=mid+1;
         }
          else{
               return mid;

	          }
}
return-(first +1);
}
public static void main(String args[])
{
   int i=binarySearch(args."Hello");
     if(i<0)
      System.out.println("Not Found");
     else 
System.out.println("Found at"+(i+1)+"location.");
}
}

