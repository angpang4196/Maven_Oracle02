package com.biz.oracle.exec;

import com.biz.oracle.service.ScoreService;
import com.biz.oracle.vo.ScoreVO;

public class OrExec02 {

	public static void main(String[] args) {

		ScoreService ss = new ScoreService();

		for (int i = 0; i < 4; i++) {
			ss.viewScore("0000" + (i + 1));
		}
	}
}
