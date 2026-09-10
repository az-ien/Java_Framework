package com.iengineering.ltppinfopave.pages;

import com.iengineering.helper.CommonMethods;
import com.iengineering.helper.GlobalWaitTime;
import com.iengineering.ltppinfopave.objects.OR_Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.apache.logging.log4j.Level.*;

public class Home {

  // Creating a logger
  private static Logger logger = LogManager.getLogger(Home.class);
  public WebDriver driver;
  OR_Home orHome = null;

  public Home(WebDriver driver) {
    this.driver = driver;
    this.orHome = PageFactory.initElements(this.driver, OR_Home.class);
  }

  public void MnuDataSelectionAndDownLoad() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuData, this.orHome.mnuDataSelectionAndDownload);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuSectionSummaryReport() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuData, this.orHome.mnuSectionSummaryReport);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuStateSummaryReport() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuData, this.orHome.mnuStateSummaryReport);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuAncillaryDataSelection() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuData, this.orHome.mnuAncillaryDataSelection);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuStandardDataRelease() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuData, this.orHome.mnuStandardDataRelease);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTableNavigator() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuData, this.orHome.mnuTableNavigator);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTableExport() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuData, this.orHome.mnuTableExport);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuSQLExport() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuData, this.orHome.mnuSQLExport);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuSampleQuery() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuData, this.orHome.mnuSampleQuery);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuDataFeedback() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuData, this.orHome.mnuDataFeedback);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPSectionMapping() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuVisualization, this.orHome.mnuVisualizationLTPPSectionMapping);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuSectionTimeline() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuVisualization, this.orHome.mnuVisualizationSectionTimeline);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuPavementCrossSectionViewer() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationPavementCrossSectionViewer);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuViewInspectionVideos() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationViewInspectionVideos);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTransverseProfileViewer() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationTransverseProfileViewer);
    logger.log(INFO, "Navigating to Data Selection and Download");
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuDistressMapsandImages() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationDistressMapsandImages);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuManualDistressSurveyViewer() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationManualDistressSurveyViewer);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuDataPivot() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuVisualization, this.orHome.mnuVisualizationDataPivot);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuVirtualSection() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuVisualization, this.orHome.mnuVisualizationVirtualSection);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuMultiFeatureVisualization() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuVisualization,
        this.orHome.mnuVisualizationMultiFeatureVisualization);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPDataAnalysisPlan() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisLTPPDataAnalysisPlan);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTrendAnalysis() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisTrendAnalysis);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuDataAvailabilityChart() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisDataAvailabilityChart);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuCorrelationAnalysis() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisCorrelationAnalysis);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuExploreGeospatialData() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisExploreGeospatialData);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuStudentDataAnalysisContest() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuAnalysis, this.orHome.mnuAnalysisStudentDataAnalysisContest);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPClimateTool() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolsLTPPClimateTool);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPBindOnline() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolsLTPPBindOnline);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuMERRAClimateDataforMEPDGInputs() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolsMERRAClimateDataforMEPDGInputs);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPJointedConcretePavementDataforMEPDGLocalCalibration() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuTools,
        this.orHome.mnuToolsLTPPJointeConcretePavementDataforMEPDGLocalCalibration);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuERDFileBuilder() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolsERDFileBuilder);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuAxleLoadDistributionFactors() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolsAxleLoadDistributionFactors);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuMore() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuTools, this.orHome.mnuToolsMore);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLess() {
    CommonMethods.ClickMenuItem(this.driver, this.orHome.mnuTools, this.orHome.mnuToolsLess);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPDynamicModulusPrediction() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolLTPPDynamicModulusPrediction);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuPavementPerformanceForecast() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolPavementPerformanceForecast);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuWIMCostAnalysis() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolWIMCostAnalysis);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuForwardCalculuatedStiffness() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolForwardCalculatedStiffness);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuAASHTO1998RigidPavementDesign() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolAASHTO1998RigidPavementDesign);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuDistressIdentificationManual() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuToolDistressIdentificationManual);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuPavementLoadingUserGuideLTPPPlug() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuPavementLoadingUserGuideLTPPPLUG);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPInfoPaveMobile() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuTools, this.orHome.mnuLTPPInfoPaveMobile);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLibraryWhatsNew() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryWhatsNew);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuReportsAndBrief() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryReportsAndBrief);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuProgramDocumentation() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryProgramDocumentation);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPLiteratureRefrences() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryLTPPLiteratureRefrences);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuNewsLetter() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryNewsLetter);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTerminology() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryTerminology);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void LibraryStudentDataAnalysisContest() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuLibrary, this.orHome.mnuLibraryStudentDataAnalysisContest);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuOperationsFieldOperations() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuOperations, this.orHome.mnuOperationsFieldOperations);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuMaterialsRefrenceLibrary() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuOperations, this.orHome.mnuOperationsMaterialsReferenceLibrary);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPDirectives() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuOperations, this.orHome.mnuOperationsLTPPDirectives);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuMnRoadData() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuNonLTPP, this.orHome.mnuNonLTPPMnRoadData);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuInterstatePavementConditionSamplingDataVisualization() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuNonLTPP,
        this.orHome.mnuNonLTPPInterstatePavementConditionSamplingDataVisualization);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuFHWAInfoMaterials() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuNonLTPP, this.orHome.mnuNonLTPPFHWAInfoMaterials);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuFHWAInfoTechnology() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuNonLTPP, this.orHome.mnuNonLTPPFHWAInfoTechnology);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuLTPPData() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuNonLTPP, this.orHome.mnuNonLTPPCLTPPData);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuTrackData() {
    CommonMethods.ClickMenuItem(
        this.driver, this.orHome.mnuNonLTPP, this.orHome.mnuNonLTPPWesTrackData);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void MnuRigidPavementPerformanceandRehabilitionData() {
    CommonMethods.ClickMenuItem(
        this.driver,
        this.orHome.mnuNonLTPP,
        this.orHome.mnuNonLTPPRigidPavementPerformanceandRehabilitationData);
    logger.log(INFO, "Navigating to " + this.driver.getTitle());
  }

  public void TogAdvance() {
    try {
      CommonMethods.ClickCheckBox(this.driver, orHome.togAdvance);
      new WebDriverWait(this.driver, GlobalWaitTime.getLongWaitTime())
          .until(
              webDriver ->
                  ((JavascriptExecutor) webDriver)
                      .executeScript("return document.readyState")
                      .equals("complete"));
      // System.out.println("Toggle Mode Switched");
      logger.log(INFO, "Toggle Mode Switched");
      //Thread.sleep(3000);
      CommonMethods.WaitForPageLoad(this.driver);
    } catch (Exception e) {
      // System.out.println("I was interrupted!");
      logger.log(TRACE, "I was interrupted!");
    }
  }

  public boolean isDataPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuData);
  }

  public boolean isVisualizationPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuVisualization);
  }

  public boolean isAnalysisPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuAnalysis);
  }

  public boolean isToolsPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuTools);
  }

  public boolean isLibraryPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuLibrary);
  }

  public boolean isOperationsPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuOperations);
  }

  public boolean isNonLTPPPresent() {
    return CommonMethods.isElementPresent(this.driver, this.orHome.mnuNonLTPP);
  }

  public String SDRLink() {
    String link = this.orHome.lnkSDRGuide.getAttribute("href");
    return CommonMethods.ReturnEndSubString(
        link, 19); // File naming convention is XXXX-XXX-NN-NNN.xxx (19 Char)
  }

  public void TypeSearch(String strSearch){
    CommonMethods.TypeInWebElement(this.driver,this.orHome.txtSearch,strSearch);
  }

  public void ClickSearch(){
    CommonMethods.ClickButton(this.driver,this.orHome.btnSearch);
  }

  public boolean isSearchResultFound(){
    try{
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.visibilityOf(this.orHome.msgSearchResult));
      return true;
    }catch(Exception e){
      return false;
    }
  }


}
