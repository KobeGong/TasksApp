package defpackage;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: dia  reason: default package */
/* compiled from: PG */
public final class dia {
    public static final dia d = new dia((byte) 0);
    public final dkk a = dkk.a(16);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dia)) {
            return false;
        }
        return this.a.equals(((dia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator b() {
        if (this.c) {
            return new diw(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    private final void b(dib dib, Object obj) {
        throw new NoSuchMethodError();
    }

    public final boolean c() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.a.c()) {
            if (!c(entry)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Map.Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void a(Map.Entry entry) {
        dib dib = (dib) entry.getKey();
        if (entry.getValue() instanceof diu) {
            diu.a();
        }
        throw new NoSuchMethodError();
    }

    static void a(dhn dhn, dln dln, int i, Object obj) {
        if (dln == dln.GROUP) {
            dim.a();
            dhn.a(i, 3);
            ((djo) obj).a(dhn);
            dhn.a(i, 4);
            return;
        }
        dhn.a(i, dln.f);
        switch (dln.ordinal()) {
            case 0:
                dhn.a(((Double) obj).doubleValue());
                return;
            case 1:
                dhn.a(((Float) obj).floatValue());
                return;
            case 2:
                dhn.a(((Long) obj).longValue());
                return;
            case 3:
                dhn.a(((Long) obj).longValue());
                return;
            case 4:
                dhn.b(((Integer) obj).intValue());
                return;
            case 5:
                dhn.c(((Long) obj).longValue());
                return;
            case 6:
                dhn.e(((Integer) obj).intValue());
                return;
            case 7:
                dhn.a(((Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof dha) {
                    dhn.a((dha) obj);
                    return;
                } else {
                    dhn.a((String) obj);
                    return;
                }
            case 9:
                ((djo) obj).a(dhn);
                return;
            case 10:
                dhn.a((djo) obj);
                return;
            case 11:
                if (obj instanceof dha) {
                    dhn.a((dha) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                dhn.a(bArr, bArr.length);
                return;
            case 12:
                dhn.c(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof din) {
                    dhn.b(((din) obj).a());
                    return;
                } else {
                    dhn.b(((Integer) obj).intValue());
                    return;
                }
            case 14:
                dhn.e(((Integer) obj).intValue());
                return;
            case 15:
                dhn.c(((Long) obj).longValue());
                return;
            case 16:
                dhn.d(((Integer) obj).intValue());
                return;
            case 17:
                dhn.b(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    static int b(Map.Entry entry) {
        dib dib = (dib) entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    static int a(dln dln, int i, Object obj) {
        int m = dhn.m(i);
        if (dln == dln.GROUP) {
            dim.a();
            m <<= 1;
        }
        return m + a(dln, obj);
    }

    private static int a(dln dln, Object obj) {
        switch (dln.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return dhn.f();
            case 1:
                ((Float) obj).floatValue();
                return dhn.e();
            case 2:
                return dhn.d(((Long) obj).longValue());
            case 3:
                return dhn.e(((Long) obj).longValue());
            case 4:
                return dhn.n(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return dhn.c();
            case 6:
                ((Integer) obj).intValue();
                return dhn.a();
            case 7:
                ((Boolean) obj).booleanValue();
                return dhn.g();
            case 8:
                if (obj instanceof dha) {
                    return dhn.b((dha) obj);
                }
                return dhn.b((String) obj);
            case 9:
                return dhn.c((djo) obj);
            case 10:
                if (obj instanceof diu) {
                    return dhn.a((diu) obj);
                }
                return dhn.b((djo) obj);
            case 11:
                if (obj instanceof dha) {
                    return dhn.b((dha) obj);
                }
                return dhn.b((byte[]) obj);
            case 12:
                return dhn.o(((Integer) obj).intValue());
            case 13:
                if (obj instanceof din) {
                    return dhn.q(((din) obj).a());
                }
                return dhn.q(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return dhn.b();
            case 15:
                ((Long) obj).longValue();
                return dhn.d();
            case 16:
                return dhn.p(((Integer) obj).intValue());
            case 17:
                return dhn.f(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int a(dib dib, Object obj) {
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        dia dia = new dia();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry b2 = this.a.b(i);
            dia.b((dib) b2.getKey(), b2.getValue());
        }
        for (Map.Entry entry : this.a.c()) {
            dia.b((dib) entry.getKey(), entry.getValue());
        }
        dia.c = this.c;
        return dia;
    }
}
