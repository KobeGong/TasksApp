package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dvl  reason: default package */
/* compiled from: PG */
public final class dvl {
    public final /* synthetic */ dvk a;

    dvl(dvk dvk) {
        this.a = dvk;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int b;
        if (this.a.f - this.a.e > 0) {
            b = this.a.d[this.a.e] & 255;
            dvk.a(this.a, 1);
        } else {
            b = this.a.a.b();
        }
        this.a.b.update(b);
        dvk.b(this.a, 1);
        return b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return (this.a.f - this.a.e) + this.a.a.a;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return a() | (a() << 8);
    }
}
