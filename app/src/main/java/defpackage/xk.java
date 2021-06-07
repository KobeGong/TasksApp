package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.ListAdapter;

/* renamed from: xk  reason: default package */
/* compiled from: PG */
public final class xk implements zu {
    public final agq a;
    private boolean b;
    private final int c;

    @Override // defpackage.zu
    public final boolean a(ze zeVar) {
        return false;
    }

    @Override // defpackage.zu
    public final void a(ze zeVar, boolean z) {
        if (!this.b) {
            this.b = true;
            acr acr = null;
            acr.a();
            this.b = false;
        }
    }

    public xk(Context context) {
        this(context, wl.a(context, 0));
    }

    private xk(Context context, int i) {
        this.a = new agq(new ContextThemeWrapper(context, wl.a(context, i)));
        this.c = i;
    }

    public final xk a(int i) {
        this.a.d = this.a.a.getText(i);
        return this;
    }

    public final xk b(int i) {
        this.a.f = this.a.a.getText(i);
        return this;
    }

    public final xk a(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public final xk a(int i, DialogInterface.OnClickListener onClickListener) {
        this.a.g = this.a.a.getText(i);
        this.a.h = onClickListener;
        return this;
    }

    public final xk a(DialogInterface.OnClickListener onClickListener) {
        this.a.i = this.a.a.getText(17039360);
        this.a.j = onClickListener;
        return this;
    }

    public final xk a(DialogInterface.OnDismissListener onDismissListener) {
        this.a.l = onDismissListener;
        return this;
    }

    public final wl a() {
        ListAdapter wkVar;
        wl wlVar = new wl(this.a.a, this.c);
        agq agq = this.a;
        AlertController alertController = wlVar.a;
        if (agq.e != null) {
            alertController.y = agq.e;
        } else {
            if (agq.d != null) {
                alertController.a(agq.d);
            }
            if (agq.c != null) {
                Drawable drawable = agq.c;
                alertController.u = drawable;
                if (alertController.v != null) {
                    if (drawable != null) {
                        alertController.v.setVisibility(0);
                        alertController.v.setImageDrawable(drawable);
                    } else {
                        alertController.v.setVisibility(8);
                    }
                }
            }
        }
        if (agq.f != null) {
            CharSequence charSequence = agq.f;
            alertController.f = charSequence;
            if (alertController.x != null) {
                alertController.x.setText(charSequence);
            }
        }
        if (agq.g != null) {
            alertController.a(-1, agq.g, agq.h, null);
        }
        if (agq.i != null) {
            alertController.a(-2, agq.i, agq.j, null);
        }
        if (agq.n != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) agq.b.inflate(alertController.C, (ViewGroup) null);
            int i = alertController.D;
            if (agq.n != null) {
                wkVar = agq.n;
            } else {
                wkVar = new wk(agq.a, i);
            }
            alertController.z = wkVar;
            alertController.A = agq.p;
            if (agq.o != null) {
                recycleListView.setOnItemClickListener(new wi(agq, alertController));
            }
            alertController.g = recycleListView;
        }
        wlVar.setCancelable(this.a.k);
        if (this.a.k) {
            wlVar.setCanceledOnTouchOutside(true);
        }
        wlVar.setOnCancelListener(null);
        wlVar.setOnDismissListener(this.a.l);
        if (this.a.m != null) {
            wlVar.setOnKeyListener(this.a.m);
        }
        return wlVar;
    }
}
