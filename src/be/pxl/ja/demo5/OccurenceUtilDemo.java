package be.pxl.ja.demo5;

import be.pxl.ja.streamingservice.model.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OccurenceUtilDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7,15,23,12,8,7,23,13,32,7);
		System.out.println(OccurenceUtil.occursExactTimes(numbers, 7, 3));
		System.out.println(OccurenceUtil.occursExactTimes(numbers, 23, 5));
		System.out.println(OccurenceUtil.occursExactTimes(numbers,12,5));

		List<String> strings = Arrays.asList("ik", "jij", "honger", "eten");
		System.out.println(OccurenceUtil.occursExactTimes(strings,"ik",2));


		List<Profile> profiles = Arrays.asList(
				new Profile("Ann"),
				new Profile("Mary"),
				new Profile("Henk"),
				new Profile("Thomas"),
				new Profile("Ann"));
		System.out.println(OccurenceUtil.occursExactTimes(profiles, new Profile("Ann"), 3));
		System.out.println(OccurenceUtil.occursExactTimes(profiles, new Profile("Tommy"), 0));

		System.out.println(OccurenceUtil.countSmaller(numbers, 7));
		System.out.println(OccurenceUtil.countSmaller(numbers, 23));

		System.out.println(OccurenceUtil.countSmaller(profiles, new Profile("Ann")));
		System.out.println(OccurenceUtil.countSmaller(profiles, new Profile("Mark")));

		System.out.println(OccurenceUtil.countSmaller(strings,"ik"));
	}


}
