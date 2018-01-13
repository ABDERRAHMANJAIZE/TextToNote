/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttonoe;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 *
 * @author MSdev
 */
public class TextToNoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
//        String a = "president of the white house";
//        MaxentTagger tagger =  new MaxentTagger("taggers/english-left3words-distsim.tagger");
//        String tagged = tagger.tagString(a);
//        System.out.println(tagged);
//        
//        // this is a test line
//        
//        String aa = "Karim is eating an apple";
//        MaxentTagger taggerr =  new MaxentTagger("taggers/english-bidirectional-distsim.tagger");
//        String taggedd = taggerr.tagString(a);
//        System.out.println(taggedd);
       
        
        MaxentTagger taggerrr = new MaxentTagger("taggers/english-left3words-distsim.tagger");
        List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new BufferedReader(new FileReader("text.txt")));
        
        System.out.println("*******************");
        for (List<HasWord> sentence : sentences) {
        List<TaggedWord> tSentence = taggerrr.tagSentence(sentence);

        System.out.println("*******************");
        
//        String filters[];
//        filters = new String[] {"NN","VB"};

        Functions f= new Functions();
       
        List<String> output =  f.GetPhrases(tSentence);
        
        List<MyPhrase> list = f.GetMyPhrases(output);

        List<String> checkedPatterntNVN = new ArrayList<>();
        Iterator<MyPhrase> itr = list.iterator();
	       
        list.stream().map((element) -> element.getWords()).forEachOrdered((Words) -> {
                //System.out.println(element.GetPattString());
                // System.out.println(element.getPhrase());
                String[] tableWords = new String[10];
                String tablePatterns[] = new String[10];
                String PattenrString="";
                int i=0;
                for (MyWord word : Words) {
                    
                    if(word.getPatt().contains("NN") || word.getPatt().contains("VB")){
                        PattenrString = PattenrString + " " + word.getPatt();
                        tableWords[i] = word.getLabel();
                        tablePatterns[i] = word.getPatt();
                        i++;
                    }
                    
                }   System.out.println("");
                System.out.println("*****");
                System.out.println("");
                for(i=0;i<tableWords.length;i++){
                    if(tableWords[i]!=null) {System.out.print(tableWords[i]+" ");}
                }   System.out.println("");
                System.out.println("*****");
                System.out.println("");
                for(i=0;i<tableWords.length;i++){
                    if(tablePatterns[i]!=null) { System.out.print(tablePatterns[i]+" "); }
                }   System.out.println("");
                System.out.println("*****");
                System.out.println("");
                for(i=0;i<tableWords.length;i++){
                    
                    if(tableWords[i]!=null) {
                        System.out.print(tableWords[i]+" ");
                        System.out.println("");
                        System.out.print(tablePatterns[i]+" ");
                    }
                }
            }); /* (\\\\VB(G|Z|N)?)? ?(\\\\NN(P|S|PS)?) (\\\\NN(P|S|PS)?)? *///        for (String patt : checkedPatterntNVN) {
//                System.out.println(patt);
//              
//        }
//
//        String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";          
//        String strangeString = " 1Z aaa **** *** {{{ {{ { ";
//
            //f.regexChecker("", longString);
                  
        }
        
        
       
        
        
    }
    
    
}
