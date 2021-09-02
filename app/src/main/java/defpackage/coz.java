package defpackage;

/* renamed from: coz reason: default package */
/* compiled from: PG */
public final class coz implements defpackage.ecz {
    private final defpackage.cox a;
    private defpackage.coo b;

    public coz(defpackage.ecz ecz) {
        this.a = new defpackage.cox(ecz);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.coo a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = (defpackage.coo) this.a.a();
                }
            }
        }
        return this.b;
    }
}
