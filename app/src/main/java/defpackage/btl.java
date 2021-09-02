package defpackage;

/* renamed from: btl reason: default package */
/* compiled from: PG */
public abstract class btl {
    public static final defpackage.btl a = new defpackage.btm().a(defpackage.btn.SUCCESS).a();

    public static final defpackage.btl a(java.lang.Throwable th) {
        defpackage.btm a2 = new defpackage.btm().a(defpackage.btn.PERMANENT_FAILURE);
        a2.a = th;
        return a2.a();
    }

    public abstract defpackage.btn a();

    public abstract java.lang.Throwable b();

    public static final defpackage.btl b(java.lang.Throwable th) {
        defpackage.btm a2 = new defpackage.btm().a(defpackage.btn.TRANSIENT_FAILURE);
        a2.a = th;
        return a2.a();
    }

    btl() {
    }
}
