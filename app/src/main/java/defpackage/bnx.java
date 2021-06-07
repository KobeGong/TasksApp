package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bnx  reason: default package */
/* compiled from: PG */
public final class bnx extends biq implements bnt {
    public static final Parcelable.Creator CREATOR = new bnw();
    private final String a;
    private final List b;
    private final String c;
    private final Long d;
    private final Long e;
    private List f;

    public bnx(String str, List list, String str2, Long l, Long l2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = l;
        this.e = l2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.b(parcel, 3, c());
        bjr.a(parcel, 4, this.c);
        bjr.a(parcel, 5, this.d);
        bjr.a(parcel, 6, this.e);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bnt
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bnt
    public final List c() {
        if (this.f == null && this.b != null) {
            this.f = new ArrayList(this.b.size());
            for (bnv bnv : this.b) {
                this.f.add(bnv);
            }
        }
        return this.f;
    }

    @Override // defpackage.bnt
    public final String d() {
        return this.c;
    }

    @Override // defpackage.bnt
    public final Long e() {
        return this.d;
    }

    @Override // defpackage.bnt
    public final Long f() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnt)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bnt bnt = (bnt) obj;
        return azb.a(b(), bnt.b()) && azb.a(c(), bnt.c()) && azb.a(d(), bnt.d()) && azb.a(e(), bnt.e()) && azb.a(f(), bnt.f());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), c(), d(), e(), f()});
    }
}
