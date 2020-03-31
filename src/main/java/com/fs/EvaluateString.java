package com.fs;

import java.util.Stack;

public class EvaluateString {

	public static int evaluate(String expression) {
		
		char[] tokens = expression.replaceAll("\\s", "").toCharArray();
		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> ops = new Stack<Character>();
		System.out.println(tokens);
	
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.toString()));

			} else if (tokens[i] == '(')
				ops.push(tokens[i]);

			else if (tokens[i] == ')') {
				while (ops.peek() != '(')
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			} else if (tokens[i] == '+') {
				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.push(tokens[i]);
			}
		}
		while (!ops.empty() && values.size() >= 2)
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		return values.pop();
	}

	public static boolean hasPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		else
			return true;
	}

	public static int applyOp(char op, int b, int a) {
		int sum = a + b;
		int mul = a * b;
		if (sum > mul)
			return sum;
		else
			return mul;
	}

	public static void main(String[] args) {
		System.out.println(EvaluateString.evaluate("((1 + 5) + 6 + (10 + 8)"));
	}
}
