package defpackage;

/* renamed from: yb reason: default package */
/* compiled from: PG */
public final class yb {
    public android.content.Context a;

    public static defpackage.yb a(android.content.Context context) {
        return new defpackage.yb(context);
    }

    private yb(android.content.Context context) {
        this.a = context;
    }

    public final int a() {
        android.content.res.Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(2131558400);
    }
}
