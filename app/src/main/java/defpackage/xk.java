package defpackage;

/* renamed from: xk reason: default package */
/* compiled from: PG */
public final class xk implements defpackage.zu {
    public final defpackage.agq a;
    private boolean b;
    private final int c;

    public final boolean a(defpackage.ze zeVar) {
        return false;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if (!this.b) {
            this.b = true;
            defpackage.acr acr = null;
            acr.a();
            this.b = false;
        }
    }

    public xk(android.content.Context context) {
        this(context, defpackage.wl.a(context, 0));
    }

    private xk(android.content.Context context, int i) {
        this.a = new defpackage.agq(new android.view.ContextThemeWrapper(context, defpackage.wl.a(context, i)));
        this.c = i;
    }

    public final defpackage.xk a(int i) {
        this.a.d = this.a.a.getText(i);
        return this;
    }

    public final defpackage.xk b(int i) {
        this.a.f = this.a.a.getText(i);
        return this;
    }

    public final defpackage.xk a(java.lang.CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public final defpackage.xk a(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        this.a.g = this.a.a.getText(i);
        this.a.h = onClickListener;
        return this;
    }

    public final defpackage.xk a(android.content.DialogInterface.OnClickListener onClickListener) {
        this.a.i = this.a.a.getText(17039360);
        this.a.j = onClickListener;
        return this;
    }

    public final defpackage.xk a(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.a.l = onDismissListener;
        return this;
    }

    public final defpackage.wl a() {
        android.widget.ListAdapter wkVar;
        defpackage.wl wlVar = new defpackage.wl(this.a.a, this.c);
        defpackage.agq agq = this.a;
        android.support.v7.app.AlertController alertController = wlVar.a;
        if (agq.e != null) {
            alertController.y = agq.e;
        } else {
            if (agq.d != null) {
                alertController.a(agq.d);
            }
            if (agq.c != null) {
                android.graphics.drawable.Drawable drawable = agq.c;
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
            java.lang.CharSequence charSequence = agq.f;
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
            android.support.v7.app.AlertController.RecycleListView recycleListView = (android.support.v7.app.AlertController.RecycleListView) agq.b.inflate(alertController.C, null);
            int i = alertController.D;
            if (agq.n != null) {
                wkVar = agq.n;
            } else {
                wkVar = new defpackage.wk(agq.a, i);
            }
            alertController.z = wkVar;
            alertController.A = agq.p;
            if (agq.o != null) {
                recycleListView.setOnItemClickListener(new defpackage.wi(agq, alertController));
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
