package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private int pointTotal = 0;
    private int userScore = 0;

    public Quiz () {}

    public Quiz (ArrayList<Question> questions) {
        this.questions.addAll(questions);
        for (Question question : this.questions) {
            this.pointTotal += question.getPointValue();
        }
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
        this.pointTotal += question.getPointValue();
    }

    public void runQuiz() {
        System.out.println("Welcome to the quiz. It has " + this.questions.size() + " questions and is worth " + this.pointTotal + " points. Good luck!");

        Scanner input = new Scanner(System.in);

        int currentQuestionNum = 1;
        for (Question question : this.questions) {
            System.out.print("\n" + currentQuestionNum + ". ");
            question.displayQuestion();
            question.collectResponse(input);
            this.userScore += question.gradeResponse();
            currentQuestionNum++;
        }

        input.close();

        System.out.println("\nYour score: " + this.userScore + "/" + this.pointTotal + " (" + this.getScorePercentage() + ")");
    }

    // returns something like 67% for 2/3
    public String getScorePercentage() {
        double pct = (double) this.userScore / (double) this.pointTotal;
        long pctScore = Math.round(pct * 100);
        return pctScore + "%";
    }

    public int getPointTotal() {
        return pointTotal;
    }

    public int getUserScore() {
        return userScore;
    }
}
