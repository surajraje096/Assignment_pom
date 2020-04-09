package config;

import base.TestBase;

public class XPath extends TestBase {

	public static final String url = "https://www.google.com";
	public static final String browser = "chrome";

	// google search page
	
	public static final String searchbox = "//input[@class='gLFyf gsfi']";
	public static final String searchbtn = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]";
	public static final String searchluckybtn = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]";
	public static final String googleapp="//*[@id=\"gbwa\"]/div[1]/a";
	// google apps box
	public static final String Account = "//span[text()='Account']";
	public static final String Search = "//span[text()='Search']";
	public static final String Maps = "//span[text()='Maps']";
	public static final String YouTube = "//span[text()='YouTube']";
	public static final String Play = "//span[text()='Play']";
	public static final String News = "//span[text()='News']";
	public static final String Gmail = "//span[text()='Gmail']";
	public static final String Drive = "//span[text()='Drive']";
	public static final String Translate = "//span[text()='Translate']";
	public static final String Photos = "//span[text()='Photos']";

	// google apps tital
	public static final String TitalAccount = "//a[@id='sdgBod']";
	public static final String TitalSearch = "";
	public static final String TitalMaps = "//*[@id=\"omnibox\"]";

	public static final String TitalYouTube = "//*[@id=\"logo\"]//a";
	public static final String YouTubesearchbox = "//*[@id=\"search\"]//form";

	public static final String TitalPlay = "//*[@title=\"Google Play Logo\"]";
	public static final String Playsearch = "//*[@class=\"gbqfi gb_oc\"]";

	public static final String TitalNews = "//*[@id=\"sdgBod\"]";
	public static final String Newstopstoris = "//span[text()=\"Top stories\"]";

	public static final String CreatGmail = "//*[@class=\"h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary\"]";
	public static final String Gmaillogo = "//body//div[2]//div//div//div[2]//div//span[@class='h-c-header__product-logo-text']";

	public static final String TitalDrive = "//span[text()='Drive']";
	public static final String MeetDrive = "//*[@class=\"meet\"]";
	public static final String usingDrive = "//*[@data-g-label=\"Using Drive\"]";
	public static final String Drivelogo = "//*[@alt=\"Drive logo\" and@itemprop=\"image\"]";
	public static final String gotoDrive = "//*[@class=\"maia-button button-download mobile-is-hidden get-started go-to-drive\"]";

	public static final String Translatefun = "//span[text()='Translate']";

	public static final String TitalPhotos = "//*[@class=\"header__logo__image header__logo__image--static \"]";
	public static final String gotoPhotos = "//a[@id='js-hero-btn']";

	public static final String searchboxsearch = "//*[@class=\"vdLsw gsfi\"]";
	public static final String searchboxsearchbtn = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]";
	public static final String searchboxsearchlucky = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]";

	public static final String Mapsearchbox = "//*[@id=\"searchbox\"]";
	public static final String MAptool = "//*[@class=\"app-horizontal-widget-holder noprint\"]";

//assinment 4 singin Xpath

	public static final String Accountsingbtn = "//*[@class=\"gb_4 gb_5 gb_9d gb_Vc\"]";
	public static final String Searchsingbtn = "//*[@class=\"gb_de gb_1 gb_pb\"]";
	public static final String Mapssingbtn = "//*[@class=\"gb_de gb_1 gb_pb\"]";
	public static final String YouTubesingbtn = "//*[@id=\"text\" and@class=\"style-scope ytd-button-renderer style-suggestive size-small\"]";
	public static final String Playsingbtn = "//*[@id=\"gb_70\"]";
	public static final String Newssingbtn = "//*[@class=\"gb_1 gb_2 gb_de gb_pb\"]";
	public static final String Gmailsingbtn = "/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a";
	public static final String Drivesingbtn = "//*[@class=\"go-to-drive get-started\"]";
	public static final String Translatesingbtn = "//*[@class=\"gb_1 gb_2 gb_de gb_pb\"]";
	public static final String Photossingbtn = "//*[@id=\"js-hero-btn\"]";

//assinment 4 singinID or password

	public static final String Accountid = "//input[@id=\"identifierId\"]";
	public static final String Accountpassword = "//*[@type=\"password\"]";

	public static final String Mapsid = "//input[@id=\"identifierId\"]";
	public static final String Mappassword = "//*[@type=\"password\"]";

	public static final String YouTubeid = "//input[@id=\"identifierId\"]";
	public static final String YouTubepassword = "//*[@type=\"password\"]";

	public static final String Playid = "//input[@id=\"identifierId\"]";
	public static final String Playpassword = "//*[@type=\"password\"]";

	public static final String Newsid = "//input[@id=\"identifierId\"]";
	public static final String Newspassword = "//*[@type=\"password\"]";

	public static final String Gmailid = "//input[@type=\"email\"]";
	public static final String Gmailpassword = "//*[@type=\"password\"]";

	public static final String Driveid = "//input[@id=\"identifierId\"]";
	public static final String Drivepassword = "//*[@type=\"password\"]";

	public static final String Translateid = "//input[@id=\"identifierId\"]";
	public static final String Translatepassword = "//*[@type=\"password\"]";

	public static final String Photosid = "//input[@id=\"identifierId\"]";
	public static final String Photospassword = "//*[@type=\"password\"]";

	public static final String searchid = "//input[@id=\"identifierId\"]";
	public static final String searchpassword = "//*[@type=\"password\"]";

	// hindi langvege xpath
	public static final String hindilanguage = "//div[@id=\"SIvCob\"]//a";

	public static final String hindigooglesearch = "Google सर्च";
	public static final String hindigooglesearchxpath = "//input[@class=\"gNO89b\" and @value=\"'Google सर्च'\" and @name=\"btnK\"]";

	public static final String hindi = "//*[@id=\\\"SIvCob\\\"]/a[1]";
	// ---------------------------------------------------------------------------------------------
	// amitab bachhan name xpath
	// assin 7//
	public static final String google = "Amitabh Bachchan";
	public static final String searchbox1 = "//input[@class='gLFyf gsfi']";;
	public static final String nameXpath = "//*[@id=\"rso\"]/div[3]/div/div[1]/div/div/div[1]/a/h3";
	// ---------------------------------------------------------------------
	public static final String googleproducturl = "https://about.google/intl/en/products/";
	public static final String googlewebsearch = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Search\"]";
	public static final String googlewebchrome = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Translate\"]";
	public static final String googlewebtoolbar = "";
	public static final String googlewebBookmarks = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Bookmarks\"]";
	public static final String googlemobile = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Mobile\"]";
	public static final String googlemapsformobile = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Maps for mobile\"]";
	public static final String googlesearchformobile = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Search for mobile\"]";
	public static final String googleadwords = "";
	public static final String googleappsforworks = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Apps for works\"]";
	public static final String googlemybusiness = "";
	public static final String googleadsense = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"AdSense\"]";
	public static final String googleadmob = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"AdMob\"]";
	public static final String googleyoutube = "//h3[@class=\"row-title-watch-and-play products-grid-item-title\" and text()=\"YouTube\"]";
	public static final String googlebooks = "//h3[@class=\"row-title-use-anywhere products-grid-item-title\" and text()=\"Chromebook\"]";
	public static final String googleimagesearch = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"imagesearch\"]";
	public static final String googlenews = "//p[text()=\"News\"]";
	public static final String googlevideosearch = "//p[text()=\"VideoSearch\"]";
	public static final String googlepicasa = "//p[text()=\"Picasa\"]";
	public static final String googlemaps = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Maps\"]";
	public static final String googleearth = "//p[text()=\"Earth\"]";
	public static final String googlepanoramio = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"Panoamio\"]";
	public static final String googlecustomesearch = "";
	public static final String googlescholar = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"scholar\"]";
	public static final String googletrends = "//p[text()=\"Trends\"]";
	public static final String googlegmail = "//h3[@class=\"row-title-talk-and-text products-grid-item-title\" and text()=\"Gmail\"]";
	public static final String googledrive = "//h3[@class=\"row-title-work-smarter products-grid-item-title\" and text()=\"Drive\"]";
	public static final String googledocs = "";
	public static final String googlesheets = "//h3[@class=\"row-title-work-smarter products-grid-item-title\" and text()=\"Sheets\"]";
	public static final String googleslides = "";
	public static final String googleforms = "//p[text()=\"Forms\"]";
	public static final String googledrawings = "";
	public static final String googlesales = "//p[text()=\"Sales\"]";
	public static final String googlecalendar = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"Calendar\"]";
	public static final String googletranslate = "//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Translate\"]";
	public static final String googlecloudprint = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"CloudPrint\"]";
	public static final String googlekeeps = "//h3[@class=\"row-title-stay-organized products-grid-item-title\" and text()=\"Keep\"]";
	public static final String googlestore = "//p[text()=\"Google Play\"]";
	public static final String googleplus1 = "";
	public static final String googleblogger = "//p[text()=\"Blogger\"]";
	public static final String googlehangouts = "//p[text()=\"Hangouts\"]";
	public static final String googlecode = "";
//gmail verificaton page	
	public static final String gmailcompose="//*[@class=\"T-I J-J5-Ji T-I-KE L3\"]";
	public static final String gmailinbox="//*[@id=\":3s\"]/div/div[2]";
	public static final String gmailstarred="//*[@id=\":3t\"]/div/div[2]/span/a";
	public static final String gmailsent="//*[@id=\":3x\"]/div/div[2]";
	public static final String to="surajraje096@gmail.com";
	public static final String subject="Google assignment";
//gmail search email
	public static final String searchemail="kvineet881@gmail.com";
	
	public static final String googlelogo="//*[@alt=\"Google\"]";
	
	
	
	
	
	

}
