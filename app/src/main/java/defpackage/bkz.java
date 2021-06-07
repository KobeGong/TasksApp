package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: bkz  reason: default package */
/* compiled from: PG */
public final class bkz implements Cloneable {
    private bkx a;
    private Object b;
    private List c = new ArrayList();

    bkz() {
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = 0;
        if (this.b != null) {
            bkx bkx = this.a;
            Object obj = this.b;
            if (bkx.b) {
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    if (Array.get(obj, i2) != null) {
                        Array.get(obj, i2);
                        throw new NoSuchMethodError();
                    }
                }
                return 0;
            }
            throw new NoSuchMethodError();
        }
        for (blc blc : this.c) {
            i = blc.b.length + bku.c(blc.a) + 0 + i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void a(bku bku) {
        if (this.b != null) {
            bkx bkx = this.a;
            Object obj = this.b;
            if (bkx.b) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    if (Array.get(obj, i) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                return;
            }
            throw new NoSuchMethodError();
        }
        for (blc blc : this.c) {
            bku.b(blc.a);
            bku.b(blc.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkz)) {
            return false;
        }
        bkz bkz = (bkz) obj;
        if (this.b == null || bkz.b == null) {
            if (this.c != null && bkz.c != null) {
                return this.c.equals(bkz.c);
            }
            try {
                return Arrays.equals(b(), bkz.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.a != bkz.a) {
            return false;
        } else {
            if (!this.a.a.isArray()) {
                return this.b.equals(bkz.b);
            }
            if (this.b instanceof byte[]) {
                return Arrays.equals((byte[]) this.b, (byte[]) bkz.b);
            }
            if (this.b instanceof int[]) {
                return Arrays.equals((int[]) this.b, (int[]) bkz.b);
            }
            if (this.b instanceof long[]) {
                return Arrays.equals((long[]) this.b, (long[]) bkz.b);
            }
            if (this.b instanceof float[]) {
                return Arrays.equals((float[]) this.b, (float[]) bkz.b);
            }
            if (this.b instanceof double[]) {
                return Arrays.equals((double[]) this.b, (double[]) bkz.b);
            }
            if (this.b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.b, (boolean[]) bkz.b);
            }
            return Arrays.deepEquals((Object[]) this.b, (Object[]) bkz.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(bku.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final bkz clone() {
        int i = 0;
        bkz bkz = new bkz();
        try {
            bkz.a = this.a;
            if (this.c == null) {
                bkz.c = null;
            } else {
                bkz.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof blb) {
                    bkz.b = (blb) ((blb) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    bkz.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    bkz.b = bArr2;
                    while (i < bArr.length) {
                        bArr2[i] = (byte[]) bArr[i].clone();
                        i++;
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
                } else if (this.b instanceof blb[]) {
                    blb[] blbArr = (blb[]) this.b;
                    blb[] blbArr2 = new blb[blbArr.length];
                    bkz.b = blbArr2;
                    while (i < blbArr.length) {
                        blbArr2[i] = (blb) blbArr[i].clone();
                        i++;
                    }
                }
            }
            return bkz;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
