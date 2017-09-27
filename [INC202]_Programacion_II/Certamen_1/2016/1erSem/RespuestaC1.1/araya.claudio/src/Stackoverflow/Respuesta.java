/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackoverflow;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cl
 */
public class Respuesta {

    private int idAnswer;
    private int idAnswerer;
    private int scoreAnswer;
    private Date timeAnswer;

    private int idQuestion;

    private int idQuestioner;
    private int scoreQuestion;
    private Date timeQuestion;
    private int numberViewsQuestion;    
    private int numberAnswers;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public int getIdAnswerer() {
        return idAnswerer;
    }

    public void setIdAnswerer(int idAnswerer) {
        this.idAnswerer = idAnswerer;
    }

    public int getScoreAnswer() {
        return scoreAnswer;
    }

    public void setScoreAnswer(int scoreAnswer) {
        this.scoreAnswer = scoreAnswer;
    }

    public Date getTimeAnswer() {
        return timeAnswer;
    }

    public void setTimeAnswer(Date timeAnswer) {
        this.timeAnswer = timeAnswer;
    }

    public int getIdQuestioner() {
        return idQuestioner;
    }

    public void setIdQuestioner(int idQuestioner) {
        this.idQuestioner = idQuestioner;
    }

    public int getScoreQuestion() {
        return scoreQuestion;
    }

    public void setScoreQuestion(int scoreQuestion) {
        this.scoreQuestion = scoreQuestion;
    }

    public Date getTimeQuestion() {
        return timeQuestion;
    }

    public void setTimeQuestion(Date timeQuestion) {
        this.timeQuestion = timeQuestion;
    }

    public int getNumberViewsQuestion() {
        return numberViewsQuestion;
    }

    public void setNumberViewsQuestion(int numberViewsQuestion) {
        this.numberViewsQuestion = numberViewsQuestion;
    }

    public int getNumberAnswers() {
        return numberAnswers;
    }

    public void setNumberAnswers(int numberAnswers) {
        this.numberAnswers = numberAnswers;
    }
    
    public long tiempoRespuesta(){    
        return timeAnswer.getTime() - timeQuestion.getTime();
    }
    
    
    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        
        return String.format("%d\t%d\t%d\t%s\t%d\t%d\t%d\t%d\t%d\t%s", 
                idQuestion, idQuestioner, scoreQuestion, dt.format(timeQuestion), 
                numberViewsQuestion, numberAnswers, idAnswer, idAnswerer, scoreAnswer, dt.format(timeAnswer));
    }

}
