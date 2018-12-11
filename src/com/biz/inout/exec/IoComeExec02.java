package com.biz.inout.exec;

import java.util.Scanner;

import com.biz.inout.service.IoComeService;
import com.biz.inout.vo.IoComeVO;

public class IoComeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IoComeService is = new IoComeService();
		is.iolistPrint();
		
		while(true) {
			
			IoComeVO vo = ioInsert();
			// vo에 담기는 값은 완성된 vo이거나,null이다
			if(vo == null) break;
			is.ioInoutInsert(vo); //list에 추가하라고 vo를 전달
		
		}
		
		
		
	}
	
	public static IoComeVO ioInsert() {
		
		IoComeVO vo = new IoComeVO();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============================");
		System.out.println("매입 매출 등록");
		System.out.println("------------------------------");
		
		System.out.print("거래일(-1:종료) >>");
		String strDate = scan.nextLine();
		
		if(strDate.equals("-1")) {
			return null; // 나머지 코드를 실행하지 말고 중단 
		}; //종료코드
		
		
		System.out.print("거래방법(매입/매출) >> ");
		String strInOut = scan.nextLine();

		System.out.print("품목(상품명) >> ");
		String strPum = scan.nextLine();
		
		
			System.out.print("단가 >> ");
			String strDan = scan.nextLine();
			int intDan = Integer.valueOf(strDan);
			
			
			System.out.print("수량 >> ");
			String strSu = scan.nextLine();
			int intSu = Integer.valueOf(strSu);
			
			vo.setStDate(strDate);
			vo.setStInout(strInOut);
			vo.setStPum(strPum);
			vo.setIntDan(intDan);
			vo.setIntSu(intSu);
	
			 System.out.println("입력이 잘못 되었습니다.");
			 return null;
			
			
		//return vo; // 모든 입력과 변환이 정상적으로 완료되면
					// vo를 main으로 return
		
	

}
}
