package com.applications.calculations;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	//zero-argument constructor
	public Calculator() {
	}
	//constructor using fields
	public Calculator(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	//Getters and Setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	//methods
	public double performOperation(String operation, double operandOne, double operandTwo) {
		double retVal=0;
		if(operation.equals("*")){
			retVal = operandOne*operandTwo;
			return retVal;
			
			} else if(operation.equals("+")){
			retVal = operandOne+operandTwo;
			return retVal;
			}else if(operation.equals("-")){
				retVal = operandOne-operandTwo;
				return retVal;
				}else if(operation.equals("/")){
				retVal = operandOne/operandTwo;
				return retVal;
				}
		return retVal;
		
	}
	public void getResults(String operation, double operandOne, double operandTwo) {
		System.out.println(performOperation(operation, operandOne, operandTwo));
		
	}
	}
