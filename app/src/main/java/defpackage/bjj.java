package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: bjj  reason: default package */
/* compiled from: PG */
public final class bjj extends bkm implements bji {
    bjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    @Override // defpackage.bji
    public final boolean a(ErrorReport errorReport) {
        Parcel c = c();
        bko.a(c, errorReport);
        Parcel a = a(1, c);
        boolean a2 = bko.a(a);
        a.recycle();
        return a2;
    }
}
