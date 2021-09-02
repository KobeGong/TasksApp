package defpackage;

/* renamed from: aiq reason: default package */
/* compiled from: PG */
public final class aiq {
    private static defpackage.aiq a;
    private defpackage.ajc b;
    private final java.util.Map c = new java.util.HashMap();
    private java.lang.String d;

    public static synchronized defpackage.aiq a() {
        defpackage.aiq aiq;
        synchronized (defpackage.aiq.class) {
            if (a == null) {
                a = new defpackage.aiq();
            }
            aiq = a;
        }
        return aiq;
    }

    aiq() {
    }

    public final synchronized void a(java.lang.String str) {
        this.d = str;
        defpackage.air c2 = c();
        if (c2 != null) {
            a(c2, str);
        }
    }

    public final synchronized defpackage.ais b(java.lang.String str) {
        defpackage.ais ais;
        ais = (defpackage.ais) this.c.get(str);
        if (ais == null) {
            ais = new defpackage.ais(this, str);
            this.c.put(str, ais);
        }
        return ais;
    }

    public final synchronized void a(defpackage.ajc ajc) {
        this.b = ajc;
        if (this.b != null) {
            defpackage.air c2 = c();
            if (c2 != null) {
                this.b.a(c2);
            }
        }
    }

    public final synchronized void b() {
        if (!android.text.TextUtils.isEmpty(this.d)) {
            defpackage.ais ais = (defpackage.ais) this.c.get(this.d);
            if (ais != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                synchronized (ais) {
                    if (ais.a != null) {
                        ais.a = null;
                        arrayList.addAll(ais.b);
                        java.util.ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            java.lang.Object obj = arrayList2.get(i);
                            i++;
                            ((defpackage.aiy) obj).a.b();
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.air air, java.lang.String str) {
        if (!str.equals(this.d) || this.b == null) {
            return false;
        }
        this.b.a(air);
        return true;
    }

    private final defpackage.air c() {
        if (this.d == null) {
            return null;
        }
        defpackage.ais ais = (defpackage.ais) this.c.get(this.d);
        if (ais == null) {
            return null;
        }
        return ais.a;
    }
}
