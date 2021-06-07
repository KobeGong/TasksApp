package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.logging.Level;

/* renamed from: cvq  reason: default package */
/* compiled from: PG */
public final class cvq extends cvg implements cux {
    private final String b;

    public cvq(String str, String str2, boolean z) {
        super(str2);
        String str3;
        if (str.length() + str2.length() <= 23) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(str2);
            this.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            return;
        }
        String replace = str2.replace('$', '.');
        String substring = replace.substring(replace.lastIndexOf(46) + 1);
        if (z || Build.VERSION.SDK_INT < 26) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(substring);
            String concat = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            str3 = concat.substring(0, Math.min(concat.length(), 23));
        } else {
            String valueOf5 = String.valueOf(str);
            String valueOf6 = String.valueOf(substring);
            str3 = valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5);
        }
        this.b = str3;
    }

    @Override // defpackage.cup
    public final boolean a(Level level) {
        return Log.isLoggable(this.b, b(level));
    }

    @Override // defpackage.cup
    public final void a(cuo cuo) {
        cuw.a(cuo, this);
    }

    private static int b(Level level) {
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

    @Override // defpackage.cux
    public final void a(Level level, String str, Throwable th) {
        switch (b(level)) {
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                Log.w(this.b, str, th);
                return;
            case 6:
                Log.e(this.b, str, th);
                return;
            default:
                Log.wtf(this.b, String.format("Level \"%d\" is not a valid level", Integer.valueOf(level.intValue())));
                return;
        }
    }
}
