package defpackage;

/* renamed from: dia reason: default package */
/* compiled from: PG */
final class dia {
    public static final defpackage.dia d = new defpackage.dia(0);
    public final defpackage.dkk a = defpackage.dkk.a(16);
    public boolean b;
    public boolean c = false;

    private dia() {
    }

    private dia(byte b2) {
        a();
    }

    public final void a() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dia)) {
            return false;
        }
        return this.a.equals(((defpackage.dia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.util.Iterator b() {
        if (this.c) {
            return new defpackage.diw(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    private final void b(defpackage.dib dib, java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    public final boolean c() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (java.util.Map.Entry c2 : this.a.c()) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(java.util.Map.Entry entry) {
        entry.getKey();
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.Map.Entry entry) {
        defpackage.dib dib = (defpackage.dib) entry.getKey();
        if (entry.getValue() instanceof defpackage.diu) {
            defpackage.diu.a();
        }
        throw new java.lang.NoSuchMethodError();
    }

    static void a(defpackage.dhn dhn, defpackage.dln dln, int i, java.lang.Object obj) {
        if (dln == defpackage.dln.GROUP) {
            defpackage.dim.a();
            defpackage.djo djo = (defpackage.djo) obj;
            dhn.a(i, 3);
            djo.a(dhn);
            dhn.a(i, 4);
            return;
        }
        dhn.a(i, dln.f);
        switch (dln.ordinal()) {
            case 0:
                dhn.a(((java.lang.Double) obj).doubleValue());
                return;
            case 1:
                dhn.a(((java.lang.Float) obj).floatValue());
                return;
            case 2:
                dhn.a(((java.lang.Long) obj).longValue());
                return;
            case 3:
                dhn.a(((java.lang.Long) obj).longValue());
                return;
            case 4:
                dhn.b(((java.lang.Integer) obj).intValue());
                return;
            case 5:
                dhn.c(((java.lang.Long) obj).longValue());
                return;
            case 6:
                dhn.e(((java.lang.Integer) obj).intValue());
                return;
            case 7:
                dhn.a(((java.lang.Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof defpackage.dha) {
                    dhn.a((defpackage.dha) obj);
                    return;
                } else {
                    dhn.a((java.lang.String) obj);
                    return;
                }
            case 9:
                ((defpackage.djo) obj).a(dhn);
                return;
            case 10:
                dhn.a((defpackage.djo) obj);
                return;
            case 11:
                if (obj instanceof defpackage.dha) {
                    dhn.a((defpackage.dha) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                dhn.a(bArr, bArr.length);
                return;
            case 12:
                dhn.c(((java.lang.Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof defpackage.din) {
                    dhn.b(((defpackage.din) obj).a());
                    return;
                } else {
                    dhn.b(((java.lang.Integer) obj).intValue());
                    return;
                }
            case 14:
                dhn.e(((java.lang.Integer) obj).intValue());
                return;
            case 15:
                dhn.c(((java.lang.Long) obj).longValue());
                return;
            case 16:
                dhn.d(((java.lang.Integer) obj).intValue());
                return;
            case 17:
                dhn.b(((java.lang.Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    static int b(java.util.Map.Entry entry) {
        defpackage.dib dib = (defpackage.dib) entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }

    static int a(defpackage.dln dln, int i, java.lang.Object obj) {
        int m = defpackage.dhn.m(i);
        if (dln == defpackage.dln.GROUP) {
            defpackage.dim.a();
            m <<= 1;
        }
        return m + a(dln, obj);
    }

    private static int a(defpackage.dln dln, java.lang.Object obj) {
        switch (dln.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                return defpackage.dhn.f();
            case 1:
                ((java.lang.Float) obj).floatValue();
                return defpackage.dhn.e();
            case 2:
                return defpackage.dhn.d(((java.lang.Long) obj).longValue());
            case 3:
                return defpackage.dhn.e(((java.lang.Long) obj).longValue());
            case 4:
                return defpackage.dhn.n(((java.lang.Integer) obj).intValue());
            case 5:
                ((java.lang.Long) obj).longValue();
                return defpackage.dhn.c();
            case 6:
                ((java.lang.Integer) obj).intValue();
                return defpackage.dhn.a();
            case 7:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.dhn.g();
            case 8:
                if (obj instanceof defpackage.dha) {
                    return defpackage.dhn.b((defpackage.dha) obj);
                }
                return defpackage.dhn.b((java.lang.String) obj);
            case 9:
                return defpackage.dhn.c((defpackage.djo) obj);
            case 10:
                if (obj instanceof defpackage.diu) {
                    return defpackage.dhn.a((defpackage.dix) (defpackage.diu) obj);
                }
                return defpackage.dhn.b((defpackage.djo) obj);
            case 11:
                if (obj instanceof defpackage.dha) {
                    return defpackage.dhn.b((defpackage.dha) obj);
                }
                return defpackage.dhn.b((byte[]) obj);
            case 12:
                return defpackage.dhn.o(((java.lang.Integer) obj).intValue());
            case 13:
                if (obj instanceof defpackage.din) {
                    return defpackage.dhn.q(((defpackage.din) obj).a());
                }
                return defpackage.dhn.q(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).intValue();
                return defpackage.dhn.b();
            case 15:
                ((java.lang.Long) obj).longValue();
                return defpackage.dhn.d();
            case 16:
                return defpackage.dhn.p(((java.lang.Integer) obj).intValue());
            case 17:
                return defpackage.dhn.f(((java.lang.Long) obj).longValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int a(defpackage.dib dib, java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    public final /* synthetic */ java.lang.Object clone() {
        defpackage.dia dia = new defpackage.dia();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.b()) {
                break;
            }
            java.util.Map.Entry b2 = this.a.b(i2);
            dia.b((defpackage.dib) b2.getKey(), b2.getValue());
            i = i2 + 1;
        }
        for (java.util.Map.Entry entry : this.a.c()) {
            dia.b((defpackage.dib) entry.getKey(), entry.getValue());
        }
        dia.c = this.c;
        return dia;
    }
}
