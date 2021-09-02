package defpackage;

/* renamed from: box reason: default package */
/* compiled from: PG */
public final class box extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bpl();
    private static final byte[][] a = new byte[0][];
    private final java.lang.String b;
    private final byte[] c;
    private final byte[][] d;
    private final byte[][] e;
    private final byte[][] f;
    private final byte[][] g;
    private final int[] h;
    private final byte[][] i;

    public box(java.lang.String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
    }

    public final java.lang.String toString() {
        java.lang.String sb;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ExperimentTokens");
        sb2.append("(");
        if (this.b == null) {
            sb = "null";
        } else {
            java.lang.String str = "'";
            java.lang.String str2 = this.b;
            java.lang.String str3 = "'";
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
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
            sb2.append(android.util.Base64.encodeToString(bArr, 3));
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

    private static void a(java.lang.StringBuilder sb, java.lang.String str, byte[][] bArr) {
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
            sb.append(android.util.Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.box)) {
            return false;
        }
        defpackage.box box = (defpackage.box) obj;
        if (!defpackage.bjr.a((java.lang.Object) this.b, (java.lang.Object) box.b) || !java.util.Arrays.equals(this.c, box.c) || !defpackage.bjr.a((java.lang.Object) a(this.d), (java.lang.Object) a(box.d)) || !defpackage.bjr.a((java.lang.Object) a(this.e), (java.lang.Object) a(box.e)) || !defpackage.bjr.a((java.lang.Object) a(this.f), (java.lang.Object) a(box.f)) || !defpackage.bjr.a((java.lang.Object) a(this.g), (java.lang.Object) a(box.g)) || !defpackage.bjr.a((java.lang.Object) a(this.h), (java.lang.Object) a(box.h)) || !defpackage.bjr.a((java.lang.Object) a(this.i), (java.lang.Object) a(box.i))) {
            return false;
        }
        return true;
    }

    private static java.util.List a(byte[][] bArr) {
        if (bArr == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(android.util.Base64.encodeToString(encodeToString, 3));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private static java.util.List a(int[] iArr) {
        if (iArr == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(java.lang.Integer.valueOf(valueOf));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.b);
        defpackage.bjr.a(parcel, 3, this.c);
        defpackage.bjr.a(parcel, 4, this.d);
        defpackage.bjr.a(parcel, 5, this.e);
        defpackage.bjr.a(parcel, 6, this.f);
        defpackage.bjr.a(parcel, 7, this.g);
        defpackage.bjr.a(parcel, 8, this.h);
        defpackage.bjr.a(parcel, 9, this.i);
        defpackage.bjr.r(parcel, q);
    }

    static {
        new defpackage.box("", null, a, a, a, a, null, null);
        new defpackage.bph();
        new defpackage.bpi();
        new defpackage.bpj();
        new defpackage.bpk();
    }
}
