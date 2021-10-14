package com.Managers;

import com.PageClass.GoogleHomePage;

public class PageManager extends TestBaseClass {

	private GoogleHomePage homepage;

	public GoogleHomePage getHomePage() {
		return (homepage == null) ? homepage =new GoogleHomePage() : homepage;
	}
}
