package project;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class dollar {

	public static void main(String[] args) {
		double currencyAmount = 1500.00;
		Locale usa = new Locale("en", "US");
		Currency dollars = Currency.getInstance(usa);
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

		System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));

	}

}
