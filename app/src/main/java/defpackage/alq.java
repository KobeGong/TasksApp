package defpackage;

/* renamed from: alq reason: default package */
/* compiled from: PG */
public final class alq {
    private static defpackage.alq d;
    public java.util.List a = new java.util.ArrayList();
    public android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    public java.lang.String c;

    private alq() {
    }

    public final void a(defpackage.alu alu) {
        this.a.add(alu);
    }

    public final void b(defpackage.alu alu) {
        this.a.remove(alu);
    }

    public final void a(java.lang.String str) {
        this.b.post(new defpackage.als(this, str));
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        this.b.post(new defpackage.alt(this, str, str2));
    }

    public static synchronized defpackage.alq a() {
        defpackage.alq alq;
        synchronized (defpackage.alq.class) {
            if (d == null) {
                d = new defpackage.alq();
            }
            alq = d;
        }
        return alq;
    }
}
