package defpackage;

/* renamed from: ais reason: default package */
/* compiled from: PG */
public final class ais {
    public defpackage.air a;
    public final java.util.List b = new java.util.ArrayList();
    private final java.lang.String c;
    private final /* synthetic */ defpackage.aiq d;

    ais(defpackage.aiq aiq, java.lang.String str) {
        this.d = aiq;
        this.c = str;
    }

    public final synchronized void a(defpackage.air air) {
        if (this.a != null) {
            new java.lang.Object[1][0] = air;
        } else {
            this.a = air;
            if (!this.d.a(this.a, this.c)) {
                new java.lang.Object[1][0] = air;
                this.a = null;
            }
        }
    }

    public final synchronized void a(defpackage.aiy aiy) {
        this.b.add(aiy);
    }

    public final synchronized boolean a() {
        return this.a != null;
    }
}
