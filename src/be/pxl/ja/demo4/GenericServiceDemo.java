package be.pxl.ja.demo4;

import be.pxl.ja.streamingservice.model.Profile;

public class GenericServiceDemo {

	public static void main(String[] args) {

		CountService countService = new CountService();
		System.out.println(countService.execute("abcdefghijkl"));
		System.out.println(countService.execute("kak"));

		ProfileService profileService = new ProfileService();
		Profile profile1 = profileService.execute(8);
		System.out.println(profile1);

		ProfileService ps = new ProfileService();
		Profile p1 = ps.execute(20);
		System.out.println(p1);
	}
}
