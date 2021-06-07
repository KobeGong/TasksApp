package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: axa  reason: default package */
/* compiled from: PG */
public final class axa extends biq {
    public static final Parcelable.Creator CREATOR = new axp();
    public axb a;
    public byte[] b;
    public final blh c;
    public final aww d;
    public final aww e;
    private int[] f;
    private String[] g;
    private int[] h;
    private byte[][] i;
    private box[] j;
    private boolean k;

    public axa(axb axb, blh blh, aww aww, int[] iArr, int[] iArr2, boolean z) {
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

    axa(axb axb, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, box[] boxArr) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa)) {
            return false;
        }
        axa axa = (axa) obj;
        return azb.a(this.a, axa.a) && Arrays.equals(this.b, axa.b) && Arrays.equals(this.f, axa.f) && Arrays.equals(this.g, axa.g) && azb.a(this.c, axa.c) && azb.a(this.d, axa.d) && azb.a(null, null) && Arrays.equals(this.h, axa.h) && Arrays.deepEquals(this.i, axa.i) && Arrays.equals(this.j, axa.j) && this.k == axa.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, this.d, null, this.h, this.i, this.j, Boolean.valueOf(this.k)});
    }

    public final String toString() {
        return "LogEventParcelable[" + this.a + ", LogEventBytes: " + (this.b == null ? null : new String(this.b)) + ", TestCodes: " + Arrays.toString(this.f) + ", MendelPackages: " + Arrays.toString(this.g) + ", LogEvent: " + this.c + ", ExtensionProducer: " + this.d + ", VeProducer: " + ((Object) null) + ", ExperimentIDs: " + Arrays.toString(this.h) + ", ExperimentTokens: " + Arrays.toString(this.i) + ", ExperimentTokensParcelables: " + Arrays.toString(this.j) + ", AddPhenotypeExperimentTokens: " + this.k + "]";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a, i2);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.f);
        bjr.a(parcel, 5, this.g);
        bjr.a(parcel, 6, this.h);
        bjr.a(parcel, 7, this.i);
        bjr.a(parcel, 8, this.k);
        bjr.a(parcel, 9, this.j, i2);
        bjr.r(parcel, q);
    }
}
