package defpackage;

/* renamed from: bhr reason: default package */
/* compiled from: PG */
public final class bhr {
    private static defpackage.bjr a = new defpackage.bjr();

    public static boolean a(android.content.Context context, android.content.Intent intent) {
        return defpackage.bht.a(context, intent);
    }

    public static defpackage.bhq b(android.content.Context context, android.content.Intent intent) {
        defpackage.biq biq = null;
        defpackage.azb.b((java.lang.Object) context, (java.lang.Object) "Context must not be null.");
        defpackage.azb.b((java.lang.Object) intent, (java.lang.Object) "Intent must not be null.");
        if (!defpackage.bht.a(context, intent)) {
            return null;
        }
        android.os.Parcelable.Creator creator = defpackage.bhq.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
        if (byteArrayExtra != null) {
            defpackage.azb.b((java.lang.Object) creator);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            biq = (defpackage.biq) creator.createFromParcel(obtain);
            obtain.recycle();
        }
        return (defpackage.bhq) biq;
    }

    static {
        new defpackage.bht(a);
    }
}
