package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import com.google.android.apps.tasks.ui.TaskListsActivity;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* access modifiers changed from: package-private */
/* renamed from: fs  reason: default package */
/* compiled from: PG */
public final class fs implements zf {
    private final /* synthetic */ fr a;

    fs(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.zf
    public final boolean a(ze zeVar, MenuItem menuItem) {
        boolean z;
        dcb dcb;
        String str;
        if (this.a.e == null) {
            return false;
        }
        ft ftVar = this.a.e;
        TaskListsActivity taskListsActivity = ftVar.a;
        NavigationView navigationView = ftVar.b;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            crv a2 = akh.a();
            if (a2.a()) {
                str = ((aki) a2.b()).b();
            } else {
                str = "com.google.android.apps.tasks.USER_INITIATED_FEEDBACK_REPORT";
            }
            ayp ayp = taskListsActivity.m;
            bgk bgk = new bgk();
            Bitmap a3 = GoogleHelp.a(taskListsActivity);
            if (a3 != null) {
                bgk.a = new BitmapTeleporter(a3);
            }
            bgk.c = str;
            bgh.a(ayp, new bgj(new ApplicationErrorReport()).m = null.f = bgk.a.a = null.c = null.b = bgk.b.e = bgk.c.h = bgk.d.i = false.j = null.k = null.l = false.n = null).a(new app(taskListsActivity));
        } else {
            if (itemId == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                taskListsActivity.a(new arv());
            } else if (itemId == 2) {
                taskListsActivity.startActivity(new Intent(taskListsActivity, LicenseMenuActivity.class));
            } else {
                aou aou = taskListsActivity.p;
                int i = itemId - 3;
                if (i < 0 || i >= aou.a.size()) {
                    dcb = null;
                } else {
                    dcb = (dcb) aou.a.get(i);
                }
                if (dcb != null) {
                    taskListsActivity.b(dcb);
                    navigationView.a(itemId);
                }
            }
        }
        cft h = taskListsActivity.o.h();
        if (h != null) {
            h.a(false);
        }
        return true;
    }

    @Override // defpackage.zf
    public final void a(ze zeVar) {
    }
}
