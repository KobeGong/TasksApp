package defpackage;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: aru  reason: default package */
/* compiled from: PG */
public final class aru {
    public final WeakReference a;
    public int b;
    public boolean c;

    aru(int i, art art) {
        this.a = new WeakReference(art);
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(art art) {
        return art != null && this.a.get() == art;
    }
}
