package Arraystest;
import java.util.*;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {

        
        String strFinal=Play();
        
        System.out.println("GS"+strFinal);
        
    }
       
        
     

    public   static String  Play() {
        StringBuilder sb = new StringBuilder();
        
        String [] str={"1:2:3:4","5::7:8","9:10:11:11","12:13:14:15"};
        
        List<String> aList=Arrays.asList(str);
        System.out.println(aList);
       // System.out.println("aaaaaaaa"+str);
//        for (String string : aList) {
//           System.out.println("sssssssss"+string);
//           //System.out.println(sb.append(str));
//        }
//       return sb.toString();
//    }
        System.out.println(str.length);
        for (int i=0; i<str.length;i++)
        {
//            if(str[i].equalsIgnoreCase(""))
//                sb.append("  ");
//            else
                sb.append(str[i]+"\n");
        }
        return sb.toString();
    }
}


