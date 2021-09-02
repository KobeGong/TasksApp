package defpackage;

/* renamed from: beq reason: default package */
/* compiled from: PG */
public final class beq {
    public static android.content.Intent a(java.lang.String str) {
        android.net.Uri fromParts = android.net.Uri.fromParts("package", str, null);
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static android.content.Intent a(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static android.content.Intent a() {
        android.content.Intent intent = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static {
        android.net.Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }
}
