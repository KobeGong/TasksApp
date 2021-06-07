package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: arb  reason: default package */
/* compiled from: PG */
public class arb extends lc {
    private boolean a;
    private Runnable b;

    public final void O() {
        this.a = true;
        c();
    }

    public final void a(Runnable runnable) {
        this.b = runnable;
        c();
    }

    public static anc P() {
        return any.a().c();
    }

    public final void b(View view) {
        lg j = j();
        if (j != null && j.hasWindowFocus()) {
            view.requestFocus();
            bdk.a(view, true);
        } else if (Build.VERSION.SDK_INT >= 18) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new arc(this, view));
        }
    }

    private final void c() {
        if (this.a && this.b != null) {
            this.b.run();
            this.b = null;
        }
    }
}
