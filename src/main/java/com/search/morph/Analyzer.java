package com.search.morph;

import org.apache.lucene.analysis.kr.morph.MorphException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.search.morph.log.LoggerLoader;

public class Analyzer {
	private static Logger LOG = LoggerFactory.getLogger(Analyzer.class);
		
	public static void main(String[] args) {
		LoggerLoader.load();
		AnalyzerUtil analyzer = new AnalyzerUtil();
    	String input1 = "[생]마이콜 걸어서 서울에서 부산D4 충남천안";
    	String result1 = null;
		try {
			result1 = analyzer.guideWord(input1);
		} catch (MorphException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(result1);
	}

}
