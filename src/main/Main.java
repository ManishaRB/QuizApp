package main;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("What is your favorite color?", "green"));
        quiz.addQuestion(new Question("What is the answer to the ultimate question?", "42"));
        quiz.addQuestion(new Question("How high is the St. Louis Arch in feet?", "630"));

        quiz.runQuiz();
    }
}
