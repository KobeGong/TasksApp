package defpackage;

/* renamed from: arb reason: default package */
/* compiled from: PG */
public class arb extends Fragment {
    private boolean a;
    private java.lang.Runnable b;

    public final void O() {
        this.a = true;
        c();
    }

    public final void a(java.lang.Runnable runnable) {
        this.b = runnable;
        c();
    }

    public static defpackage.anc P() {
        return defpackage.any.get().c();
    }

    public final void b(android.view.View view) {
        FragmentActivity j = getActivity();
        if (j != null && j.hasWindowFocus()) {
            view.requestFocus();
            defpackage.bdk.a(view, true);
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new defpackage.arc(this, view));
        }
    }

    private final void c() {
        if (this.a && this.b != null) {
            this.b.run();
            this.b = null;
        }
    }
}
