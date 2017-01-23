package com.wordpress.mnsalim.foodgrabber.Utils;

public interface Constants 
{
	//Id for google analytics
	static final String GOOGLE_ANALYTICS_ID = "UA-49753947-1";
//	static final String GOOGLE_ANALYTICS_ID = "UA-49771426-1"; //test account
	
	//AssetTime stamp used to check for new asset. Please Update this when asset data changed
	static final String ASSET_TIME = "2014-03-31 08:50:25.000000";
	
	
	//PushWosh id  & google api key
    static final String APP_ID = "0E858-D8786";
    static final String SENDER_ID = "1081645079315";
    
    
	//preferance file name
	public static final String PREF_FILE_NAME = "opticalDbPrefFile";
	public static final String PREF_KEY_EVER_UPDATED = "isDataEverDownloaded";
	public static final String PREF_KEY_UPDATE_TIME_STAMP = "upadatedTimeStamp";
	public static final String PREF_KEY_IS_FIRST_LAUNCHED = "isFirstLaunched";
	
	
	//API & FILE LINK
	//test server links
//	public static final String BASE_FILE_URL = "http://algonyx.com/opticalglass/files/";
//	public static final String BASE_API_URL = "http://algonyx.com/opticalglass/api/";
	
	//Live server links
	public static final String BASE_FILE_URL = "http://ohara-app.sakura.ne.jp/files/";
	public static final String BASE_API_URL =  "http://ohara-app.sakura.ne.jp/api/";
	
	public static final String CHECK_UPDATE_API_URL = "checkupdate.php";
	public static final String PARAM_LAST_UPDATED = "lastupdated";
	
	
	//json keyword for url
	public static final String GLASS_DATA_CSV_URL = "data_csv_url";
	public static final String OTHER_MAKER_CSV_URL = "other_maker_csv_url";
	public static final String MANUFACTURE_CSV_URL = "manufacture_csv_url";
	
	public static final String GLASS_PDF_ZIP_URL = "glass_pdf_zip_url";
	public static final String MAP_PDF_ZIP_URL = "map_pdf_zip_url";
	
	public static final String HASE_UPADATE_GLASS_DATA_CSV = "data_csv_hasupdate";
	public static final String HASE_UPADATE_OTHER_MAKER_CSV = "other_maker_csv_hasupdate";
	public static final String HASE_UPADATE_MANUFACTURE_CSV = "manufacture_csv_hasupdate";
	
	public static final String HASE_UPADATE_GLASS_PDF_ZIP = "glass_pdf_zip_hasupdate";
	public static final String HASE_UPADATE_MAP_PDF_ZIP = "map_pdf_zip_hasupdate";
	
	public static final String UPDATED_TIME_STAMP = "timestamp";
	public static final String UPDATED_VERSION = "timestamp";
	public static final String UPDATED_STATUS = "status";
	
	//file & folder name for resources
	public static final String DOWNLOAD_FILE_NAME = "fileName";
	public static final String DOWNLOAD_FILE_URL = "fileUrl";
	
	public static final String GLASS_DATA_CSV_DESTINATION_FILE = "optical_glass_data.csv";
	public static final String OTHER_MAKER_CSV_DESTINATION_FILE = "other_makers_data.csv";
	public static final String MANUFACTURE_CSV_DESTINATION_FILE = "can_manufacture_data.csv";
	
	public static final String GLASS_PDF_ZIP_DESTINATION_FILE = "optical_glass_pdf.zip";
	public static final String MAP_PDF_ZIP_DESTINATION_FILE = "map_pdf.zip";
	
	public static final String GLASS_PDF_DIRECTORY = "GLASS_PDF";
	public static final String MAP_PDF_DIRECTORY = "MAP_PDF";
	
	
	// other maker csv data index
	public static final int OtherMakerSerialNumberIndex = 0;

	public static final int OHARA_GlassTypeIndex = 1;
	public static final int OHARA_MakerIndex = 2;
	public static final int OHARA_ndIndex = 3;
	public static final int OHARA_vdIndex = 4;
	public static final int OHARA_egfIndex = 5;
	public static final int OHARA_eegfIndex = 6;

	public static final int SCHOTT_GlassTypeIndex = 7;
	public static final int SCHOTT_MakerIndex = 8;
	public static final int SCHOTT_ndIndex = 9;
	public static final int SCHOTT_vdIndex = 10;
	public static final int SCHOTT_egfIndex = 11;
	public static final int SCHOTT_eegfIndex = 12;

	public static final int HOYA_GlassTypeIndex = 13;
	public static final int HOYA_MakerIndex = 14;
	public static final int HOYA_ndIndex = 15;
	public static final int HOYA_vdIndex = 16;
	public static final int HOYA_egfIndex = 17;
	public static final int HOYA_eegfIndex = 18;

	public static final int HIKARI_GlassTypeIndex = 19;
	public static final int HIKARI_MakerIndex = 20;
	public static final int HIKARI_ndIndex  = 21;
	public static final int HIKARI_vdIndex = 22;
	public static final int HIKARI_egfIndex = 23;
	public static final int HIKARI_eegfIndex = 24;

	public static final int SUMITA_GlassTypeIndex = 25;
	public static final int SUMITA_MakerIndex = 26;
	public static final int SUMITA_ndIndex = 27;
	public static final int SUMITA_vdIndex = 28;
	public static final int SUMITA_egfIndex = 29;
	public static final int SUMITA_eegfIndex = 30;

	// can manufactire csv data index
	public static final int ManufactireSerialNumberIndex = 0;
	public static final int ManufactireGlassCategoryIndex = 1;
	public static final int ManufactireGlassTypeIndex = 2;
	public static final int ManufactireMaxWidthIndex = 3;
	public static final int ManufactireMinWidthIndex = 4;
	public static final int ManufactireMaxThicknessIndex = 5;
	public static final int ManufactireMinThicknessIndex = 6;
	
	//For the glass_data.csv file, here are index for necessary columns
	public static final int Product_pdfNameIndex = 180;
	public static final int Product_serialNumberIndex = 0;
	public static final int Product_newItemIndex = 1;
	public static final int Product_glassCategoryIndex = 2;
	public static final int Product_glassTypeIndex = 3;
	public static final int Product_ndIndex = 18;
	public static final int Product_neIndex = 19;
	public static final int Product_neu_d_Index = 26;
	public static final int Product_neu_e_Index = 27;
	public static final int Product_nF_nCIndex = 31;
	public static final int Product_nFF_nCCIndex = 32;
	public static final int Product_sigma_g_f_Index = 50;
	public static final int Product_delta_sigma_g_f_Index = 60;
	public static final int Product_lambda_80_Index = 74;
	public static final int Product_lambda_70_Index = 75;
	public static final int Product_lambda_5_Index = 76;
	public static final int Product_D_40_60_Index = 131;
	public static final int Product_Transition_point_Tg_C_Index = 159;
	public static final int Product_Yield_point_At_C_Index = 160;
	public static final int Product_Knoop_Hk_Index = 168;
	public static final int Product_Water_resistant_RW_P_Index = 172;
	public static final int Product_Acid_RA_P_Index = 173;
	public static final int Product_Taiko_W_S_max_Index = 174;
	public static final int Product_acid_SR_Index = 176;
	public static final int Product_detergent_Versus_pr_Index = 177;
	public static final int Product_d_Index = 179;
	public static final int Product_alpha_m30_p70_Index = 162;
	public static final int Product_alpha_100_300_Index = 163;
	public static final int Product_wear_degree_Aa_Index = 170;
	
	
	//DataBase Constants
	public static final String DB_NAME = "opticalGlassDb";
	public static final int DATABASE_VERSION = 1;
	
	//---Optical Glass Data Table COnstants
	public static final String TABLE_OPTICAL_GLASS_DATA = "opticalGlassDataTable";

	public static final String KEY_OD_PDF_NAME = "pdfFileName";
	public static final String KEY_OD_SERIAL_NUMBER = "serialNumber";
	public static final String KEY_OD_ACID_RA_P = "acid_RA_P";
	public static final String KEY_OD_ACID_SR = "acid_SR";
	public static final String KEY_OD_ALPHA_100_300 = "alpha_100_300";
	public static final String KEY_OD_ALPHA_M_30_P70 = "alpha_m30_p70";
	public static final String KEY_OD_D = "d";
	public static final String KEY_OD_D_40_60 = "d_40_60";
	public static final String KEY_OD_DELTA_SIGMA_G_F = "delta_theta_g_f";
	public static final String KEY_OD_DETERGENT_VERSUS_PR = "detergentVersus_pr";
	public static final String KEY_OD_FAVORITE = "favorite";
	public static final String KEY_OD_GLASS_CATAGORY = "glassCategory";
	public static final String KEY_OD_GLASS_TYPE = "glassType";
	public static final String KEY_OD_KNOOP_HK = "knoopHk";
	public static final String KEY_OD_LAMBDA_5 = "lambda_5";
	public static final String KEY_OD_LAMBDA_70 = "lambda_70";
	public static final String KEY_OD_LAMBDA_80 = "lambda_80";
	public static final String KEY_OD_MAX_THICKNESS = "maxThickness";
	public static final String KEY_OD_MAX_WIDTH = "maxWidth";
	public static final String KEY_OD_MIN_THICKNESS = "minThickness";
	public static final String KEY_OD_MIN_WIDTH = "minWidth";
	public static final String KEY_OD_ND = "nd";
	public static final String KEY_OD_NE = "ne";
	public static final String KEY_OD_NEU_D = "neu_d";
	public static final String KEY_OD_NEU_E = "neu_e";
	public static final String KEY_OD_NEW_ITEM = "newItem";
	public static final String KEY_OD_nF_nC = "nF_nC";
	public static final String KEY_OD_nFF_nCC = "nFF_nCC";
	public static final String KEY_OD_SIGMA_G_F = "theta_g_f";
	public static final String KEY_OD_TAIKO_WS_MAX = "taiko_WS_max";
	public static final String KEY_OD_TRANSITION_POINT_TGC = "transitionPoint_TgC";
	public static final String KEY_OD_WATER_RESISTANT_RWP = "waterResistant_RWP";
	public static final String KEY_OD_WRAR_DEGREE_Aa = "wearDegree_Aa";
	public static final String KEY_OD_YIELD_POINT_ATC = "yieldPoint_AtC";
	
	public static final String KEY_OD_SIMILAR_PRODUCTS = "similarProducts";

	//---Other Product Table Constants
	public static final String TABLE_OTHER_PRODUCT = "otherProductTable";
	
	public static final String KEY_OP_EEGF = "eegf";
	public static final String KEY_OP_EGF = "egf";
	public static final String KEY_OP_GLASS_TYPE = "glassType";
	public static final String KEY_OP_MAKER = "maker";
	public static final String KEY_OP_ND = "nd";
	public static final String KEY_OP_SIMILAR_TO = "similarTo";
	public static final String KEY_OP_VD = "vd";
	
	
	//---Favorite Map Search Table Constants
	public static final String TABLE_FAVORITE_MAP_SEARCH = "favoriteMapSearchTable";
	
	public static final String KEY_FMAP_ABBE = "abbe";
	public static final String KEY_FMAP_COMMENT = "comment";
	public static final String KEY_FMAP_REFRACTIVE = "refractive";
	public static final String KEY_FMAP_TIME_STAMP = "timestamp";
	public static final String KEY_FMAP_TITLE = "title";
	
	//---Favorite Manufacture Search Table Constants
	public static final String TABLE_FAVORITE_MANUFACTURE_SEARCH = "favoriteManufactureSearchTable";
	
	public static final String KEY_FMAN_GLASS_THICKNESS = "glassThickness";
	public static final String KEY_FMAN_GLASS_TYPE = "glassType";
	public static final String KEY_FMAN_GLASS_WIDTH = "glassWidth";
	public static final String KEY_FMAN_TIME_STAMP = "timestamp";
	
	//---Favorite OtherMaker Search Table Constants
	public static final String TABLE_FAVORITE_OTHER_MAKER_SEARCH = "favoriteOtherMakerSearchTable";
	
	public static final String KEY_FOM_COMPANY_NAME = "companyName";
	public static final String KEY_FOM_GLASS_TYPE = "glassType";
	public static final String KEY_FOM_TIME_STAMP = "timestamp";
	
	//---Favorite Data Search Table Constants
	public static final String TABLE_FAVORITE_DATA_SEARCH = "favoriteDataSearchTable";
	
	public static final String KEY_FDS_CONDITION_NAME_1 = "condition1name";
	public static final String KEY_FDS_CONDITION_NAME_2 = "condition2name";
	public static final String KEY_FDS_CONDITION_NAME_3 = "condition3name";
	public static final String KEY_FDS_CONDITION_NAME_4 = "condition4name";
	public static final String KEY_FDS_CONDITION_NAME_5 = "condition5name";
	
	public static final String KEY_FDS_CONDITION_1 = "condition1";
	public static final String KEY_FDS_CONDITION_2 = "condition2";
	public static final String KEY_FDS_CONDITION_3 = "condition3";
	public static final String KEY_FDS_CONDITION_4 = "condition4";
	public static final String KEY_FDS_CONDITION_5 = "condition5";
	
	public static final String KEY_FDS_LOWER_LIMIT_1 = "lowerLimit1";
	public static final String KEY_FDS_LOWER_LIMIT_2 = "lowerLimit2";
	public static final String KEY_FDS_LOWER_LIMIT_3 = "lowerLimit3";
	public static final String KEY_FDS_LOWER_LIMIT_4 = "lowerLimit4";
	public static final String KEY_FDS_LOWER_LIMIT_5 = "lowerLimit5";
	
	public static final String KEY_FDS_TIME_STAMP = "timestamp";
	
	public static final String KEY_FDS_UPPER_LIMIT_1 = "upperLimit1";
	public static final String KEY_FDS_UPPER_LIMIT_2 = "upperLimit2";
	public static final String KEY_FDS_UPPER_LIMIT_3 = "upperLimit3";
	public static final String KEY_FDS_UPPER_LIMIT_4 = "upperLimit4";
	public static final String KEY_FDS_UPPER_LIMIT_5 = "upperLimit5";
	
	public static final String KEY_FDS_CATAGORY = "dataSearchCatagory";
	public static final String KEY_FDS_IS_ONLY_NEW_ITEM = "isOnlyNewItem";
	
	
	
	//Constant key to pass data between fragment
	public static final String PASS_KEY_IS_FROM_FAVORITE = "isFromFavorite";
	
	//dataSearch - use dataBase constant to pass value
	public static final String PASS_KEY_DATA_SEARCH_NEW_ITEM_SEARCH = "isOnlyNewItemSearch";
	public static final String PASS_KEY_DATA_SEARCH_CONDITION_1 = "condition1DataSearch";
	public static final String PASS_KEY_DATA_SEARCH_CONDITION_2 = "condition2DataSearch";
	public static final String PASS_KEY_DATA_SEARCH_CONDITION_3 = "condition3DataSearch";
	public static final String PASS_KEY_DATA_SEARCH_CONDITION_4 = "condition4DataSearch";
	public static final String PASS_KEY_DATA_SEARCH_CONDITION_5 = "condition5DataSearch";
	
	//can manufacture
	public static final String PASS_KEY_CAN_MANUFACTURE_GLASS_TYPE = "manuGlassType";
	public static final String PASS_KEY_CAN_MANUFACTURE_INPUT_WIDTH = "manuInputWidth";
	public static final String PASS_KEY_CAN_MANUFACTURE_INPUT_THICKNESS = "manuInputThickness";
	
	//other maker
	public static final String PASS_KEY_OTHER_MAKER_GLASS_TYPE = "otherMakerGlassType";
	public static final String PASS_KEY_OTHER_MAKER_COMPANY_NAME = "otherMakerCompany";
	
	//map search
	public static final String PASS_KEY_MAP_SEARCH_ITEM_NAME = "mapSearchItemName";
	public static final String PASS_KEY_MAP_SEARCH_ITEM_PDF_NAME = "mapSearchItemPdfName";
	public static final String PASS_KEY_MAP_SEARCH_GLASS_TYP = "glassTyepOfPdf";
	
	//glass type to pdfView
	public static final String PASS_KEY_GLASS_TYPE_TO_PDF = "glassTypeToPdf";
}
