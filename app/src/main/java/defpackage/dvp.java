package defpackage;

/* renamed from: dvp reason: default package */
/* compiled from: PG */
abstract class dvp {
    public final java.util.HashSet a = new java.util.HashSet();

    dvp() {
    }

    /* access modifiers changed from: 0000 */
    public abstract void a();

    /* access modifiers changed from: 0000 */
    public abstract void b();

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj, boolean z) {
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
