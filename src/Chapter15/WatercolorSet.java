package Chapter15;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import basetool.Sets;

enum watercolor{
	shihu,shitao,shimin
}
public class WatercolorSet {
	public static void main(String args[]){
		Set<watercolor> watercolorset = EnumSet.range(watercolor.shihu, watercolor.shitao);
		System.out.println(watercolorset);
		System.out.println(Sets.intersection(watercolorset, watercolorset));
	}
}
