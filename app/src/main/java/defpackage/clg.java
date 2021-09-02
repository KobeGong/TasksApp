package defpackage;

/* renamed from: clg reason: default package */
/* compiled from: PG */
final class clg {
    public volatile java.lang.String a;
    public volatile long b;
    public final java.util.ArrayList c;
    private long d;

    clg() {
    }

    clg(java.lang.String str, long j) {
        this.c = new java.util.ArrayList();
        this.d = 1;
        a(str, this.d, 0, j, j);
    }

    /* access modifiers changed from: 0000 */
    public final long a(java.lang.String str, long j, long j2) {
        long j3 = this.d + 1;
        this.d = j3;
        return a(str, j3, 1, j, j2);
    }

    private final long a(java.lang.String str, long j, long j2, long j3, long j4) {
        if (j4 < j3) {
            java.lang.String str2 = "PrimesStartupTracer";
            java.lang.String str3 = "endTime < startTime. Dropping span: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            defpackage.cdm.a(5, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3), new java.lang.Object[0]);
            return -1;
        }
        defpackage.efs efs = new defpackage.efs();
        efs.b = java.lang.Long.valueOf(j);
        efs.a = str;
        efs.d = java.lang.Long.valueOf(j3);
        efs.e = java.lang.Long.valueOf(j4 - j3);
        efs.c = java.lang.Long.valueOf(j2);
        this.c.add(efs);
        return j;
    }
}
