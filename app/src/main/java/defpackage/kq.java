package defpackage;

/* renamed from: kq reason: default package */
/* compiled from: PG */
public final class kq extends defpackage.ob {
    public static defpackage.kt a() {
        return null;
    }

    public static void a(android.app.Activity activity, android.content.Intent intent, int i, android.os.Bundle bundle) {
        activity.startActivityForResult(intent, i, null);
    }

    public static void a(android.app.Activity activity) {
        activity.finishAffinity();
    }

    public static void a(android.app.Activity activity, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof defpackage.ku) {
                ((defpackage.ku) activity).a_();
            }
            activity.requestPermissions(strArr, 1000);
        } else if (activity instanceof defpackage.ks) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.kr(strArr, activity));
        }
    }

    public static boolean a(android.app.Activity activity, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
