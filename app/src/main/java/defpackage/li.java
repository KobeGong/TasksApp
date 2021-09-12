package defpackage;

/* renamed from: li reason: default package */
/* compiled from: PG */
final class li extends FragmentHostCallback {
    private final /* synthetic */ FragmentActivity e;

    public li(FragmentActivity lgVar) {
        this.e = lgVar;
        super(lgVar);
    }

    public final void a(java.lang.String str, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.e.dump(str, null, printWriter, strArr);
    }

    public final boolean b() {
        return !this.e.isFinishing();
    }

    public final android.view.LayoutInflater onGetLayoutInflater() {
        return this.e.getLayoutInflater().cloneInContext(this.e);
    }

    public final void startActivityForResult(Fragment lcVar, android.content.Intent intent, int i) {
        FragmentActivity lgVar = this.e;
        lgVar.a = true;
        if (i == -1) {
            try {
                defpackage.kq.a(lgVar, intent, -1, null);
            } finally {
                lgVar.a = false;
            }
        } else {
            FragmentActivity.a(i);
            if (lgVar.f.b() >= 65534) {
                throw new java.lang.IllegalStateException("Too many pending Fragment activity results.");
            }
            while (true) {
                defpackage.rj rjVar = lgVar.f;
                int i2 = lgVar.e;
                if (rjVar.b) {
                    rjVar.a();
                }
                if (defpackage.qv.a(rjVar.c, rjVar.e, i2) >= 0) {
                    lgVar.e = (lgVar.e + 1) % 65534;
                } else {
                    int i3 = lgVar.e;
                    lgVar.f.a(i3, lcVar.h);
                    lgVar.e = (lgVar.e + 1) % 65534;
                    defpackage.kq.a(lgVar, intent, ((i3 + 1) << 16) + (65535 & i), null);
                    lgVar.a = false;
                    return;
                }
            }
        }
    }

    public final boolean d() {
        return this.e.getWindow() != null;
    }

    public final int e() {
        android.view.Window window = this.e.getWindow();
        if (window == null) {
            return 0;
        }
        return window.getAttributes().windowAnimations;
    }

    public final android.view.View onFindViewById(int i) {
        return this.e.findViewById(i);
    }

    public final boolean onHasView() {
        android.view.Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
