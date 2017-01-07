package com.google.android.gms;

import org.appcelerator.titanium.util.TiRHelper;
import org.appcelerator.titanium.util.TiRHelper.ResourceNotFoundException;

public class R {

   public static class dimen{

   	public static int place_autocomplete_button_padding = 0x7f060000;
   	public static int place_autocomplete_powered_by_google_height = 0x7f060001;
   	public static int place_autocomplete_powered_by_google_start = 0x7f060002;
   	public static int place_autocomplete_prediction_height = 0x7f060003;
   	public static int place_autocomplete_prediction_horizontal_margin = 0x7f060004;
   	public static int place_autocomplete_prediction_primary_text = 0x7f060005;
   	public static int place_autocomplete_prediction_secondary_text = 0x7f060006;
   	public static int place_autocomplete_progress_horizontal_margin = 0x7f060007;
   	public static int place_autocomplete_progress_size = 0x7f060008;
   	public static int place_autocomplete_separator_start = 0x7f060009;
   }

   public static class layout{

   	public static int place_autocomplete_fragment = 0x7f030000;
   	public static int place_autocomplete_item_powered_by_google = 0x7f030001;
   	public static int place_autocomplete_item_prediction = 0x7f030002;
   	public static int place_autocomplete_progress = 0x7f030003;
   }

   public static class attr{

   	public static int adSize = 0x7f010000;
   	public static int adSizes = 0x7f010001;
   	public static int adUnitId = 0x7f010002;
   	public static int ambientEnabled = 0x7f010017;
   	public static int appTheme = 0x7f01001b;
   	public static int buttonSize = 0x7f010018;
   	public static int buyButtonAppearance = 0x7f010022;
   	public static int buyButtonHeight = 0x7f01001f;
   	public static int buyButtonText = 0x7f010021;
   	public static int buyButtonWidth = 0x7f010020;
   	public static int cameraBearing = 0x7f010008;
   	public static int cameraTargetLat = 0x7f010009;
   	public static int cameraTargetLng = 0x7f01000a;
   	public static int cameraTilt = 0x7f01000b;
   	public static int cameraZoom = 0x7f01000c;
   	public static int circleCrop = 0x7f010006;
   	public static int colorScheme = 0x7f010019;
   	public static int environment = 0x7f01001c;
   	public static int fragmentMode = 0x7f01001e;
   	public static int fragmentStyle = 0x7f01001d;
   	public static int imageAspectRatio = 0x7f010005;
   	public static int imageAspectRatioAdjust = 0x7f010004;
   	public static int liteMode = 0x7f01000d;
   	public static int mapType = 0x7f010007;
   	public static int maskedWalletDetailsBackground = 0x7f010025;
   	public static int maskedWalletDetailsButtonBackground = 0x7f010027;
   	public static int maskedWalletDetailsButtonTextAppearance = 0x7f010026;
   	public static int maskedWalletDetailsHeaderTextAppearance = 0x7f010024;
   	public static int maskedWalletDetailsLogoImageType = 0x7f010029;
   	public static int maskedWalletDetailsLogoTextColor = 0x7f010028;
   	public static int maskedWalletDetailsTextAppearance = 0x7f010023;
   	public static int scopeUris = 0x7f01001a;
   	public static int uiCompass = 0x7f01000e;
   	public static int uiMapToolbar = 0x7f010016;
   	public static int uiRotateGestures = 0x7f01000f;
   	public static int uiScrollGestures = 0x7f010010;
   	public static int uiTiltGestures = 0x7f010011;
   	public static int uiZoomControls = 0x7f010012;
   	public static int uiZoomGestures = 0x7f010013;
   	public static int useViewLifecycle = 0x7f010014;
   	public static int windowTransitionStyle = 0x7f010003;
   	public static int zOrderOnTop = 0x7f010015;
   }

   public static class color{

   	public static int common_action_bar_splitter = 0x7f050000;
   	public static int common_google_signin_btn_text_dark = 0x7f050024;
   	public static int common_google_signin_btn_text_dark_default = 0x7f050001;
   	public static int common_google_signin_btn_text_dark_disabled = 0x7f050002;
   	public static int common_google_signin_btn_text_dark_focused = 0x7f050003;
   	public static int common_google_signin_btn_text_dark_pressed = 0x7f050004;
   	public static int common_google_signin_btn_text_light = 0x7f050025;
   	public static int common_google_signin_btn_text_light_default = 0x7f050005;
   	public static int common_google_signin_btn_text_light_disabled = 0x7f050006;
   	public static int common_google_signin_btn_text_light_focused = 0x7f050007;
   	public static int common_google_signin_btn_text_light_pressed = 0x7f050008;
   	public static int common_plus_signin_btn_text_dark = 0x7f050026;
   	public static int common_plus_signin_btn_text_dark_default = 0x7f050009;
   	public static int common_plus_signin_btn_text_dark_disabled = 0x7f05000a;
   	public static int common_plus_signin_btn_text_dark_focused = 0x7f05000b;
   	public static int common_plus_signin_btn_text_dark_pressed = 0x7f05000c;
   	public static int common_plus_signin_btn_text_light = 0x7f050027;
   	public static int common_plus_signin_btn_text_light_default = 0x7f05000d;
   	public static int common_plus_signin_btn_text_light_disabled = 0x7f05000e;
   	public static int common_plus_signin_btn_text_light_focused = 0x7f05000f;
   	public static int common_plus_signin_btn_text_light_pressed = 0x7f050010;
   	public static int place_autocomplete_prediction_primary_text = 0x7f050011;
   	public static int place_autocomplete_prediction_primary_text_highlight = 0x7f050012;
   	public static int place_autocomplete_prediction_secondary_text = 0x7f050013;
   	public static int place_autocomplete_search_hint  = 0x7f050014;
   	public static int place_autocomplete_search_text = 0x7f050015;
   	public static int place_autocomplete_separator = 0x7f050016;
   	public static int wallet_bright_foreground_disabled_holo_light = 0x7f050017;
   	public static int wallet_bright_foreground_holo_dark = 0x7f050018;
   	public static int wallet_bright_foreground_holo_light = 0x7f050019;
   	public static int wallet_dim_foreground_disabled_holo_dark = 0x7f05001a;
   	public static int wallet_dim_foreground_holo_dark = 0x7f05001b;
   	public static int wallet_dim_foreground_inverse_disabled_holo_dark = 0x7f05001c;
   	public static int wallet_dim_foreground_inverse_holo_dark = 0x7f05001d;
   	public static int wallet_highlighted_text_holo_dark = 0x7f05001e;
   	public static int wallet_highlighted_text_holo_light = 0x7f05001f;
   	public static int wallet_hint_foreground_holo_dark = 0x7f050020;
   	public static int wallet_hint_foreground_holo_light = 0x7f050021;
   	public static int wallet_holo_blue_light = 0x7f050022;
   	public static int wallet_link_text_light = 0x7f050023;
   	public static int wallet_primary_text_holo_light = 0x7f050028;
   	public static int wallet_secondary_text_holo_dark = 0x7f050029;
   }

   public static class style{

   	public static int Theme_AppInvite_Preview = 0x7f0a0000;
   	public static int Theme_AppInvite_Preview_Base = 0x7f0a0001;
   	public static int Theme_IAPTheme = 0x7f0a0002;
   	public static int WalletFragmentDefaultButtonTextAppearance = 0x7f0a0003;
   	public static int WalletFragmentDefaultDetailsHeaderTextAppearance = 0x7f0a0004;
   	public static int WalletFragmentDefaultDetailsTextAppearance = 0x7f0a0005;
   	public static int WalletFragmentDefaultStyle = 0x7f0a0006;
   }

   public static class styleable{

   	public static int[] AdsAttrs = {0x7f010000,0x7f010001,0x7f010002};
   	public static int AdsAttrs_adSize = 0;
   	public static int AdsAttrs_adSizes = 1;
   	public static int AdsAttrs_adUnitId = 2;
   	public static int[] CustomWalletTheme = {0x7f010003};
   	public static int CustomWalletTheme_windowTransitionStyle = 0;
   	public static int[] LoadingImageView = {0x7f010004,0x7f010005,0x7f010006};
   	public static int LoadingImageView_circleCrop = 2;
   	public static int LoadingImageView_imageAspectRatio = 1;
   	public static int LoadingImageView_imageAspectRatioAdjust = 0;
   	public static int[] MapAttrs = {0x7f010007,0x7f010008,0x7f010009,0x7f01000a,0x7f01000b,0x7f01000c,0x7f01000d,0x7f01000e,0x7f01000f,0x7f010010,0x7f010011,0x7f010012,0x7f010013,0x7f010014,0x7f010015,0x7f010016,0x7f010017};
   	public static int MapAttrs_ambientEnabled = 16;
   	public static int MapAttrs_cameraBearing = 1;
   	public static int MapAttrs_cameraTargetLat = 2;
   	public static int MapAttrs_cameraTargetLng = 3;
   	public static int MapAttrs_cameraTilt = 4;
   	public static int MapAttrs_cameraZoom = 5;
   	public static int MapAttrs_liteMode = 6;
   	public static int MapAttrs_mapType = 0;
   	public static int MapAttrs_uiCompass = 7;
   	public static int MapAttrs_uiMapToolbar = 15;
   	public static int MapAttrs_uiRotateGestures = 8;
   	public static int MapAttrs_uiScrollGestures = 9;
   	public static int MapAttrs_uiTiltGestures = 10;
   	public static int MapAttrs_uiZoomControls = 11;
   	public static int MapAttrs_uiZoomGestures = 12;
   	public static int MapAttrs_useViewLifecycle = 13;
   	public static int MapAttrs_zOrderOnTop = 14;
   	public static int[] SignInButton = {0x7f010018,0x7f010019,0x7f01001a};
   	public static int SignInButton_buttonSize = 0;
   	public static int SignInButton_colorScheme = 1;
   	public static int SignInButton_scopeUris = 2;
   	public static int[] WalletFragmentOptions = {0x7f01001b,0x7f01001c,0x7f01001d,0x7f01001e};
   	public static int WalletFragmentOptions_appTheme = 0;
   	public static int WalletFragmentOptions_environment = 1;
   	public static int WalletFragmentOptions_fragmentMode = 3;
   	public static int WalletFragmentOptions_fragmentStyle = 2;
   	public static int[] WalletFragmentStyle = {0x7f01001f,0x7f010020,0x7f010021,0x7f010022,0x7f010023,0x7f010024,0x7f010025,0x7f010026,0x7f010027,0x7f010028,0x7f010029};
   	public static int WalletFragmentStyle_buyButtonAppearance = 3;
   	public static int WalletFragmentStyle_buyButtonHeight = 0;
   	public static int WalletFragmentStyle_buyButtonText = 2;
   	public static int WalletFragmentStyle_buyButtonWidth = 1;
   	public static int WalletFragmentStyle_maskedWalletDetailsBackground = 6;
   	public static int WalletFragmentStyle_maskedWalletDetailsButtonBackground = 8;
   	public static int WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance = 7;
   	public static int WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance = 5;
   	public static int WalletFragmentStyle_maskedWalletDetailsLogoImageType = 10;
   	public static int WalletFragmentStyle_maskedWalletDetailsLogoTextColor = 9;
   	public static int WalletFragmentStyle_maskedWalletDetailsTextAppearance = 4;
   }

   public static class raw{

   	public static int gtm_analytics = 0x7f040000;
   }

   public static class integer{

   	public static int google_play_services_version = 0x7f080000;
   }

   public static class drawable{

   	public static int cast_ic_notification_0 = 0x7f020000;
   	public static int cast_ic_notification_1 = 0x7f020001;
   	public static int cast_ic_notification_2 = 0x7f020002;
   	public static int cast_ic_notification_connecting = 0x7f020003;
   	public static int cast_ic_notification_on = 0x7f020004;
   	public static int common_full_open_on_phone = 0x7f020005;
   	public static int common_google_signin_btn_icon_dark = 0x7f020006;
   	public static int common_google_signin_btn_icon_dark_disabled = 0x7f020007;
   	public static int common_google_signin_btn_icon_dark_focused = 0x7f020008;
   	public static int common_google_signin_btn_icon_dark_normal = 0x7f020009;
   	public static int common_google_signin_btn_icon_dark_pressed = 0x7f02000a;
   	public static int common_google_signin_btn_icon_light = 0x7f02000b;
   	public static int common_google_signin_btn_icon_light_disabled = 0x7f02000c;
   	public static int common_google_signin_btn_icon_light_focused = 0x7f02000d;
   	public static int common_google_signin_btn_icon_light_normal = 0x7f02000e;
   	public static int common_google_signin_btn_icon_light_pressed = 0x7f02000f;
   	public static int common_google_signin_btn_text_dark = 0x7f020010;
   	public static int common_google_signin_btn_text_dark_disabled = 0x7f020011;
   	public static int common_google_signin_btn_text_dark_focused = 0x7f020012;
   	public static int common_google_signin_btn_text_dark_normal = 0x7f020013;
   	public static int common_google_signin_btn_text_dark_pressed = 0x7f020014;
   	public static int common_google_signin_btn_text_light = 0x7f020015;
   	public static int common_google_signin_btn_text_light_disabled = 0x7f020016;
   	public static int common_google_signin_btn_text_light_focused = 0x7f020017;
   	public static int common_google_signin_btn_text_light_normal = 0x7f020018;
   	public static int common_google_signin_btn_text_light_pressed = 0x7f020019;
   	public static int common_ic_googleplayservices = 0x7f02001a;
   	public static int common_plus_signin_btn_icon_dark = 0x7f02001b;
   	public static int common_plus_signin_btn_icon_dark_disabled = 0x7f02001c;
   	public static int common_plus_signin_btn_icon_dark_focused = 0x7f02001d;
   	public static int common_plus_signin_btn_icon_dark_normal = 0x7f02001e;
   	public static int common_plus_signin_btn_icon_dark_pressed = 0x7f02001f;
   	public static int common_plus_signin_btn_icon_light = 0x7f020020;
   	public static int common_plus_signin_btn_icon_light_disabled = 0x7f020021;
   	public static int common_plus_signin_btn_icon_light_focused = 0x7f020022;
   	public static int common_plus_signin_btn_icon_light_normal = 0x7f020023;
   	public static int common_plus_signin_btn_icon_light_pressed = 0x7f020024;
   	public static int common_plus_signin_btn_text_dark = 0x7f020025;
   	public static int common_plus_signin_btn_text_dark_disabled = 0x7f020026;
   	public static int common_plus_signin_btn_text_dark_focused = 0x7f020027;
   	public static int common_plus_signin_btn_text_dark_normal = 0x7f020028;
   	public static int common_plus_signin_btn_text_dark_pressed = 0x7f020029;
   	public static int common_plus_signin_btn_text_light = 0x7f02002a;
   	public static int common_plus_signin_btn_text_light_disabled = 0x7f02002b;
   	public static int common_plus_signin_btn_text_light_focused = 0x7f02002c;
   	public static int common_plus_signin_btn_text_light_normal = 0x7f02002d;
   	public static int common_plus_signin_btn_text_light_pressed = 0x7f02002e;
   	public static int ic_plusone_medium_off_client = 0x7f02002f;
   	public static int ic_plusone_small_off_client = 0x7f020030;
   	public static int ic_plusone_standard_off_client = 0x7f020031;
   	public static int ic_plusone_tall_off_client = 0x7f020032;
   	public static int places_ic_clear = 0x7f020033;
   	public static int places_ic_search = 0x7f020034;
   	public static int powered_by_google_dark = 0x7f020035;
   	public static int powered_by_google_light = 0x7f020036;
   }

   public static class id{

   	public static int adjust_height = 0x7f070003;
   	public static int adjust_width = 0x7f070004;
   	public static int android_pay = 0x7f070029;
   	public static int android_pay_dark = 0x7f070020;
   	public static int android_pay_light = 0x7f070021;
   	public static int android_pay_light_with_border = 0x7f070022;
   	public static int auto = 0x7f07000c;
   	public static int book_now = 0x7f070019;
   	public static int buyButton = 0x7f070015;
   	public static int buy_now = 0x7f07001a;
   	public static int buy_with = 0x7f07001b;
   	public static int buy_with_google = 0x7f07001c;
   	public static int cast_notification_ = 0x7f070000;
   	public static int classic = 0x7f070023;
   	public static int dark = 0x7f07000d;
   	public static int donate_with = 0x7f07001d;
   	public static int donate_with_google = 0x7f07001e;
   	public static int google_wallet_classic = 0x7f070024;
   	public static int google_wallet_grayscale = 0x7f070025;
   	public static int google_wallet_monochrome = 0x7f070026;
   	public static int grayscale = 0x7f070027;
   	public static int holo_dark = 0x7f07000f;
   	public static int holo_light = 0x7f070010;
   	public static int hybr = 0x7f070005;
   	public static int icon_only = 0x7f070009;
   	public static int light = 0x7f07000e;
   	public static int logo_only = 0x7f07001f;
   	public static int match_parent = 0x7f070017;
   	public static int monochrome = 0x7f070028;
   	public static int none = 0x7f070001;
   	public static int normal = 0x7f070006;
   	public static int place_autocomplete_clear_button = 0x7f07002c;
   	public static int place_autocomplete_powered_by_google = 0x7f07002e;
   	public static int place_autocomplete_prediction_primary_text = 0x7f070030;
   	public static int place_autocomplete_prediction_secondary_text = 0x7f070031;
   	public static int place_autocomplete_progress = 0x7f07002f;
   	public static int place_autocomplete_search_button = 0x7f07002a;
   	public static int place_autocomplete_search_input = 0x7f07002b;
   	public static int place_autocomplete_separator = 0x7f07002d;
   	public static int production = 0x7f070011;
   	public static int sandbox = 0x7f070012;
   	public static int satellite = 0x7f070007;
   	public static int selectionDetails = 0x7f070016;
   	public static int slide = 0x7f070002;
   	public static int standard = 0x7f07000a;
   	public static int strict_sandbox = 0x7f070013;
   	public static int terrain = 0x7f070008;
   	public static int test = 0x7f070014;
   	public static int wide = 0x7f07000b;
   	public static int wrap_content = 0x7f070018;
   }

   public static class string{

   	public static int accept = 0x7f090000;
   	public static int auth_google_play_services_client_facebook_display_name = 0x7f090001;
   	public static int auth_google_play_services_client_google_display_name = 0x7f090002;
   	public static int cast_notification_connected_message = 0x7f090003;
   	public static int cast_notification_connecting_message = 0x7f090004;
   	public static int cast_notification_disconnect = 0x7f090005;
   	public static int common_google_play_services_api_unavailable_text = 0x7f090006;
   	public static int common_google_play_services_enable_button = 0x7f090007;
   	public static int common_google_play_services_enable_text = 0x7f090008;
   	public static int common_google_play_services_enable_title = 0x7f090009;
   	public static int common_google_play_services_install_button = 0x7f09000a;
   	public static int common_google_play_services_install_text_phone = 0x7f09000b;
   	public static int common_google_play_services_install_text_tablet = 0x7f09000c;
   	public static int common_google_play_services_install_title = 0x7f09000d;
   	public static int common_google_play_services_invalid_account_text = 0x7f09000e;
   	public static int common_google_play_services_invalid_account_title = 0x7f09000f;
   	public static int common_google_play_services_network_error_text = 0x7f090010;
   	public static int common_google_play_services_network_error_title = 0x7f090011;
   	public static int common_google_play_services_notification_ticker = 0x7f090012;
   	public static int common_google_play_services_restricted_profile_text = 0x7f090013;
   	public static int common_google_play_services_restricted_profile_title = 0x7f090014;
   	public static int common_google_play_services_sign_in_failed_text = 0x7f090015;
   	public static int common_google_play_services_sign_in_failed_title = 0x7f090016;
   	public static int common_google_play_services_unknown_issue = 0x7f090017;
   	public static int common_google_play_services_unsupported_text = 0x7f090018;
   	public static int common_google_play_services_unsupported_title = 0x7f090019;
   	public static int common_google_play_services_update_button = 0x7f09001a;
   	public static int common_google_play_services_update_text = 0x7f09001b;
   	public static int common_google_play_services_update_title = 0x7f09001c;
   	public static int common_google_play_services_updating_text = 0x7f09001d;
   	public static int common_google_play_services_updating_title = 0x7f09001e;
   	public static int common_google_play_services_wear_update_text = 0x7f09001f;
   	public static int common_open_on_phone = 0x7f090020;
   	public static int common_signin_button_text = 0x7f090021;
   	public static int common_signin_button_text_long = 0x7f090022;
   	public static int create_calendar_message = 0x7f090023;
   	public static int create_calendar_title = 0x7f090024;
   	public static int decline = 0x7f090025;
   	public static int place_autocomplete_clear_button = 0x7f090026;
   	public static int place_autocomplete_search_hint = 0x7f090027;
   	public static int store_picture_message = 0x7f090028;
   	public static int store_picture_title = 0x7f090029;
   	public static int wallet_buy_button_place_holder = 0x7f09002a;
   }

    public static void initialize() {
      //   R.attr.adSize = getResource("attr.adSize");
      //   R.attr.adUnitId = getResource("attr.adUnitId");
      //   R.attr.allowShortcuts = getResource("attr.allowShortcuts");
        // ... more ...
    }

    private static int getResource(String path) {
        int id = 0;
        try {
            id = TiRHelper.getResource(path);
        } catch (ResourceNotFoundException e) {}
        return id;
    }
}
