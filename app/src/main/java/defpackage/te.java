package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: te  reason: default package */
/* compiled from: PG */
public final class te {
    public WeakReference a;

    te(View view) {
        this.a = new WeakReference(view);
    }

    public final te a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final te a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final te b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final te a(th thVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (thVar != null) {
                view.animate().setListener(new tf(thVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    public final te a(tj tjVar) {
        View view = (View) this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            tg tgVar = null;
            if (tjVar != null) {
                tgVar = new tg(tjVar);
            }
            view.animate().setUpdateListener(tgVar);
        }
        return this;
    }
}
