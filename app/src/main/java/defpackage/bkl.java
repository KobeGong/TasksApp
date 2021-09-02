package defpackage;

/* renamed from: bkl reason: default package */
/* compiled from: PG */
public final class bkl implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bkk[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        defpackage.axq axq = null;
        int i = 0;
        defpackage.bed bed = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    axq = (defpackage.axq) defpackage.bjr.a(parcel, readInt, defpackage.axq.CREATOR);
                    break;
                case 3:
                    bed = (defpackage.bed) defpackage.bjr.a(parcel, readInt, defpackage.bed.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bkk(i, axq, bed);
    }
}
