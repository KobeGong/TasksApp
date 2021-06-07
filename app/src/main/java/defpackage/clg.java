package defpackage;

import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: clg  reason: default package */
/* compiled from: PG */
public final class clg {
    public volatile String a;
    public volatile long b;
    public final ArrayList c;
    private long d;

    clg() {
    }

    clg(String str, long j) {
        this.c = new ArrayList();
        this.d = 1;
        a(str, this.d, 0, j, j);
    }

    /* access modifiers changed from: package-private */
    public final long a(String str, long j, long j2) {
        long j3 = this.d + 1;
        this.d = j3;
        return a(str, j3, 1, j, j2);
    }

    private final long a(String str, long j, long j2, long j3, long j4) {
        if (j4 < j3) {
            String valueOf = String.valueOf(str);
            cdm.a(5, "PrimesStartupTracer", valueOf.length() != 0 ? "endTime < startTime. Dropping span: ".concat(valueOf) : new String("endTime < startTime. Dropping span: "), new Object[0]);
            return -1;
        }
        efs efs = new efs();
        efs.b = Long.valueOf(j);
        efs.a = str;
        efs.d = Long.valueOf(j3);
        efs.e = Long.valueOf(j4 - j3);
        efs.c = Long.valueOf(j2);
        this.c.add(efs);
        return j;
    }
}
