package defpackage;

/* renamed from: ejd  reason: default package */
/* compiled from: PG */
public final class ejd {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;

    public ejd() {
    }

    public ejd(long j, long j2, long j3, long j4, long j5) {
        this();
        this.c = Long.valueOf(j4);
        this.d = Long.valueOf(j5);
        if (j == -1 || j2 == -1) {
            this.a = null;
        } else {
            this.a = Long.valueOf(j2 - j);
        }
        if (j == -1 || j3 == -1) {
            this.b = null;
        } else {
            this.b = Long.valueOf(j3 - j);
        }
    }
}
