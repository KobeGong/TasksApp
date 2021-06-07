package defpackage;

/* renamed from: bkw  reason: default package */
/* compiled from: PG */
public class bkw extends blb {
    public bky a;

    /* access modifiers changed from: protected */
    @Override // defpackage.blb
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

    @Override // defpackage.blb
    public void a(bku bku) {
        if (this.a != null) {
            for (int i = 0; i < this.a.b; i++) {
                this.a.a[i].a(bku);
            }
        }
    }

    /* renamed from: b */
    public bkw clone() {
        bkw bkw = (bkw) super.clone();
        bla.a(this, bkw);
        return bkw;
    }

    @Override // defpackage.blb
    public /* synthetic */ blb c() {
        return (bkw) clone();
    }
}
