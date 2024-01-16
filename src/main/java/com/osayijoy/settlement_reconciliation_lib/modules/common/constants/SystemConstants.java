package com.osayijoy.settlement_reconciliation_lib.modules.common.constants;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

public class SystemConstants {

    public static final String MAKER_ROLE_NAME = "SYSTEM_MAKER";
    public static final String CHECKER_ROLE_NAME = "SYSTEM_CHECKER";
    public static final String CHECKER_EMAIL = "systemChecker@automata.com";
    public static final String MAKER_EMAIL = "systemMaker@automata.com";
    public static final String SYSTEM_DEFAULT_PASSWORD = "P@ssw0rd_Automata";
    public static final String ROLE_NAME_IS_REQUIRED = "role name is required";
    public static final String ROLE_DESCRIPTION_IS_REQUIRED = "role description is required";
    public static final String ROLE_PERMISSIONS_ARE_REQUIRED = "role permissions are required";
    public static final String PERMISSION_NAME_IS_REQUIRED = "role name is required";
    public static final String PASSWORD_IS_REQUIRED_MESSAGE = "password is required, should contain special character, numbers and minimum length of password is 8";
    public static final String PASSWORD_PATTERN = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public static final String ROLE_NAME_PATTERN = "^(?:[a-zA-Z]\\s){0,34}[a-zA-Z]$";
    public static final String ROLE_DESCRIPTION_PATTERN = "^(?:[a-zA-Z]+\\s){0,24}[a-zA-Z]+$";
    public static final String PERMISSION_TYPE_USERS = "USERS";
    public static final String SETTING_KEY_IS_REQUIRED = "setting key is required";
    public static final String SETTING_TYPE_IS_REQUIRED = "setting type is required";
    public static final String SETTING_VALUE_IS_REQUIRED = "setting value is required";
    public static final String SETTING_DESCRIPTION_IS_REQUIRED = "setting description is required";

    private SystemConstants() {
    }



}
