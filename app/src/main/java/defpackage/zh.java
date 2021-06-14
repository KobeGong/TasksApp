package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: zh  reason: default package */
/* compiled from: PG */
final class zh implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, zu {
    public MenuBuilder a;
    public wl b;
    public zb c;

    public zh(MenuBuilder zeVar) {
        this.a = zeVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    @Override // defpackage.zu
    public final void a(MenuBuilder zeVar, boolean z) {
        if ((z || zeVar == this.a) && this.b != null) {
            this.b.dismiss();
        }
    }

    @Override // defpackage.zu
    public final boolean a(MenuBuilder zeVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a((MenuItemImpl) this.c.d().getItem(i), (MenuPresenter) null, 0);
    }
}
