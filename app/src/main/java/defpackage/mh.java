package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: mh  reason: default package */
/* compiled from: PG */
public final class mh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mi();
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;
    public Bundle k;
    public lc l;

    mh(lc lcVar) {
        this.a = lcVar.getClass().getName();
        this.b = lcVar.g;
        this.c = lcVar.o;
        this.d = lcVar.z;
        this.e = lcVar.A;
        this.f = lcVar.B;
        this.g = lcVar.E;
        this.h = lcVar.D;
        this.i = lcVar.i;
        this.j = lcVar.C;
    }

    mh(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        this.i = parcel.readBundle();
        this.j = parcel.readInt() == 0 ? false : z3;
        this.k = parcel.readBundle();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4;
        int i5 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (this.h) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        parcel.writeInt(i4);
        parcel.writeBundle(this.i);
        if (!this.j) {
            i5 = 0;
        }
        parcel.writeInt(i5);
        parcel.writeBundle(this.k);
    }
}
