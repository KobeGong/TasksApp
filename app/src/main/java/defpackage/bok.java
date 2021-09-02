package defpackage;

/* renamed from: bok reason: default package */
/* compiled from: PG */
public final class bok implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bol[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(3);
        java.lang.Boolean bool = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    valueOf = defpackage.bjr.e(parcel, readInt);
                    break;
                case 4:
                    int a2 = defpackage.bjr.a(parcel, readInt);
                    if (a2 != 0) {
                        defpackage.bjr.a(parcel, a2, 4);
                        bool = java.lang.Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bol(valueOf, bool);
    }
}
