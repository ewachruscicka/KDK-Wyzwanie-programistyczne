package pl.kobietydokodu.wyzwanie01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sandwich {

	public static String getSandwich(String sandwichFilling){
		String filling = null;
		if(Pattern.matches(".*bread.*bread.*", sandwichFilling)){
			Pattern p = Pattern.compile(Pattern.quote("bread") + "(.*)" + Pattern.quote("bread") );
			Matcher m = p.matcher(sandwichFilling);
			while(m.find()){
			    filling = m.group(1);
			}
			return filling;
		}
		else{
			filling = "The sanwich doesn't contain 2 pieces of bread.";
			return filling;
		}
	}
}
