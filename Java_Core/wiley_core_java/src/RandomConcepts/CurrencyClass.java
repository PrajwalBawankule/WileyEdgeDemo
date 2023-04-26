package RandomConcepts;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Currency usd = Currency.getInstance("USD");
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedval = nf.format(108.5);
		System.out.println(formattedval);
		
		double price = 2002.34;
		Locale local = new Locale("en","US");
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(local);
		String formattedval1 = nf1.format(price);
		System.out.println(formattedval1);
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		System.out.println(symbol);
		
		
	}

}
