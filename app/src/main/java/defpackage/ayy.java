package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: ayy  reason: default package */
/* compiled from: PG */
public final class ayy extends Handler {
    public ayy() {
        this(Looper.getMainLooper());
    }

    public ayy(Looper looper) {
        super(looper);
    }

    public final void a(ayx ayx, ayw ayw) {
        sendMessage(obtainMessage(1, new Pair(ayx, ayw)));
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                ayx ayx = (ayx) pair.first;
                ayw ayw = (ayw) pair.second;
                try {
                    ayx.a(ayw);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.b(ayw);
                    throw e;
                }
            case 2:
                ((BasePendingResult) message.obj).b(Status.d);
                return;
            default:
                Log.wtf("BasePendingResult", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                return;
        }
    }
}
