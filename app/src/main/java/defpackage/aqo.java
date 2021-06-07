package defpackage;

import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: aqo  reason: default package */
public final /* synthetic */ class aqo implements Callable {
    private final aql a;
    private final int b;
    private final cyi c;
    private final cyu d;
    private final Locale e;

    public aqo(aql aql, int i, cyi cyi, cyu cyu, Locale locale) {
        this.a = aql;
        this.b = i;
        this.c = cyi;
        this.d = cyu;
        this.e = locale;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c, this.d, this.e);
    }
}
