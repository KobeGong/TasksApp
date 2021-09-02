package defpackage;

/* renamed from: wr reason: default package */
/* compiled from: PG */
class wr extends defpackage.yo {
    private final /* synthetic */ defpackage.wp a;

    wr(defpackage.wp wpVar, android.view.Window.Callback callback) {
        this.a = wpVar;
        super(callback);
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.a.a(keyEvent.getKeyCode(), keyEvent);
    }

    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0 || (menu instanceof defpackage.ze)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public void onContentChanged() {
    }

    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        defpackage.ze zeVar = menu instanceof defpackage.ze ? (defpackage.ze) menu : null;
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

    public boolean onMenuOpened(int i, android.view.Menu menu) {
        super.onMenuOpened(i, menu);
        this.a.e(i);
        return true;
    }

    public void onPanelClosed(int i, android.view.Menu menu) {
        super.onPanelClosed(i, menu);
        this.a.d(i);
    }
}
