package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: clf  reason: default package */
/* compiled from: PG */
public final class clf {
    public static volatile clf a = new clf();
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile civ i;
    private final List j = new ArrayList();

    clf() {
    }

    /* access modifiers changed from: package-private */
    public final clg[] a() {
        clg[] clgArr;
        synchronized (this.j) {
            clgArr = (clg[]) this.j.toArray(new clg[this.j.size()]);
        }
        return clgArr;
    }
}
