package defpackage;

/* renamed from: te reason: default package */
/* compiled from: PG */
public final class te {
    public java.lang.ref.WeakReference a;

    te(android.view.View view) {
        this.a = new java.lang.ref.WeakReference(view);
    }

    public final defpackage.te a(long j) {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final defpackage.te a(float f) {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final defpackage.te b(float f) {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final void a() {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final defpackage.te a(defpackage.th thVar) {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null) {
            if (thVar != null) {
                view.animate().setListener(new defpackage.tf(thVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
        return this;
    }

    public final defpackage.te a(defpackage.tj tjVar) {
        android.view.View view = (android.view.View) this.a.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 19) {
            defpackage.tg tgVar = null;
            if (tjVar != null) {
                tgVar = new defpackage.tg(tjVar);
            }
            view.animate().setUpdateListener(tgVar);
        }
        return this;
    }
}
