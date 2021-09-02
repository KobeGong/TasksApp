package defpackage;

/* renamed from: cvq reason: default package */
/* compiled from: PG */
public final class cvq extends defpackage.cvg implements defpackage.cux {
    private final java.lang.String b;

    public cvq(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String str3;
        super(str2);
        if (str.length() + str2.length() <= 23) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            java.lang.String valueOf2 = java.lang.String.valueOf(str2);
            this.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
            return;
        }
        java.lang.String replace = str2.replace('$', '.');
        java.lang.String substring = replace.substring(replace.lastIndexOf(46) + 1);
        if (z || android.os.Build.VERSION.SDK_INT < 26) {
            java.lang.String valueOf3 = java.lang.String.valueOf(str);
            java.lang.String valueOf4 = java.lang.String.valueOf(substring);
            java.lang.String str4 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
            str3 = str4.substring(0, java.lang.Math.min(str4.length(), 23));
        } else {
            java.lang.String valueOf5 = java.lang.String.valueOf(str);
            java.lang.String valueOf6 = java.lang.String.valueOf(substring);
            str3 = valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new java.lang.String(valueOf5);
        }
        this.b = str3;
    }

    public final boolean a(java.util.logging.Level level) {
        return android.util.Log.isLoggable(this.b, b(level));
    }

    public final void a(defpackage.cuo cuo) {
        defpackage.cuw.a(cuo, (defpackage.cux) this);
    }

    private static int b(java.util.logging.Level level) {
        int intValue = level.intValue();
        if (intValue >= 1000) {
            return 6;
        }
        if (intValue >= 900) {
            return 5;
        }
        if (intValue >= 800) {
            return 4;
        }
        if (intValue >= 700) {
            return 3;
        }
        return 2;
    }

    public final void a(java.util.logging.Level level, java.lang.String str, java.lang.Throwable th) {
        switch (b(level)) {
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                android.util.Log.w(this.b, str, th);
                return;
            case 6:
                android.util.Log.e(this.b, str, th);
                return;
            default:
                android.util.Log.wtf(this.b, java.lang.String.format("Level \"%d\" is not a valid level", new java.lang.Object[]{java.lang.Integer.valueOf(level.intValue())}));
                return;
        }
    }
}
