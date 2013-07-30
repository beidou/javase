package demo;

import java.util.Hashtable;

/**
 * Created by Administrator on 13-7-26.
 */
public class hashTable {
    public static void main(String[] args) {
        String[]strings={"hello","happy","new","year"};
        char[] chars={'a','b','c','d'};
        Hashtable hashtable=new Hashtable();
        for (int i = 0; i <strings.length ; i++) {
            hashtable.put(chars[i],strings[i]);
        }
        System.out.println(hashtable.get('c'));
    }
}
