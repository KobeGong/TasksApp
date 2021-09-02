package defpackage;

/* renamed from: ars reason: default package */
/* compiled from: PG */
final class ars implements android.os.Handler.Callback {
    private final /* synthetic */ defpackage.arr a;

    ars(defpackage.arr arr) {
        this.a = arr;
    }

    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                defpackage.arr arr = this.a;
                defpackage.aru aru = (defpackage.aru) message.obj;
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
