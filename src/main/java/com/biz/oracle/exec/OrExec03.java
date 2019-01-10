package com.biz.oracle.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.oracle.service.ScoreService;
import com.biz.oracle.vo.ScoreVO;

public class OrExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreService ss = new ScoreService();

		Scanner scan = new Scanner(System.in);
		List<ScoreVO> viewList = new ArrayList();

		System.out.print("학번 입력 >>> ");
		String writeSt_num = scan.nextLine();

		viewList = ss.viewScore(writeSt_num);

		System.out.println(viewList);
	}
}
