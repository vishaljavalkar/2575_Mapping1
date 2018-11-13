package com.test;

import java.util.ArrayList;

public class TestMapping {

	public static void main(String[] args) {
		String[] inputu = {};
		String[] type = {};
		String[] eventtype = {};
		String[] buom = {};
		String[] auom = {};
		String[] MAflag = {};
        // Added some comments to it.
	}

	public void N4(String[] inputu, String[] inputa, String[] type, String[] eventtype, String[] buom, String[] auom,
			String[] MAflag, ArrayList result) {
		for (int k = 0; k < eventtype.length; k++) {
			if (eventtype[k].equalsIgnoreCase("UPDATE") && !MAflag[k].equals("Y")) {
				for (int y = 0; y < inputu.length; y++) {
					for (int j = 0; j < auom.length; j++) {
						if (auom[j] == buom[j]) {
							// for(int l=0;l<inputu.length;l++)
							// {
							try {
								if (type[y].equalsIgnoreCase("N4") || type[y].equalsIgnoreCase("ND")
										|| type[y].equalsIgnoreCase("GT")) {
									result.add(inputu[y]);
								}
							} catch (Exception e) {
							}
							// }
						} else {
							if (type[y].equalsIgnoreCase("GT")) {
								result.add(inputu[y]);
							} else {

								if (type[y].equalsIgnoreCase("ND") || type[y].equalsIgnoreCase("N4")) {
									result.add("_SUPPRESS_");
								} else {

									result.add("/");
								}
							}

						}
					}

				}
			} else {
				for (int i = 0; i < inputa.length; i++) {
					if (!inputa[i].equals("")) {
						result.add(inputa[i]);
					} else {
						result.add("/");
					}
				}
			}
		}

	}

}
