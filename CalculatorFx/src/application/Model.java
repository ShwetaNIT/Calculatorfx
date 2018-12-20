package application;

public class Model {
	public double calculate(long number1,long number2,String operator) {
		System.out.println(number1+"                  "+number2);
		switch(operator) {
		case "+":return (number1+number2);
		case "-":return number1-number2;
		case "/":{if(number2==0)
			return 0;
		else
			return number1/number2;
		}
		case "*":return number1*number2;
		default:
			return 0;
		
		}
	
	}

}
