package com.osayijoy.settlement_reconciliation_lib.modules.common.constants;
/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */

public class AuditLogActivity {

    //AuditLogTypes
    public static final String BACKOFFICE = "BACKOFFICE";


    //BackOffice Role Audit
    public static final String CREATE_NEW_ROLE = "CREATE_NEW_ROLE";
    public static final String CREATE_NEW_ROLE_DESCRIPTION = "A new role creation request was successfully submitted and awaiting approval.";

    public static final String APPROVE_CREATE_NEW_ROLE = "APPROVE_CREATE_NEW_ROLE";
    public static final String APPROVE_CREATE_NEW_ROLE_DESCRIPTION = "A new role creation request was successfully approved, new role created is {}";

    public static final String DELETE_ROLE = "DELETE_ROLE";
    public static final String DELETE_ROLE_DESCRIPTION = "A role deletion request was successfully submitted and awaiting approval.";

    public static final String APPROVE_DELETE_ROLE = "APPROVE_DELETE_ROLE";
    public static final String APPROVE_DELETE_ROLE_DESCRIPTION = "A role deletion request was successfully approved, role deleted is {}";

    public static final String DISABLE_ROLE = "DISABLE_ROLE";
    public static final String DISABLE_ROLE_DESCRIPTION = "A role disable request was successfully submitted and awaiting approval.";

    public static final String APPROVE_DISABLE_ROLE = "APPROVE_DISABLE_ROLE";
    public static final String APPROVE_DISABLE_ROLE_DESCRIPTION = "A role disable request was successfully approved, role disabled is {}";

    public static final String ENABLE_ROLE = "ENABLE_ROLE";
    public static final String ENABLE_ROLE_DESCRIPTION = "A role enable request was successfully submitted and awaiting approval.";

    public static final String APPROVE_ENABLE_ROLE = "APPROVE_DISABLE_ROLE";
    public static final String APPROVE_ENABLE_ROLE_DESCRIPTION = "A role enable request was successfully approved, role enabled is {}";

    public static final String EDIT_ROLE = "EDIT_ROLE";
    public static final String EDIT_ROLE_DESCRIPTION = "A role edit request was successfully submitted and awaiting approval.";

    public static final String APPROVE_EDIT_ROLE = "APPROVE_EDIT_ROLE";
    public static final String APPROVE_EDIT_ROLE_DESCRIPTION = "A role edit request was successfully approved, role edited is {}";


    //BackOfficeProfile Audit
    public static final String DELETE_PROFILE = "DELETE_PROFILE";
    public static final String DELETE_PROFILE_DESCRIPTION = "A profile deletion request was successfully submitted and awaiting approval.";

    public static final String APPROVE_DELETE_PROFILE = "APPROVE_DELETE_PROFILE";
    public static final String APPROVE_DELETE_PROFILE_DESCRIPTION = "A profile deletion request was successfully approved, profile deleted is {}";

    public static final String EDIT_PROFILE = "EDIT_PROFILE";
    public static final String EDIT_PROFILE_DESCRIPTION = "A profile edit request was successfully submitted and awaiting approval.";

    public static final String APPROVE_EDIT_PROFILE = "APPROVE_EDIT_PROFILE";
    public static final String APPROVE_EDIT_PROFILE_DESCRIPTION = "A profile edit request was successfully approved, profile edited is {}";

    public static final String ENABLE_PROFILE = "ENABLE_PROFILE";
    public static final String ENABLE_PROFILE_DESCRIPTION = "A profile enable request was successfully submitted and awaiting approval.";

    public static final String APPROVE_ENABLE_PROFILE = "APPROVE_ENABLE_PROFILE";
    public static final String APPROVE_ENABLE_PROFILE_DESCRIPTION = "A profile enable request was successfully approved, profile enabled is {}";

    public static final String DISABLE_PROFILE = "DISABLE_PROFILE";
    public static final String DISABLE_PROFILE_DESCRIPTION = "A profile disable request was successfully submitted and awaiting approval.";

    public static final String APPROVE_DISABLE_PROFILE = "APPROVE_DISABLE_PROFILE";
    public static final String APPROVE_DISABLE_PROFILE_DESCRIPTION = "A profile disable request was successfully approved, profile disabled is {}";

    public static final String INVITE_USER = "INVITE_USER";
    public static final String INVITE_USER_DESCRIPTION = "An invite request for new user was successfully submitted and awaiting approval.";

    public static final String APPROVE_INVITE_USER = "APPROVE_INVITE_USER";
    public static final String APPROVE_INVITE_USER_DESCRIPTION = "An invite request for new user was successfully approved, invitation sent to {}";

    public static final String RESEND_INVITATION_TO_USER = "RESEND_INVITATION_TO_USER";
    public static final String RESEND_INVITATION_TO_USER_DESCRIPTION = "A resend of invitation to new user request was successfully submitted and awaiting approval.";

    public static final String PASSWORD_UPDATE = "PASSWORD_UPDATE";
    public static final String PASSWORD_UPDATE_DESCRIPTION = "A password update was successfully completed.";


    public static final String LOGIN_SUCCESS = "LOGIN_SUCCESS";
    public static final String LOGIN_SUCCESS_DESCRIPTION = "{} successfully logged in.";

    public static final String LOGIN_FAILURE = "LOGIN_FAILURE";
    public static final String LOGIN_FAILURE_DESCRIPTION = "%s login attempt failed because %s";


    // Backoffice Issuer Audit
    public static final String CREATE_NEW_ISSUER = "CREATE_NEW_ISSUER";
    public static final String CREATE_NEW_ISSUER_DESCRIPTION = "A new issuer creation request was successfully submitted and awaiting approval.";
    public static final String APPROVE_CREATE_NEW_ISSUER = "APPROVE_CREATE_NEW_ISSUER";
    public static final String APPROVE_CREATE_NEW_ISSUER_DESCRIPTION = "A new issuer creation request was successfully approved, new issuer created is {}";

    public static final String DELETE_ISSUER = "DELETE_ISSUER";
    public static final String DELETE_ISSUER_DESCRIPTION = "An issuer deletion request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DELETE_ISSUER = "APPROVE_DELETE_ISSUER";
    public static final String APPROVE_DELETE_ISSUER_DESCRIPTION = "An issuer deletion request was successfully approved, issuer deleted is {}";

    public static final String DISABLE_ISSUER = "DISABLE_ISSUER";
    public static final String DISABLE_ISSUER_DESCRIPTION = "An issuer disable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DISABLE_ISSUER = "APPROVE_DISABLE_ISSUER";
    public static final String APPROVE_DISABLE_ISSUER_DESCRIPTION = "An issuer disable request was successfully approved, issuer disabled is {}";

    public static final String ENABLE_ISSUER = "ENABLE_ISSUER";
    public static final String ENABLE_ISSUER_DESCRIPTION = "An issuer enable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_ENABLE_ISSUER = "APPROVE_ENABLE_ISSUER";
    public static final String APPROVE_ENABLE_ISSUER_DESCRIPTION = "An issuer enable request was successfully approved, issuer enabled is {}";

    public static final String EDIT_ISSUER = "EDIT_ISSUER";
    public static final String EDIT_ISSUER_DESCRIPTION = "An issuer edit request was successfully submitted and awaiting approval.";
    public static final String APPROVE_EDIT_ISSUER = "APPROVE_EDIT_ISSUER";
    public static final String APPROVE_EDIT_ISSUER_DESCRIPTION = "An issuer edit request was successfully approved, issuer edited is {}";


    // Backoffice Card Scheme Audit
    public static final String CREATE_NEW_CARD_SCHEME = "CREATE_NEW_CARD_SCHEME";
    public static final String CREATE_NEW_CARD_SCHEME_DESCRIPTION = "A new card scheme creation request was successfully submitted and awaiting approval.";
    public static final String APPROVE_CREATE_NEW_CARD_SCHEME = "APPROVE_CREATE_NEW_CARD_SCHEME";
    public static final String APPROVE_CREATE_NEW_CARD_SCHEME_DESCRIPTION = "A new card scheme creation request was successfully approved, new card scheme created is {}";

    public static final String DELETE_CARD_SCHEME = "DELETE_CARD_SCHEME";
    public static final String DELETE_CARD_SCHEME_DESCRIPTION = "A card scheme deletion request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DELETE_CARD_SCHEME = "APPROVE_DELETE_CARD_SCHEME";
    public static final String APPROVE_DELETE_CARD_SCHEME_DESCRIPTION = "A card scheme deletion request was successfully approved, card scheme deleted is {}";

    public static final String DISABLE_CARD_SCHEME = "DISABLE_CARD_SCHEME";
    public static final String DISABLE_CARD_SCHEME_DESCRIPTION = "A card scheme disable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DISABLE_CARD_SCHEME = "APPROVE_DISABLE_CARD_SCHEME";
    public static final String APPROVE_DISABLE_CARD_SCHEME_DESCRIPTION = "A card scheme disable request was successfully approved, issuer disabled is {}";

    public static final String ENABLE_CARD_SCHEME = "ENABLE_CARD_SCHEME";
    public static final String ENABLE_CARD_SCHEME_DESCRIPTION = "A card scheme enable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_ENABLE_CARD_SCHEME = "APPROVE_ENABLE_CARD_SCHEME";
    public static final String APPROVE_ENABLE_CARD_SCHEME_DESCRIPTION = "A card scheme enable request was successfully approved, issuer enabled is {}";

    public static final String EDIT_CARD_SCHEME = "EDIT_CARD_SCHEME";
    public static final String EDIT_CARD_SCHEME_DESCRIPTION = "A card scheme edit request was successfully submitted and awaiting approval.";
    public static final String APPROVE_EDIT_CARD_SCHEME = "APPROVE_EDIT_CARD_SCHEME";
    public static final String APPROVE_EDIT_CARD_SCHEME_DESCRIPTION = "A card scheme edit request was successfully approved, card scheme edited is {}";


    // Backoffice Card Program Audit
    public static final String CREATE_NEW_CARD_PROGRAM = "CREATE_NEW_CARD_PROGRAM";
    public static final String CREATE_NEW_CARD_PROGRAM_DESCRIPTION = "A new card program creation request was successfully submitted and awaiting approval.";
    public static final String APPROVE_CREATE_NEW_CARD_PROGRAM = "APPROVE_CREATE_NEW_CARD_PROGRAM";
    public static final String APPROVE_CREATE_NEW_CARD_PROGRAM_DESCRIPTION = "A new card program creation request was successfully approved, new card program created is {}";

    public static final String DELETE_CARD_PROGRAM = "DELETE_CARD_PROGRAM";
    public static final String DELETE_CARD_PROGRAM_DESCRIPTION = "A card program deletion request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DELETE_CARD_PROGRAM = "APPROVE_DELETE_CARD_PROGRAM";
    public static final String APPROVE_DELETE_CARD_PROGRAM_DESCRIPTION = "A card program deletion request was successfully approved, card program deleted is {}";

    public static final String DISABLE_CARD_PROGRAM = "DISABLE_CARD_PROGRAM";
    public static final String DISABLE_CARD_PROGRAM_DESCRIPTION = "A card program disable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_DISABLE_CARD_PROGRAM = "APPROVE_DISABLE_CARD_PROGRAM";
    public static final String APPROVE_DISABLE_CARD_PROGRAM_DESCRIPTION = "A card program disable request was successfully approved, card program disabled is {}";

    public static final String ENABLE_CARD_PROGRAM = "ENABLE_CARD_PROGRAM";
    public static final String ENABLE_CARD_PROGRAM_DESCRIPTION = "A card program enable request was successfully submitted and awaiting approval.";
    public static final String APPROVE_ENABLE_CARD_PROGRAM = "APPROVE_ENABLE_CARD_PROGRAM";
    public static final String APPROVE_ENABLE_CARD_PROGRAM_DESCRIPTION = "A card program enable request was successfully approved, card program enabled is {}";

    public static final String EDIT_CARD_PROGRAM = "EDIT_CARD_PROGRAM";
    public static final String EDIT_CARD_PROGRAM_DESCRIPTION = "A card program edit request was successfully submitted and awaiting approval.";
    public static final String APPROVE_EDIT_CARD_PROGRAM = "APPROVE_EDIT_CARD_PROGRAM";
    public static final String APPROVE_EDIT_CARD_PROGRAM_DESCRIPTION = "A card program edit request was successfully approved, card program edited is {}";

    public static final String VIEW_CARD_PROGRAM = "VIEW_CARD_PROGRAM";
    public static final String VIEW_CARD_PROGRAM_DESCRIPTION = "A request to view a card program was successfully processed.";

    public static final String VIEW_ALL_CARD_PROGRAMS = "VIEW_ALL_CARD_PROGRAMS";
    public static final String VIEW_ALL_CARD_PROGRAMS_DESCRIPTION = "A request to view all card programs was successfully processed.";

    public static final String FILTER_CARD_PROGRAMS = "FILTER_CARD_PROGRAMS";
    public static final String FILTER_CARD_PROGRAMS_DESCRIPTION = "A request to filter card programs was successfully processed.";

    public static final String SEARCH_CARD_PROGRAM = "SEARCH_CARD_PROGRAM";
    public static final String SEARCH_CARD_PROGRAM_DESCRIPTION = "A request to search for card programs was successfully processed.";

    public static final String EXPORT_CARD_PROGRAMS = "EXPORT_CARD_PROGRAMS";
    public static final String EXPORT_CARD_PROGRAMS_DESCRIPTION = "A request to export card programs was successfully processed.";


    private AuditLogActivity() {
    }
}
