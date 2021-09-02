package defpackage;

/* renamed from: bjj reason: default package */
/* compiled from: PG */
public final class bjj extends defpackage.bkm implements defpackage.bji {
    bjj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final boolean a(com.google.android.gms.feedback.ErrorReport errorReport) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.Parcelable) errorReport);
        android.os.Parcel a = a(1, c);
        boolean a2 = defpackage.bko.a(a);
        a.recycle();
        return a2;
    }
}
