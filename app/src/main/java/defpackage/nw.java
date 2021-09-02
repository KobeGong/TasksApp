package defpackage;

/* renamed from: nw reason: default package */
/* compiled from: PG */
public final class nw implements java.lang.Iterable {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final android.content.Context b;

    public nw(android.content.Context context) {
        this.b = context;
    }

    public final defpackage.nw a(android.content.ComponentName componentName) {
        int size = this.a.size();
        try {
            android.content.Intent a2 = defpackage.jd.a(this.b, componentName);
            while (a2 != null) {
                this.a.add(size, a2);
                a2 = defpackage.jd.a(this.b, a2.getComponent());
            }
            return this;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @java.lang.Deprecated
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }

    static {
        new defpackage.ny(0);
    }
}
