package defpackage;

/* renamed from: wm reason: default package */
/* compiled from: PG */
public class wm extends FragmentActivity implements defpackage.nx, defpackage.wn {
    private defpackage.wo h;
    private int i = 0;

    public void onCreate(android.os.Bundle bundle) {
        defpackage.wo g = g();
        g.j();
        g.a(bundle);
        if (g.k() && this.i != 0) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.i, false);
            } else {
                setTheme(this.i);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        this.i = i2;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        g().c();
    }

    public android.view.MenuInflater getMenuInflater() {
        return g().b();
    }

    public void setContentView(int i2) {
        g().b(i2);
    }

    public void setContentView(android.view.View view) {
        g().a(view);
    }

    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        g().a(view, layoutParams);
    }

    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        g().b(view, layoutParams);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g().d();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        g().g();
    }

    public void onStart() {
        super.onStart();
        g().e();
    }

    public void onStop() {
        super.onStop();
        g().f();
    }

    public android.view.View findViewById(int i2) {
        return g().a(i2);
    }

    public final boolean onMenuItemSelected(int i2, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        defpackage.wa a = g().a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.c() & 4) == 0) {
            return false;
        }
        return h();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        g().i();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(java.lang.CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        g().a(charSequence);
    }

    public void invalidateOptionsMenu() {
        g().h();
    }

    public final void d() {
    }

    public final void e() {
    }

    public final defpackage.yc f() {
        return null;
    }

    private final boolean h() {
        android.content.Intent intent;
        android.content.Intent a = defpackage.jd.a((android.app.Activity) this);
        if (a == null) {
            return false;
        }
        if (shouldUpRecreateTask(a)) {
            defpackage.nw nwVar = new defpackage.nw(this);
            android.content.Intent intent2 = null;
            if (this instanceof defpackage.nx) {
                intent2 = b_();
            }
            if (intent2 == null) {
                intent = defpackage.jd.a((android.app.Activity) this);
            } else {
                intent = intent2;
            }
            if (intent != null) {
                android.content.ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(nwVar.b.getPackageManager());
                }
                nwVar.a(component);
                nwVar.a.add(intent);
            }
            if (nwVar.a.isEmpty()) {
                throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            android.content.Intent[] intentArr = (android.content.Intent[]) nwVar.a.toArray(new android.content.Intent[nwVar.a.size()]);
            intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
            defpackage.ob.a(nwVar.b, intentArr);
            try {
                defpackage.kq.a(this);
            } catch (java.lang.IllegalStateException e) {
                finish();
            }
        } else {
            navigateUpTo(a);
        }
        return true;
    }

    public final android.content.Intent b_() {
        return defpackage.jd.a((android.app.Activity) this);
    }

    public void onContentChanged() {
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g().b(bundle);
    }

    public final defpackage.wo g() {
        if (this.h == null) {
            this.h = defpackage.wo.a(this, getWindow(), this);
        }
        return this.h;
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        defpackage.wa a = g().a();
        if (keyCode == 82 && a != null) {
            a.j();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            r0 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L_0x0041
            boolean r1 = r5.isCtrlPressed()
            if (r1 != 0) goto L_0x0041
            int r1 = r5.getMetaState()
            boolean r1 = android.view.KeyEvent.metaStateHasNoModifiers(r1)
            if (r1 != 0) goto L_0x0041
            int r1 = r5.getRepeatCount()
            if (r1 != 0) goto L_0x0041
            int r1 = r5.getKeyCode()
            boolean r1 = android.view.KeyEvent.isModifierKey(r1)
            if (r1 != 0) goto L_0x0041
            android.view.Window r1 = r3.getWindow()
            if (r1 == 0) goto L_0x0041
            android.view.View r2 = r1.getDecorView()
            if (r2 == 0) goto L_0x0041
            android.view.View r1 = r1.getDecorView()
            boolean r1 = r1.dispatchKeyShortcutEvent(r5)
            if (r1 == 0) goto L_0x0041
            r1 = r0
        L_0x003e:
            if (r1 == 0) goto L_0x0043
        L_0x0040:
            return r0
        L_0x0041:
            r1 = 0
            goto L_0x003e
        L_0x0043:
            boolean r0 = super.onKeyDown(r4, r5)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void openOptionsMenu() {
        defpackage.wa a = g().a();
        if (getWindow().hasFeature(0)) {
            if (a != null) {
                a.g();
            }
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        defpackage.wa a = g().a();
        if (getWindow().hasFeature(0)) {
            if (a != null) {
                a.h();
            }
            super.closeOptionsMenu();
        }
    }
}
