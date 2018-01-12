/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttonoe;

import edu.stanford.nlp.ling.TaggedWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.*;

/**
 *
 * @author MSdev
 */
public class Functions {
    
    
    public  List<String> GetPhrases(List<TaggedWord> tSentence){
        
        Iterator<TaggedWord> iterator = tSentence.iterator();
        String DetailedString="";
        int i = 0;

        List<String> phrasesdetails = new ArrayList<>();
            while (iterator.hasNext()) {
                     i++;
                    TaggedWord get = tSentence.get(tSentence.indexOf(iterator.next()));
                    String str = get.toString();
                    String [] strArray = str.split("/");
                    
                    if(strArray[0].equals(",")){
                        phrasesdetails.add(DetailedString);
                        DetailedString = "";
                    }else{
                        DetailedString = DetailedString + strArray[0]+" "+strArray[1]+" ";
                    }         
            }
 
            return phrasesdetails;
    }
    
    public List<MyPhrase> GetMyPhrases (List<String> list){
         
        List<MyPhrase> MyPhrases = new ArrayList<>();
        
        for (String element : list) {
            MyPhrase phrase = new MyPhrase(element);
            MyPhrases.add(phrase);
        }
       
        return MyPhrases;
    }
    
    

/*
    public String regexChecker(String theRegex, String str2Check){
        // You define your regular expression (REGEX) using Pattern
        Pattern checkRegex = Pattern.compile(theRegex);
        // Creates a Matcher object that searches the String for
        // anything that matches the REGEX
        Matcher regexMatcher = checkRegex.matcher( str2Check );
        // Cycle through the positive matches and print them to screen
        // Make sure string isn't empty and trim off any whitespace
        while ( regexMatcher.find() ){
            if (regexMatcher.group().length() != 0){
//                System.out.println( regexMatcher.group().trim() );
//                // You can get the starting and ending indexs
//                System.out.println( "Start Index: " + regexMatcher.start());
//                System.out.println( "end Index: " + regexMatcher.end());
                return str2Check;
            }
        }
        System.out.println();
        return "";
    }
*/

}
