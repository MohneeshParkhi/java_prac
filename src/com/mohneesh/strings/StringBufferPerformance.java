package com.mohneesh.strings;

public class StringBufferPerformance {
	
	private String stringCheckPerf(String ss) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time To check String preformance :"+startTime);
		for(int i=0 ;i<150000;i++) {
			ss.concat("Ltd");
		}
		System.out.println("Finish Time: "+ (System.currentTimeMillis() - startTime));
	   
		return ss;
	}
	
	private String stringBufferCheck(String s) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time To check String preformance :"+startTime);
		
		StringBuffer strBuf = new StringBuffer(s);
		for(int i=0;i<150000;i++) {
		strBuf.append("HURRAY !");
		}
		System.out.println("Finish Time: "+ (System.currentTimeMillis() - startTime));
		return strBuf.toString();
	}
	
	
	public static void main(String[] args) {
		String s = "hcl";
		StringBufferPerformance strPer = new StringBufferPerformance();
		strPer.stringCheckPerf(s);
		strPer.stringBufferCheck(s);
		
	}
	
}
