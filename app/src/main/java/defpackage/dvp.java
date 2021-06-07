package defpackage;

import java.util.HashSet;

/* access modifiers changed from: package-private */
/* renamed from: dvp  reason: default package */
/* compiled from: PG */
public abstract class dvp {
    public final HashSet a = new HashSet();

    dvp() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public final void a(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size == 0) {
                a();
            }
        } else if (this.a.remove(obj) && size == 1) {
            b();
        }
    }
}
