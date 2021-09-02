package defpackage;

/* renamed from: yo reason: default package */
/* compiled from: PG */
public class yo implements android.view.Window.Callback {
    private final android.view.Window.Callback a;

    public yo(android.view.Window.Callback callback) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public android.view.View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        return this.a.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        return this.a.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, android.view.Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.a.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, android.view.Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.a.onWindowStartingActionMode(callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        return this.a.onWindowStartingActionMode(callback, i);
    }

    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i) {
        this.a.onProvideKeyboardShortcuts(list, menu, i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.a.onPointerCaptureChanged(z);
    }
}
