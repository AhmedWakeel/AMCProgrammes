package com.amc.newlyadde.iles;

public interface X {

	int m(Iterable<String> arg);
	}

 interface Y {

	int m(Iterable<String> arg);
	}
 
 interface Z extends X, Y {}
