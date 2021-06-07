package defpackage;

import java.util.Map;

/* renamed from: qu  reason: default package */
/* compiled from: PG */
final class qu extends qz {
    private final /* synthetic */ qt c;

    qu(qt qtVar) {
        this.c = qtVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int a() {
        return this.c.b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Object a(int i, int i2) {
        return this.c.a[i];
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final int b(Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Map b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void a(Object obj, Object obj2) {
        this.c.add(obj);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final Object a(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void a(int i) {
        this.c.a(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qz
    public final void c() {
        this.c.clear();
    }
}
