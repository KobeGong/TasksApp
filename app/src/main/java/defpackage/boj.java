package defpackage;

/* renamed from: boj reason: default package */
/* compiled from: PG */
public final class boj extends defpackage.biq implements android.os.Parcelable, defpackage.bcs {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.boi();
    private final java.lang.String a;
    private final java.util.List b;
    private final java.util.List c;
    private final java.util.List d;
    private final java.util.List e;
    private final java.util.List f;
    private java.util.List g;
    private java.util.List h;
    private java.util.List i;
    private java.util.List j;
    private java.util.List k;

    public boj(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        if (this.g == null && this.b != null) {
            this.g = new java.util.ArrayList(this.b.size());
            for (defpackage.bof add : this.b) {
                this.g.add(add);
            }
        }
        defpackage.bjr.b(parcel, 4, this.g);
        if (this.h == null && this.c != null) {
            this.h = new java.util.ArrayList(this.c.size());
            for (defpackage.bop add2 : this.c) {
                this.h.add(add2);
            }
        }
        defpackage.bjr.b(parcel, 5, this.h);
        if (this.i == null && this.d != null) {
            this.i = new java.util.ArrayList(this.d.size());
            for (defpackage.bny add3 : this.d) {
                this.i.add(add3);
            }
        }
        defpackage.bjr.b(parcel, 9, this.i);
        if (this.j == null && this.e != null) {
            this.j = new java.util.ArrayList(this.e.size());
            for (defpackage.bob add4 : this.e) {
                this.j.add(add4);
            }
        }
        defpackage.bjr.b(parcel, 11, this.j);
        if (this.k == null && this.f != null) {
            this.k = new java.util.ArrayList(this.f.size());
            for (defpackage.bom add5 : this.f) {
                this.k.add(add5);
            }
        }
        defpackage.bjr.b(parcel, 13, this.k);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }
}
