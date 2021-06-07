package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dmc  reason: default package */
/* compiled from: PG */
public final class dmc implements Cloneable {
    public dma a;
    public Object b;
    public List c = new ArrayList();

    dmc() {
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = 0;
        if (this.b != null) {
            throw new NoSuchMethodError();
        }
        for (dmg dmg : this.c) {
            i = dmg.b.length + dlx.c(dmg.a) + 0 + i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void a(dlx dlx) {
        if (this.b != null) {
            throw new NoSuchMethodError();
        }
        for (dmg dmg : this.c) {
            dlx.b(dmg.a);
            byte[] bArr = dmg.b;
            int length = bArr.length;
            if (dlx.a.remaining() >= length) {
                dlx.a.put(bArr, 0, length);
            } else {
                throw new dly(dlx.a.position(), dlx.a.limit());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dmc)) {
            return false;
        }
        dmc dmc = (dmc) obj;
        if (this.b == null || dmc.b == null) {
            if (this.c != null && dmc.c != null) {
                return this.c.equals(dmc.c);
            }
            try {
                return Arrays.equals(b(), dmc.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.a != dmc.a) {
            return false;
        } else {
            if (!this.a.a.isArray()) {
                return this.b.equals(dmc.b);
            }
            if (this.b instanceof byte[]) {
                return Arrays.equals((byte[]) this.b, (byte[]) dmc.b);
            }
            if (this.b instanceof int[]) {
                return Arrays.equals((int[]) this.b, (int[]) dmc.b);
            }
            if (this.b instanceof long[]) {
                return Arrays.equals((long[]) this.b, (long[]) dmc.b);
            }
            if (this.b instanceof float[]) {
                return Arrays.equals((float[]) this.b, (float[]) dmc.b);
            }
            if (this.b instanceof double[]) {
                return Arrays.equals((double[]) this.b, (double[]) dmc.b);
            }
            if (this.b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.b, (boolean[]) dmc.b);
            }
            return Arrays.deepEquals((Object[]) this.b, (Object[]) dmc.b);
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
        a(dlx.a(bArr, bArr.length));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final dmc clone() {
        int i = 0;
        dmc dmc = new dmc();
        try {
            dmc.a = this.a;
            if (this.c == null) {
                dmc.c = null;
            } else {
                dmc.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof dmf) {
                    dmc.b = (dmf) ((dmf) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    dmc.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    dmc.b = bArr2;
                    while (i < bArr.length) {
                        bArr2[i] = (byte[]) bArr[i].clone();
                        i++;
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
                } else if (this.b instanceof dmf[]) {
                    dmf[] dmfArr = (dmf[]) this.b;
                    dmf[] dmfArr2 = new dmf[dmfArr.length];
                    dmc.b = dmfArr2;
                    while (i < dmfArr.length) {
                        dmfArr2[i] = (dmf) dmfArr[i].clone();
                        i++;
                    }
                }
            }
            return dmc;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
