package defpackage;

import android.os.SystemClock;

/* renamed from: cir  reason: default package */
/* compiled from: PG */
public final class cir {
    public long a;
    public long b;
    public long c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public String i;
    public edf j;
    public int k;
    public int l;
    public int m;
    public int n;

    public cir(String str) {
        if (str != null && !str.isEmpty()) {
            this.f = str;
        }
        this.a = SystemClock.elapsedRealtime();
    }
}
