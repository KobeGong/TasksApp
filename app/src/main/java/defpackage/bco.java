package defpackage;

/* renamed from: bco reason: default package */
/* compiled from: PG */
public final class bco {
    public defpackage.bbm a;
    private android.os.Looper b;

    public final defpackage.ayo a() {
        if (this.a == null) {
            this.a = new defpackage.bbm();
        }
        if (this.b == null) {
            this.b = android.os.Looper.getMainLooper();
        }
        return new defpackage.ayo(this.a, this.b);
    }
}
