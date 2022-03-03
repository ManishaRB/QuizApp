package main;

import java.util.Scanner;

public class Question {


        private String text;
        private String response;
        private String answer;
        private int pointValue = 1;

        public Question(String text, String answer) {
            this.text = text;
            this.answer = answer;
        }

        public Question(String text, String answer, int pointValue) {
            this(text, answer);
            this.pointValue = pointValue;
        }

        public void displayQuestion() {
            System.out.println(text);
        }

        public void collectResponse(Scanner input) {
            this.response = input.nextLine();
        }

        public int gradeResponse () {
            return this.response.equals(this.answer) ? this.pointValue : 0;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public int getPointValue() {
            return pointValue;
        }

        public void setPointValue(int pointValue) {
            this.pointValue = pointValue;
        }
    }

