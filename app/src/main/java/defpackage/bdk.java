package defpackage;

/* renamed from: bdk reason: default package */
/* compiled from: PG */
public final class bdk implements defpackage.aye, defpackage.uy {
    private final /* synthetic */ TasksFragment a;

    public bdk() {
        new java.util.ArrayList();
    }

    public static boolean a(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static byte[] a(defpackage.dih dih) {
        byte[] bArr = null;
        if (dih == null) {
            return bArr;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            defpackage.dhn a2 = defpackage.dhn.a((java.io.OutputStream) byteArrayOutputStream, defpackage.dhn.a(dih.f()));
            dih.a(a2);
            a2.h();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            defpackage.azb.a("Unable to serialize %s into ByteArray", (java.lang.Throwable) e, dih.getClass().getSimpleName());
            return bArr;
        }
    }

    public static defpackage.dih a(byte[] bArr, defpackage.dih dih) {
        defpackage.dih dih2;
        if (bArr == null) {
            return null;
        }
        try {
            defpackage.dih dih3 = (defpackage.dih) dih.a(defpackage.bg.ap);
            defpackage.dii dii = (defpackage.dii) dih3.a(defpackage.bg.ao);
            dii.a(dih3);
            defpackage.dii dii2 = (defpackage.dii) dii.a(bArr, bArr.length);
            if (dii2.b) {
                dih2 = dii2.a;
            } else {
                defpackage.dih dih4 = dii2.a;
                defpackage.djz.a.a((java.lang.Object) dih4).c(dih4);
                dii2.b = true;
                dih2 = dii2.a;
            }
            defpackage.dih dih5 = dih2;
            if (defpackage.dih.a(dih5, java.lang.Boolean.TRUE.booleanValue())) {
                return dih5;
            }
            throw new defpackage.dkw();
        } catch (defpackage.dir e) {
            defpackage.azb.a("Unable to parse %s from ByteArray", (java.lang.Throwable) e, dih.getClass().getSimpleName());
            return null;
        }
    }

    public static void a(android.view.View view, boolean z) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(view, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static java.util.Calendar a() {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(defpackage.auz.a());
        a(instance);
        return instance;
    }

    public static void a(java.util.Calendar calendar) {
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
    }

    public static boolean b(android.content.Context context) {
        java.util.List enabledAccessibilityServiceList = ((android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && !enabledAccessibilityServiceList.isEmpty();
    }

    public bdk(TasksFragment auj) {
        this.a = auj;
    }

    public final void a(android.support.v4.widget.NestedScrollView nestedScrollView, int i, int i2) {
        this.a.b(nestedScrollView);
    }
}
