/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.lab;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author porte
 */
public class QuestionUI {

    private ArrayList<Quiz> questions;

    public QuestionUI() {
        questions = new ArrayList<>();

    }

    public void add() {

        int type = 0;
        System.out.println("If you would like to add a Basic Question, type '1'. \n If you would like to add a Multiple Question type, '2'. \n If you would like to add an Essay Question, type '3'.");
        Scanner add = new Scanner(System.in);
        type = add.nextInt();
        if (type == 1) {
            Quiz q = new Quiz();
            System.out.println("Enter basic question");
            Scanner reader = new Scanner(System.in);
            String question = reader.nextLine();
            q.setQuestionText(question);//Put "question" in brackets to assign

            System.out.println("Enter Correct Answer");
            String answer = reader.nextLine();
            q.setCorrectAnswer(answer);

            System.out.println("Enter Amount of marks for this Question");
            int marks = reader.nextInt();
            q.setMark(marks);

            questions.add(q);

        } else if (type == 2) {
            multipleChoice m = new multipleChoice("", "", "", "", 0);

            System.out.println("Enter Essay Question");
            Scanner reader = new Scanner(System.in);
            String question = reader.nextLine();
            m.setQuestionText(question);

            System.out.println("Enter Option A");
            String answer1 = reader.nextLine();
            m.setOptionA(answer1);

            System.out.println("Enter Option B");
            String answer2 = reader.nextLine();
            m.setOptionB(answer2);

            System.out.println("Enter Option C");
            String answer3 = reader.nextLine();
            m.setOptionC(answer3);

            System.out.println("Enter marks for Question");
            int marks = reader.nextInt();
            m.setMark(marks);

            questions.add(m);

        } else if (type == 3) {
            EssayQuestion e = new EssayQuestion("", 0, 0);
            System.out.println("Enter Essay Question");
            Scanner reader = new Scanner(System.in);
            String question = reader.nextLine();
            e.setEssayQuestion(question);

            System.out.println("Enter word limit");
            int wordLimit = reader.nextInt();
            e.setWordCount(wordLimit);

            System.out.println("Enter marks for Question");
            int marks = reader.nextInt();
            e.setMark(marks);

            questions.add(e);

        }
    }

    public void print() {
        for (int i = 0; i < questions.size(); i++) {
            Quiz q = questions.get(i);

            if (q instanceof Quiz) {
                System.out.println("Question: " + q.getQuestionText() + "\n Correct answer: " + q.getCorrectAnswer() + "\n Marks: " + q.getMark());

            } else if (q instanceof multipleChoice) {
                System.out.println("Multiple Choice Question: " + ((multipleChoice) q).getQuestionText() + "\nOption A: " + ((multipleChoice) q).getOptionA() + "\nOption B: " + ((multipleChoice) q).getOptionB() + "\nOption C: " + ((multipleChoice) q).getOptionC() + "\n Marks: " + ((multipleChoice) q).getMark());
            } else if (q instanceof EssayQuestion) {
                System.out.println("Essay Question: " + ((EssayQuestion) q).getEssayQuestion() + "\n Word Limit" + ((EssayQuestion) q).getWordCount() + "\n Marks: " + ((EssayQuestion) q).getEssayQuestion());
            }
        }
    }

    public void search() {
        System.out.println("Please enter a mark to search for a question"); // using mark as an id to search for questions seems easier than entering the question that is being looked for
        Scanner reader = new Scanner(System.in);
        int search = reader.nextInt();
        for (Quiz q : questions) {
            if (q.getMark() == search) {
                if (q instanceof Quiz) {
                    System.out.println("Question: " + q.getQuestionText() + "\n Correct answer: " + q.getCorrectAnswer() + "\n Marks: " + q.getMark());

                } else if (q instanceof multipleChoice) {
                    System.out.println("Multiple Choice Question: " + ((multipleChoice) q).getQuestionText() + "\nOption A: " + ((multipleChoice) q).getOptionA() + "\nOption B: " + ((multipleChoice) q).getOptionB() + "\nOption C: " + ((multipleChoice) q).getOptionC() + "\n Marks: " + ((multipleChoice) q).getMark());
                } else if (q instanceof EssayQuestion) {
                    System.out.println("Essay Question: " + ((EssayQuestion) q).getEssayQuestion() + "\n Word Limit" + ((EssayQuestion) q).getWordCount() + "\n Marks: " + ((EssayQuestion) q).getEssayQuestion());
                }
            }
        }
    }

    public void delete() {
        System.out.println("Please enter a mark to search for a question"); // using mark as an id to search for questions seems easier than entering the question that is being looked for
        Scanner reader = new Scanner(System.in);
        int delete = reader.nextInt();
        for (Quiz q : questions) {
            if (q.getMark() == delete) {
                questions.remove(q);

            }

        }
    }

    public void menu() {
        System.out.println("Please select an option: \n 1.Add a new Question \n 2.Display all Questions \n 3.Search for a Question \n 4.Delete a Question");
        Scanner reader = new Scanner(System.in);
        int ans = reader.nextInt();
        switch (ans) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
}
