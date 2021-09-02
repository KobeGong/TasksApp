package defpackage;

/* renamed from: aqo reason: default package */
public final /* synthetic */ class aqo implements java.util.concurrent.Callable {
    private final defpackage.aql a;
    private final int b;
    private final defpackage.cyi c;
    private final defpackage.cyu d;
    private final java.util.Locale e;

    public aqo(defpackage.aql aql, int i, defpackage.cyi cyi, defpackage.cyu cyu, java.util.Locale locale) {
        this.a = aql;
        this.b = i;
        this.c = cyi;
        this.d = cyu;
        this.e = locale;
    }

    public final java.lang.Object call() {
        return this.a.a(this.b, this.c, this.d, this.e);
    }
}
