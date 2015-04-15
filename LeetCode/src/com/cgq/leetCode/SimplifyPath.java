package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * @comment Given an absolute path for a file(Unix-style), simplify it.
 * For example,
	path = "/home/", => "/home"
	path = "/a/./b/../../c/", => "/c"
	Corner Cases:
		Did you consider the case where path = "/../"?
		In this case, you should return "/".
		Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
		In this case, you should ignore redundant slashes and return "/home/foo".
 * @author cgqfzy
 * @version 1.0
 * @date Apr 13, 2015 2:50:14 PM
 */
public class SimplifyPath {

	private final static int MAX_DEPTH = 50;
	public String simplifyPath(String path){
		String[] pat = path.split("/");
		String[] stack = new String[MAX_DEPTH];
		int top = -1;
		for (String tmp : pat) {
			if (".".equals(tmp)) {
				// do nothing
				continue;
			}else if ("..".equals(tmp)) {
				//pop
				if (top >= 0){
					top --;
				}
				
				continue;
			}else if ("".equals(tmp)) {
				continue;
			} else {
				stack[++ top] = tmp;
			}
		}
		if (top == -1){
			return "/";
		}
		StringBuilder sb = new StringBuilder("/");
		for (int i = 0; i <= top; i++) {
			sb.append(stack[i]);
			if (i != top && !"".equals(stack[i])){
				sb.append("/");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String path = "///////RgQ/DCkMtxRQArpnS///./../.././////lU/HkOPFethUYRJYwGjzHMe/rJteBUS///IsKEnIQJ/../../hGXBMGFqtOjs/rmSJGOpIwm/CLuUcSXPiwjsK///uAmXcWR/./tTrlKBgzBlNEwF/OOpDjmMoTvaedK///./YYjtE///cH/KOmxKcGmWg/qGCOBeWiABLFqcIOmz/////./maSVbpF/./CWFbBs/qMzsrWxv/.././vvUmYui///KCVaRfmLpZOzberV/VHOA/jphGcKrSF/kJkDRYKtpUosUWVbD///gclGacfgDoPGdiXxPWyc/MZIcVQZzab/DIGNdzzS/qBPDkxjWjEQlv/Njfre/./hxoM/mKKOwBVEWZwjagOuWi/UuLHfsWzeWi/../QuopYsUtqgnqAiXwE/qgokdsKKhosJhdBiSjA/..///ANrXgVcSNejG/FIfSyTz/.///UZlMfMXBUmuCDhiVQf///kqdiy/aRxweiOpLcczy/RPed/e/zbO/././M/NxCFeiNOJI/../qfBhtXbBFuRBPQrYpTx///tZhVBcmIMlnygAKHKdcT///rQllOCPKsfmXOdMT/./xqXODEft/dOqZbqJ/uCii///../../fDWbSnpMzPd///./PS/.././//HIQJuNdVfdlpqBKA/wo/.././OhBzBcujoxcpY/EHrtJtqIsnhIUkqh///./../WKPXCkCl/FEncfxOdTdcBPMUAS/OYcSyadfthTntUAsjUm/././iTURgskcGXkmDKWLcis/KvNnwUvQcCBJ/UCNcxJzeOdaX/././..///tX///DfxuGi/";
		String p2 = "//...";
		String[] pats = path.split("/",0);
		for (String string : pats) {
			System.out.println(string);
		}
		
		MyPrint.print(new SimplifyPath().simplifyPath(p2));
	}
}
