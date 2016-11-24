package com.github.manliogit.javatags.element;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class VoidTest {

	@Test
	public void voidElementHasSelfClosingChar() {
		assertThat(new Void("br").render(), is("<br/>"));
	}
	
	@Test
	public void voidElementWithAttributeHasSelfClosingChar() {
		assertThat(new Void("hr", new Attribute("aaa -> xxx")).render(), is("<hr aaa='xxx'/>"));
	}
}
