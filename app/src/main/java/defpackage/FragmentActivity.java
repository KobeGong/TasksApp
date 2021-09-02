package defpackage;

/* renamed from: lg reason: default package */
/* compiled from: PG */
public class FragmentActivity extends defpackage.la implements ViewModelStoreOwner, defpackage.ks, defpackage.ku {
    public final android.os.Handler b = new defpackage.lh(this);
    public final defpackage.ll c = new defpackage.ll(new defpackage.li(this));
    public boolean d = true;
    public int e;
    public defpackage.rj f;
    private ViewModelStore h;
    private boolean i;
    private boolean j;
    private boolean k = true;
    private boolean l;

    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
            r5 = this;
            ll r0 = this.c
            r0.a()
            int r0 = r6 >> 16
            if (r0 == 0) goto L_0x0073
            int r1 = r0 + -1
            rj r0 = this.f
            int[] r2 = r0.c
            int r3 = r0.e
            int r2 = defpackage.qv.a(r2, r3, r1)
            if (r2 < 0) goto L_0x001f
            java.lang.Object[] r3 = r0.d
            r3 = r3[r2]
            java.lang.Object r4 = defpackage.rj.a
            if (r3 != r4) goto L_0x0049
        L_0x001f:
            r0 = 0
        L_0x0020:
            java.lang.String r0 = (java.lang.String) r0
            rj r2 = this.f
            int[] r3 = r2.c
            int r4 = r2.e
            int r1 = defpackage.qv.a(r3, r4, r1)
            if (r1 < 0) goto L_0x003f
            java.lang.Object[] r3 = r2.d
            r3 = r3[r1]
            java.lang.Object r4 = defpackage.rj.a
            if (r3 == r4) goto L_0x003f
            java.lang.Object[] r3 = r2.d
            java.lang.Object r4 = defpackage.rj.a
            r3[r1] = r4
            r1 = 1
            r2.b = r1
        L_0x003f:
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "FragmentActivity"
            java.lang.String r1 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r1)
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object[] r0 = r0.d
            r0 = r0[r2]
            goto L_0x0020
        L_0x004e:
            ll r1 = this.c
            lc r1 = r1.a(r0)
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "FragmentActivity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Activity result no fragment exists for who: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            goto L_0x0048
        L_0x006b:
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r6
            r1.a(r0, r7, r8)
            goto L_0x0048
        L_0x0073:
            defpackage.kq.a()
            super.onActivityResult(r6, r7, r8)
            goto L_0x0048
    }

    public void onBackPressed() {
        FragmentManagerImpl lpVar = this.c.a.mFragmentManager;
        boolean h2 = lpVar.h();
        if (h2 && android.os.Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (h2 || !lpVar.d()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.c.a.mFragmentManager.b(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.c.a.mFragmentManager.c(z);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.a();
        this.c.a.mFragmentManager.a(configuration);
    }

    public final ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.h == null) {
            this.h = new ViewModelStore();
        }
        return this.h;
    }

    public void onCreate(android.os.Bundle bundle) {
        defpackage.ll llVar = this.c;
        llVar.a.mFragmentManager.a(llVar.a, (FragmentContainer) llVar.a, (Fragment) null);
        super.onCreate(bundle);
        defpackage.lj ljVar = (defpackage.lj) getLastNonConfigurationInstance();
        if (ljVar != null) {
            this.h = ljVar.a;
        }
        if (bundle != null) {
            this.c.a.mFragmentManager.a(bundle.getParcelable("android:support:fragments"), ljVar != null ? ljVar.b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.e = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                java.lang.String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    android.util.Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f = new defpackage.rj(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f.a(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f == null) {
            this.f = new defpackage.rj();
            this.e = 0;
        }
        this.c.a.mFragmentManager.n();
    }

    public boolean onCreatePanelMenu(int i2, android.view.Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        defpackage.ll llVar = this.c;
        return onCreatePanelMenu | llVar.a.mFragmentManager.a(menu, getMenuInflater());
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View a(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.c.a.mFragmentManager.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        a(false);
        if (this.h != null && !this.l) {
            this.h.a();
        }
        this.c.a.mFragmentManager.s();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.c.a.mFragmentManager.t();
    }

    public boolean onMenuItemSelected(int i2, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        switch (i2) {
            case 0:
                return this.c.a.mFragmentManager.a(menuItem);
            case 6:
                return this.c.a.mFragmentManager.b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i2, android.view.Menu menu) {
        switch (i2) {
            case 0:
                this.c.a.mFragmentManager.b(menu);
                break;
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.j = false;
        if (this.b.hasMessages(2)) {
            this.b.removeMessages(2);
            this.c.a.mFragmentManager.q();
        }
        this.c.a.mFragmentManager.c(4);
    }

    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.c.a();
    }

    public void onStateNotSaved() {
        this.c.a();
    }

    public void onResume() {
        super.onResume();
        this.b.sendEmptyMessage(2);
        this.j = true;
        this.c.b();
    }

    public void onPostResume() {
        super.onPostResume();
        this.b.removeMessages(2);
        this.c.a.mFragmentManager.q();
        this.c.b();
    }

    public boolean onPreparePanel(int i2, android.view.View view, android.view.Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.c.a.mFragmentManager.a(menu);
    }

    public final java.lang.Object onRetainNonConfigurationInstance() {
        if (this.d) {
            a(true);
        }
        FragmentManagerImpl lpVar = this.c.a.mFragmentManager;
        FragmentManagerImpl.a(lpVar.k);
        defpackage.me meVar = lpVar.k;
        if (meVar == null && this.h == null) {
            return null;
        }
        defpackage.lj ljVar = new defpackage.lj();
        ljVar.a = this.h;
        ljVar.b = meVar;
        return ljVar;
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        android.os.Parcelable l2 = this.c.a.mFragmentManager.l();
        if (l2 != null) {
            bundle.putParcelable("android:support:fragments", l2);
        }
        if (this.f.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.e);
            int[] iArr = new int[this.f.b()];
            java.lang.String[] strArr = new java.lang.String[this.f.b()];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f.b()) {
                    iArr[i3] = this.f.b(i3);
                    strArr[i3] = (java.lang.String) this.f.c(i3);
                    i2 = i3 + 1;
                } else {
                    bundle.putIntArray("android:support:request_indicies", iArr);
                    bundle.putStringArray("android:support:request_fragment_who", strArr);
                    return;
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.d = false;
        this.k = false;
        this.b.removeMessages(1);
        if (!this.i) {
            this.i = true;
            this.c.a.mFragmentManager.o();
        }
        this.c.a();
        this.c.b();
        this.c.a.mFragmentManager.p();
    }

    public void onStop() {
        super.onStop();
        this.d = true;
        g();
        this.b.sendEmptyMessage(1);
        this.c.a.mFragmentManager.r();
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.k);
        defpackage.na.a(this).a(str2, fileDescriptor, printWriter, strArr);
        this.c.a.mFragmentManager.a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (!this.k) {
            this.k = true;
            this.l = z;
            this.b.removeMessages(1);
            this.c.a.mFragmentManager.c(2);
        }
    }

    public final defpackage.ln getSupportFragmentManager() {
        return this.c.a.mFragmentManager;
    }

    public void startActivityForResult(android.content.Intent intent, int i2) {
        if (!this.a && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public final void a_() {
        a(1000);
    }

    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r6, java.lang.String[] r7, int[] r8) {
            r5 = this;
            ll r0 = this.c
            r0.a()
            int r0 = r6 >> 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004c
            int r1 = r0 + -1
            rj r0 = this.f
            int[] r2 = r0.c
            int r3 = r0.e
            int r2 = defpackage.qv.a(r2, r3, r1)
            if (r2 < 0) goto L_0x0023
            java.lang.Object[] r3 = r0.d
            r3 = r3[r2]
            java.lang.Object r4 = defpackage.rj.a
            if (r3 != r4) goto L_0x004d
        L_0x0023:
            r0 = 0
        L_0x0024:
            java.lang.String r0 = (java.lang.String) r0
            rj r2 = this.f
            int[] r3 = r2.c
            int r4 = r2.e
            int r1 = defpackage.qv.a(r3, r4, r1)
            if (r1 < 0) goto L_0x0043
            java.lang.Object[] r3 = r2.d
            r3 = r3[r1]
            java.lang.Object r4 = defpackage.rj.a
            if (r3 == r4) goto L_0x0043
            java.lang.Object[] r3 = r2.d
            java.lang.Object r4 = defpackage.rj.a
            r3[r1] = r4
            r1 = 1
            r2.b = r1
        L_0x0043:
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "FragmentActivity"
            java.lang.String r1 = "Activity result delivered for unknown Fragment."
            android.util.Log.w(r0, r1)
        L_0x004c:
            return
        L_0x004d:
            java.lang.Object[] r0 = r0.d
            r0 = r0[r2]
            goto L_0x0024
        L_0x0052:
            ll r1 = this.c
            lc r1 = r1.a(r0)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "FragmentActivity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Activity result no fragment exists for who: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            goto L_0x004c
        L_0x006f:
            defpackage.lc.n()
            goto L_0x004c
    }

    private final void g() {
        do {
        } while (a(getSupportFragmentManager(), State.CREATED));
    }

    private static boolean a(defpackage.ln lnVar, State wVar) {
        boolean z;
        boolean z2 = false;
        for (Fragment lcVar : lnVar.g()) {
            if (lcVar != null) {
                if (lcVar.T.getCurrentState().a(State.STARTED)) {
                    lcVar.T.a(wVar);
                    z2 = true;
                }
                FragmentManagerImpl lpVar = lcVar.v;
                if (lpVar != null) {
                    z = a(lpVar, wVar) | z2;
                } else {
                    z = z2;
                }
                z2 = z;
            }
        }
        return z2;
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(android.content.IntentSender intentSender, int i2, android.content.Intent intent, int i3, int i4, int i5, android.os.Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(android.content.Intent intent, int i2, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(android.content.IntentSender intentSender, int i2, android.content.Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }
}
