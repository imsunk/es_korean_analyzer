package com.search.morph;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.kr.KoreanAnalyzer;
import org.apache.lucene.analysis.kr.KoreanTokenizer;
import org.apache.lucene.analysis.kr.morph.MorphException;

import com.search.morph.AnalyzerUtil;

public class testAnalyzer extends TestCase
{
    public void testAnalyze() {
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
