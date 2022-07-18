package com.suacelabs.automation;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/spec/features" }, 
plugin = { "pretty", "html:target/cucumber-report.html" },
// glue= {""},
tags = ("@achatProduct_ok"), snippets = CAMELCASE, monochrome = true)

public class TestRunner {

}

