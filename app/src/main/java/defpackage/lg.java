package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: lg  reason: default package */
/* compiled from: PG */
public class lg extends la implements ak, ks, ku {
    public final Handler b = new lh(this);
    public final ll c = new ll(new li(this));
    public boolean d = true;
    public int e;
    public rj f;
    private gt h;
    private boolean i;
    private boolean j;
    private boolean k = true;
    private boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        lp lpVar = this.c.a.d;
        boolean h2 = lpVar.h();
        if (h2 && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (h2 || !lpVar.d()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.c.a.d.b(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.c.a.d.c(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.a();
        this.c.a.d.a(configuration);
    }

    @Override // defpackage.ak
    public final gt b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.h == null) {
            this.h = new gt();
        }
        return this.h;
    }

    @Override // defpackage.nv
    public void onCreate(Bundle bundle) {
        ll llVar = this.c;
        llVar.a.d.a(llVar.a, llVar.a, (lc) null);
        super.onCreate(bundle);
        lj ljVar = (lj) getLastNonConfigurationInstance();
        if (ljVar != null) {
            this.h = ljVar.a;
        }
        if (bundle != null) {
            this.c.a.d.a(bundle.getParcelable("android:support:fragments"), ljVar != null ? ljVar.b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.e = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f = new rj(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f.a(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f == null) {
            this.f = new rj();
            this.e = 0;
        }
        this.c.a.d.n();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        ll llVar = this.c;
        return onCreatePanelMenu | llVar.a.d.a(menu, getMenuInflater());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.kz
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.c.a.d.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        a(false);
        if (this.h != null && !this.l) {
            this.h.a();
        }
        this.c.a.d.s();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.c.a.d.t();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        switch (i2) {
            case 0:
                return this.c.a.d.a(menuItem);
            case 6:
                return this.c.a.d.b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        switch (i2) {
            case 0:
                this.c.a.d.b(menu);
                break;
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.j = false;
        if (this.b.hasMessages(2)) {
            this.b.removeMessages(2);
            this.c.a.d.q();
        }
        this.c.a.d.c(4);
    }

    public void onNewIntent(Intent intent) {
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
        this.c.a.d.q();
        this.c.b();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.c.a.d.a(menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.d) {
            a(true);
        }
        lp lpVar = this.c.a.d;
        lp.a(lpVar.k);
        me meVar = lpVar.k;
        if (meVar == null && this.h == null) {
            return null;
        }
        lj ljVar = new lj();
        ljVar.a = this.h;
        ljVar.b = meVar;
        return ljVar;
    }

    @Override // defpackage.nv
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        Parcelable l2 = this.c.a.d.l();
        if (l2 != null) {
            bundle.putParcelable("android:support:fragments", l2);
        }
        if (this.f.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.e);
            int[] iArr = new int[this.f.b()];
            String[] strArr = new String[this.f.b()];
            for (int i2 = 0; i2 < this.f.b(); i2++) {
                iArr[i2] = this.f.b(i2);
                strArr[i2] = (String) this.f.c(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.d = false;
        this.k = false;
        this.b.removeMessages(1);
        if (!this.i) {
            this.i = true;
            this.c.a.d.o();
        }
        this.c.a();
        this.c.b();
        this.c.a.d.p();
    }

    public void onStop() {
        super.onStop();
        this.d = true;
        g();
        this.b.sendEmptyMessage(1);
        this.c.a.d.r();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.k);
        na.a(this).a(str2, fileDescriptor, printWriter, strArr);
        this.c.a.d.a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!this.k) {
            this.k = true;
            this.l = z;
            this.b.removeMessages(1);
            this.c.a.d.c(2);
        }
    }

    public final ln c() {
        return this.c.a.d;
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.a && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // defpackage.ku
    public final void a_() {
        a(1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // defpackage.ks
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r6, java.lang.String[] r7, int[] r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    private final void g() {
        do {
        } while (a(c(), w.CREATED));
    }

    private static boolean a(ln lnVar, w wVar) {
        boolean z;
        boolean z2 = false;
        for (lc lcVar : lnVar.g()) {
            if (lcVar != null) {
                if (lcVar.T.a().a(w.STARTED)) {
                    lcVar.T.a(wVar);
                    z2 = true;
                }
                lp lpVar = lcVar.v;
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

    @Override // defpackage.la, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // defpackage.la
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // defpackage.kz, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // defpackage.kz
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // defpackage.kz
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }
}
