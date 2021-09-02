package defpackage;

/* renamed from: dpx reason: default package */
/* compiled from: PG */
public enum dpx {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    public final int r;
    public final byte[] s;

    public static defpackage.dpx a(java.lang.String str) {
        return (defpackage.dpx) java.lang.Enum.valueOf(defpackage.dpx.class, str);
    }

    private dpx(int i) {
        this.r = i;
        this.s = java.lang.Integer.toString(i).getBytes(defpackage.crp.a);
    }

    public final defpackage.dpw a() {
        return (defpackage.dpw) defpackage.dpw.a.get(this.r);
    }
}
