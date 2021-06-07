package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: box  reason: default package */
/* compiled from: PG */
public final class box extends biq {
    public static final Parcelable.Creator CREATOR = new bpl();
    private static final byte[][] a = new byte[0][];
    private final String b;
    private final byte[] c;
    private final byte[][] d;
    private final byte[][] e;
    private final byte[][] f;
    private final byte[][] g;
    private final int[] h;
    private final byte[][] i;

    public box(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        if (this.b == null) {
            sb = "null";
        } else {
            String str = this.b;
            sb = new StringBuilder(String.valueOf("'").length() + String.valueOf(str).length() + String.valueOf("'").length()).append("'").append(str).append("'").toString();
        }
        sb2.append(sb);
        sb2.append(", ");
        byte[] bArr = this.c;
        sb2.append("direct");
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        a(sb2, "GAIA", this.d);
        sb2.append(", ");
        a(sb2, "PSEUDO", this.e);
        sb2.append(", ");
        a(sb2, "ALWAYS", this.f);
        sb2.append(", ");
        a(sb2, "OTHER", this.g);
        sb2.append(", ");
        int[] iArr = this.h;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z = true;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(i3);
                i2++;
                z = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        a(sb2, "directs", this.i);
        sb2.append(")");
        return sb2.toString();
    }

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof box)) {
            return false;
        }
        box box = (box) obj;
        if (!bjr.a(this.b, box.b) || !Arrays.equals(this.c, box.c) || !bjr.a(a(this.d), a(box.d)) || !bjr.a(a(this.e), a(box.e)) || !bjr.a(a(this.f), a(box.f)) || !bjr.a(a(this.g), a(box.g)) || !bjr.a(a(this.h), a(box.h)) || !bjr.a(a(this.i), a(box.i))) {
            return false;
        }
        return true;
    }

    private static List a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.b);
        bjr.a(parcel, 3, this.c);
        bjr.a(parcel, 4, this.d);
        bjr.a(parcel, 5, this.e);
        bjr.a(parcel, 6, this.f);
        bjr.a(parcel, 7, this.g);
        bjr.a(parcel, 8, this.h);
        bjr.a(parcel, 9, this.i);
        bjr.r(parcel, q);
    }

    static {
        new box("", null, a, a, a, a, null, null);
        new bph();
        new bpi();
        new bpj();
        new bpk();
    }
}
