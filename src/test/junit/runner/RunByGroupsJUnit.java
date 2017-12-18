package test.junit.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;

import test.junit.CosDoubleTest;
import test.junit.DivDoubleTest;
import test.junit.MultLongTest;
import test.junit.PositiveLongTest;
import test.junit.SubLongTest;
import test.junit.SumDoubleTest;
import test.junit.TgDoubleTest;
import test.junit.runner.groups.AllTests;
import test.junit.runner.groups.LogicTests;
import test.junit.PowDoubleTest;

@RunWith(Categories.class)
@IncludeCategory(AllTests.class)
@ExcludeCategory(LogicTests.class)
@SuiteClasses({
	CosDoubleTest.class,
	DivDoubleTest.class,
	MultLongTest.class,
	PositiveLongTest.class,
	SubLongTest.class,
	SumDoubleTest.class,
	TgDoubleTest.class,
	PowDoubleTest.class
})
public class RunByGroupsJUnit {

}
