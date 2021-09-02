package defpackage;

/* renamed from: dmc reason: default package */
/* compiled from: PG */
final class dmc implements java.lang.Cloneable {
    public defpackage.dma a;
    public java.lang.Object b;
    public java.util.List c = new java.util.ArrayList();

    dmc() {
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        int i = 0;
        if (this.b != null) {
            throw new java.lang.NoSuchMethodError();
        }
        java.util.Iterator it = this.c.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            defpackage.dmg dmg = (defpackage.dmg) it.next();
            i = dmg.b.length + defpackage.dlx.c(dmg.a) + 0 + i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dlx dlx) {
        if (this.b != null) {
            throw new java.lang.NoSuchMethodError();
        }
        for (defpackage.dmg dmg : this.c) {
            dlx.b(dmg.a);
            byte[] bArr = dmg.b;
            int length = bArr.length;
            if (dlx.a.remaining() >= length) {
                dlx.a.put(bArr, 0, length);
            } else {
                throw new defpackage.dly(dlx.a.position(), dlx.a.limit());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.dmc)) {
            return false;
        }
        defpackage.dmc dmc = (defpackage.dmc) obj;
        if (this.b == null || dmc.b == null) {
            if (this.c != null && dmc.c != null) {
                return this.c.equals(dmc.c);
            }
            try {
                return java.util.Arrays.equals(b(), dmc.b());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else if (this.a != dmc.a) {
            return false;
        } else {
            if (!this.a.a.isArray()) {
                return this.b.equals(dmc.b);
            }
            if (this.b instanceof byte[]) {
                return java.util.Arrays.equals((byte[]) this.b, (byte[]) dmc.b);
            }
            if (this.b instanceof int[]) {
                return java.util.Arrays.equals((int[]) this.b, (int[]) dmc.b);
            }
            if (this.b instanceof long[]) {
                return java.util.Arrays.equals((long[]) this.b, (long[]) dmc.b);
            }
            if (this.b instanceof float[]) {
                return java.util.Arrays.equals((float[]) this.b, (float[]) dmc.b);
            }
            if (this.b instanceof double[]) {
                return java.util.Arrays.equals((double[]) this.b, (double[]) dmc.b);
            }
            if (this.b instanceof boolean[]) {
                return java.util.Arrays.equals((boolean[]) this.b, (boolean[]) dmc.b);
            }
            return java.util.Arrays.deepEquals((java.lang.Object[]) this.b, (java.lang.Object[]) dmc.b);
        }
    }

    public final int hashCode() {
        try {
            return java.util.Arrays.hashCode(b()) + 527;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(defpackage.dlx.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final defpackage.dmc clone() {
        int i = 0;
        defpackage.dmc dmc = new defpackage.dmc();
        try {
            dmc.a = this.a;
            if (this.c == null) {
                dmc.c = null;
            } else {
                dmc.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof defpackage.dmf) {
                    dmc.b = (defpackage.dmf) ((defpackage.dmf) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    dmc.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    dmc.b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    dmc.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    dmc.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    dmc.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    dmc.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    dmc.b = ((double[]) this.b).clone();
                } else if (this.b instanceof defpackage.dmf[]) {
                    defpackage.dmf[] dmfArr = (defpackage.dmf[]) this.b;
                    defpackage.dmf[] dmfArr2 = new defpackage.dmf[dmfArr.length];
                    dmc.b = dmfArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= dmfArr.length) {
                            break;
                        }
                        dmfArr2[i3] = (defpackage.dmf) dmfArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return dmc;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
