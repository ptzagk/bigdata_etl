/**
 *
 * Avro schema definition 
 *
 */


package etl_spark;

public class SchemaDef{

    public static final String AVRO_SCHEMA_P =
        "{"
        + "\"type\":\"record\","
        + "\"name\":\"P\","
        + "\"fields\":["
        + "  { \"name\":\"WORKFLOW_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"RECORD_TYPE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"DATA_SPECIFICATION_VERSION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CLIENT_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM_D1\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM_D2\", \"type\":\"string\" },"
        + "  { \"name\":\"GMT_OFFSET\", \"type\":\"string\" },"
        + "  { \"name\":\"CUSTOMER_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"ACCOUNT_REFERENCE_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"EXTERNAL_TRANSACTION_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"BUSINESS_TYPE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"VIP_XFLG\", \"type\":\"string\" },"
        + "  { \"name\":\"RELATION_START_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"ACCOUNTS_CNT\", \"type\":\"string\" },"
        + "  { \"name\":\"BUSINESS_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESSSEE\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"CITY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_REGION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"POSTAL_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESSEE2\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"CITY2_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_REGION2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"POSTAL2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_ADDRESSEE\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_CITY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_COUNTRY_REGN_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_POSTAL_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"HEADQUARTERS_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_COMPANY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_COMPANY_ADDRESSEE\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_CO_ADDRESS_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_CO_ADDRESS_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_CO_ADDRESS_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_CO_ADDRESS_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_COMPANY_CITY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_CO_COUNTRY_RGN_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_COMPANY_POSTAL_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PARENT_COMPANY_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_TITLE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_PREFERRED_LANGUAGE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_ALTERNATE_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_1_EMAIL_ADDRESS\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_TITLE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_PREFERRED_LANGUAGE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_ALTERNATE_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_2_EMAIL_ADDRESS\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_TITLE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_PREFERRED_LANGUAGE\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_ALTERNATE_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CONTACT_3_EMAIL_ADDRESS\", \"type\":\"string\" },"
        + "  { \"name\":\"RELATIONSHIP_CONTACT_1_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_1_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_1_ALTRNT_PHN_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_1_CONTACT_EMAIL\", \"type\":\"string\" },"
        + "  { \"name\":\"RELATIONSHIP_CONTACT_2_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_2_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_2_ALTRNT_PHN_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"RELSHP_CNTCT_2_CONTACT_EMAIL\", \"type\":\"string\" },"
        + "  { \"name\":\"NATIONAL_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"NATIONAL_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"BUSINESS_REGISTRATION_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"TAX_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"TAX_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCORE\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCORE_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCORE_SOURCE\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCR_REQUEST_REASON_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_RATING\", \"type\":\"string\" },"
        + "  { \"name\":\"EMPLOYEES_CNT\", \"type\":\"string\" },"
        + "  { \"name\":\"ANNUAL_REVENUE\", \"type\":\"string\" },"
        + "  { \"name\":\"CURRENCY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"TRAN_ISO_CURRENCY_CNVRSN_RATIO\", \"type\":\"string\" },"
        + "  { \"name\":\"INDUSTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"SALES_MARKET_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PEFP_INDICATOR_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"OFAC_INDICATOR_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"BEHAVIOR_1_SCR\", \"type\":\"string\" },"
        + "  { \"name\":\"BEHAVIOR_2_SCR\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT1_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT2_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT3_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT4_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_1_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_3_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_4_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_5_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER1_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER3_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER4_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER5_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_5_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_6_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_7_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_8_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_9_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_10_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_11_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_12_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_13_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_14_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_15_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"RESERVED_01 \", \"type\":\"string\" }"
        + "]}";

    public static final String AVRO_SCHEMA_C =
        "{"
        + "\"type\":\"record\","
        + "\"name\":\"C\","
        + "\"fields\":["
        + "  { \"name\":\"WORKFLOW_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"RECORD_TYPE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"DATA_SPECIFICATION_VERSION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CLIENT_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM_D1\", \"type\":\"string\" },"
        + "  { \"name\":\"RCD_CRT_DTTM_D2\", \"type\":\"string\" },"
        + "  { \"name\":\"GMT_OFFSET\", \"type\":\"string\" },"
        + "  { \"name\":\"CUSTOMER_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"ACCOUNT_REFERENCE_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"EXTERNAL_TRANSACTION_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"CUSTOMER_TYPE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"VIP_XFLG\", \"type\":\"string\" },"
        + "  { \"name\":\"RELATION_START_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"ACCOUNTS_CNT\", \"type\":\"string\" },"
        + "  { \"name\":\"FIRST_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"MIDDLE_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"LAST_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"PREFIX_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"SUFFIX_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"PREFERRED_GREETING\", \"type\":\"string\" },"
        + "  { \"name\":\"PREFERRED_LANGUAGE\", \"type\":\"string\" },"
        + "  { \"name\":\"MOTHERS_MAIDEN_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"HOUSEHOLD_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"CITY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_REGION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"POSTAL_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"RESIDENCE_STATUS_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS_EFFECTIVE_FROM_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_TYPE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"ADDRESS2_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"CITY2_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY_REGION2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"POSTAL2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"COUNTRY2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"BUSINESS_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_ADDRESS_LINE_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_ADDRESS_LINE_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_ADDRESS_LINE_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_ADDRESS_LINE_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_CITY_NAME\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_COUNTRY_REGION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_POSTAL_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"EMPLOYMENT_STATUS_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"EMPLOYMENT_STATUS_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"EMPLOYER_MERCHANT_CAT_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"OCCUPATION_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"INCOME_AMT\", \"type\":\"string\" },"
        + "  { \"name\":\"CURRENCY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"TRAN_ISO_CURRENCY_CNVRSN_RATIO\", \"type\":\"string\" },"
        + "  { \"name\":\"HOME_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"PHONE2_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"WORK_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"CELL_PHONE_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"PREFERRED_PHONE_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"EMAIL_ADDRESS\", \"type\":\"string\" },"
        + "  { \"name\":\"EDUCATIONAL_STATUS_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CUSTOMER_BIRTH_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"BIRTH_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CITIZENSHIP_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"NATIONAL_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"NATIONAL_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PASSPORT_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"PASSPORT_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PASSPORT_EXPIRATION_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"DRIVERS_LICENSE_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"DRIVER_LICENSE_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"TAX_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"TAX_COUNTRY_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CUSTOMER_GENDER_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"PERSON_MARITAL_STATUS_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"DEPENDENTS_CNT\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCR\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCORE_DT\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCORE_SOURCE\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_SCR_REQUEST_REASON_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"CREDIT_RATING\", \"type\":\"string\" },"
        + "  { \"name\":\"EXPOSED_FOREGIN_PERSON_XFLG\", \"type\":\"string\" },"
        + "  { \"name\":\"FOREIGN_ASSETS_CONTROL_XFLG\", \"type\":\"string\" },"
        + "  { \"name\":\"BEHAVIOR_1_SCR\", \"type\":\"string\" },"
        + "  { \"name\":\"BEHAVIOR_2_SCR\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT1_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT2_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT3_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"SEGMENT4_XID\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_1_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_3_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_4_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_INDICATOR_5_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER1_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER2_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER3_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER4_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER5_XCD\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_1_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_2_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_3_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_4_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_5_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_6_NUM\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_7_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_8_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_9_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_10_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_11_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_12_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_13_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_14_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"USER_DATA_15_STRG\", \"type\":\"string\" },"
        + "  { \"name\":\"RESERVED_01 \", \"type\":\"string\" }"
        + "]}";

    public static final String AVRO_SCHEMA_logaction =
            "{"
            + "\"type\":\"record\","
            + "\"name\":\"logaction\","
            + "\"fields\":["
            + "  { \"name\":\"logaction_TILINUMERO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_PERIOD\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_ASIAKASTUNNUS\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_TILIN_NIMI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_TILIN_VALUUTTA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILITYYPPI_AVISTATILI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_LKP_TILINUMERO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_LKP_TILIN_LASKENTAPAIKKA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIN_TULOSTE_JAKO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_TILIVASTUUKONTTORI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_TILIN_KIELI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OSNRO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_ASIAKKAAN_KOHDERYHMA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_ASIAKKAAN_KOHDERYHMA_TARKENNE\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIN_KAYTTO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIN_AVAUSPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIN_LOPETUSPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_LIMIITTI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_LIMIITIN_KAYTTOASTE\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_DAYLIGHT_LIMIITTI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_SALDOKOODI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIN_KAYTTOTAPA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KONSERNITILIPALVELU_TILINRO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_CBS_MCCF_CODE_0KP\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_ERIKOISTIETO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILINHOITOMAKSUNKIRJAUS\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TULOSTEEN_TUNNUS\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KAUSITILIOTTEEN_TULOSTUSPAIVA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TAPAHTUMIEN_TULOSTUSJARJESTYS\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TILIOTTEEN_MUOTO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TULOSTEEN_OSOITENUMERO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_POSTITUSTAPA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TULOSTEKOPION_KIELI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TULOSTEKOPION_OSOITENUMERO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KUUKAUDEN_ALKUSALDO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KUUKAUDEN_ALKUSALDON_PVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_SALDO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_SALDON_PVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_ENSIM_YLITYSPAIVA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_YLITYSILMOITUS_TILA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KESKIMAARAINEN_TALLETSALDO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KESKIMAARAINEN_LUOTTOSALDO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TALLETUSKORON_LASKENTATAPA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_LUOTTOKORON_LASKENTATAPA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KAYT_TALLETUSKORKOPROSENTTI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KAYT_LUOTTOKORKOPROSENTTI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KOSKEMISPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_PANOJEN_SUMMA_KK\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_PANOT_VIIMEISIN_KK_KPL\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_OTTOJEN_SUMMA_KK\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_OTOT_VIIMEISIN_KK_KPL\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_OTOT_KULUVA_VUOSI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_OTOT_KULUVA_VUOSI_KPL\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_PANOT_KULUVA_VUOSI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_PANOT_KULUVA_VUOSI_KPL\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_PERUSTIEDON_MUUTOSPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_ASIAKKAAN_HLOTUN_VALIMERKKI\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_ASIAKKAAN_SEKTORI_2012\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_ERAPAIVA\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_KORON_ERAPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TALLETUKSEN_EDERAPVM\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_INVESTMENT_DEPOSIT_PART_NO\", \"type\":\"string\" },"
            + "  { \"name\":\"logaction_OL_TOIMEKSIANTOTUNNUS\", \"type\":\"string\" }"
            + "]}";


    public static final String AVRO_SCHEMA_loguser =
            "{"
            + "\"type\":\"record\","
            + "\"name\":\"loguser\","
            + "\"fields\":["
            + "  { \"name\":\"loguser_CUSTOMER_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ORGUNIT_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ORGUNIT_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_ORGUNIT_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DOMAIN_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SOURCE_REF_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SOURCE_UNIQUE_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PERSON_TITLE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_FIRST_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MIDDLE_NAMES\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_LAST_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SUFFIX\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPANY_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPANY_FORM\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_REGISTERED_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INCORPORATION_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INCORPORATION_COUNTRY_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_TYPE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_SEGMENT_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_SEGMENT_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INITIALS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DATE_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NAME_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ADDRESS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SECONDARY_COUNTRIES_OF_RESIDENCE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ZONE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_POSTAL_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_RESIDENCE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_ORIGIN\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_TAXATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_REGISTRATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_DOMICILE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_EXPECTED_TRANSACTIONS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_CITIZENSHIP\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NATIONALITY_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PLACE_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_GENDER_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PRIME_BRANCH_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RELATIONSHIP_MGR_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYEE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYEE_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MARITAL_STATUS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_OCCUPATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYMENT_STATUS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ACQUISITION_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CANCELLED_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_TYPE_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_STATUS_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_3\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RESIDENCE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SPECIAL_ATTENTION_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DECEASED_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DORMANT_OVERRIDE_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_LAST_UPDATED_TIMESTAMP\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RISK_SCORE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BANKRUPT_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPENSATION_REQD_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_COMPLAINT_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_END_RELATIONSHIP_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MERCHANT_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_FACE_TO_FACE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CHANNEL\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_AGE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NEAR_BORDER_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INTENDED_PRODUCT_USE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PRODUCTS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SOURCE_OF_FUNDS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPLEX_STRUCTURE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EXPECTED_ANNUAL_TURNOVER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TRADING_DURATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BALANCE_SHEET_TOTAL\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_VAT_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BROKER_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BLACK_LISTED_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMMENTS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TOTAL_DEPOSITS_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TOTAL_LOANS_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CURRENCY_CODE_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_3\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_4\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_5\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SANCTION_LIST_ALERTED\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CHECK_SUM\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_OFFICIAL_ID_FLAG\", \"type\":\"string\" }"
            + "]}";

    public static final String AVRO_SCHEMA_OUTlog =
            "{"
            + "\"type\":\"record\","
            + "\"name\":\"OUTlog\","
            + "\"fields\":["
            + "  { \"name\":\"loguser_CUSTOMER_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ORGUNIT_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ORGUNIT_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_ORGUNIT_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DOMAIN_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SOURCE_REF_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SOURCE_UNIQUE_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PERSON_TITLE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_FIRST_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MIDDLE_NAMES\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_LAST_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SUFFIX\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPANY_NAME\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPANY_FORM\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_REGISTERED_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INCORPORATION_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INCORPORATION_COUNTRY_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_TYPE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_SEGMENT_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_SEGMENT_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INITIALS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DATE_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NAME_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ADDRESS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SECONDARY_COUNTRIES_OF_RESIDENCE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ZONE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_POSTAL_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_RESIDENCE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_ORIGIN\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_TAXATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_REGISTRATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_DOMICILE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_EXPECTED_TRANSACTIONS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COUNTRY_OF_CITIZENSHIP\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NATIONALITY_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PLACE_OF_BIRTH\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_GENDER_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PRIME_BRANCH_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RELATIONSHIP_MGR_ID\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYEE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYEE_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MARITAL_STATUS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_OCCUPATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EMPLOYMENT_STATUS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_ACQUISITION_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CANCELLED_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_TYPE_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_STATUS_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_SEGMENT_3\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RESIDENCE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SPECIAL_ATTENTION_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DECEASED_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_DORMANT_OVERRIDE_DATE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_LAST_UPDATED_TIMESTAMP\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_RISK_SCORE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BANKRUPT_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPENSATION_REQD_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CUSTOMER_COMPLAINT_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_END_RELATIONSHIP_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_MERCHANT_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_FACE_TO_FACE_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CHANNEL\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_AGE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_NEAR_BORDER_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_INTENDED_PRODUCT_USE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_PRODUCTS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SOURCE_OF_FUNDS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMPLEX_STRUCTURE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_EXPECTED_ANNUAL_TURNOVER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TRADING_DURATION\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BALANCE_SHEET_TOTAL\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_VAT_NUMBER\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BROKER_CODE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BLACK_LISTED_FLAG\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_COMMENTS\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TOTAL_DEPOSITS_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_TOTAL_LOANS_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CURRENCY_CODE_BASE\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_1\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_2\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_3\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_4\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_BUSINESS_AREA_5\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_SANCTION_LIST_ALERTED\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_CHECK_SUM\", \"type\":\"string\" },"
            + "  { \"name\":\"loguser_OFFICIAL_ID_FLAG\", \"type\":\"string\" }"
            + "]}";



}
