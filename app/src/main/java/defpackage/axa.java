package defpackage;

/* renamed from: axa reason: default package */
/* compiled from: PG */
public final class axa extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.axp();
    public defpackage.axb a;
    public byte[] b;
    public final defpackage.blh c;
    public final defpackage.aww d;
    public final defpackage.aww e;
    private int[] f;
    private java.lang.String[] g;
    private int[] h;
    private byte[][] i;
    private defpackage.box[] j;
    private boolean k;

    public axa(defpackage.axb axb, defpackage.blh blh, defpackage.aww aww, int[] iArr, int[] iArr2, boolean z) {
        this.a = axb;
        this.c = blh;
        this.d = aww;
        this.e = null;
        this.f = iArr;
        this.g = null;
        this.h = iArr2;
        this.i = null;
        this.j = null;
        this.k = z;
    }

    axa(defpackage.axb axb, byte[] bArr, int[] iArr, java.lang.String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, defpackage.box[] boxArr) {
        this.a = axb;
        this.b = bArr;
        this.f = iArr;
        this.g = strArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = iArr2;
        this.i = bArr2;
        this.j = boxArr;
        this.k = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.axa)) {
            return false;
        }
        defpackage.axa axa = (defpackage.axa) obj;
        if (!defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) axa.a) || !java.util.Arrays.equals(this.b, axa.b) || !java.util.Arrays.equals(this.f, axa.f) || !java.util.Arrays.equals(this.g, axa.g) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) axa.c) || !defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) axa.d) || !defpackage.azb.a((java.lang.Object) null, (java.lang.Object) null) || !java.util.Arrays.equals(this.h, axa.h) || !java.util.Arrays.deepEquals(this.i, axa.i) || !java.util.Arrays.equals(this.j, axa.j) || this.k != axa.k) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.f, this.g, this.c, this.d, null, this.h, this.i, this.j, java.lang.Boolean.valueOf(this.k)});
    }

    public final java.lang.String toString() {
        return "LogEventParcelable[" + this.a + ", LogEventBytes: " + (this.b == null ? null : new java.lang.String(this.b)) + ", TestCodes: " + java.util.Arrays.toString(this.f) + ", MendelPackages: " + java.util.Arrays.toString(this.g) + ", LogEvent: " + this.c + ", ExtensionProducer: " + this.d + ", VeProducer: " + null + ", ExperimentIDs: " + java.util.Arrays.toString(this.h) + ", ExperimentTokens: " + java.util.Arrays.toString(this.i) + ", ExperimentTokensParcelables: " + java.util.Arrays.toString(this.j) + ", AddPhenotypeExperimentTokens: " + this.k + "]";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i2);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.f);
        defpackage.bjr.a(parcel, 5, this.g);
        defpackage.bjr.a(parcel, 6, this.h);
        defpackage.bjr.a(parcel, 7, this.i);
        defpackage.bjr.a(parcel, 8, this.k);
        defpackage.bjr.a(parcel, 9, (android.os.Parcelable[]) this.j, i2);
        defpackage.bjr.r(parcel, q);
    }
}
