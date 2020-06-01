
In Feature file, I have created 1 scenario & 2 scenario outlines to cover all the scenarios, the scenarios below:

Scenario: Validate CustomerList HomePage test
Scenario Outline: User validate customer's middlle panel name & personal details on home page
Scenario Outline: User validate customer's side panel name & personal details on home page


The above scenario outline has 3 scenarios for each customer (John Smith, Jeff Bridges and Steve Jones), to reduce the steps in features I have used '<parameters>' and implemented by using data-driven framework.

I have used Page Object model approach to implement the automation testing for this website:

1. HomepageContainer.java file contains all the locators for element
2. HomePageSteps.java file contains all the step definiton implementation
3. TestRunner.java file contains cucumberoptions & path for (feature & step definition) file to run the features.
4. Config properties file contains the website url & browser details
5. TestBase.java & TestUtil.java file contains initialization 

