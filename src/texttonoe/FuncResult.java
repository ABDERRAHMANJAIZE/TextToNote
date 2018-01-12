/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttonoe;

/**
 *
 * @author MSdev
 */
public class FuncResult {
    
    MyPhrase Phrase;
    String Pattern;
    


    public MyPhrase getPhrase() {
        return Phrase;
    }

    public void setPhrase(MyPhrase Phrase) {
        this.Phrase = Phrase;
    }

   

    
    public FuncResult(MyPhrase Phrase) {
        this.Phrase = Phrase;
        
    }

}
