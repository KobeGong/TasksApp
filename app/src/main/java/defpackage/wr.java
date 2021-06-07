package defpackage;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: wr  reason: default package */
/* compiled from: PG */
public class wr extends yo {
    private final /* synthetic */ wp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wr(wp wpVar, Window.Callback callback) {
        super(callback);
        this.a = wpVar;
    }

    @Override // defpackage.yo
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.yo
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.a.a(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // defpackage.yo
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ze)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // defpackage.yo
    public void onContentChanged() {
    }

    @Override // defpackage.yo
    public boolean onPreparePanel(int i, View view, Menu menu) {
        ze zeVar = menu instanceof ze ? (ze) menu : null;
        if (i == 0 && zeVar == null) {
            return false;
        }
        if (zeVar != null) {
            zeVar.k = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (zeVar == null) {
            return onPreparePanel;
        }
        zeVar.k = false;
        return onPreparePanel;
    }

    @Override // defpackage.yo
    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.a.e(i);
        return true;
    }

    @Override // defpackage.yo
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.a.d(i);
    }
}
