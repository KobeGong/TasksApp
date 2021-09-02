package defpackage;

/* renamed from: ejd reason: default package */
/* compiled from: PG */
public final class ejd {
    public final java.lang.Long a;
    public final java.lang.Long b;
    public final java.lang.Long c;
    public final java.lang.Long d;

    public ejd() {
    }

    public ejd(long j, long j2, long j3, long j4, long j5) {
        this();
        this.c = java.lang.Long.valueOf(j4);
        this.d = java.lang.Long.valueOf(j5);
        if (j == -1 || j2 == -1) {
            this.a = null;
        } else {
            this.a = java.lang.Long.valueOf(j2 - j);
        }
        if (j == -1 || j3 == -1) {
            this.b = null;
        } else {
            this.b = java.lang.Long.valueOf(j3 - j);
        }
    }
}
