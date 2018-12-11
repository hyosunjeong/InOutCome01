package com.biz.inout.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.IoComeVO;


public class IoComeService {

	List<IoComeVO> ioList;
	
	public IoComeService() {
		ioList = new ArrayList();
	
	}
	
	public void ioInoutInsert(IoComeVO vo) {
		int intTotal = vo.getIntDan() * vo.getIntSu(); // 단가*수량
		vo.setIntTotal(intTotal);
		this.ioList.add(vo);
	}

	public void iolistPrint() {
		System.out.println("매입리스트");
		System.out.println("=========================================");
		System.out.println("거래일자\t구분\t품목\t단가\t수량\t합계");
		System.out.println("-----------------------------------------");
		
	
		for(IoComeVO v : ioList) {
		
			if(v.getStInout().equals("매입")) {
				System.out.print(v.getStDate()+"\t");
				System.out.print(v.getStInout()+"\t");
				System.out.print(v.getStPum()+"\t");
				System.out.print(v.getIntDan()+"\t");
				System.out.print(v.getIntSu()+"\t");
				System.out.print(v.getIntTotal()+"\n");
				
			}
		
		}
		
		
		System.out.println("매출리스트");
		System.out.println("============================================");
		System.out.println("거래일자\t구분\t품목\t단가\t수량\t합계");
		System.out.println("--------------------------------------------");
		
		
		for(IoComeVO v : ioList) {
			
			if(v.getStInout().equals("매출")) {
				System.out.print(v.getStDate()+"\t");
				System.out.print(v.getStInout()+"\t");
				System.out.print(v.getStPum()+"\t");
				System.out.print(v.getIntDan()+"\t");
				System.out.print(v.getIntSu()+"\t");
				System.out.print(v.getIntTotal()+"\n");
		
		
			}
		
		
		}
	}
	
}
