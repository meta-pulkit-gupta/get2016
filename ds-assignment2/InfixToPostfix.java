package session2;

/**
 * class for infix to postfix conversion
 * @author Pulkit Gupta
 *
 */
public class InfixToPostfix {

	/**
	 * list of constants
	 */
	final static int IS_CHAR = 1;
	final static int IS_ADDITION_OPERATOR = 2;
	final static int IS_SUBSTRACTION_OPERATOR = 2;
	final static int IS_DIVISION_OPERATOR = 3;
	final static int IS_MULTIPLICATION_OPERATOR = 3;

	/**
	 * method to check the type of token
	 * 
	 * @param charVar
	 *            : token
	 * @return integer value of the token
	 */
	public int checkCharType(char charVar) {

		int type = 0;

		if ((charVar >= 97 && charVar <= 122)
				|| (charVar >= 65 && charVar <= 90)) {

			type = IS_CHAR;
		} else if (charVar == 43) {

			type = IS_ADDITION_OPERATOR;
		} else if (charVar == 45) {

			type = IS_SUBSTRACTION_OPERATOR;
		} else if (charVar == 42) {

			type = IS_MULTIPLICATION_OPERATOR;
		} else if (charVar == 47) {

			type = IS_DIVISION_OPERATOR;
		}
		return type;
	}

	/**
	 * method to compare precendece of stack top and the character
	 * 
	 * @param stackTop
	 *            : character at stack top
	 * @param charVar
	 *            : token to be compared
	 * @return boolean
	 */
	public boolean isPriorityHigher(char stackTop, char charVar) {

		boolean status = false;

		if (checkCharType(stackTop) > checkCharType(charVar)) {

			status = true;
			// System.out.println("priority of "+stackTop+" is higher than "+charVar);
		}
		return status;
	}

	/**
	 * method to compare precendece of stack top and the character
	 * 
	 * @param stackTop
	 *            : character at stack top
	 * @param charVar
	 *            : token to be compared
	 * @return boolean
	 */
	public boolean isPrecedencyEqual(char charVar1, char charVar2) {
		boolean status = false;

		if (checkCharType(charVar1) == checkCharType(charVar2)) {

			status = true;
			// System.out.println("priority of "+charVar1+" is equal to  "+charVar2);
		}
		return status;
	}

	/**
	 * method to convert infix to postfix
	 * 
	 * @param infix
	 */
	public void infixToPostfixConverter(String infix) {

		MyStack<Character> stack = new MyStack<Character>();
		String postfix = "";
		int inputLength = infix.length();
		// System.out.println("inputLength : "+inputLength);
		int counter = 0;
		char characterAtCounter;

		while (counter < inputLength) {

			characterAtCounter = infix.charAt(counter);
			// System.out.println("characterAtCounter : "+characterAtCounter);
			// System.out.println("checkCharType(characterAtCounter) : "+checkCharType(characterAtCounter));
			if (checkCharType(characterAtCounter) == IS_CHAR) {

				postfix += "" + characterAtCounter;
				// System.out.println("postfix  "+postfix);
			} else if (characterAtCounter == '('){
				stack.push(characterAtCounter);
			} else if(characterAtCounter == ')'){
				char temp = stack.pop();
				while(temp != '('){
					postfix += "" + temp;
					temp = stack.pop();
				}
			}
			else if ((checkCharType(characterAtCounter) == IS_ADDITION_OPERATOR
					|| checkCharType(characterAtCounter) == IS_DIVISION_OPERATOR
					|| checkCharType(characterAtCounter) == IS_MULTIPLICATION_OPERATOR || checkCharType(characterAtCounter) == IS_SUBSTRACTION_OPERATOR)) {

				while (!(stack.isEmpty())
						&& ((isPriorityHigher(stack.getPeek(),
								characterAtCounter)) || (isPrecedencyEqual(
								stack.getPeek(), characterAtCounter)))) {

					postfix += "" + stack.pop();
					// System.out.println("postfix ; "+postfix);
				}
				stack.push(characterAtCounter);
			}

			counter++;
		}

		while (!(stack.isEmpty())) {

			postfix += "" + stack.pop();
		}
		// print the postfix expression
		System.out.println("Postfix : " + postfix);

	}

	/**
	 * main method for testing working of infix to postfix converter
	 * 
	 * @param args
	 *            : string[]
	 */
	public static void main(String[] args) {

		InfixToPostfix infixToPostfix = new InfixToPostfix();
		String infix = "(a+b)*c";
		infixToPostfix.infixToPostfixConverter(infix);
	}
}
