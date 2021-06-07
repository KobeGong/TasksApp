package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bmm  reason: default package */
/* compiled from: PG */
public final class bmm extends biq {
    public static final Parcelable.Creator CREATOR = new bmz();
    private List a = new ArrayList();
    private List b = new ArrayList();
    private List c = new ArrayList();
    private String d;
    private bmp e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private int k;

    bmm(List list, List list2, List list3, String str, bmp bmp, boolean z, boolean z2, String str2, String str3, String str4, int i2) {
        this.c = list3;
        this.a = list;
        this.b = list2;
        this.d = str;
        this.e = bmp;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i2;
    }

    public bmm() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bmm)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bmm bmm = (bmm) obj;
        return azb.a(this.a, bmm.a) && azb.a(null, null) && azb.a(this.b, bmm.b) && azb.a(null, null) && azb.a(this.d, bmm.d) && azb.a(this.e, bmm.e) && azb.a(this.c, bmm.c) && azb.a(Boolean.valueOf(this.f), Boolean.valueOf(bmm.f)) && azb.a(Boolean.valueOf(this.g), Boolean.valueOf(bmm.g)) && azb.a(this.h, bmm.h) && azb.a(this.i, bmm.i) && azb.a(this.j, bmm.j) && azb.a(Integer.valueOf(this.k), Integer.valueOf(bmm.k));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, this.c, null, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(this.k)});
    }

    public final String toString() {
        return azb.a(this).a("names", this.a).a("emails", null).a("photos", this.b).a("sortedContactMethods", this.c).a("phones", null).a("provenanceReference", this.d).a("metadata", this.e).a("isStarred", Boolean.valueOf(this.f)).a("sendToVoicemail", Boolean.valueOf(this.g)).a("customRingtone", this.h).a("lookupKey", this.i).a("secondaryProvenanceReference", this.j).a("pinnedPosition", Integer.valueOf(this.k)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.b(parcel, 3, Collections.unmodifiableList(this.a));
        bjr.b(parcel, 5, Collections.unmodifiableList(this.b));
        bjr.b(parcel, 6, this.c);
        bjr.a(parcel, 7, this.d);
        bjr.a(parcel, 8, this.e, i2);
        bjr.a(parcel, 9, this.f);
        bjr.a(parcel, 10, this.g);
        bjr.a(parcel, 11, this.h);
        bjr.a(parcel, 12, this.i);
        bjr.a(parcel, 13, this.j);
        bjr.c(parcel, 14, this.k);
        bjr.r(parcel, q);
    }
}
