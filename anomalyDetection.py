import numpy as np
import matplotlib.pyplot as plt
import scipy
from scipy.stats import multivariate_normal

def estimateGaussian(X):
    (m,n) = X.shape
    # initializing mu(mean) and sigma2(variance)
    mu = np.zeros((n,1))
    sigma2 = np.zeros((n,1))
    # mean
    mu = np.sum(X, axis=0)/m
    tempSigma = X - mu
    tempSigma2 = np.power(tempSigma, 2)
    sigma2 = np.sum(tempSigma2, axis=0)/m
    return (mu, sigma2)

def calculateProbability(X, mean, cov):
    var = multivariate_normal(mean=[0,0], cov=[[1,0],[0,1]])
    p = var.pdf([1,0])
