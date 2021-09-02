package defpackage;

/* renamed from: agz reason: default package */
/* compiled from: PG */
public final class agz implements defpackage.zt {
    public defpackage.zi a;
    private defpackage.ze b;
    private final /* synthetic */ android.support.v7.widget.Toolbar c;

    public agz(android.support.v7.widget.Toolbar toolbar) {
        this.c = toolbar;
    }

    public final void a(android.content.Context context, defpackage.ze zeVar) {
        if (!(this.b == null || this.a == null)) {
            this.b.b(this.a);
        }
        this.b = zeVar;
    }

    public final void a(boolean z) {
        boolean z2 = false;
        if (this.a != null) {
            if (this.b != null) {
                int size = this.b.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.b.getItem(i) == this.a) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z2) {
                b(this.a);
            }
        }
    }

    public final void a(defpackage.zu zuVar) {
    }

    public final boolean a(defpackage.aad aad) {
        return false;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(defpackage.zi ziVar) {
        android.support.v7.widget.Toolbar toolbar = this.c;
        if (toolbar.l == null) {
            toolbar.l = new defpackage.abr(toolbar.getContext(), null, 2130772188);
            toolbar.l.setImageDrawable(toolbar.j);
            toolbar.l.setContentDescription(toolbar.k);
            defpackage.aha aha = new defpackage.aha();
            aha.a = (toolbar.r & 112) | 8388611;
            aha.b = 2;
            toolbar.l.setLayoutParams(aha);
            toolbar.l.setOnClickListener(new defpackage.agy(toolbar));
        }
        android.view.ViewParent parent = this.c.l.getParent();
        if (parent != this.c) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.c.l);
            }
            this.c.addView(this.c.l);
        }
        this.c.m = ziVar.getActionView();
        this.a = ziVar;
        android.view.ViewParent parent2 = this.c.m.getParent();
        if (parent2 != this.c) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(this.c.m);
            }
            defpackage.aha aha2 = new defpackage.aha();
            aha2.a = (this.c.r & 112) | 8388611;
            aha2.b = 2;
            this.c.m.setLayoutParams(aha2);
            this.c.addView(this.c.m);
        }
        android.support.v7.widget.Toolbar toolbar2 = this.c;
        for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = toolbar2.getChildAt(childCount);
            if (!(((defpackage.aha) childAt.getLayoutParams()).b == 2 || childAt == toolbar2.g)) {
                toolbar2.removeViewAt(childCount);
                toolbar2.z.add(childAt);
            }
        }
        this.c.requestLayout();
        ziVar.d(true);
        if (this.c.m instanceof defpackage.ye) {
            ((defpackage.ye) this.c.m).a();
        }
        return true;
    }

    public final boolean b(defpackage.zi ziVar) {
        if (this.c.m instanceof defpackage.ye) {
            ((defpackage.ye) this.c.m).b();
        }
        this.c.removeView(this.c.m);
        this.c.removeView(this.c.l);
        this.c.m = null;
        android.support.v7.widget.Toolbar toolbar = this.c;
        for (int size = toolbar.z.size() - 1; size >= 0; size--) {
            toolbar.addView((android.view.View) toolbar.z.get(size));
        }
        toolbar.z.clear();
        this.a = null;
        this.c.requestLayout();
        ziVar.d(false);
        return true;
    }

    public final int b() {
        return 0;
    }

    public final android.os.Parcelable c() {
        return null;
    }

    public final void a(android.os.Parcelable parcelable) {
    }
}
