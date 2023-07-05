package edu.kh.oarr.practice.run;

import edu.kh.oarr.practice.model.service.PracticeService;

public class PracticeRun {

	public static void main(String[] args) {

		PracticeService service = new PracticeService();
		service.start();
	}

}
