import java.util.ArrayList;
import java.util.List;

public class Calculator {
	public int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		String delimiter=",|\n";
		if(numbers.startsWith("//")) {
			int delimiterIndex=numbers.indexOf("\n");
			delimiter=numbers.substring(2, delimiterIndex);
			numbers=numbers.substring(delimiterIndex+1);
		}
		
		String[] tokens=numbers.split(delimiter);
		List<Integer>negatives=new ArrayList<>();
		int sum=0;
		for(String token:tokens) {
			if(!token.trim().isEmpty()) {
			int num=Integer.parseInt(token.trim());
			if(num<0) {
				negatives.add(num);
			}
			sum+=num;
			}
		}
		if(!negatives.isEmpty()) {
			throw new IllegalArgumentException("Negative numbers are not allowed:"+negatives);
		}
		return sum;
	}
}
