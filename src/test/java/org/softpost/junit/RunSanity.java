package org.softpost.junit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Sagar on 22-01-2017.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Sanity.class)
@Suite.SuiteClasses( {MyTests.class})
public class RunSanity {
}
