package defpackage;

/* renamed from: coz  reason: default package */
/* compiled from: PG */
public final class coz implements ecz {
    private final cox a;
    private coo b;

    public coz(ecz ecz) {
        this.a = new cox(ecz);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final coo a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = (coo) this.a.a();
                }
            }
        }
        return this.b;
    }
}
