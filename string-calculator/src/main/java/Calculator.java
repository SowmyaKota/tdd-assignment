
public class Calculator {
	public int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		String[] numArray=numbers.replace("\n",",").split(",");
		int sum=0;
		for(String num:numArray) {
			sum+=Integer.parseInt(num.trim());
		}
		return sum;
	}
}
