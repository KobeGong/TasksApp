package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: wm  reason: default package */
/* compiled from: PG */
public class wm extends FragmentActivity implements nx, wn {
    private wo h;
    private int i = 0;

    @Override // defpackage.nv, defpackage.lg
    public void onCreate(Bundle bundle) {
        wo g = g();
        g.j();
        g.a(bundle);
        if (g.k() && this.i != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.i, false);
            } else {
                setTheme(this.i);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i2) {
        super.setTheme(i2);
        this.i = i2;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        g().c();
    }

    public MenuInflater getMenuInflater() {
        return g().b();
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        g().b(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        g().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().a(view, layoutParams);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().b(view, layoutParams);
    }

    @Override // defpackage.lg
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g().d();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onPostResume() {
        super.onPostResume();
        g().g();
    }

    @Override // defpackage.lg
    public void onStart() {
        super.onStart();
        g().e();
    }

    @Override // defpackage.lg
    public void onStop() {
        super.onStop();
        g().f();
    }

    @Override // android.app.Activity
    public View findViewById(int i2) {
        return g().a(i2);
    }

    @Override // defpackage.lg
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        wa a = g().a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.c() & 4) == 0) {
            return false;
        }
        return h();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onDestroy() {
        super.onDestroy();
        g().i();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        g().a(charSequence);
    }

    public void invalidateOptionsMenu() {
        g().h();
    }

    @Override // defpackage.wn
    public final void d() {
    }

    @Override // defpackage.wn
    public final void e() {
    }

    @Override // defpackage.wn
    public final yc f() {
        return null;
    }

    private final boolean h() {
        Intent intent;
        Intent a = jd.a((Activity) this);
        if (a == null) {
            return false;
        }
        if (shouldUpRecreateTask(a)) {
            nw nwVar = new nw(this);
            Intent intent2 = null;
            if (this instanceof nx) {
                intent2 = b_();
            }
            if (intent2 == null) {
                intent = jd.a((Activity) this);
            } else {
                intent = intent2;
            }
            if (intent != null) {
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(nwVar.b.getPackageManager());
                }
                nwVar.a(component);
                nwVar.a.add(intent);
            }
            if (nwVar.a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) nwVar.a.toArray(new Intent[nwVar.a.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            ob.a(nwVar.b, intentArr);
            try {
                kq.a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            navigateUpTo(a);
        }
        return true;
    }

    @Override // defpackage.nx
    public final Intent b_() {
        return jd.a((Activity) this);
    }

    public void onContentChanged() {
    }

    @Override // defpackage.nv, defpackage.lg
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g().b(bundle);
    }

    public final wo g() {
        if (this.h == null) {
            this.h = wo.a(this, getWindow(), this);
        }
        return this.h;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        wa a = g().a();
        if (keyCode == 82 && a != null) {
            a.j();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void openOptionsMenu() {
        wa a = g().a();
        if (getWindow().hasFeature(0)) {
            if (a != null) {
                a.g();
            }
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        wa a = g().a();
        if (getWindow().hasFeature(0)) {
            if (a != null) {
                a.h();
            }
            super.closeOptionsMenu();
        }
    }
}
