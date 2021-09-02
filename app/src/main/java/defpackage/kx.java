package defpackage;

/* renamed from: kx reason: default package */
/* compiled from: PG */
final class kx implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ky();
    public final int[] a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public final java.lang.CharSequence g;
    public final int h;
    public final java.lang.CharSequence i;
    public final java.util.ArrayList j;
    public final java.util.ArrayList k;
    public final boolean l;

    public kx(defpackage.kv kvVar) {
        int size = kvVar.b.size();
        this.a = new int[(size * 6)];
        if (!kvVar.i) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.kw kwVar = (defpackage.kw) kvVar.b.get(i3);
            int i4 = i2 + 1;
            this.a[i2] = kwVar.a;
            int i5 = i4 + 1;
            this.a[i4] = kwVar.b != null ? kwVar.b.g : -1;
            int i6 = i5 + 1;
            this.a[i5] = kwVar.c;
            int i7 = i6 + 1;
            this.a[i6] = kwVar.d;
            int i8 = i7 + 1;
            this.a[i7] = kwVar.e;
            i2 = i8 + 1;
            this.a[i8] = kwVar.f;
        }
        this.b = kvVar.g;
        this.c = kvVar.h;
        this.d = kvVar.j;
        this.e = kvVar.l;
        this.f = kvVar.m;
        this.g = kvVar.n;
        this.h = kvVar.o;
        this.i = kvVar.p;
        this.j = kvVar.q;
        this.k = kvVar.r;
        this.l = kvVar.s;
    }

    public kx(android.os.Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int i3 = 0;
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        android.text.TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        android.text.TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        if (this.l) {
            i3 = 1;
        }
        parcel.writeInt(i3);
    }
}
