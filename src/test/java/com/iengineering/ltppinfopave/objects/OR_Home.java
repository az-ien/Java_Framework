package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Home {

//Hub Links
    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Data')]")
    public WebElement mnuData;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Visualization')]")
    public WebElement mnuVisualization;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Analysis')]")
    public WebElement mnuAnalysis;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Tools')]")
    public WebElement mnuTools;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Library')]")
    public WebElement mnuLibrary;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Operations')]")
    public WebElement mnuOperations;

    @FindBy (how = How.XPATH, using = "//li[@class='listItem']/a[contains(@title,'Non-LTPP')]")
    public WebElement mnuNonLTPP;

    // Data Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Data Selection and Download')]")
    public WebElement mnuDataSelectionAndDownload;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Section Summary Report')]")
    public WebElement mnuSectionSummaryReport;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'State/Province Summary Report')]")
    public WebElement mnuStateSummaryReport;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(@href,'/Data/AncillaryDataSelection')]")
    public WebElement mnuAncillaryDataSelection;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Standard Data Release')]")
    public WebElement mnuStandardDataRelease;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'LTPP Table Navigator')]")
    public WebElement mnuTableNavigator;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Table Export')]")
    public WebElement mnuTableExport;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'SQL Export')]")
    public WebElement mnuSQLExport;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Sample SQL Query')]")
    public WebElement mnuSampleQuery;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "///a[@class='sublink'][contains(text(),'Data Feedback')]")
    public WebElement mnuDataFeedback;

    // Visualization Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPP Section Mapping')]")
    public WebElement mnuVisualizationLTPPSectionMapping;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Section Timeline')]")
    public WebElement mnuVisualizationSectionTimeline;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Pavement Cross-Section Viewer')]")
    public WebElement mnuVisualizationPavementCrossSectionViewer;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Transverse Profile Viewer')]")
    public WebElement mnuVisualizationTransverseProfileViewer;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Distress Maps and Images')]")
    public WebElement mnuVisualizationDistressMapsandImages;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Data Pivot')]")
    public WebElement mnuVisualizationDataPivot;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Virtual Section')]")
    public WebElement mnuVisualizationVirtualSection;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Multi-Feature Visualization')]")
    public WebElement mnuVisualizationMultiFeatureVisualization;


    // Analysis Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPP Data Analysis Plan')]")
    public WebElement mnuAnalysisLTPPDataAnalysisPlan;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Trend Analysis')]")
    public WebElement mnuAnalysisTrendAnalysis;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Data Availability Chart')]")
    public WebElement mnuAnalysisDataAvailabilityChart;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Correlation Analysis')]")
    public WebElement mnuAnalysisCorrelationAnalysis;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Explore Geospatial Data')]")
    public WebElement mnuAnalysisExploreGeospatialData;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Student Data Analysis Contest')]")
    public WebElement mnuAnalysisStudentDataAnalysisContest;

    // Tools Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPP Climate Tool')]")
    public WebElement mnuToolsLTPPClimateTool;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPPBind Online')]")
    public WebElement mnuToolsLTPPBindOnline;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'MERRA Climate Data for MEPDG Inputs')]")
    public WebElement mnuToolsMERRAClimateDataforMEPDGInputs;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPP Jointed Concrete Pavement Data for MEPDG Local Calibration')]")
    public WebElement mnuToolsLTPPJointeConcretePavementDataforMEPDGLocalCalibration;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'ERD File Builder')]")
    public WebElement mnuToolsERDFileBuilder;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Axle Load Distribution Factors')]")
    public WebElement mnuToolsAxleLoadDistributionFactors;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "((//b[contains(text(),'More...')])[2]")
    public WebElement mnuToolsMore;


    @CacheLookup
    @FindBy (how = How.XPATH, using = "(//b[contains(text(),'Less...')])[2]")
    public WebElement mnuToolsLess;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'LTPP Dynamic Modulus Prediction')]")
    public WebElement mnuToolLTPPDynamicModulusPrediction;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Pavement Performance Forecast')]")
    public WebElement mnuToolPavementPerformanceForecast;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'WIM Cost Analysis')]")
    public WebElement mnuToolWIMCostAnalysis;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Forward Calculated Stiffness')]")
    public WebElement mnuToolForwardCalculatedStiffness;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'AASHTO 1998 Rigid Pavement Design')]")
    public WebElement mnuToolAASHTO1998RigidPavementDesign;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Distress Identification Manual')]")
    public WebElement mnuToolDistressIdentificationManual;

    // Library Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/Library/WhatsNew']")
    public WebElement mnuLibraryWhatsNew;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/Library/A10']")
    public WebElement mnuLibraryReportsAndBrief;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/Library/A20']")
    public WebElement mnuLibraryProgramDocumentation;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Analysis/LTPPLiteratureAnalysisData']")
    public WebElement mnuLibraryLTPPLiteratureRefrences;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/Library/Newsletters']")
    public WebElement mnuLibraryNewsLetter;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/Library/Terminology']")
    public WebElement mnuLibraryTerminology;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@href='/Reports/LtppDataContest']")
    public WebElement mnuLibraryStudentDataAnalysisContest;

    //Operation Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Field Operations')]")
    public WebElement mnuOperationsFieldOperations;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Materials Reference Library')]")
    public WebElement mnuOperationsMaterialsReferenceLibrary;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'LTPP Directives')]")
    public WebElement mnuOperationsLTPPDirectives;

    // Non-LTPP Menu Links
    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'MnROAD Data')]")
    public WebElement mnuNonLTPPMnRoadData;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Interstate Pavement Condition Sampling Data Visualization')]")
    public WebElement mnuNonLTPPInterstatePavementConditionSamplingDataVisualization;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'FHWA InfoMaterials')]")
    public WebElement mnuNonLTPPFHWAInfoMaterials;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'FHWA InfoTechnology')]")
    public WebElement mnuNonLTPPFHWAInfoTechnology;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'C-LTPP Data')]")
    public WebElement mnuNonLTPPCLTPPData;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'WesTrack Data')]")
    public WebElement mnuNonLTPPWesTrackData;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Rigid Pavement Performance and Rehabilitation Data')]")
    public WebElement mnuNonLTPPRigidPavementPerformanceandRehabilitationData;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'Manual Distress Survey Viewer')]")
    public WebElement mnuVisualizationManualDistressSurveyViewer;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[@class='sublink'][contains(text(),'View Inspection Videos')]")
    public WebElement mnuVisualizationViewInspectionVideos;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'LTPP InfoPave Mobile')]")
    public WebElement mnuLTPPInfoPaveMobile;

    @CacheLookup
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Pavement Loading User Guide (LTPP-PLUG)')]")
    public WebElement mnuPavementLoadingUserGuideLTPPPLUG;

    @CacheLookup
    @FindBy (how = How.CSS, using = ".sliders")
    public WebElement togAdvance;

    // Small Tiles
    @FindBy(how = How.ID, using="996")
    public WebElement tileLLTPPSectionMapping;

    @FindBy(how = How.ID, using="999")
    public WebElement tileLLTPPClimateTool;

    @FindBy(how = How.ID, using="1000")
    public WebElement tileLLTPPBindOnline;

    @FindBy(how = How.ID, using="1055")
    public WebElement tileSectionSummaryReport;

    @FindBy(how = How.ID, using="1001")
    public WebElement tileTrendAnalysis;

    @FindBy(how = How.ID, using="1196")
    public WebElement tileIntroductionVideo;

    //Midsize Tiles
    @FindBy(how = How.ID, using="1176")
    public WebElement tileInfoMaterial;

    @FindBy(how = How.ID, using="1237")
    public WebElement tileInfoTechnology;

    //Large Tiles
    @FindBy(how = How.ID, using="997")
    public WebElement tileSelectionandDownload;

    @FindBy(how = How.ID, using="995")
    public WebElement tileAboutLTPP;

    @FindBy(how = How.XPATH, using="//a[contains(text(),'LTPP IMS User Guide')]")
    public WebElement lnkSDRGuide;

    @FindBy(how = How.ID, using="txtSearch")
    public WebElement txtSearch;

    @FindBy(how = How.ID, using="btnSearch")
    public WebElement btnSearch;

    @FindBy(how = How.XPATH, using="//div[@id='noResultsDiv']")
    public WebElement msgSearchResult;
}
