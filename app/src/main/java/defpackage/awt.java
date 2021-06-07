package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: awt  reason: default package */
/* compiled from: PG */
public final class awt {
    @Deprecated
    public static final ayd a = new ayd("ClearcutLogger.API", c, b);
    private static ayh b = new ayh((byte) 0);
    private static ayf c = new axn();
    private final String d;
    private final int e;
    private String f;
    private int g;
    private String h;
    private String i;
    private final awy j;
    private final bex k;
    private awx l;
    private final awv m;

    @Deprecated
    public awt(Context context, String str, String str2) {
        this(context, str, str2, new axc(context), bey.a, new axk(context));
    }

    private awt(Context context, String str, String str2, awy awy, bex bex, awv awv) {
        this.g = -1;
        this.d = context.getPackageName();
        this.e = a(context);
        this.g = -1;
        this.f = str;
        this.h = str2;
        this.i = null;
        this.j = awy;
        this.k = bex;
        this.l = new awx();
        this.m = awv;
    }

    private static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
    }

    static /* synthetic */ String d(awt awt) {
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
