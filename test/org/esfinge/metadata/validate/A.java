package org.esfinge.metadata.validate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.esfinge.metadata.annotation.SearchOnEnclosingElements;

@SearchOnEnclosingElements
@Retention(RetentionPolicy.RUNTIME)
public @interface A {

}