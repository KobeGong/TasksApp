package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.tasks.R;

/* renamed from: agz  reason: default package */
/* compiled from: PG */
public final class agz implements zt {
    public zi a;
    private ze b;
    private final /* synthetic */ Toolbar c;

    public agz(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.zt
    public final void a(Context context, ze zeVar) {
        if (!(this.b == null || this.a == null)) {
            this.b.b(this.a);
        }
        this.b = zeVar;
    }

    @Override // defpackage.zt
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

    @Override // defpackage.zt
    public final void a(zu zuVar) {
    }

    @Override // defpackage.zt
    public final boolean a(aad aad) {
        return false;
    }

    @Override // defpackage.zt
    public final void a(ze zeVar, boolean z) {
    }

    @Override // defpackage.zt
    public final boolean a() {
        return false;
    }

    @Override // defpackage.zt
    public final boolean a(zi ziVar) {
        Toolbar toolbar = this.c;
        if (toolbar.l == null) {
            toolbar.l = new abr(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.l.setImageDrawable(toolbar.j);
            toolbar.l.setContentDescription(toolbar.k);
            aha aha = new aha();
            aha.a = (toolbar.r & 112) | 8388611;
            aha.b = 2;
            toolbar.l.setLayoutParams(aha);
            toolbar.l.setOnClickListener(new agy(toolbar));
        }
        ViewParent parent = this.c.l.getParent();
        if (parent != this.c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c.l);
            }
            this.c.addView(this.c.l);
        }
        this.c.m = ziVar.getActionView();
        this.a = ziVar;
        ViewParent parent2 = this.c.m.getParent();
        if (parent2 != this.c) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.c.m);
            }
            aha aha2 = new aha();
            aha2.a = (this.c.r & 112) | 8388611;
            aha2.b = 2;
            this.c.m.setLayoutParams(aha2);
            this.c.addView(this.c.m);
        }
        Toolbar toolbar2 = this.c;
        for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar2.getChildAt(childCount);
            if (!(((aha) childAt.getLayoutParams()).b == 2 || childAt == toolbar2.g)) {
                toolbar2.removeViewAt(childCount);
                toolbar2.z.add(childAt);
            }
        }
        this.c.requestLayout();
        ziVar.d(true);
        if (this.c.m instanceof ye) {
            ((ye) this.c.m).a();
        }
        return true;
    }

    @Override // defpackage.zt
    public final boolean b(zi ziVar) {
        if (this.c.m instanceof ye) {
            ((ye) this.c.m).b();
        }
        this.c.removeView(this.c.m);
        this.c.removeView(this.c.l);
        this.c.m = null;
        Toolbar toolbar = this.c;
        for (int size = toolbar.z.size() - 1; size >= 0; size--) {
            toolbar.addView((View) toolbar.z.get(size));
        }
        toolbar.z.clear();
        this.a = null;
        this.c.requestLayout();
        ziVar.d(false);
        return true;
    }

    @Override // defpackage.zt
    public final int b() {
        return 0;
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        return null;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
    }
}
