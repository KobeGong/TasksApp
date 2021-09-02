package defpackage;

/* renamed from: fs reason: default package */
/* compiled from: PG */
final class fs implements defpackage.zf {
    private final /* synthetic */ defpackage.fr a;

    fs(defpackage.fr frVar) {
        this.a = frVar;
    }

    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        boolean z;
        defpackage.dcb dcb;
        java.lang.String str;
        if (this.a.e == null) {
            return false;
        }
        defpackage.ft ftVar = this.a.e;
        com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity = ftVar.a;
        android.support.design.widget.NavigationView navigationView = ftVar.b;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            defpackage.crv a2 = defpackage.akh.a();
            if (a2.a()) {
                str = ((defpackage.aki) a2.b()).b();
            } else {
                str = "com.google.android.apps.tasks.USER_INITIATED_FEEDBACK_REPORT";
            }
            defpackage.ayp ayp = taskListsActivity.m;
            defpackage.bgk bgk = new defpackage.bgk();
            android.graphics.Bitmap a3 = com.google.android.gms.googlehelp.GoogleHelp.a(taskListsActivity);
            if (a3 != null) {
                bgk.a = new com.google.android.gms.common.data.BitmapTeleporter(a3);
            }
            bgk.c = str;
            defpackage.bgh.a(ayp, new defpackage.bgj(new android.app.ApplicationErrorReport()).m = null.f = bgk.a.a = null.c = null.b = bgk.b.e = bgk.c.h = bgk.d.i = false.j = null.k = null.l = false.n = null).a((defpackage.ayx) new defpackage.app(taskListsActivity));
        } else {
            if (itemId == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                taskListsActivity.a((Fragment) new defpackage.arv());
            } else if (itemId == 2) {
                taskListsActivity.startActivity(new android.content.Intent(taskListsActivity, com.google.android.libraries.social.licenses.LicenseMenuActivity.class));
            } else {
                defpackage.aou aou = taskListsActivity.p;
                int i = itemId - 3;
                if (i < 0 || i >= aou.a.size()) {
                    dcb = null;
                } else {
                    dcb = (defpackage.dcb) aou.a.get(i);
                }
                if (dcb != null) {
                    taskListsActivity.b(dcb);
                    navigationView.a(itemId);
                }
            }
        }
        defpackage.cft h = taskListsActivity.o.h();
        if (h != null) {
            h.a(false);
        }
        return true;
    }

    public final void a(defpackage.ze zeVar) {
    }
}
