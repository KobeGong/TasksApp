package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* access modifiers changed from: package-private */
/* renamed from: bih  reason: default package */
/* compiled from: PG */
public final class bih extends Handler {
    private /* synthetic */ bhw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bih(bhw bhw, Looper looper) {
        super(looper);
        this.a = bhw;
    }

    public final void handleMessage(Message message) {
        bhw bhw = this.a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    bhw.b = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    bhw.a = (Messenger) parcelableExtra;
                }
            }
            bhw.a((Intent) message.obj);
            return;
        }
        Log.w("InstanceID/Rpc", "Dropping invalid message");
    }
}
