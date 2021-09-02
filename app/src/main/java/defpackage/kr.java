package defpackage;

/* renamed from: kr reason: default package */
/* compiled from: PG */
final class kr implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String[] a;
    private final /* synthetic */ android.app.Activity b;
    private final /* synthetic */ int c = 1000;

    kr(java.lang.String[] strArr, android.app.Activity activity) {
        this.a = strArr;
        this.b = activity;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        android.content.pm.PackageManager packageManager = this.b.getPackageManager();
        java.lang.String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((defpackage.ks) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
