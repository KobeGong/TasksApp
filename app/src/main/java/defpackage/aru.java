package defpackage;

/* renamed from: aru reason: default package */
/* compiled from: PG */
final class aru {
    public final java.lang.ref.WeakReference a;
    public int b;
    public boolean c;

    aru(int i, defpackage.art art) {
        this.a = new java.lang.ref.WeakReference(art);
        this.b = i;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.art art) {
        return art != null && this.a.get() == art;
    }
}
