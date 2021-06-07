package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: op  reason: default package */
/* compiled from: PG */
public final class op {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ aci b;

    public op() {
    }

    public final void a(Typeface typeface) {
        aci aci = this.b;
        WeakReference weakReference = this.a;
        if (aci.e) {
            aci.d = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, aci.c);
            }
        }
    }

    public final void a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new oq(this, typeface));
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new or(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public op(aci aci, WeakReference weakReference) {
        this();
        this.b = aci;
        this.a = weakReference;
    }
}
