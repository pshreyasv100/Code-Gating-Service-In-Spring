package com.gating.service;

public class QualityParameters {

  private String projectPath;
  private float timeToRunTest;
  private int noOfWarnings;
  private float codeCoverage;
  private int cyclomaticComplexity;
  private boolean isCodeDuplication;
  private int securityIssuesCount;
  private String finalDecision;

  public float getTimeToRunTests() {
    return timeToRunTest;
  }

  public void setTimeToRunTests(float timeToRunTest) {
    this.timeToRunTest = timeToRunTest;
  }

  public int getNoOfWarnings() {
    return noOfWarnings;
  }

  public void setNoOfWarnings(int noOfWarnings) {
    this.noOfWarnings = noOfWarnings;
  }

  public float getCodeCoverage() {
    return codeCoverage;
  }

  public void setCodeCoverage(float codeCoverage) {
    this.codeCoverage = codeCoverage;
  }

  public int getCyclomaticComplexity() {
    return cyclomaticComplexity;
  }

  public void setCyclomaticComplexity(int cyclomaticComplexity) {
    this.cyclomaticComplexity = cyclomaticComplexity;
  }

  public boolean isCodeDuplication() {
    return isCodeDuplication;
  }

  public void setCodeDuplication(boolean isCodeDuplication) {
    this.isCodeDuplication = isCodeDuplication;
  }

  public int getSecurityIssuesCount() {
    return securityIssuesCount;
  }

  public void setSecurityIssuesCount(int securityIssuesCount) {
    this.securityIssuesCount = securityIssuesCount;
  }

  public String getFinalDecision() {
    return finalDecision;
  }

  public void setFinalDecision(String finalDecision) {
    this.finalDecision = finalDecision;
  }

  public String getProjectPath() {
    return projectPath;
  }

  public void setProjectPath(String projectPath) {
    this.projectPath = projectPath;
  }


}
