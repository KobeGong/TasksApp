package defpackage;

/* renamed from: lh reason: default package */
/* compiled from: PG */
final class lh extends android.os.Handler {
    private final /* synthetic */ FragmentActivity a;

    lh(FragmentActivity lgVar) {
        this.a = lgVar;
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                if (this.a.d) {
                    this.a.a(false);
                    return;
                }
                return;
            case 2:
                this.a.c.a.mFragmentManager.q();
                this.a.c.b();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
