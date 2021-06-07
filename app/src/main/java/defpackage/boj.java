package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: boj  reason: default package */
/* compiled from: PG */
public final class boj extends biq implements Parcelable, bcs {
    public static final Parcelable.Creator CREATOR = new boi();
    private final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public boj(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        if (this.g == null && this.b != null) {
            this.g = new ArrayList(this.b.size());
            for (bof bof : this.b) {
                this.g.add(bof);
            }
        }
        bjr.b(parcel, 4, this.g);
        if (this.h == null && this.c != null) {
            this.h = new ArrayList(this.c.size());
            for (bop bop : this.c) {
                this.h.add(bop);
            }
        }
        bjr.b(parcel, 5, this.h);
        if (this.i == null && this.d != null) {
            this.i = new ArrayList(this.d.size());
            for (bny bny : this.d) {
                this.i.add(bny);
            }
        }
        bjr.b(parcel, 9, this.i);
        if (this.j == null && this.e != null) {
            this.j = new ArrayList(this.e.size());
            for (bob bob : this.e) {
                this.j.add(bob);
            }
        }
        bjr.b(parcel, 11, this.j);
        if (this.k == null && this.f != null) {
            this.k = new ArrayList(this.f.size());
            for (bom bom : this.f) {
                this.k.add(bom);
            }
        }
        bjr.b(parcel, 13, this.k);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }
}
