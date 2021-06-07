package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

/* renamed from: ys  reason: default package */
/* compiled from: PG */
public abstract class ys implements zt {
    public Context a;
    public Context b;
    public ze c;
    public zu d;
    public zv e;
    public int f;
    private LayoutInflater g;
    private int h = R.layout.abc_action_menu_layout;
    private int i = R.layout.abc_action_menu_item_layout;

    public ys(Context context) {
        this.a = context;
        this.g = LayoutInflater.from(context);
    }

    public abstract void a(zi ziVar, zw zwVar);

    @Override // defpackage.zt
    public void a(Context context, ze zeVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = zeVar;
    }

    public zv a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (zv) this.g.inflate(this.h, viewGroup, false);
            this.e.a(this.c);
            a(true);
        }
        return this.e;
    }

    @Override // defpackage.zt
    public void a(boolean z) {
        int i2;
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.j();
                ArrayList i4 = this.c.i();
                int size = i4.size();
                int i5 = 0;
                i2 = 0;
                while (i5 < size) {
                    zi ziVar = (zi) i4.get(i5);
                    if (c(ziVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        zi a2 = childAt instanceof zw ? ((zw) childAt).a() : null;
                        View a3 = a(ziVar, childAt, viewGroup);
                        if (ziVar != a2) {
                            a3.setPressed(false);
                            a3.jumpDrawablesToCurrentState();
                        }
                        if (a3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a3);
                            }
                            ((ViewGroup) this.e).addView(a3, i2);
                        }
                        i3 = i2 + 1;
                    } else {
                        i3 = i2;
                    }
                    i5++;
                    i2 = i3;
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // defpackage.zt
    public final void a(zu zuVar) {
        this.d = zuVar;
    }

    public View a(zi ziVar, View view, ViewGroup viewGroup) {
        zw zwVar;
        if (view instanceof zw) {
            zwVar = (zw) view;
        } else {
            zwVar = (zw) this.g.inflate(this.i, viewGroup, false);
        }
        a(ziVar, zwVar);
        return (View) zwVar;
    }

    public boolean c(zi ziVar) {
        return true;
    }

    @Override // defpackage.zt
    public void a(ze zeVar, boolean z) {
        if (this.d != null) {
            this.d.a(zeVar, z);
        }
    }

    @Override // defpackage.zt
    public boolean a(aad aad) {
        if (this.d != null) {
            return this.d.a(aad);
        }
        return false;
    }

    @Override // defpackage.zt
    public boolean a() {
        return false;
    }

    @Override // defpackage.zt
    public final boolean a(zi ziVar) {
        return false;
    }

    @Override // defpackage.zt
    public final boolean b(zi ziVar) {
        return false;
    }

    @Override // defpackage.zt
    public final int b() {
        return this.f;
    }
}
