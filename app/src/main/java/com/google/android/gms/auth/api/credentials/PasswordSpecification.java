package com.google.android.gms.auth.api.credentials;

/* compiled from: PG */
public final class PasswordSpecification extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.avm();
    public static final com.google.android.gms.auth.api.credentials.PasswordSpecification a = new defpackage.avk().a().a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").b("abcdefghijkmnopqrstxyz").b("ABCDEFGHJKLMNPQRSTXY").b("3456789").b();
    private final java.lang.String b;
    private final java.util.List c;
    private final java.util.List d;
    private final int e;
    private final int f;

    public PasswordSpecification(java.lang.String str, java.util.List list, java.util.List list2, int i, int i2) {
        this.b = str;
        this.c = java.util.Collections.unmodifiableList(list);
        this.d = java.util.Collections.unmodifiableList(list2);
        this.e = i;
        this.f = i2;
        int[] iArr = new int[95];
        java.util.Arrays.fill(iArr, -1);
        int i3 = 0;
        for (java.lang.String charArray : this.c) {
            char[] charArray2 = charArray.toCharArray();
            int length = charArray2.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[charArray2[i4] - ' '] = i3;
            }
            i3++;
        }
        new java.security.SecureRandom();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.b);
        defpackage.bjr.a(parcel, 2, this.c);
        java.util.List list = this.d;
        if (list != null) {
            int q2 = defpackage.bjr.q(parcel, 3);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((java.lang.Integer) list.get(i2)).intValue());
            }
            defpackage.bjr.r(parcel, q2);
        }
        defpackage.bjr.c(parcel, 4, this.e);
        defpackage.bjr.c(parcel, 5, this.f);
        defpackage.bjr.r(parcel, q);
    }

    public static /* synthetic */ java.lang.String a(java.util.Collection collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        java.util.Iterator it = collection.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new java.lang.String(cArr);
            }
            i = i2 + 1;
            cArr[i2] = ((java.lang.Character) it.next()).charValue();
        }
    }

    public static /* synthetic */ boolean a(int i) {
        return i < 32 || i > 126;
    }

    static {
        new defpackage.avk().a().a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").b("abcdefghijklmnopqrstuvwxyz").b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").b("1234567890").b();
    }
}
