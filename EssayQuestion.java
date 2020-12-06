/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.lab;

/**
 *
 * @author porte
 */
public class EssayQuestion extends Quiz {
    private String essayQuestion;
    private int wordCount;
    private int mark;

    public EssayQuestion(String essayQuestion, int wordCount, int mark) {
        this.essayQuestion = essayQuestion;
        this.wordCount = wordCount;
        this.mark = mark;
    }

    public String getEssayQuestion() {
        return essayQuestion;
    }

    public void setEssayQuestion(String essayQuestion) {
        this.essayQuestion = essayQuestion;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    
    
}
