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
public class Quiz {

    protected String questionText;
    protected String correctAnswer;
    protected int mark;

    public Quiz(String questionText, String correctAnswer, int mark) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.mark = mark;
    }
    
    public Quiz(){
        questionText ="";
        correctAnswer="";
        mark=0;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getMark() {
        return mark;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
}
