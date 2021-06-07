package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: eab  reason: default package */
/* compiled from: PG */
final class eab extends ThreadLocal {
    eab() {
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new WeakReference(new byte[4096]);
    }
}
