package defpackage;

/* renamed from: bjs reason: default package */
/* compiled from: PG */
public final class bjs extends defpackage.bmc {
    private /* synthetic */ java.lang.String e;
    private /* synthetic */ java.lang.String f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;

    private bjs(defpackage.ayp ayp) {
        super(ayp);
    }

    public final /* synthetic */ defpackage.ayw a(com.google.android.gms.common.api.Status status) {
        return new defpackage.bjt(status);
    }

    public bjs(defpackage.ayp ayp, java.lang.String str, java.lang.String str2, int i, int i2) {
        this.e = str;
        this.f = null;
        this.g = i;
        this.h = 1;
        this(ayp);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(defpackage.ayg ayg) {
        defpackage.bet a = ((defpackage.bnq) ayg).a(this, this.e, this.f, this.g, this.h);
        synchronized (this.a) {
            this.b = a;
        }
    }
}
