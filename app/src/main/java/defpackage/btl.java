package defpackage;

/* renamed from: btl  reason: default package */
/* compiled from: PG */
public abstract class btl {
    public static final btl a = new btm().a(btn.SUCCESS).a();

    public static final btl a(Throwable th) {
        btm a2 = new btm().a(btn.PERMANENT_FAILURE);
        a2.a = th;
        return a2.a();
    }

    public abstract btn a();

    public abstract Throwable b();

    public static final btl b(Throwable th) {
        btm a2 = new btm().a(btn.TRANSIENT_FAILURE);
        a2.a = th;
        return a2.a();
    }

    btl() {
    }
}
