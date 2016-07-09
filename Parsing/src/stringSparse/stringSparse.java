package stringSparse;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringSparse {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        System.out.println(n);
        HashMap<String,Integer> stringMap = new HashMap<String,Integer>();

        if(n>1000 || n<1) return;

        for (int i = 0; i < n; i++) {
        	System.out.println("input value");
            String next = in.nextLine();
            if(next.length()==0 || next.length()>20) return;
            if(stringMap.containsKey(next)) {
                int count = stringMap.get(next) + 1;
                stringMap.put(next, count);
            } else {
                stringMap.put(next, 1);
            }
        }

        int m = in.nextInt();
        in.nextLine();
        if(m>1000 || m<1) return;

        for (int j = 0; j < m; j++) {
            String query=in.nextLine();
            if(stringMap.containsKey(query)){
                System.out.println(stringMap.get(query));
            }else{
                System.out.println(0);
            }
            
        }

        
    }
}