package defpackage;

/* renamed from: bkw reason: default package */
/* compiled from: PG */
public class bkw extends defpackage.blb {
    public defpackage.bky a;

    /* access modifiers changed from: protected */
    public int a() {
        if (this.a == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.a.b; i2++) {
            i += this.a.a[i2].a();
        }
        return i;
    }

    public void a(defpackage.bku bku) {
        if (this.a != null) {
            for (int i = 0; i < this.a.b; i++) {
                this.a.a[i].a(bku);
            }
        }
    }

    /* renamed from: b */
    public defpackage.bkw clone() {
        defpackage.bkw bkw = (defpackage.bkw) super.clone();
        defpackage.bla.a(this, bkw);
        return bkw;
    }

    public /* synthetic */ defpackage.blb c() {
        return (defpackage.bkw) clone();
    }
}
