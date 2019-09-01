package org.sorincos.bdd;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"org.sorincos.bdd.StepDefinition"})						
public class Runner 				
{		

}