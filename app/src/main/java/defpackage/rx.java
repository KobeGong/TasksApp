package defpackage;

/* renamed from: rx reason: default package */
/* compiled from: PG */
final class rx extends android.os.Handler {
    private final /* synthetic */ defpackage.rw a;

    rx(defpackage.rw rwVar) {
        this.a = rwVar;
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                this.a.b.onShowPress(this.a.g);
                return;
            case 2:
                defpackage.rw rwVar = this.a;
                rwVar.a.removeMessages(3);
                rwVar.e = false;
                rwVar.f = true;
                rwVar.b.onLongPress(rwVar.g);
                return;
            case 3:
                if (this.a.c == null) {
                    return;
                }
                if (!this.a.d) {
                    this.a.c.onSingleTapConfirmed(this.a.g);
                    return;
                } else {
                    this.a.e = true;
                    return;
                }
            default:
                throw new java.lang.RuntimeException("Unknown message " + message);
        }
    }
}
