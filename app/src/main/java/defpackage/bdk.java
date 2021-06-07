package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: bdk  reason: default package */
/* compiled from: PG */
public final class bdk implements aye, uy {
    private final /* synthetic */ auj a;

    public bdk() {
        new ArrayList();
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static byte[] a(dih dih) {
        if (dih == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dhn a2 = dhn.a(byteArrayOutputStream, dhn.a(dih.f()));
            dih.a(a2);
            a2.h();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            azb.a("Unable to serialize %s into ByteArray", (Throwable) e, dih.getClass().getSimpleName());
            return null;
        }
    }

    public static dih a(byte[] bArr, dih dih) {
        dih dih2;
        if (bArr == null) {
            return null;
        }
        try {
            dih dih3 = (dih) dih.a(bg.ap);
            dii dii = (dii) dih3.a(bg.ao);
            dii.a(dih3);
            dii dii2 = (dii) dii.a(bArr, bArr.length);
            if (dii2.b) {
                dih2 = dii2.a;
            } else {
                dih dih4 = dii2.a;
                djz.a.a(dih4).c(dih4);
                dii2.b = true;
                dih2 = dii2.a;
            }
            dih dih5 = dih2;
            if (dih.a(dih5, Boolean.TRUE.booleanValue())) {
                return dih5;
            }
            throw new dkw();
        } catch (dir e) {
            azb.a("Unable to parse %s from ByteArray", e, dih.getClass().getSimpleName());
            return null;
        }
    }

    public static void a(View view, boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(view, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static Calendar a() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(auz.a());
        a(instance);
        return instance;
    }

    public static void a(Calendar calendar) {
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
    }

    public static boolean b(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public bdk(auj auj) {
        this.a = auj;
    }

    @Override // defpackage.uy
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        this.a.b((View) nestedScrollView);
    }
}
