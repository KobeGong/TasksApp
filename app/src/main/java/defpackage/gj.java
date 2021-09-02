package defpackage;

/* renamed from: gj reason: default package */
/* compiled from: PG */
public final class gj implements android.os.Handler.Callback {
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                java.lang.Object obj = message.obj;
                android.support.design.snackbar.BaseTransientBottomBar.b();
                return true;
            case 1:
                java.lang.Object obj2 = message.obj;
                int i = message.arg1;
                android.support.design.snackbar.BaseTransientBottomBar.c();
                return true;
            default:
                return false;
        }
    }
}
