package defpackage;

/* renamed from: op reason: default package */
/* compiled from: PG */
public final class op {
    private final /* synthetic */ java.lang.ref.WeakReference a;
    private final /* synthetic */ defpackage.aci b;

    public op() {
    }

    public final void a(android.graphics.Typeface typeface) {
        defpackage.aci aci = this.b;
        java.lang.ref.WeakReference weakReference = this.a;
        if (aci.e) {
            aci.d = typeface;
            android.widget.TextView textView = (android.widget.TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, aci.c);
            }
        }
    }

    public final void a(android.graphics.Typeface typeface, android.os.Handler handler) {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.post(new defpackage.oq(this, typeface));
    }

    public final void a(int i, android.os.Handler handler) {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.post(new defpackage.or(this));
    }

    public op(defpackage.aci aci, java.lang.ref.WeakReference weakReference) {
        this.b = aci;
        this.a = weakReference;
        this();
    }
}
