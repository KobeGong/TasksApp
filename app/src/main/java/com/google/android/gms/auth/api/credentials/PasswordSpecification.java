package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class PasswordSpecification extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new avm();
    public static final PasswordSpecification a = new avk().a().a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").b("abcdefghijkmnopqrstxyz").b("ABCDEFGHJKLMNPQRSTXY").b("3456789").b();
    private final String b;
    private final List c;
    private final List d;
    private final int e;
    private final int f;

    public PasswordSpecification(String str, List list, List list2, int i, int i2) {
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = i;
        this.f = i2;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i3 = 0;
        for (String str2 : this.c) {
            char[] charArray = str2.toCharArray();
            int length = charArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[charArray[i4] - ' '] = i3;
            }
            i3++;
        }
        new SecureRandom();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.b);
        bjr.a(parcel, 2, this.c);
        List list = this.d;
        if (list != null) {
            int q2 = bjr.q(parcel, 3);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            bjr.r(parcel, q2);
        }
        bjr.c(parcel, 4, this.e);
        bjr.c(parcel, 5, this.f);
        bjr.r(parcel, q);
    }

    public static /* synthetic */ String a(Collection collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i++;
            cArr[i] = ((Character) it.next()).charValue();
        }
        return new String(cArr);
    }

    public static /* synthetic */ boolean a(int i) {
        return i < 32 || i > 126;
    }

    static {
        new avk().a().a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").b("abcdefghijklmnopqrstuvwxyz").b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").b("1234567890").b();
    }
}
