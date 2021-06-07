package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: bvp  reason: default package */
/* compiled from: PG */
public final class bvp {
    public Long a;
    private Long b;

    public final bvp a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final bvo a() {
        String str = "";
        if (this.b == null) {
            str = String.valueOf(str).concat(" startTime");
        }
        if (str.isEmpty()) {
            return new bvj(this.a, this.b.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    bvp() {
    }
}
