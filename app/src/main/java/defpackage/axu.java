package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: axu  reason: default package */
/* compiled from: PG */
public final class axu extends Handler {
    private final Context a;
    private /* synthetic */ axt b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axu(axt axt, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = axt;
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int a2 = axv.a(this.a);
                if (axv.a(a2)) {
                    axt axt = this.b;
                    Context context = this.a;
                    axt.a(context, a2, axv.a(context, a2, 0, "n"));
                    return;
                }
                return;
            default:
                Log.w("GoogleApiAvailability", new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what).toString());
                return;
        }
    }
}
