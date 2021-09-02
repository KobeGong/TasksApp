package defpackage;

/* renamed from: awt reason: default package */
/* compiled from: PG */
public final class awt {
    @java.lang.Deprecated
    public static final defpackage.ayd a = new defpackage.ayd("ClearcutLogger.API", c, b);
    private static defpackage.ayh b = new defpackage.ayh(0);
    private static defpackage.ayf c = new defpackage.axn();
    /* access modifiers changed from: private */
    public final java.lang.String d;
    /* access modifiers changed from: private */
    public final int e;
    /* access modifiers changed from: private */
    public java.lang.String f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public java.lang.String h;
    private java.lang.String i;
    /* access modifiers changed from: private */
    public final defpackage.awy j;
    /* access modifiers changed from: private */
    public final defpackage.bex k;
    /* access modifiers changed from: private */
    public defpackage.awx l;
    /* access modifiers changed from: private */
    public final defpackage.awv m;

    @java.lang.Deprecated
    public awt(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this(context, str, str2, new defpackage.axc(context), defpackage.bey.a, new defpackage.axk(context));
    }

    private awt(android.content.Context context, java.lang.String str, java.lang.String str2, defpackage.awy awy, defpackage.bex bex, defpackage.awv awv) {
        this.g = -1;
        this.d = context.getPackageName();
        this.e = a(context);
        this.g = -1;
        this.f = str;
        this.h = str2;
        this.i = null;
        this.j = awy;
        this.k = bex;
        this.l = new defpackage.awx();
        this.m = awv;
    }

    private static int a(android.content.Context context) {
        boolean z = false;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            android.util.Log.wtf("ClearcutLogger", "This can't happen.");
            return z;
        }
    }

    static /* synthetic */ java.lang.String d(defpackage.awt awt) {
        return null;
    }

    static /* synthetic */ int a() {
        return 0;
    }

    public static /* synthetic */ boolean b() {
        return false;
    }

    static /* synthetic */ int[] c() {
        return null;
    }
}
