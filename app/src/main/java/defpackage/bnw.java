package defpackage;

/* renamed from: bnw reason: default package */
/* compiled from: PG */
public final class bnw implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bnx[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Long l = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.Long l2 = null;
        java.lang.String str = null;
        java.util.List list = null;
        java.lang.String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    list = defpackage.bjr.c(parcel, readInt, defpackage.bot.CREATOR);
                    break;
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 5:
                    l2 = defpackage.bjr.g(parcel, readInt);
                    break;
                case 6:
                    l = defpackage.bjr.g(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bnx(str2, list, str, l2, l);
    }
}
