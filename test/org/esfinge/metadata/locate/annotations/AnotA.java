package org.esfinge.metadata.locate.annotations;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

import org.esfinge.metadata.validate.needsToHave.SearchOnEnclosingElements;

@SearchOnEnclosingElements
@Retention(RetentionPolicy.RUNTIME)
public @interface AnotA {

}
