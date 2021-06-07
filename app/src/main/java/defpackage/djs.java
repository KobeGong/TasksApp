package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: djs  reason: default package */
/* compiled from: PG */
final class djs implements dkh {
    private final djo a;
    private final dkx b;
    private final boolean c;
    private final dhy d;

    private djs(dkx dkx, dhy dhy, djo djo) {
        this.b = dkx;
        this.c = djo instanceof dij;
        this.d = dhy;
        this.a = djo;
    }

    static djs a(dkx dkx, dhy dhy, djo djo) {
        return new djs(dkx, dhy, djo);
    }

    @Override // defpackage.dkh
    public final Object a() {
        return this.a.h().c();
    }

    @Override // defpackage.dkh
    public final boolean a(Object obj, Object obj2) {
        if (!((dih) obj).s.equals(((dih) obj2).s)) {
            return false;
        }
        if (this.c) {
            return ((dij) obj).a.equals(((dij) obj2).a);
        }
        return true;
    }

    @Override // defpackage.dkh
    public final int a(Object obj) {
        int hashCode = ((dih) obj).s.hashCode();
        if (this.c) {
            return (hashCode * 53) + ((dij) obj).a.hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.dkh
    public final void b(Object obj, Object obj2) {
        dkj.a(this.b, obj, obj2);
        if (this.c) {
            dkj.a(this.d, obj, obj2);
        }
    }

    @Override // defpackage.dkh
    public final void a(Object obj, dlt dlt) {
        Iterator b2 = ((dij) obj).a.b();
        if (b2.hasNext()) {
            ((Map.Entry) b2.next()).getKey();
            throw new NoSuchMethodError();
        }
        dky dky = ((dih) obj).s;
        if (bg.at == bg.au) {
            for (int i = dky.b - 1; i >= 0; i--) {
                dlt.a(dky.c[i] >>> 3, dky.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < dky.b; i2++) {
            dlt.a(dky.c[i2] >>> 3, dky.d[i2]);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC] */
    @Override // defpackage.dkh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r10, byte[] r11, int r12, int r13, defpackage.dgw r14) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djs.a(java.lang.Object, byte[], int, int, dgw):void");
    }

    @Override // defpackage.dkh
    public final void a(Object obj, dkc dkc, dhw dhw) {
        boolean z;
        dkx dkx = this.b;
        Object a2 = dkx.a(obj);
        dhy.a(obj);
        do {
            try {
                if (dkc.a() == Integer.MAX_VALUE) {
                    dkx.a(obj, a2);
                    return;
                }
                int b2 = dkc.b();
                if (b2 == 11) {
                    dha dha = null;
                    int i = 0;
                    dik dik = null;
                    while (dkc.a() != Integer.MAX_VALUE) {
                        int b3 = dkc.b();
                        if (b3 == 16) {
                            i = dkc.o();
                            dik = dhw.a(this.a, i);
                        } else if (b3 == 26) {
                            if (dik != null) {
                                throw new NoSuchMethodError();
                            }
                            dha = dkc.n();
                        } else if (!dkc.c()) {
                            break;
                        }
                    }
                    if (dkc.b() != 12) {
                        throw dir.e();
                    }
                    if (dha != null) {
                        if (dik != null) {
                            throw new NoSuchMethodError();
                        }
                        dkx.a(a2, i, dha);
                    }
                    z = true;
                    continue;
                } else if ((b2 & 7) != 2) {
                    z = dkc.c();
                    continue;
                } else if (dhw.a(this.a, b2 >>> 3) != null) {
                    throw new NoSuchMethodError();
                } else {
                    z = dkx.a(a2, dkc);
                    continue;
                }
            } finally {
                dkx.a(obj, a2);
            }
        } while (z);
    }

    @Override // defpackage.dkh
    public final void c(Object obj) {
        dkx.b(obj);
        dhy.b(obj);
    }

    @Override // defpackage.dkh
    public final boolean d(Object obj) {
        return ((dij) obj).a.c();
    }

    @Override // defpackage.dkh
    public final int b(Object obj) {
        dky dky = ((dih) obj).s;
        int i = dky.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < dky.b; i2++) {
                i += dhn.d(dky.c[i2] >>> 3, (dha) dky.d[i2]);
            }
            dky.e = i;
        }
        int i3 = i + 0;
        if (!this.c) {
            return i3;
        }
        dia dia = ((dij) obj).a;
        int i4 = 0;
        for (int i5 = 0; i5 < dia.a.b(); i5++) {
            i4 += dia.b(dia.a.b(i5));
        }
        for (Map.Entry entry : dia.a.c()) {
            i4 = dia.b(entry) + i4;
        }
        return i3 + i4;
    }
}
