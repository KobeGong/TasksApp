package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: kq  reason: default package */
/* compiled from: PG */
public final class kq extends ob {
    public static kt a() {
        return null;
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, null);
    }

    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void a(Activity activity, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof ku) {
                ((ku) activity).a_();
            }
            activity.requestPermissions(strArr, 1000);
        } else if (activity instanceof ks) {
            new Handler(Looper.getMainLooper()).post(new kr(strArr, activity));
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
