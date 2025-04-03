import java.util.Objects;

public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      double z = 9.8;
      System.out.println("x: "+x+" y: "+y+" z: "+z);
      int[] nums={3,6,-1,2};
      for (int i=0; i<nums.length;i++){
         System.out.println(nums[i]);
      }

      int numFound=char_count(y,'l');
      System.out.println("Found: "+numFound);
      for (int i=1; i<11;i++){
         System.out.print(i+" ");
      }
      System.out.println();
   }
   public static int char_count(String s, char c){
      int count=0;
      int ch;
      for (ch=0;ch<s.length();ch++){
         if (s.charAt(ch)==c){
            count+=1;
         }
      }
      return count;
   }
}
