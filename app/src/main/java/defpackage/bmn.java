package defpackage;

/* renamed from: bmn reason: default package */
/* compiled from: PG */
public final class bmn extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bna();
    private com.google.android.gms.people.model.AvatarReference a;

    public bmn() {
    }

    public bmn(com.google.android.gms.people.model.AvatarReference avatarReference) {
        this.a = avatarReference;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.a, i);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmn)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.a.equals(((defpackage.bmn) obj).a);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a});
    }
}
