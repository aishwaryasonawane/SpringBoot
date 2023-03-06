package com.calculator.simplecalculator.logic;

public class cal_logic {
	//create a method for addition of two number
			public static int addNO(int n1,int n2) {
				return n1+n2;
			}
			
			//create a method for substraction of two number
			public static int subNO(int n1,int n2) {
				return n1-n2;
			}
			
			//create a method for multiplication of two number
			public static int mulNO(int n1,int n2) {
				return n1*n2;
			}
			
			//create a method for Division of two number
			public static int divNO(int n1,int n2) {
				try {
				return n1/n2;
				}
				catch(Exception e) {
					System.out.println(e);
				}
				return n2;
			}

		}



