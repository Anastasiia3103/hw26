package hw26;

public class ExampleTestClass {

    @TestRunner.Test(priority = 2)
    public void testMethod1() {
        System.out.println("Executing testMethod1");
    }

    @TestRunner.Test(priority = 1)
    public void testMethod2() {
        System.out.println("Executing testMethod2");
    }

    @TestRunner.BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Executing @BeforeSuite method");
    }

    @TestRunner.AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Executing @AfterSuite method");
    }
}