package defpackage;

import java.util.regex.Pattern;

/* renamed from: ckd  reason: default package */
/* compiled from: PG */
public final class ckd {
    public static final ckd a = new ckd();
    public final boolean b;
    public final int c;
    private final Pattern[] d;

    private ckd() {
        this(new Pattern[0]);
    }

    private ckd(Pattern... patternArr) {
        this.b = false;
        this.c = 2;
        this.d = patternArr;
    }

    public final Pattern[] a() {
        return (Pattern[]) this.d.clone();
    }
}
