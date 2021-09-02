package defpackage;

/* renamed from: boi reason: default package */
/* compiled from: PG */
public final class boi implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.boj[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = null;
        int a = defpackage.bjr.a(parcel);
        java.util.List list = null;
        java.util.List list2 = null;
        java.util.List list3 = null;
        java.util.List list4 = null;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    list4 = defpackage.bjr.c(parcel, readInt, defpackage.boh.CREATOR);
                    break;
                case 5:
                    list3 = defpackage.bjr.c(parcel, readInt, defpackage.bor.CREATOR);
                    break;
                case 9:
                    list2 = defpackage.bjr.c(parcel, readInt, defpackage.boa.CREATOR);
                    break;
                case 11:
                    list = defpackage.bjr.c(parcel, readInt, defpackage.bod.CREATOR);
                    break;
                case 13:
                    arrayList = defpackage.bjr.c(parcel, readInt, defpackage.boo.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.boj(str, list4, list3, list2, list, arrayList);
    }
}
