package defpackage;

/* renamed from: qs reason: default package */
/* compiled from: PG */
final class qs extends defpackage.qz {
    private final /* synthetic */ defpackage.qr c;

    qs(defpackage.qr qrVar) {
        this.c = qrVar;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return this.c.b;
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i, int i2) {
        return this.c.a[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    public final int a(java.lang.Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: protected */
    public final int b(java.lang.Object obj) {
        return this.c.b(obj);
    }

    /* access modifiers changed from: protected */
    public final java.util.Map b() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        this.c.put(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i, java.lang.Object obj) {
        defpackage.qr qrVar = this.c;
        int i2 = (i << 1) + 1;
        java.lang.Object obj2 = qrVar.a[i2];
        qrVar.a[i2] = obj;
        return obj2;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        this.c.d(i);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c.clear();
    }
}
