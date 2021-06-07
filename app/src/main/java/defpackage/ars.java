package defpackage;

import android.os.Handler;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: ars  reason: default package */
/* compiled from: PG */
public final class ars implements Handler.Callback {
    private final /* synthetic */ arr a;

    ars(arr arr) {
        this.a = arr;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                arr arr = this.a;
                aru aru = (aru) message.obj;
                synchronized (arr.a) {
                    if (arr.c == aru || arr.d == aru) {
                        arr.a(aru, 2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
