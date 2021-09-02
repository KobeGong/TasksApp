package com.google.android.apps.tasks.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;

import java.util.concurrent.Executor;

import defpackage.BottomSheetMenuDialogFragment;
import defpackage.EditTaskFragment;
import defpackage.Fragment;
import defpackage.TasksFragment;
import defpackage.WelcomeFragment;

/* compiled from: PG */
public class TaskListsActivity extends defpackage.aql implements defpackage.alh, android.app.DatePickerDialog.OnDateSetListener, defpackage.aop, defpackage.aqi, defpackage.ash, defpackage.atf, defpackage.aux, defpackage.ays {
    private defpackage.wl A;
    private TasksAppBarLayout appBarLayout;
    private boolean C;
    private android.view.View splashView;
    private Executor E;
    private android.widget.FrameLayout F;
    private NavigationView G;
    private defpackage.cdm H;
    private defpackage.cdm I;
    public defpackage.dcb h;
    public TasksFragment i;
    public android.support.design.widget.CollapsingToolbarLayout collapsingToolbarLayout;
    public android.view.View fab;
    public boolean l;
    public defpackage.ayp m;
    public Fragment n;
    public defpackage.cde o;
    public defpackage.aou p;
    public defpackage.cdl q;
    private defpackage.alu t;
    private CoordinatorLayout u;
    private NestedScrollView v;
    private Toolbar toolbar;
    private BottomAppBar bottomAppBar;
    private android.view.View bottomAppBarShadow;
    private boolean z;

    /* access modifiers changed from: protected */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.crk crk = defpackage.crk.a;
        if (crk.a()) {
            android.os.StrictMode.setThreadPolicy(((defpackage.all) crk.b()).a());
        }
        setContentView(R.layout.app_bar_task_lists);
        this.u = (CoordinatorLayout) findViewById(R.id.app_bar_coordinator);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        e(false);
        this.collapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.collapsingToolbarLayout.a("");
        android.support.design.widget.CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        collapsingToolbarLayout.b = (int) getResources().getDimension(R.dimen.app_bar_expanded_bottom_margin);
        collapsingToolbarLayout.requestLayout();
        android.support.design.widget.CollapsingToolbarLayout collapsingToolbarLayout2 = this.collapsingToolbarLayout;
        collapsingToolbarLayout2.a = (int) getResources().getDimension(R.dimen.app_bar_expanded_top_margin);
        collapsingToolbarLayout2.requestLayout();
        TaskApplication.getApplication().a.a(new defpackage.apo(this));
        this.toolbar.setNavigationOnClickListener(new defpackage.aov(this));
        this.toolbar.mOnMenuItemClickListener = new defpackage.aow(this);
        defpackage.ayq ayq = new defpackage.ayq(this);
        defpackage.baw baw = new defpackage.baw(this);
        defpackage.azb.b(true, "clientId must be non-negative");
        ayq.b = 0;
        ayq.c = this;
        ayq.a = baw;
        defpackage.ayq a = ayq.a(defpackage.bgh.b);
        this.F = new android.widget.FrameLayout(this);
        this.F.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        defpackage.cdj cdj = TaskApplication.getApplication().d;
        this.g.addObserver(new defpackage.cdc(this, cdj));
        this.g.addObserver(TaskApplication.getApplication().e);
        this.H = new defpackage.apu(this);
        this.q = cdj.a();
        this.o = new defpackage.cde(this, cdj, this.F);
        this.m = a.a();
        this.i = (TasksFragment) getSupportFragmentManager().a("tasksfragment");
        if (this.i == null) {
            this.i = new TasksFragment();
        }
        this.v = (NestedScrollView) findViewById(R.id.scrollable_content);
        this.t = new defpackage.aps(this);
        this.fab = findViewById(R.id.fab);
        this.fab.setOnClickListener(new defpackage.aph(this));
        this.splashView = findViewById(R.id.splash_view);
        if (TaskApplication.getApplication().c) {
            removeSplash();
        } else {
            TaskApplication.getApplication().c = true;
        }
        this.appBarLayout = (TasksAppBarLayout) findViewById(R.id.app_bar);
        this.bottomAppBar = (BottomAppBar) findViewById(R.id.bottom_app_bar);
        this.bottomAppBarShadow = findViewById(R.id.bottom_app_bar_shadow);
        this.bottomAppBar.c(R.drawable.quantum_ic_menu_grey600_24);
        this.bottomAppBar.c(getString(R.string.a11y_hamburger));
        this.bottomAppBar.setNavigationOnClickListener(new defpackage.apm(this));
        this.bottomAppBar.k().clear();
        this.bottomAppBar.d(R.menu.bottom_bar_menu);
        this.bottomAppBar.mOnMenuItemClickListener = new defpackage.apn(this);
        g(false);
        f(true);
        this.E = defpackage.cub.a((Executor) TaskApplication.getApplication().a);
        this.v.a = new defpackage.apt(this);
    }

    public final void b(boolean z2) {
        TasksAppBarLayout tasksAppBarLayout = this.appBarLayout;
        if (tasksAppBarLayout.f != z2) {
            tasksAppBarLayout.f = z2;
            defpackage.sn.a(tasksAppBarLayout, (float) (tasksAppBarLayout.f ? tasksAppBarLayout.getResources().getDimensionPixelOffset(R.dimen.app_bar_elevation) : 0));
        }
    }

    public final void c(boolean z2) {
        if (this.n instanceof TasksFragment) {
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        a((defpackage.cdu) this.q.c());
    }

    public final void a(java.util.List list, java.lang.String str) {
        defpackage.dcd dcd;
        java.lang.Integer num;
        java.lang.Integer num2 = null;
        boolean z2 = false;
        NavigationView navigationView = (NavigationView) getLayoutInflater().inflate(R.layout.navigation_view_tasks_lists, null);
        navigationView.d.a(new android.view.View(this));
        this.p = new defpackage.aou();
        navigationView.e = new defpackage.ft(this, navigationView);
        defpackage.aou aou = this.p;
        defpackage.ez ezVar = navigationView.c;
        boolean z3 = this.C;
        aou.a.clear();
        if (list != null) {
            aou.a.addAll(list);
        }
        ezVar.clear();
        int i2 = 0;
        while (i2 < aou.a.size()) {
            defpackage.dcb dcb = (defpackage.dcb) aou.a.get(i2);
            int i3 = i2 + 3;
            if (dcb.c == null) {
                dcd = defpackage.dcd.c;
            } else {
                dcd = dcb.c;
            }
            ezVar.add(0, i3, i2, dcd.a).setCheckable(true).setChecked(false);
            if (num2 != null || str == null || !dcb.b.equals(str)) {
                num = num2;
            } else {
                num = i2 + 3;
            }
            i2++;
            num2 = num;
        }
        MenuItem icon = ezVar.add(1, 0, aou.a.size(), R.string.navigation_drawer_create_list).setIcon(R.drawable.quantum_ic_add_grey600_18);
        if (!z3) {
            z2 = true;
        }
        icon.setEnabled(z2);
        ezVar.add(2, 1, aou.a.size() + 1, R.string.navigation_drawer_send_feedback).setIcon(R.drawable.quantum_ic_feedback_grey600_18);
        ezVar.add(3, 2, aou.a.size() + 2, R.string.navigation_drawer_licences);
        if (num2 != null) {
            navigationView.a(num2.intValue());
        }
        this.F.removeAllViews();
        this.F.addView(navigationView);
        this.G = navigationView;
    }

    public final void a(defpackage.axq axq) {
        if (!r()) {
            android.widget.Toast.makeText(getApplicationContext(), "Unable to get accounts. App won't work.", 0).show();
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, int i2) {
        a(EditTaskFragment.a(str, str2, true, i2));
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        a(EditTaskFragment.a(str, str2, false, -1));
    }

    public final void d(boolean z2) {
        if (this.n instanceof TasksFragment) {
            h(z2);
            Fragment a = getSupportFragmentManager().a("BottomSheetMenuDialogFragment");
            if (a instanceof BottomSheetMenuDialogFragment) {
                ((BottomSheetMenuDialogFragment) a).c(z2);
            }
        }
    }

    public void onDateSet(android.widget.DatePicker datePicker, int i2, int i3, int i4) {
        Fragment a = getSupportFragmentManager().a("AddTaskBottomSheetDialogFragment");
        if (a == null) {
            a = getSupportFragmentManager().findFragmentById(2131755276);
        }
        if (a instanceof android.app.DatePickerDialog.OnDateSetListener) {
            ((android.app.DatePickerDialog.OnDateSetListener) a).onDateSet(datePicker, i2, i3, i4);
        }
    }

    public final void a(defpackage.dcb dcb) {
        Fragment a = getSupportFragmentManager().findFragmentById(2131755276);
        if (a instanceof defpackage.atf) {
            ((defpackage.atf) a).a(dcb);
        }
    }

    public final void a(defpackage.dca dca) {
        defpackage.dih dih;
        boolean z2 = false;
        TasksFragment auj = this.i;
        if (auj.O()) {
            defpackage.dby dby = defpackage.dby.g;
            if (dca != null) {
                defpackage.dii dii = (defpackage.dii) defpackage.dby.g.a(defpackage.bg.ao);
                dii.b();
                defpackage.dby dby2 = (defpackage.dby) dii.a;
                if (dca == null) {
                    throw new java.lang.NullPointerException();
                }
                dby2.e = dca;
                if (dii.b) {
                    dih = dii.a;
                } else {
                    defpackage.dih dih2 = dii.a;
                    defpackage.djz.a.a(dih2).c(dih2);
                    dii.b = true;
                    dih = dii.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, true)) {
                    throw new defpackage.dkw();
                }
                dby = (defpackage.dby) dih3;
            }
            defpackage.dby a = TasksFragment.N().a(auj.X, dby, 0, null);
            boolean z3 = auj.W.a() == 0;
            defpackage.atg atg = auj.W;
            if (!defpackage.ajd.a(a)) {
                z2 = true;
            }
            defpackage.cld.a(z2);
            atg.b(a);
            atg.g();
            if (z3) {
                auj.c(true);
            }
            auj.recyclerView.c(auj.W.a(a));
        }
    }

    public final void i() {
        a((defpackage.cdu) this.q.c());
    }

    private final void e(boolean z2) {
        if (z2) {
            this.toolbar.c(R.drawable.quantum_ic_arrow_back_grey600_24);
            this.toolbar.b(R.string.a11y_back_to_list);
            return;
        }
        this.toolbar.b((android.graphics.drawable.Drawable) null);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        if (q()) {
            this.E.execute(new defpackage.aoh(defpackage.aju.a(this, intent), new defpackage.apr(this)));
        }
    }

    public final void a(defpackage.cdu cdu) {
        this.E.execute(new defpackage.aoh(new defpackage.aox(this, cdu, true)));
    }

    private final defpackage.cdu b(java.lang.String str) {
        for (defpackage.cdu cdu : this.q.c) {
            if (cdu.b().equals(str)) {
                return cdu;
            }
        }
        return null;
    }

    public final void a(defpackage.aoe aoe) {
        defpackage.cdu b = b(aoe.a(this));
        if (b == null) {
            b = (defpackage.cdu) this.q.c();
        }
        if (b == null) {
            java.util.List list = this.q.c;
            if (!list.isEmpty()) {
                b = (defpackage.cdu) list.get(0);
            }
        }
        a(b, true, aoe);
    }

    private final boolean b(defpackage.cdu cdu) {
        return cdu != null && defpackage.ajd.a(this, cdu.b()) != null;
    }

    public final void a(defpackage.cdu cdu, boolean z2, defpackage.aoe aoe) {
        boolean z3;
        int i2;
        if (!b(cdu)) {
            defpackage.cdu cdu2 = (defpackage.cdu) this.q.e();
            if (!b(cdu2)) {
                cdu2 = (defpackage.cdu) this.q.g();
                if (!b(cdu2)) {
                    java.util.Iterator it = defpackage.ajd.a(this).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        cdu = b(((android.accounts.Account) it.next()).name);
                        if (cdu != null) {
                            break;
                        }
                    }
                }
            }
            cdu = cdu2;
        }
        if (cdu == null) {
            f(true);
            s();
            this.I = new defpackage.apw(this);
            this.q.a(this.I);
            b(defpackage.bg.N);
            aoe.a((java.lang.String) null);
            p();
            return;
        }
        Fragment a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        z3 = defpackage.any.a().c() != null && cdu.b().equals(defpackage.any.a().c().b());
        if (!z3 || !(a instanceof WelcomeFragment) || z2) {
            if (!z3) {
                this.i.a(null, null, true);
                this.h = null;
                this.collapsingToolbarLayout.a("");
                a((java.util.List) null, null);
                h(false);
                this.C = true;
                g(false);
            }
            getWindow().addFlags(16);
            this.q.b(this.H);
            this.q.a(cdu);
            this.q.a(this.H);
            java.lang.String b = cdu.b();
            defpackage.cyu cyu = new defpackage.cyu();
            defpackage.any.a().d.b(b);
            android.accounts.Account a2 = defpackage.ajd.a(this, b);
            if (a2 == null) {
                cyu.a(defpackage.ajh.c());
            } else {
                if (this.s != null && this.s.b()) {
                    this.s.a(3);
                }
                defpackage.aiq.a().a(a2.name);
                defpackage.alm.a();
                defpackage.alq.a().c = a2.name;
                defpackage.any.a().c(a2);
                ((defpackage.ajy) defpackage.ajt.a().b()).a(a2.name);
                defpackage.cyi b2 = defpackage.any.a().b();
                defpackage.cyi a3 = defpackage.ain.a(this, a2.name);
                defpackage.cyl cyl = TaskApplication.getApplication().a;
                java.util.Locale locale = getResources().getConfiguration().locale;
                try {
                    i2 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    defpackage.azb.a("Package info not found for given package name. Cannot get version code", e, new java.lang.String[0]);
                    i2 = 0;
                }
                new defpackage.cye(defpackage.csp.a(new defpackage.cyi[]{b2, a3})).a(new defpackage.aqo(this, i2, a3, cyu, locale), cyl);
            }
            cyu.a(new defpackage.aoy(this, aoe, cdu, cyu), TaskApplication.getApplication().a);
            return;
        }
        aoe.a(cdu.b());
        p();
    }

    private final void s() {
        if (this.I != null) {
            this.q.b(this.I);
        }
    }

    /* access modifiers changed from: protected */
    public final void j() {
        defpackage.anc c = defpackage.any.a().c();
        if (c != null && !c.a()) {
            c.a.a.c();
            a((defpackage.cdu) this.q.c());
        }
    }

    /* access modifiers changed from: protected */
    public final void k() {
        b(defpackage.bg.R);
    }

    /* access modifiers changed from: protected */
    public final void l() {
        b(defpackage.bg.O);
    }

    public final void b(int i2) {
        WelcomeFragment d;
        p();
        if (this.n instanceof WelcomeFragment) {
            d = (WelcomeFragment) this.n;
            d.e(i2);
        } else {
            d = WelcomeFragment.d(i2);
            if (android.os.Build.VERSION.SDK_INT >= 21 && this.n != null && !(this.n instanceof WelcomeFragment)) {
                this.n.b(new android.transition.Fade());
                d.a_(new android.transition.Fade());
            }
        }
        b(d);
        defpackage.mj a = getSupportFragmentManager().a();
        a.a(2131755276, d, "cannotInitializeAccount");
        a.c();
    }

    /* access modifiers changed from: protected */
    public final android.view.View m() {
        return this.u;
    }

    public final void a(Fragment lcVar) {
        b(lcVar);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            lcVar.a_(new android.transition.Fade());
            this.i.b(new android.transition.Fade());
        }
        defpackage.mj a = getSupportFragmentManager().a();
        a.b(lcVar);
        a.a();
        a.b();
        if (lcVar instanceof defpackage.arb) {
            ((defpackage.arb) lcVar).O();
        }
    }

    public final void b(Fragment lcVar) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.n = lcVar;
        b(false);
        this.toolbar.k().clear();
        if (lcVar instanceof EditTaskFragment) {
            this.toolbar.d(2132082690);
        } else if (lcVar instanceof defpackage.arv) {
            this.toolbar.d(2132082689);
        }
        this.toolbar.b((android.graphics.drawable.Drawable) null);
        this.toolbar.a("");
        defpackage.ha haVar = (defpackage.ha) this.appBarLayout.getLayoutParams();
        com.google.android.apps.tasks.ui.LockableAppBarLayoutBehavior lockableAppBarLayoutBehavior = (com.google.android.apps.tasks.ui.LockableAppBarLayoutBehavior) haVar.a;
        lockableAppBarLayoutBehavior.d = false;
        if (lcVar == null || (lcVar instanceof TasksFragment)) {
            c(this.h);
            g(lcVar != null);
            z2 = lcVar == null;
            f(z2);
            z3 = lcVar != null && ((TasksFragment) lcVar).c();
            h(z3);
            e(false);
            haVar.height = (int) getResources().getDimension(R.dimen.app_bar_expanded_height);
            defpackage.da daVar = (defpackage.da) this.collapsingToolbarLayout.getLayoutParams();
            if (daVar.a != 29) {
                daVar.a = 29;
                lockableAppBarLayoutBehavior.a_((this.collapsingToolbarLayout.getMinimumHeight() + 1) - haVar.height);
                this.v.c(1);
            }
        } else if (lcVar instanceof WelcomeFragment) {
            f(true);
            this.appBarLayout.getLayoutParams().height = 0;
            if (((WelcomeFragment) lcVar).V != defpackage.bg.P) {
                z4 = false;
            }
            g(z4);
            this.collapsingToolbarLayout.a("");
            h(false);
            e(false);
            a((java.util.List) null, null);
        } else {
            f(false);
            g(false);
            this.collapsingToolbarLayout.a("");
            if (lcVar instanceof defpackage.arv) {
                defpackage.arv arv = (defpackage.arv) lcVar;
                Toolbar toolbar = this.toolbar;
                android.os.Bundle bundle = arv.i;
                toolbar.a(toolbar.getContext().getText(bundle == null || android.text.TextUtils.isEmpty(bundle.getString("list_id")) ? 2131951745 : 2131951748));
                ((defpackage.da) this.collapsingToolbarLayout.getLayoutParams()).a = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                lockableAppBarLayoutBehavior.d = true;
                this.appBarLayout.a(false, false, true);
            } else {
                ((defpackage.da) this.collapsingToolbarLayout.getLayoutParams()).a = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                this.appBarLayout.a(true, false, true);
            }
            h(false);
            e(true);
            if (lcVar instanceof defpackage.arv) {
                this.toolbar.c(2130837665);
            } else if (lcVar instanceof EditTaskFragment) {
                this.toolbar.c(2130837662);
            }
        }
    }

    private final void c(defpackage.dcb dcb) {
        defpackage.dcd dcd;
        if (dcb == null) {
            this.collapsingToolbarLayout.a("");
            this.collapsingToolbarLayout.setContentDescription(null);
            return;
        }
        defpackage.dcb dcb2 = this.h;
        if (dcb2.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb2.c;
        }
        java.lang.String str = dcd.a;
        this.collapsingToolbarLayout.a(str);
        this.collapsingToolbarLayout.setContentDescription(str);
    }

    private final void f(boolean z2) {
        boolean z3 = false;
        this.C = z2;
        MenuItem item = this.bottomAppBar.k().getItem(0);
        if (!z2) {
            z3 = true;
        }
        item.setEnabled(z3);
    }

    private final void g(boolean z2) {
        if (z2) {
            this.bottomAppBar.setVisibility(0);
            this.bottomAppBarShadow.setVisibility(0);
            return;
        }
        this.bottomAppBar.setVisibility(8);
        this.bottomAppBarShadow.setVisibility(8);
    }

    public final void a(java.lang.String str) {
        defpackage.dcb dcb;
        java.util.List<defpackage.dcb> d = defpackage.any.a().c().d();
        java.lang.String str2 = d.get(0).b;
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.i.X;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = defpackage.ain.b(this, defpackage.any.a().c().b()).a();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = str2;
        }
        defpackage.dcb dcb2 = null;
        for (defpackage.dcb dcb3 : d) {
            if (!dcb3.b.equals(str)) {
                dcb3 = dcb2;
            }
            dcb2 = dcb3;
        }
        if (dcb2 == null) {
            dcb = d.get(0);
        } else {
            dcb = dcb2;
        }
        a(d, dcb.b);
        b(dcb);
    }

    public final void b(defpackage.dcb dcb) {
        java.lang.Integer num;
        int i2 = 0;
        boolean z2 = this.h == null || !this.h.b.equals(dcb.b);
        this.h = dcb;
        if (z2) {
            defpackage.any.a().c().a(dcb.b);
            this.i.a(dcb.b, defpackage.ain.b(this, defpackage.any.a().c().b()).b(dcb.b), true);
        }
        Fragment a = getSupportFragmentManager().findFragmentById(2131755276);
        if (a == null || (a instanceof TasksFragment)) {
            c(this.h);
        }
        defpackage.ain.b(this, defpackage.any.a().c().b()).a(dcb.b);
        if (z2) {
            this.appBarLayout.a(true, true, true);
        }
        if (this.G != null) {
            defpackage.aou aou = this.p;
            java.lang.String str = this.h.b;
            java.util.Iterator it = aou.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                } else if (((defpackage.dcb) it.next()).b.equals(str)) {
                    num = java.lang.Integer.valueOf(i2 + 3);
                    break;
                } else {
                    i2++;
                }
            }
            if (num != null) {
                this.G.a(num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.ajn ajn) {
        defpackage.dcb c = defpackage.any.a().c().c(ajn.a());
        if (c != null) {
            b(c);
        }
    }

    private final java.lang.Runnable t() {
        defpackage.cyu cyu = new defpackage.cyu();
        this.E.execute(new defpackage.apd(cyu));
        return new defpackage.ape(cyu);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b(getSupportFragmentManager().findFragmentById(R.id.fragment_container));
        n();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.H != null) {
            this.q.b(this.H);
        }
        s();
    }

    /* access modifiers changed from: protected */
    public final void n() {
        s();
        if (q()) {
            if (defpackage.crk.a.a() && defpackage.ob.a(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                if (defpackage.kq.a(this, "android.permission.ACCESS_FINE_LOCATION")) {
                    if (this.A != null) {
                        this.A.dismiss();
                    }
                    defpackage.xk xkVar = new defpackage.xk(this);
                    xkVar.b(2131951750);
                    xkVar.a(17039370, new defpackage.aoz(this));
                    this.A = xkVar.a();
                    defpackage.ajd.a(this.A);
                } else {
                    defpackage.kq.a(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"});
                }
            }
            android.content.Context applicationContext = TaskApplication.getApplication().getApplicationContext();
            defpackage.aju.a().a(applicationContext, defpackage.ajd.a(applicationContext));
            Intent intent = getIntent();
            setIntent(new Intent());
            this.E.execute(new defpackage.aoh(defpackage.aju.a(this, intent), new defpackage.apq(this)));
            this.q.b(this.H);
            this.q.a(this.H);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        defpackage.alq.a().b(this.t);
        defpackage.alq.a().a(this.t);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        defpackage.alq.a().b(this.t);
        super.onPause();
    }

    public void onBackPressed() {
        defpackage.ln c = getSupportFragmentManager();
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        boolean z2 = fragment instanceof WelcomeFragment && ((WelcomeFragment) fragment).V == defpackage.bg.Q && !defpackage.aiw.b(this).a();
        if (z2) {
            finish();
            return;
        }
        int f = c.f();
        if (f > 0) {
            if (fragment instanceof EditTaskFragment) {
                ((EditTaskFragment) fragment).a(true);
            }
            c.c();
            if (f == 1) {
                b(this.i);
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return true;
    }

    public final void b_(int i2) {
        int i3;
        if (!r()) {
            switch (i2 - 1) {
                case 0:
                    a(defpackage.ajr.MY_ORDER);
                    return;
                case 1:
                    a(defpackage.ajr.BY_DUE_DATE);
                    return;
                case 2:
                    java.lang.String str = this.i.X;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        defpackage.arv arv = new defpackage.arv();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("list_id", str);
                        arv.e(bundle);
                        a(arv);
                        return;
                    }
                    return;
                case 3:
                    java.lang.String str2 = this.i.X;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        int size = defpackage.any.a().c().d(str2).a().size();
                        if (size == 0) {
                            defpackage.any.a().c().a(str2, size, defpackage.ajn.a(str2));
                            a((java.lang.String) null);
                            return;
                        }
                        java.lang.Runnable t2 = t();
                        defpackage.xk xkVar = new defpackage.xk(this);
                        xkVar.a(R.string.list_delete_confirm_title);
                        xkVar.a(getResources().getQuantityString(R.plurals.list_delete_confirm_content, size, new Object[]{size}));
                        xkVar.a(defpackage.apa.a);
                        xkVar.a(R.string.list_delete_confirm_ok_button, new defpackage.apb(this, str2, size));
                        xkVar.a(new defpackage.apc(t2));
                        defpackage.ajd.a(xkVar.a());
                        return;
                    }
                    return;
                case 4:
                    Fragment a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
                    defpackage.cld.b(a instanceof TasksFragment);
                    TasksFragment auj = (TasksFragment) a;
                    java.lang.String str3 = auj.X;
                    int i4 = 0;
                    for (defpackage.dby a2 : defpackage.any.a().c().d(this.h.b).a()) {
                        if (defpackage.ajd.a(a2)) {
                            i3 = i4 + 1;
                        } else {
                            i3 = i4;
                        }
                        i4 = i3;
                    }
                    if (i4 != 0) {
                        java.lang.Runnable t3 = t();
                        defpackage.xk xkVar2 = new defpackage.xk(this);
                        xkVar2.a(R.string.delete_completed_tasks_confirm_title);
                        xkVar2.a(getResources().getQuantityString(R.plurals.delete_completed_tasks_confirm_message, i4, new Object[]{i4}));
                        xkVar2.a(defpackage.apf.a);
                        xkVar2.a(2131951717, new defpackage.apg(this, str3, auj));
                        xkVar2.a(new defpackage.api(t3));
                        defpackage.ajd.a(xkVar2.a());
                        return;
                    }
                    return;
                case 5:
                    onSearchRequested();
                    return;
                case 6:
                    TaskApplication.getApplication();
                    return;
                case 7:
                    sendBroadcast(new Intent("com.google.android.apps.tasks.NOTIFICATIONS"));
                    return;
                default:
                    return;
            }
        }
    }

    public boolean onSearchRequested() {
        if (!defpackage.crk.a.a()) {
            return false;
        }
        return super.onSearchRequested();
    }

    private final void a(defpackage.ajr orderType) {
        if (!r()) {
            this.i.a(this.h.b, orderType, true);
            defpackage.ain b = defpackage.ain.b(this, defpackage.any.a().c().b());
            java.lang.String str = this.h.b;
            android.content.SharedPreferences.Editor edit = b.a.edit();
            java.lang.String valueOf = "task-list-order:";
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            edit.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : valueOf, orderType.name());
            edit.apply();
        }
    }

    public final void removeSplash() {
        if (this.splashView != null) {
            this.splashView.setVisibility(View.GONE);
            ((android.view.ViewGroup) this.splashView.getParent()).removeView(this.splashView);
            this.splashView = null;
        }
    }

    public final void p() {
        if (this.splashView != null && this.splashView.getVisibility() == View.VISIBLE) {
            this.splashView.animate().alpha(0.0f).setStartDelay(250).withEndAction(new defpackage.apj(this)).start();
        }
    }

    private final void h(boolean z2) {
        if (this.z != z2) {
            if (this.z) {
                this.fab.setClickable(false);
                this.fab.animate().alpha(0.0f).setListener(new defpackage.apy(this));
            } else {
                this.fab.setClickable(true);
                this.fab.animate().alpha(1.0f).setListener(new defpackage.apz(this));
            }
            this.z = z2;
        }
    }

    public final /* synthetic */ boolean a(MenuItem menuItem) {
        int i2;
        defpackage.dcd dcd;
        java.lang.String str;
        defpackage.dih dih;
        defpackage.ajl ajl = null;
        boolean z2 = false;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            Fragment a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
            if (a instanceof defpackage.arv) {
                defpackage.arv arv = (defpackage.arv) a;
                java.lang.String trim = arv.a.getText().toString().trim();
                defpackage.dcb dcb = arv.b;
                if (dcb.c == null) {
                    dcd = defpackage.dcd.c;
                } else {
                    dcd = dcb.c;
                }
                if (trim.equals(dcd.a) || android.text.TextUtils.isEmpty(trim)) {
                    str = null;
                } else if (android.text.TextUtils.isEmpty(arv.b.b)) {
                    defpackage.anc P = defpackage.arv.P();
                    defpackage.dii i3 = ((defpackage.dii) defpackage.dcb.g.a(defpackage.bg.ao)).i(((defpackage.dii) defpackage.dcd.c.a(defpackage.bg.ao)).h(trim));
                    if (i3.b) {
                        dih = i3.a;
                    } else {
                        defpackage.dih dih2 = i3.a;
                        defpackage.djz.a.a(dih2).c(dih2);
                        i3.b = true;
                        dih = i3.a;
                    }
                    defpackage.dih dih3 = dih;
                    if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    str = P.a((defpackage.dcb) dih3).b;
                } else {
                    defpackage.arv.P().d(arv.b.b, trim);
                    str = arv.b.b;
                }
                a(str);
                onBackPressed();
            }
        } else if (itemId == R.id.action_delete_task) {
            Fragment a2 = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
            defpackage.cld.b(a2 instanceof EditTaskFragment);
            EditTaskFragment asi = (EditTaskFragment) a2;
            java.lang.String str2 = asi.W;
            java.lang.String str3 = asi.U;
            asi.a(false);
            onBackPressed();
            java.lang.String str4 = asi.U;
            java.lang.String str5 = asi.W;
            if (!defpackage.cru.d(str3, str4)) {
                java.util.Iterator it = defpackage.any.a().c().d(str4).b().a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    defpackage.dcf dcf = (defpackage.dcf) it.next();
                    if (dcf.b.equals(str5)) {
                        i2 = dcf.c.size();
                        break;
                    }
                }
                ajl = new defpackage.ajl(defpackage.any.a().c().c(str4), i2 + 1);
            }
            defpackage.any.a().c().a(str4, str5, ajl);
            if (this.i != null) {
                TasksFragment auj = this.i;
                if (auj.l() && !auj.C && auj.J != null && auj.J.getWindowToken() != null && auj.J.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    TasksFragment auj2 = this.i;
                    if (auj2.O()) {
                        auj2.W.b(str5);
                        auj2.c(true);
                    }
                }
            }
            defpackage.aju.a().b(str2);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final /* synthetic */ void b(defpackage.aoe aoe) {
        if (this.q.a) {
            a(aoe);
        } else {
            this.q.a(new defpackage.apv(this, aoe));
        }
    }
}
