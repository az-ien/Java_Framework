# Java Framework

A Maven-based Java testing framework with multiple test configuration profiles.

## Overview

This repository contains a Java-based automation framework configured with Maven for managing dependencies and building the project.

## Project Structure

- **pom.xml** - Maven project configuration with dependencies
- **src/** - Source code directory
- **.idea/** - IDE configuration (IntelliJ IDEA)
- **.gitignore** - Git ignore patterns

## Test Configurations

- **common.xml** - Common test configuration
- **testing.xml** - Testing-specific configuration  
- **infopaveBrokenlinks.xml** - Broken links testing configuration

## Technology Stack

- Java
- Maven
- TestNG (inferred from configuration files)

## Default Branch

`test_branch` - The primary development branch

## How a test actually runs

| Step | Class / method | Used when | What happens |
| --- | --- | --- | --- |
| 1. Suite | testing.xml or class run | Always | Picks the test class. Infopave tests ignore suite Environment / Browser / Project values and hardcode them in Java. |
| 2. Bootstrap | ApplicationSetup.NavigateApplication | Every Infopave test | WebDriverManager starts Chrome/Firefox/Edge/IE. Then calls XMLDataReader for the URL. |
| 3. URL data | XMLDataReader.ReturnXMLNode(env, url, testdata.xml, ltppinfopave) | Inside ApplicationSetup for every Infopave test | Classpath ltppinfopave/testdata.xml, then the env tag, then the url child. Folder and filename are lowercased. |
| 4. Extra XML | XMLDataReader.ReturnXMLNode(dev, guide, testdata.xml, ltppinfopave) | SDRGuideLinks only, from the test class itself | Expected SDR filename. Node guide is missing, so this returns null. |
| 5. Test constructs a page, not an OR | new Home(driver), new ClimateTool(driver), new StandardDataRelease(driver), new DataSelectionAndDownload(driver) | MenuTest, OpenSearch, ClimateToolLoaded, SDRGuideLinks | The test only holds a page object. It does not new OR_Home or any other OR class, and it does not call PageFactory itself. |
| 6. Page constructor binds the OR file | PageFactory.initElements(driver, OR_*.class) | Inside every page constructor from step 5 | Home stores orHome = initElements(OR_Home.class). ClimateTool stores orClimateTool. StandardDataRelease stores orStandardDataRelease. DataSelectionAndDownload stores orDataSelectionAndDownload. Every FindBy field on that OR class is now a live WebElement. |
| 7. Test calls a page method | home.MnuLTPPClimateTool(), home.TogAdvance(), home.TypeSearch(), standarddatarelease.ClickUserGuide(), dataselectionanddownload.ClickAbout() | Same tests as step 5 | The test names an action. It still does not mention OR field names. Example: ClimateToolLoaded calls home.MnuLTPPClimateTool(), not orHome.mnuToolsLTPPClimateTool. |
| 8. Page method reads OR fields and hands them to CommonMethods | Home / ClimateTool / StandardDataRelease / DataSelectionAndDownload | Every page action from step 7 | The page method is the only place that touches the OR instance. It passes those WebElements plus the driver into CommonMethods. Example: MnuLTPPClimateTool calls ClickMenuItem(driver, orHome.mnuTools, orHome.mnuToolsLTPPClimateTool). TypeSearch calls TypeInWebElement(driver, orHome.txtSearch, strSearch). ClickAbout calls ClickButton(driver, orDataSelectionAndDownload.btnAbout). |
| 9. CommonMethods performs the Selenium action | CommonMethods | Through those page methods | ClickMenuItem hovers the parent OR element, sleeps 1s, clicks the child. ClickButton / ClickLink / ClickCheckBox / TypeInWebElement / isElementPresent / ReturnTextOfElement wait, then act on the OR element they were given. ReturnEndSubString only trims a string (SDR filename). WaitForPageLoad / ClickAndWaitForJsLoad do not take an OR field. |
| 10. Waits inside CommonMethods (and a few page methods) | GlobalWaitTime | Whenever CommonMethods waits; also Home.TogAdvance (30s) and StandardDataRelease.SDRLink / Home.isSearchResultFound (5s) | getIntWaitTime is 5s (default click/type). getLongWaitTime is 30s (toggle + page load). The wait is on the same WebElement that came from the OR field in step 8. |
| 11. Assert / teardown | TestNG Assert + driver.quit | Asserts vary by test; quit is MenuTest, ClimateToolLoaded, SDRGuideLinks | Asserts use values returned by page methods (booleans, SDR suffix, section count), not OR fields. DataSelectionTest has no assert and no quit. OpenSearch asserts but quit is commented out. |
