package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.io.File;
import java.util.List;

/* renamed from: bjh  reason: default package */
/* compiled from: PG */
public final class bjh extends bel {
    public final Context d;

    public bjh(Context context, Looper looper, ayr ayr, ays ays, bdj bdj) {
        super(context, looper, 29, bdj, ayr, ays);
        this.d = context;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public static void a(List list, File file) {
        for (int i = 0; i < list.size(); i++) {
            bgl bgl = (bgl) list.get(i);
            if (bgl != null) {
                if (file == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bgl.a = file;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof bji) {
            return (bji) queryLocalInterface;
        }
        return new bjj(iBinder);
    }
}
