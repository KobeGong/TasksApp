package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;

/* access modifiers changed from: package-private */
/* renamed from: kr  reason: default package */
/* compiled from: PG */
public final class kr implements Runnable {
    private final /* synthetic */ String[] a;
    private final /* synthetic */ Activity b;
    private final /* synthetic */ int c = 1000;

    kr(String[] strArr, Activity activity) {
        this.a = strArr;
        this.b = activity;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((ks) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
