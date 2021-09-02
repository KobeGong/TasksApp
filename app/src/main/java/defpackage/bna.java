package defpackage;

/* renamed from: bna reason: default package */
/* compiled from: PG */
public final class bna implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmn[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        com.google.android.gms.people.model.AvatarReference avatarReference = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    avatarReference = (com.google.android.gms.people.model.AvatarReference) defpackage.bjr.a(parcel, readInt, com.google.android.gms.people.model.AvatarReference.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmn(avatarReference);
    }
}
