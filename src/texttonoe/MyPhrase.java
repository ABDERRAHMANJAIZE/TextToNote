/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttonoe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSdev
 */
class MyPhrase {
    
    private String phrase;
    private List<MyWord> Words = new ArrayList<>();
    private int CurrentIndex;
    private String phrasedetails;
    

    public MyPhrase(String phras) {
        this.phrase = "";
         this.phrasedetails = phras;
        String [] strArray = phras.split(" ");
        
            for(int i=0;i<strArray.length;i=i+2){
                //System.out.println("*-- "+ i +" " + strArray.length + " " + i+1 ); 
                //System.out.println("*/ "+ strArray[i] +" " + i + " " + strArray[i+1]); 
                MyWord NewWord = new MyWord(strArray[i],i,strArray[i+1]);
                this.addWord(NewWord);
                this.phrase = this.phrase + " " + strArray[i];
            }
           
    }

    public String getPhrasedetails() {
        return phrasedetails;
    }

    public void setPhrasedetails(String phrasedetails) {
        this.phrasedetails = phrasedetails;
    }
    
    public MyPhrase() {
        this.CurrentIndex=0;
    }
    
    

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public List<MyWord> getWords() {
        return Words;
    }

    public void setWords(List<MyWord> Words) {
        this.Words = Words;
    }
    
    public void show(){
        for (MyWord element : Words) {
             System.out.println(element.getLabel()+ " " + element.getIndex() + " " + element.getPatt() );
        }
    }
    
    public void addWord(MyWord word){
        Words.add(word);
        this.CurrentIndex = word.getIndex()+1;
    }
    
    public int GetLastIndex(){
        return this.CurrentIndex;
    }
    
    public void flush(){
        this.CurrentIndex=0;
        this.Words = new ArrayList<>();
        this.phrase="";
    }
    
    public  List<Pattern> GetPatt(){
        List<Pattern> patts = new ArrayList<>();
        for (MyWord Word : this.getWords()){
            
           Pattern Patt = new Pattern(Word.getIndex(),Word.getPatt());
            patts.add(Patt);
        }
        
        return patts;
    }
    
     public  String GetPattString(){
        List<Pattern> patts = this.GetPatt();
        String Patten="";
        for (Pattern patt : patts){
            
           Patten = Patten + " " +  patt.getPatt();
        }
        return Patten;
    }
}
