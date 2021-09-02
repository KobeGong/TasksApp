package defpackage;

/* renamed from: ckd reason: default package */
/* compiled from: PG */
public final class ckd {
    public static final defpackage.ckd a = new defpackage.ckd();
    public final boolean b;
    public final int c;
    private final java.util.regex.Pattern[] d;

    private ckd() {
        this(new java.util.regex.Pattern[0]);
    }

    private ckd(java.util.regex.Pattern... patternArr) {
        this.b = false;
        this.c = 2;
        this.d = patternArr;
    }

    public final java.util.regex.Pattern[] a() {
        return (java.util.regex.Pattern[]) this.d.clone();
    }
}
