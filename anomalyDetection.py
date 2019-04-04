import numpy as np
import matplotlib.pyplot as plt
import scipy
from scipy.stats import multivariate_normal
%matplotlib inline

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

def getCovariance(X):
    return np.cov(X, rowvar=False)

def calculateProbability(X, mean, cov):
    var = multivariate_normal(mean, cov)
    p = np.zeros(len(X))
    for i in range(len(X)):
	p[i] = var.pdf(X[i])
    return p

# Z = pd.read_csv('ActuatorData.csv')
# Z.apply(pd.to_numeric, errors='coerce')
Z = np.genfromtxt ('ActuatorData.csv', delimiter=",", dtype=int)

