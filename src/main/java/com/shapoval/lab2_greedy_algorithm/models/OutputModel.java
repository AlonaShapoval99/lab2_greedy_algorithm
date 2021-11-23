package com.shapoval.lab2_greedy_algorithm.models;

public class OutputModel {
    private String stepId;
    private double currentIncome;
    private int apiaryId;
    private int currentAmount;
    private int currentNumberOfFrames;
    private int[] xij;

    public OutputModel(String stepId, double currentIncome, int apiaryId, int currentAmount, int currentNumberOfFrames, int[] xij) {
        this.stepId = stepId;
        this.currentIncome = currentIncome;
        this.apiaryId = apiaryId;
        this.currentAmount = currentAmount;
        this.currentNumberOfFrames = currentNumberOfFrames;
        this.xij = xij;
    }

    public OutputModel() {
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public double getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(double currentIncome) {
        this.currentIncome = currentIncome;
    }

    public int getApiaryId() {
        return apiaryId;
    }

    public void setApiaryId(int apiaryId) {
        this.apiaryId = apiaryId;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int getCurrentNumberOfFrames() {
        return currentNumberOfFrames;
    }

    public void setCurrentNumberOfFrames(int currentNumberOfFrames) {
        this.currentNumberOfFrames = currentNumberOfFrames;
    }

    public int[] getXij() {
        return xij;
    }

    public void setXij(int[] xij) {
        this.xij = xij;
    }
}
