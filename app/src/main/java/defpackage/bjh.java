package defpackage;

/* renamed from: bjh reason: default package */
/* compiled from: PG */
public final class bjh extends defpackage.bel {
    public final android.content.Context d;

    public bjh(android.content.Context context, android.os.Looper looper, defpackage.ayr ayr, defpackage.ays ays, defpackage.bdj bdj) {
        super(context, looper, 29, bdj, ayr, ays);
        this.d = context;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public static void a(java.util.List list, java.io.File file) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                defpackage.bgl bgl = (defpackage.bgl) list.get(i2);
                if (bgl != null) {
                    if (file == null) {
                        throw new java.lang.NullPointerException("Cannot set null temp directory");
                    }
                    bgl.a = file;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof defpackage.bji) {
            return (defpackage.bji) queryLocalInterface;
        }
        return new defpackage.bjj(iBinder);
    }
}
