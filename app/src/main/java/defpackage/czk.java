package defpackage;

/* renamed from: czk  reason: default package */
/* compiled from: PG */
public enum czk implements din {
    SCREEN_UNSPECIFIED(0),
    MENU_MY_ACCOUNT(1),
    MENU_PRIVACY(2),
    MENU_PREFERENCES(3),
    MENU_SECURITY(4),
    MENU_DEMO(99),
    PRIVACY_CHECKUP(200),
    PRIVACY_NAME(201),
    PRIVACY_NICKNAME(202),
    PRIVACY_EMAIL(203),
    PRIVACY_PHONE(204),
    PRIVACY_BIRTHDAY(205),
    PRIVACY_GENDER(206),
    PRIVACY_ABOUT_ME(207),
    PRIVACY_GOOGLE_PLUS_SETTINGS(208),
    PRIVACY_SHARED_ENDORSEMENTS(209),
    PRIVACY_LOCATION_SHARING(210),
    PRIVACY_SEARCH_SETTINGS(211),
    PRIVACY_ACTIVITY_CONTROLS(212),
    PRIVACY_ACTIVITY_CONTROLS_WEB_AND_APP(224),
    PRIVACY_ACTIVITY_CONTROLS_VOICE_AND_AUDIO(225),
    PRIVACY_ACTIVITY_CONTROLS_DEVICE_INFO(226),
    PRIVACY_ACTIVITY_CONTROLS_LOCATION_HISTORY(227),
    PRIVACY_ACTIVITY_CONTROLS_YT_SEARCH_HISTORY(228),
    PRIVACY_ACTIVITY_CONTROLS_YT_WATCH_HISTORY(229),
    PRIVACY_ADS_SETTINGS(213),
    PRIVACY_GOOGLE_DASHBOARD(214),
    PRIVACY_DOWNLOAD_YOUR_DATA(215),
    PRIVACY_INACTIVE_ACCOUNT_MANAGER(216),
    PRIVACY_BLOCKED_USERS(217),
    PRIVACY_PROFILE_PICTURE(218),
    PRIVACY_MY_ACTIVITY(219),
    PRIVACY_GOOGLE_MAPS_TIMELINE(220),
    PRIVACY_TAKEOUT_MIGRATION(221),
    PRIVACY_CONTACT_SUGGESTIONS(222),
    PRIVACY_CONTACTS(223),
    PREFERENCES_LANGUAGE(300),
    PREFERENCES_STORAGE(301),
    PREFERENCES_DELETE_SERVICES(302),
    PREFERENCES_DELETE_ACCOUNT(303),
    PREFERENCES_FAMILY_MANAGEMENT(304),
    PREFERENCES_PAYMENTS_CENTER(305),
    PREFERENCES_PAYMENTS_CENTER_SUBSCRIPTIONS(306),
    PREFERENCES_PAYMENTS_CENTER_METHODS(307),
    PREFERENCES_MY_SUBSCRIPTIONS(308),
    SECURITY_CHECKUP(400),
    SECURITY_PASSWORD(401),
    SECURITY_PHONE_SIGN_IN(402),
    SECURITY_TWO_STEP_VERIFICATION(403),
    SECURITY_APP_PASSWORDS(404),
    SECURITY_SECURITY_KEYS(405),
    SECURITY_RECOVERY_PHONE(406),
    SECURITY_RECOVERY_EMAIL(407),
    SECURITY_SECURITY_QUESTION(408),
    SECURITY_RECENT_SECURITY_EVENTS(409),
    SECURITY_RECENTLY_USED_DEVICES(410),
    SECURITY_CONNECTED_APPS(412),
    SECURITY_SAVED_PASSWORDS(413),
    SECURITY_LESS_SECURE_APPS(414),
    SECURITY_OFFLINE_OTP(415),
    SECURITY_PIN(416),
    MISC_PRIVACY_POLICY(500),
    MISC_CONTACT_EMAIL(501),
    MISC_SECURITY_CHECKUP(502),
    MISC_TERMS_OF_SERVICE(503),
    DEMO_BROWSER(9900),
    DEMO_MESSAGE(9901),
    DEMO_NATIVE(9902),
    DEMO_UNKNOWN_WITH_FALLBACK(9903),
    DEMO_UNKNOWN_WITHOUT_FALLBACK(9904),
    DEMO_WEBVIEW(9905),
    DEMO_WEBVIEW_SANDBOX_APPBAR(9906),
    DEMO_WEBVIEW_SANDBOX_NAVIGATION(9907),
    DEMO_ULR_SETTINGS(9910),
    DEMO_WEBVIEW_ACTIVITY_CONTROLS(9911),
    DEMO_WEBVIEW_ACTIVITY_CONTROLS_WEB_AND_APP(9912),
    DEMO_WEBVIEW_ACTIVITY_CONTROLS_DEVICE_INFO(9913);
    
    public final int d;

    @Override // defpackage.din
    public final int a() {
        return this.d;
    }

    public static czk a(int i) {
        switch (i) {
            case 0:
                return SCREEN_UNSPECIFIED;
            case 1:
                return MENU_MY_ACCOUNT;
            case 2:
                return MENU_PRIVACY;
            case 3:
                return MENU_PREFERENCES;
            case 4:
                return MENU_SECURITY;
            case 99:
                return MENU_DEMO;
            case 200:
                return PRIVACY_CHECKUP;
            case 201:
                return PRIVACY_NAME;
            case 202:
                return PRIVACY_NICKNAME;
            case 203:
                return PRIVACY_EMAIL;
            case 204:
                return PRIVACY_PHONE;
            case 205:
                return PRIVACY_BIRTHDAY;
            case 206:
                return PRIVACY_GENDER;
            case 207:
                return PRIVACY_ABOUT_ME;
            case 208:
                return PRIVACY_GOOGLE_PLUS_SETTINGS;
            case 209:
                return PRIVACY_SHARED_ENDORSEMENTS;
            case 210:
                return PRIVACY_LOCATION_SHARING;
            case 211:
                return PRIVACY_SEARCH_SETTINGS;
            case 212:
                return PRIVACY_ACTIVITY_CONTROLS;
            case 213:
                return PRIVACY_ADS_SETTINGS;
            case 214:
                return PRIVACY_GOOGLE_DASHBOARD;
            case 215:
                return PRIVACY_DOWNLOAD_YOUR_DATA;
            case 216:
                return PRIVACY_INACTIVE_ACCOUNT_MANAGER;
            case 217:
                return PRIVACY_BLOCKED_USERS;
            case 218:
                return PRIVACY_PROFILE_PICTURE;
            case 219:
                return PRIVACY_MY_ACTIVITY;
            case 220:
                return PRIVACY_GOOGLE_MAPS_TIMELINE;
            case 221:
                return PRIVACY_TAKEOUT_MIGRATION;
            case 222:
                return PRIVACY_CONTACT_SUGGESTIONS;
            case 223:
                return PRIVACY_CONTACTS;
            case 224:
                return PRIVACY_ACTIVITY_CONTROLS_WEB_AND_APP;
            case 225:
                return PRIVACY_ACTIVITY_CONTROLS_VOICE_AND_AUDIO;
            case 226:
                return PRIVACY_ACTIVITY_CONTROLS_DEVICE_INFO;
            case 227:
                return PRIVACY_ACTIVITY_CONTROLS_LOCATION_HISTORY;
            case 228:
                return PRIVACY_ACTIVITY_CONTROLS_YT_SEARCH_HISTORY;
            case 229:
                return PRIVACY_ACTIVITY_CONTROLS_YT_WATCH_HISTORY;
            case 300:
                return PREFERENCES_LANGUAGE;
            case 301:
                return PREFERENCES_STORAGE;
            case 302:
                return PREFERENCES_DELETE_SERVICES;
            case 303:
                return PREFERENCES_DELETE_ACCOUNT;
            case 304:
                return PREFERENCES_FAMILY_MANAGEMENT;
            case 305:
                return PREFERENCES_PAYMENTS_CENTER;
            case 306:
                return PREFERENCES_PAYMENTS_CENTER_SUBSCRIPTIONS;
            case 307:
                return PREFERENCES_PAYMENTS_CENTER_METHODS;
            case 308:
                return PREFERENCES_MY_SUBSCRIPTIONS;
            case 400:
                return SECURITY_CHECKUP;
            case 401:
                return SECURITY_PASSWORD;
            case 402:
                return SECURITY_PHONE_SIGN_IN;
            case 403:
                return SECURITY_TWO_STEP_VERIFICATION;
            case 404:
                return SECURITY_APP_PASSWORDS;
            case 405:
                return SECURITY_SECURITY_KEYS;
            case 406:
                return SECURITY_RECOVERY_PHONE;
            case 407:
                return SECURITY_RECOVERY_EMAIL;
            case 408:
                return SECURITY_SECURITY_QUESTION;
            case 409:
                return SECURITY_RECENT_SECURITY_EVENTS;
            case 410:
                return SECURITY_RECENTLY_USED_DEVICES;
            case 412:
                return SECURITY_CONNECTED_APPS;
            case 413:
                return SECURITY_SAVED_PASSWORDS;
            case 414:
                return SECURITY_LESS_SECURE_APPS;
            case 415:
                return SECURITY_OFFLINE_OTP;
            case 416:
                return SECURITY_PIN;
            case 500:
                return MISC_PRIVACY_POLICY;
            case 501:
                return MISC_CONTACT_EMAIL;
            case 502:
                return MISC_SECURITY_CHECKUP;
            case 503:
                return MISC_TERMS_OF_SERVICE;
            case 9900:
                return DEMO_BROWSER;
            case 9901:
                return DEMO_MESSAGE;
            case 9902:
                return DEMO_NATIVE;
            case 9903:
                return DEMO_UNKNOWN_WITH_FALLBACK;
            case 9904:
                return DEMO_UNKNOWN_WITHOUT_FALLBACK;
            case 9905:
                return DEMO_WEBVIEW;
            case 9906:
                return DEMO_WEBVIEW_SANDBOX_APPBAR;
            case 9907:
                return DEMO_WEBVIEW_SANDBOX_NAVIGATION;
            case 9910:
                return DEMO_ULR_SETTINGS;
            case 9911:
                return DEMO_WEBVIEW_ACTIVITY_CONTROLS;
            case 9912:
                return DEMO_WEBVIEW_ACTIVITY_CONTROLS_WEB_AND_APP;
            case 9913:
                return DEMO_WEBVIEW_ACTIVITY_CONTROLS_DEVICE_INFO;
            default:
                return null;
        }
    }

    private czk(int i) {
        this.d = i;
    }

    static {
        new czl();
    }
}
