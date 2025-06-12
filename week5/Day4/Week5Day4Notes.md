

# Exception:
   - InvalidMethodException
       You're not allowed to extend classes that define Step Definitions or hooks

# Steps:
    - Create a BaseClass and declare the driver as static
         public static ChromeDriver driver;
    - Create 2 StepDefinitions as LoginSteps and CreateLeadSteps
    - These 2 StepDefintion should extend the BaseClass  

# Hooks:
   - Cucumber Annotations - Hooks - In Ruby Language     
    @Before
      - To run the common precondition before each scenario
    @After 
      - To run the common postConditio after each scenario


# Steps to implement Hooks:
   - Create a package called hooks and create a class called HooksImplementation
   - Create 2 methods preCondition() and postCondition() and annotate with @Before and @After 
   - The HooksImplementatio class should extends BaseClass
   - In the Runner class inside glue attribute mention hooks package as well
        glue ={"steps","hooks"}

