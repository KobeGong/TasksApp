package defpackage;

/* renamed from: zh reason: default package */
/* compiled from: PG */
final class zh implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, defpackage.zu {
    public defpackage.ze a;
    public defpackage.wl b;
    public defpackage.zb c;

    public zh(defpackage.ze zeVar) {
        this.a = zeVar;
    }

    public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window = this.b.getWindow();
                if (window != null) {
                    android.view.View decorView = window.getDecorView();
                    if (decorView != null) {
                        android.view.KeyEvent.DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                android.view.Window window2 = this.b.getWindow();
                if (window2 != null) {
                    android.view.View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        android.view.KeyEvent.DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.a.b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if ((z || zeVar == this.a) && this.b != null) {
            this.b.dismiss();
        }
    }

    public final boolean a(defpackage.ze zeVar) {
        return false;
    }

    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.a.a((android.view.MenuItem) (defpackage.zi) this.c.d().getItem(i), (defpackage.zt) null, 0);
    }
}
