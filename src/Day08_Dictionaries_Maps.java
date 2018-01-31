//Complete this code or write your own from scratch
import java.util.*;


class Day08_Dictionaries_Maps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> dict = new HashMap<String,Integer>();
        
        for(int i=0;i<n;i++){
            String str = in.next();
            int num = in.nextInt();
            dict.put(str,num);
        }
  
        while(in.hasNext()){
            String testStr = in.next();
            System.out.println(dict.containsKey(testStr)?testStr+"="+dict.get(testStr):"Not found");
          }
        
        in.close();
    }
}

