package defpackage;

/* renamed from: bkz reason: default package */
/* compiled from: PG */
final class bkz implements java.lang.Cloneable {
    private defpackage.bkx a;
    private java.lang.Object b;
    private java.util.List c = new java.util.ArrayList();

    bkz() {
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        int i = 0;
        if (this.b != null) {
            defpackage.bkx bkx = this.a;
            java.lang.Object obj = this.b;
            if (bkx.b) {
                int length = java.lang.reflect.Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    if (java.lang.reflect.Array.get(obj, i2) != null) {
                        java.lang.reflect.Array.get(obj, i2);
                        throw new java.lang.NoSuchMethodError();
                    }
                }
                return 0;
            }
            throw new java.lang.NoSuchMethodError();
        }
        java.util.Iterator it = this.c.iterator();
        while (true) {
            int i3 = i;
            if (!it.hasNext()) {
                return i3;
            }
            defpackage.blc blc = (defpackage.blc) it.next();
            i = blc.b.length + defpackage.bku.c(blc.a) + 0 + i3;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.bku bku) {
        if (this.b != null) {
            defpackage.bkx bkx = this.a;
            java.lang.Object obj = this.b;
            if (bkx.b) {
                int length = java.lang.reflect.Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    if (java.lang.reflect.Array.get(obj, i) != null) {
                        throw new java.lang.NoSuchMethodError();
                    }
                }
                return;
            }
            throw new java.lang.NoSuchMethodError();
        }
        for (defpackage.blc blc : this.c) {
            bku.b(blc.a);
            bku.b(blc.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bkz)) {
            return false;
        }
        defpackage.bkz bkz = (defpackage.bkz) obj;
        if (this.b == null || bkz.b == null) {
            if (this.c != null && bkz.c != null) {
                return this.c.equals(bkz.c);
            }
            try {
                return java.util.Arrays.equals(b(), bkz.b());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else if (this.a != bkz.a) {
            return false;
        } else {
            if (!this.a.a.isArray()) {
                return this.b.equals(bkz.b);
            }
            if (this.b instanceof byte[]) {
                return java.util.Arrays.equals((byte[]) this.b, (byte[]) bkz.b);
            }
            if (this.b instanceof int[]) {
                return java.util.Arrays.equals((int[]) this.b, (int[]) bkz.b);
            }
            if (this.b instanceof long[]) {
                return java.util.Arrays.equals((long[]) this.b, (long[]) bkz.b);
            }
            if (this.b instanceof float[]) {
                return java.util.Arrays.equals((float[]) this.b, (float[]) bkz.b);
            }
            if (this.b instanceof double[]) {
                return java.util.Arrays.equals((double[]) this.b, (double[]) bkz.b);
            }
            if (this.b instanceof boolean[]) {
                return java.util.Arrays.equals((boolean[]) this.b, (boolean[]) bkz.b);
            }
            return java.util.Arrays.deepEquals((java.lang.Object[]) this.b, (java.lang.Object[]) bkz.b);
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
        a(defpackage.bku.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final defpackage.bkz clone() {
        int i = 0;
        defpackage.bkz bkz = new defpackage.bkz();
        try {
            bkz.a = this.a;
            if (this.c == null) {
                bkz.c = null;
            } else {
                bkz.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof defpackage.blb) {
                    bkz.b = (defpackage.blb) ((defpackage.blb) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    bkz.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    bkz.b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    bkz.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    bkz.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    bkz.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    bkz.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    bkz.b = ((double[]) this.b).clone();
                } else if (this.b instanceof defpackage.blb[]) {
                    defpackage.blb[] blbArr = (defpackage.blb[]) this.b;
                    defpackage.blb[] blbArr2 = new defpackage.blb[blbArr.length];
                    bkz.b = blbArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= blbArr.length) {
                            break;
                        }
                        blbArr2[i3] = (defpackage.blb) blbArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return bkz;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
