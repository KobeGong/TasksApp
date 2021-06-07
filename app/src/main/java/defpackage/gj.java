package defpackage;

import android.os.Handler;
import android.os.Message;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: gj  reason: default package */
/* compiled from: PG */
public final class gj implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object obj = message.obj;
                BaseTransientBottomBar.b();
                return true;
            case 1:
                Object obj2 = message.obj;
                int i = message.arg1;
                BaseTransientBottomBar.c();
                return true;
            default:
                return false;
        }
    }
}
