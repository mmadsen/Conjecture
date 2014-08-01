package com.etsy.conjecture.model;

import java.io.Serializable;

public abstract class LearningRateComputation implements Serializable {

    private static final long serialVersionUID = 6542742510494701712L;

    public abstract double computeFeatureLearningRate(String feature, long epoch, double gradient);

}