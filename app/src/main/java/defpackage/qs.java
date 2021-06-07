package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: qs  reason: default package */
/* compiled from: PG */
public final class qs extends qz {
    private final /* synthetic */ qr c;

    qs(qr qrVar) {
        this.c = qrVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int a() {
        return this.c.b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Object a(int i, int i2) {
        return this.c.a[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int b(Object obj) {
        return this.c.b(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Map b() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void a(Object obj, Object obj2) {
        this.c.put(obj, obj2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Object a(int i, Object obj) {
        qr qrVar = this.c;
        int i2 = (i << 1) + 1;
        Object obj2 = qrVar.a[i2];
        qrVar.a[i2] = obj;
        return obj2;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void a(int i) {
        this.c.d(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void c() {
        this.c.clear();
    }
}
