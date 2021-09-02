package com.google.android.apps.tasks.ui;

import android.accounts.Account;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.transition.Fade;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

import defpackage.ain;
import defpackage.ajd;
import defpackage.ajr;
import defpackage.alu;
import defpackage.any;
import defpackage.aoe;
import defpackage.aoh;
import defpackage.aou;
import defpackage.aov;
import defpackage.aow;
import defpackage.apd;
import defpackage.ape;
import defpackage.apg;
import defpackage.aph;
import defpackage.api;
import defpackage.apj;
import defpackage.apm;
import defpackage.apn;
import defpackage.apo;
import defpackage.aps;
import defpackage.apt;
import defpackage.apu;
import defpackage.apw;
import defpackage.apy;
import defpackage.apz;
import defpackage.aqa;
import defpackage.aql;
import defpackage.arb;
import defpackage.arv;
import defpackage.asi;
import defpackage.atf;
import defpackage.auj;
import defpackage.ayp;
import defpackage.ayq;
import defpackage.azb;
import defpackage.baw;
import defpackage.bg;
import defpackage.cdc;
import defpackage.cde;
import defpackage.cdj;
import defpackage.cdl;
import defpackage.cdm;
import defpackage.cdu;
import defpackage.cub;
import defpackage.cyu;
import defpackage.dby;
import defpackage.dca;
import defpackage.dcb;
import defpackage.dcd;
import defpackage.dih;
import defpackage.dii;
import defpackage.NavigationMenu;
import defpackage.ft;
import defpackage.ha;
import defpackage.lc;
import defpackage.sn;
import defpackage.wl;
import defpackage.xk;

/* compiled from: PG */
public class TaskListsActivity extends aql implements defpackage.alh, DatePickerDialog.OnDateSetListener, defpackage.aop, defpackage.aqi, defpackage.ash, defpackage.atf, defpackage.aux, defpackage.ays {
    private wl A;
    private TasksAppBarLayout appBarLayout;
    private boolean C;
    private View splashView;
    private Executor E;
    private FrameLayout F;
    private NavigationView G;
    private cdm H;
    private cdm I;
    public dcb h;
    public auj i;
    public CollapsingToolbarLayout collapsingToolbarLayout;
    public View fab;
    public boolean l;
    public ayp m;
    public lc n;
    public cde o;
    public aou p;
    public cdl q;
    private alu t;
    private CoordinatorLayout appbarCoordinator;
    private NestedScrollView nestedScrollView;
    private Toolbar toolbar;
    private BottomAppBar bottomAppBar;
    private View appbarShadowView;
    private boolean z;

    /* access modifiers changed from: protected */
    @Override // defpackage.nv, defpackage.wm, defpackage.lg, defpackage.aql
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        crk crk = crk.a;
        if (crk.a()) {
            StrictMode.setThreadPolicy(((all) crk.b()).a());
        }
        setContentView(R.layout.app_bar_task_lists);
        this.appbarCoordinator = (CoordinatorLayout) findViewById(R.id.app_bar_coordinator);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        e(false);
        this.collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.collapsingToolbarLayout.a("");
        this.collapsingToolbarLayout.b = (int) getResources().getDimension(R.dimen.app_bar_expanded_bottom_margin);
        this.collapsingToolbarLayout.requestLayout();
        this.collapsingToolbarLayout.a = (int) getResources().getDimension(R.dimen.app_bar_expanded_top_margin);
        this.collapsingToolbarLayout.requestLayout();
        TaskApplication.b().a.a(new apo(this));
        this.toolbar.a(new aov(this));
        this.toolbar.A = new aow(this);
        ayq ayqInst = new ayq(this);
        baw baw = new baw(this);
        azb.b(true, "clientId must be non-negative");
        ayqInst.b = 0;
        ayqInst.c = this;
        ayqInst.a = baw;
        ayq a = ayqInst.a(bgh.b);
        this.F = new FrameLayout(this);
        this.F.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        cdj cdj = TaskApplication.b().d;
        this.g.a(new cdc(this, cdj));
        this.g.a(TaskApplication.b().e);
        this.H = new apu(this);
        this.q = cdj.a();
        this.o = new cde(this, cdj, this.F);
        this.m = a.a();
        this.i = (auj) c().a("tasksfragment");
        if (this.i == null) {
            this.i = new auj();
        }
        this.nestedScrollView = (NestedScrollView) findViewById(R.id.scrollable_content);
        this.t = new aps(this);
        this.fab = findViewById(R.id.fab);
        this.fab.setOnClickListener(new aph(this));
        this.splashView = findViewById(R.id.splash_view);
        if (TaskApplication.b().c) {
            o();
        } else {
            TaskApplication.b().c = true;
        }
        this.appBarLayout = (TasksAppBarLayout) findViewById(R.id.app_bar);
        this.bottomAppBar = (BottomAppBar) findViewById(R.id.bottom_app_bar);
        this.appbarShadowView = findViewById(R.id.bottom_app_bar_shadow);
        this.bottomAppBar.c(R.drawable.quantum_ic_menu_grey600_24);
        this.bottomAppBar.c(getString(R.string.a11y_hamburger));
        this.bottomAppBar.a(new apm(this));
        this.bottomAppBar.k().clear();
        this.bottomAppBar.d(R.menu.bottom_bar_menu);
        this.bottomAppBar.A = new apn(this);
        g(false);
        f(true);
        this.E = cub.a((Executor) TaskApplication.b().a);
        this.nestedScrollView.a = new apt(this);
    }

    public final void b(boolean z2) {
        TasksAppBarLayout tasksAppBarLayout = this.appBarLayout;
        if (tasksAppBarLayout.f != z2) {
            tasksAppBarLayout.f = z2;
            sn.a(tasksAppBarLayout, (float) (tasksAppBarLayout.f ? tasksAppBarLayout.getResources().getDimensionPixelOffset(R.dimen.app_bar_elevation) : 0));
        }
    }

    @Override // defpackage.aux
    public final void c(boolean z2) {
        if (this.n instanceof auj) {
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.aql
    public final void h() {
        a((cdu) this.q.c());
    }

    public final void a(List taskEntities, String str) {
        dcd dcd;
        Integer num;
        Integer num2 = null;
        boolean z2 = false;
        NavigationView navigationView = (NavigationView) getLayoutInflater().inflate(R.layout.navigation_view_tasks_lists, null);
        navigationView.menuPresenter.a(new View(this));
        this.p = new aou();
        navigationView.e = new ft(this, navigationView);
        aou aou = this.p;
        NavigationMenu navMenu = navigationView.menu;
        boolean z3 = this.C;
        aou.a.clear();
        if (taskEntities != null) {
            aou.a.addAll(taskEntities);
        }
        navMenu.clear();
        int i2 = 0;
        while (i2 < aou.a.size()) {
            dcb dcb = (dcb) aou.a.get(i2);
            int i3 = i2 + 3;
            if (dcb.c == null) {
                dcd = defpackage.dcd.c;
            } else {
                dcd = dcb.c;
            }
            navMenu.add(0, i3, i2, dcd.a).setCheckable(true).setChecked(false);
            if (num2 != null || str == null || !dcb.b.equals(str)) {
                num = num2;
            } else {
                num = Integer.valueOf(i2 + 3);
            }
            i2++;
            num2 = num;
        }
        MenuItem icon = navMenu.add(1, 0, aou.a.size(), R.string.navigation_drawer_create_list).setIcon(R.drawable.quantum_ic_add_grey600_18);
        if (!z3) {
            z2 = true;
        }
        icon.setEnabled(z2);
        navMenu.add(2, 1, aou.a.size() + 1, R.string.navigation_drawer_send_feedback).setIcon(R.drawable.quantum_ic_feedback_grey600_18);
        navMenu.add(3, 2, aou.a.size() + 2, R.string.navigation_drawer_licences);
        if (num2 != null) {
            navigationView.a(num2.intValue());
        }
        this.F.removeAllViews();
        this.F.addView(navigationView);
        this.G = navigationView;
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        if (!r()) {
            Toast.makeText(getApplicationContext(), "Unable to get accounts. App won't work.", 0).show();
        }
    }

    @Override // defpackage.aux
    public final void a(String str, String str2, int i2) {
        a(asi.a(str, str2, true, i2));
    }

    @Override // defpackage.alh
    public final void a(String str, String str2) {
        a(asi.a(str, str2, false, -1));
    }

    @Override // defpackage.aux
    public final void d(boolean z2) {
        if (this.n instanceof auj) {
            h(z2);
            lc a = c().a("BottomSheetMenuDialogFragment");
            if (a instanceof aol) {
                ((aol) a).c(z2);
            }
        }
    }

    public void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        lc a = c().a("AddTaskBottomSheetDialogFragment");
        if (a == null) {
            a = c().a(R.id.fragment_container);
        }
        if (a instanceof DatePickerDialog.OnDateSetListener) {
            ((DatePickerDialog.OnDateSetListener) a).onDateSet(datePicker, i2, i3, i4);
        }
    }

    @Override // defpackage.atf
    public final void a(dcb dcb) {
        lc a = c().a(R.id.fragment_container);
        if (a instanceof atf) {
            ((atf) a).a(dcb);
        }
    }

    @Override // defpackage.ash
    public final void a(dca dca) {
        dih dih;
        boolean z2 = false;
        auj auj = this.i;
        if (auj.O()) {
            dby dby = defpackage.dby.g;
            if (dca != null) {
                dii dii = (dii) defpackage.dby.g.a(bg.ao);
                dii.b();
                dby dby2 = (dby) dii.a;
                if (dca == null) {
                    throw new NullPointerException();
                }
                dby2.e = dca;
                if (dii.b) {
                    dih = dii.a;
                } else {
                    dih dih2 = dii.a;
                    djz.a.a(dih2).c(dih2);
                    dii.b = true;
                    dih = dii.a;
                }
                dih dih3 = dih;
                if (!defpackage.dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dby = (dby) dih3;
            }
            dby a = defpackage.auj.N().a(auj.X, dby, 0, null);
            boolean z3 = auj.taskAdapter.getCount() == 0;
            atg atg = auj.taskAdapter;
            if (!ajd.a(a)) {
                z2 = true;
            }
            cld.a(z2);
            atg.b(a);
            atg.g();
            if (z3) {
                auj.c(true);
            }
            auj.tasksListView.c(auj.taskAdapter.a(a));
        }
    }

    @Override // defpackage.aqi
    public final void i() {
        a((cdu) this.q.c());
    }

    private final void e(boolean z2) {
        if (z2) {
            this.toolbar.c(R.drawable.quantum_ic_arrow_back_grey600_24);
            this.toolbar.b(R.string.a11y_back_to_list);
            return;
        }
        this.toolbar.b((Drawable) null);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onNewIntent(Intent intent) {
        if (q()) {
            this.E.execute(new aoh(aju.a(this, intent), new apr(this)));
        }
    }

    public final void a(cdu cdu) {
        this.E.execute(new aoh(new aox(this, cdu, true)));
    }

    private final cdu b(String str) {
        for (cdu cdu : this.q.c) {
            if (cdu.b().equals(str)) {
                return cdu;
            }
        }
        return null;
    }

    public final void a(aoe aoe) {
        cdu b = b(aoe.a(this));
        if (b == null) {
            b = (cdu) this.q.c();
        }
        if (b == null) {
            List list = this.q.c;
            if (!list.isEmpty()) {
                b = (cdu) list.get(0);
            }
        }
        a(b, true, aoe);
    }

    private final boolean b(cdu cdu) {
        return cdu != null && ajd.a(this, cdu.b()) != null;
    }

    public final void a(cdu cdu, boolean z2, aoe aoe) {
        boolean z3;
        int i2;
        if (!b(cdu)) {
            cdu cdu2 = (cdu) this.q.e();
            if (!b(cdu2)) {
                cdu2 = (cdu) this.q.g();
                if (!b(cdu2)) {
                    Iterator it = ajd.a(this).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        cdu = b(((Account) it.next()).name);
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
            this.I = new apw(this);
            this.q.a(this.I);
            b(bg.N);
            aoe.a((String) null);
            p();
            return;
        }
        lc a = c().a(R.id.fragment_container);
        z3 = any.get().c() != null && cdu.b().equals(any.get().c().b());
        if (!z3 || !(a instanceof aqa) || z2) {
            if (!z3) {
                this.i.a(null, null, true);
                this.h = null;
                this.collapsingToolbarLayout.a("");
                a((List) null, null);
                h(false);
                this.C = true;
                g(false);
            }
            getWindow().addFlags(16);
            this.q.b(this.H);
            this.q.a(cdu);
            this.q.a(this.H);
            String b = cdu.b();
            cyu cyu = new cyu();
            any.get().d.b(b);
            Account a2 = ajd.a(this, b);
            if (a2 == null) {
                cyu.a(ajh.c());
            } else {
                if (this.s != null && this.s.b()) {
                    this.s.a(3);
                }
                aiq.a().a(a2.name);
                alm.a();
                alq.a().c = a2.name;
                any.get().c(a2);
                ((ajy) ajt.a().b()).a(a2.name);
                cyi b2 = any.get().b();
                cyi a3 = ain.a(this, a2.name);
                cyl cyl = TaskApplication.b().a;
                Locale locale = getResources().getConfiguration().locale;
                try {
                    i2 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    azb.a("Package info not found for given package name. Cannot get version code", e, new String[0]);
                    i2 = 0;
                }
                new cye(csp.a((Object[]) new cyi[]{b2, a3})).a(new aqo(this, i2, a3, cyu, locale), cyl);
            }
            cyu.a(new aoy(this, aoe, cdu, cyu), TaskApplication.b().a);
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
    @Override // defpackage.aql
    public final void j() {
        anc c = any.get().c();
        if (c != null && !c.a()) {
            c.a.a.c();
            a((cdu) this.q.c());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.aql
    public final void k() {
        b(bg.R);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.aql
    public final void l() {
        b(bg.O);
    }

    public final void b(int i2) {
        aqa d;
        p();
        if (this.n instanceof aqa) {
            d = (aqa) this.n;
            d.e(i2);
        } else {
            d = aqa.d(i2);
            if (Build.VERSION.SDK_INT >= 21 && this.n != null && !(this.n instanceof aqa)) {
                this.n.b(new Fade());
                d.a_(new Fade());
            }
        }
        b(d);
        mj a = c().a();
        a.a(R.id.fragment_container, d, "cannotInitializeAccount");
        a.c();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.aql
    public final View m() {
        return this.appbarCoordinator;
    }

    public final void a(lc lcVar) {
        b(lcVar);
        if (Build.VERSION.SDK_INT >= 21) {
            lcVar.a_(new Fade());
            this.i.b(new Fade());
        }
        mj a = c().a();
        a.b(lcVar);
        a.a();
        a.b();
        if (lcVar instanceof arb) {
            ((arb) lcVar).O();
        }
    }

    public final void b(lc lcVar) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.n = lcVar;
        b(false);
        this.toolbar.k().clear();
        if (lcVar instanceof asi) {
            this.toolbar.d(R.menu.task_lists_edit_task);
        } else if (lcVar instanceof arv) {
            this.toolbar.d(R.menu.task_list_edit);
        }
        this.toolbar.b((Drawable) null);
        this.toolbar.a("");
        ha haVar = (ha) this.appBarLayout.getLayoutParams();
        LockableAppBarLayoutBehavior lockableAppBarLayoutBehavior = (LockableAppBarLayoutBehavior) haVar.a;
        lockableAppBarLayoutBehavior.d = false;
        if (lcVar == null || (lcVar instanceof auj)) {
            c(this.h);
            g(lcVar != null);
            z2 = lcVar == null;
            f(z2);
            z3 = lcVar != null && ((auj) lcVar).c();
            h(z3);
            e(false);
            haVar.height = (int) getResources().getDimension(R.dimen.app_bar_expanded_height);
            da daVar = (da) this.collapsingToolbarLayout.getLayoutParams();
            if (daVar.a != 29) {
                daVar.a = 29;
                lockableAppBarLayoutBehavior.a_((this.collapsingToolbarLayout.getMinimumHeight() + 1) - haVar.height);
                this.nestedScrollView.c(1);
            }
        } else if (lcVar instanceof aqa) {
            f(true);
            this.appBarLayout.getLayoutParams().height = 0;
            if (((aqa) lcVar).V != bg.P) {
                z4 = false;
            }
            g(z4);
            this.collapsingToolbarLayout.a("");
            h(false);
            e(false);
            a((List) null, null);
        } else {
            f(false);
            g(false);
            this.collapsingToolbarLayout.a("");
            if (lcVar instanceof arv) {
                Toolbar toolbar = this.toolbar;
                Bundle bundle = lcVar.i;
                toolbar.a(toolbar.getContext().getText(bundle == null || TextUtils.isEmpty(bundle.getString("list_id")) ? R.string.list_add_title : R.string.list_edit_title));
                ((da) this.collapsingToolbarLayout.getLayoutParams()).a = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                lockableAppBarLayoutBehavior.d = true;
                this.appBarLayout.a(false, false, true);
            } else {
                ((da) this.collapsingToolbarLayout.getLayoutParams()).a = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                this.appBarLayout.a(true, false, true);
            }
            h(false);
            e(true);
            if (lcVar instanceof arv) {
                this.toolbar.c(R.drawable.quantum_ic_clear_grey600_24);
            } else if (lcVar instanceof asi) {
                this.toolbar.c(R.drawable.quantum_ic_arrow_back_grey600_24);
            }
        }
    }

    private final void c(dcb dcb) {
        dcd dcd;
        if (dcb == null) {
            this.collapsingToolbarLayout.a("");
            this.collapsingToolbarLayout.setContentDescription(null);
            return;
        }
        dcb dcb2 = this.h;
        if (dcb2.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb2.c;
        }
        String str = dcd.a;
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
            this.appbarShadowView.setVisibility(0);
            return;
        }
        this.bottomAppBar.setVisibility(8);
        this.appbarShadowView.setVisibility(8);
    }

    public final void a(String str) {
        dcb dcb;
        List<dcb> d = any.get().c().d();
        String str2 = d.get(0).b;
        if (TextUtils.isEmpty(str)) {
            str = this.i.X;
        }
        if (TextUtils.isEmpty(str)) {
            str = ain.b(this, any.get().c().b()).a();
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        dcb dcb2 = null;
        for (dcb dcb3 : d) {
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

    public final void b(dcb dcb) {
        Integer num;
        int i2 = 0;
        boolean z2 = this.h == null || !this.h.b.equals(dcb.b);
        this.h = dcb;
        if (z2) {
            any.get().c().a(dcb.b);
            this.i.a(dcb.b, ain.b(this, any.get().c().b()).b(dcb.b), true);
        }
        lc a = c().a(R.id.fragment_container);
        if (a == null || (a instanceof auj)) {
            c(this.h);
        }
        ain.b(this, any.get().c().b()).a(dcb.b);
        if (z2) {
            this.appBarLayout.a(true, true, true);
        }
        if (this.G != null) {
            aou aou = this.p;
            String str = this.h.b;
            Iterator it = aou.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                } else if (((dcb) it.next()).b.equals(str)) {
                    num = Integer.valueOf(i2 + 3);
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
    @Override // defpackage.aql
    public final void a(ajn ajn) {
        dcb c = any.get().c().c(ajn.a());
        if (c != null) {
            b(c);
        }
    }

    private final Runnable t() {
        cyu cyu = new cyu();
        this.E.execute(new apd(cyu));
        return new ape(cyu);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wm, defpackage.lg
    public void onStart() {
        super.onStart();
        b(c().a(R.id.fragment_container));
        n();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.wm, defpackage.lg, defpackage.aql
    public void onStop() {
        super.onStop();
        if (this.H != null) {
            this.q.b(this.H);
        }
        s();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.aql
    public final void n() {
        s();
        if (q()) {
            if (crk.a.a() && ob.a(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                if (kq.a((Activity) this, "android.permission.ACCESS_FINE_LOCATION")) {
                    if (this.A != null) {
                        this.A.dismiss();
                    }
                    xk xkVar = new xk(this);
                    xkVar.b(R.string.location_permission_rationale);
                    xkVar.a(17039370, new aoz(this));
                    this.A = xkVar.a();
                    ajd.a(this.A);
                } else {
                    kq.a(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
                }
            }
            Context applicationContext = TaskApplication.b().getApplicationContext();
            aju.a().a(applicationContext, ajd.a(applicationContext));
            Intent intent = getIntent();
            setIntent(new Intent());
            this.E.execute(new aoh(aju.a(this, intent), new apq(this)));
            this.q.b(this.H);
            this.q.a(this.H);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onResume() {
        super.onResume();
        alq.a().b(this.t);
        alq.a().a(this.t);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.lg
    public void onPause() {
        alq.a().b(this.t);
        super.onPause();
    }

    @Override // defpackage.lg
    public void onBackPressed() {
        boolean z2;
        ln c = c();
        lc a = c().a(R.id.fragment_container);
        z2 = a instanceof aqa && ((aqa) a).V == bg.Q && !aiw.b(this).a();
        if (z2) {
            finish();
            return;
        }
        int f = c.f();
        if (f > 0) {
            if (a instanceof asi) {
                ((asi) a).a(true);
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

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.aop
    public final void b_(int i2) {
        int i3;
        if (!r()) {
            switch (i2 - 1) {
                case 0:
                    a(ajr.MY_ORDER);
                    return;
                case 1:
                    a(ajr.BY_DUE_DATE);
                    return;
                case 2:
                    String str = this.i.X;
                    if (!TextUtils.isEmpty(str)) {
                        arv arv = new arv();
                        Bundle bundle = new Bundle();
                        bundle.putString("list_id", str);
                        arv.e(bundle);
                        a(arv);
                        return;
                    }
                    return;
                case 3:
                    String str2 = this.i.X;
                    if (!TextUtils.isEmpty(str2)) {
                        int size = any.get().c().d(str2).a().size();
                        if (size == 0) {
                            any.get().c().a(str2, size, ajn.a(str2));
                            a((String) null);
                            return;
                        }
                        Runnable t2 = t();
                        xk xkVar = new xk(this);
                        xkVar.a(R.string.list_delete_confirm_title);
                        xkVar.a(getResources().getQuantityString(R.plurals.list_delete_confirm_content, size, Integer.valueOf(size)));
                        xkVar.a(apa.a);
                        xkVar.a(R.string.list_delete_confirm_ok_button, new apb(this, str2, size));
                        xkVar.a(new apc(t2));
                        ajd.a(xkVar.a());
                        return;
                    }
                    return;
                case 4:
                    lc a = c().a(R.id.fragment_container);
                    cld.b(a instanceof auj);
                    auj auj = (auj) a;
                    String str3 = auj.X;
                    int i4 = 0;
                    for (dby dby : any.get().c().d(this.h.b).a()) {
                        if (ajd.a(dby)) {
                            i3 = i4 + 1;
                        } else {
                            i3 = i4;
                        }
                        i4 = i3;
                    }
                    if (i4 != 0) {
                        Runnable t3 = t();
                        xk xkVar2 = new xk(this);
                        xkVar2.a(R.string.delete_completed_tasks_confirm_title);
                        xkVar2.a(getResources().getQuantityString(R.plurals.delete_completed_tasks_confirm_message, i4, Integer.valueOf(i4)));
                        xkVar2.a(apf.a);
                        xkVar2.a(R.string.delete_completed_tasks_button_delete, new apg(this, str3, auj));
                        xkVar2.a(new api(t3));
                        ajd.a(xkVar2.a());
                        return;
                    }
                    return;
                case 5:
                    onSearchRequested();
                    return;
                case 6:
                    TaskApplication.b();
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
        if (!crk.a.a()) {
            return false;
        }
        return super.onSearchRequested();
    }

    private final void a(ajr ajr) {
        if (!r()) {
            this.i.a(this.h.b, ajr, true);
            ain b = ain.b(this, any.get().c().b());
            String str = this.h.b;
            SharedPreferences.Editor edit = b.a.edit();
            String valueOf = "task-list-order:";
            String valueOf2 = String.valueOf(str);
            edit.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : valueOf, ajr.name());
            edit.apply();
        }
    }

    public final void o() {
        if (this.splashView != null) {
            this.splashView.setVisibility(8);
            ((ViewGroup) this.splashView.getParent()).removeView(this.splashView);
            this.splashView = null;
        }
    }

    public final void p() {
        if (this.splashView != null && this.splashView.getVisibility() == 0) {
            this.splashView.animate().alpha(0.0f).setStartDelay(250).withEndAction(new apj(this)).start();
        }
    }

    private final void h(boolean z2) {
        if (this.z != z2) {
            if (this.z) {
                this.fab.setClickable(false);
                this.fab.animate().alpha(0.0f).setListener(new apy(this));
            } else {
                this.fab.setClickable(true);
                this.fab.animate().alpha(1.0f).setListener(new apz(this));
            }
            this.z = z2;
        }
    }

    public final /* synthetic */ boolean onToolbarMenuItemClicked(MenuItem menuItem) {
        int i2;
        dcd dcd;
        String str;
        dih dih;
        ajl ajl = null;
        boolean z2 = false;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            lc a = c().a(R.id.fragment_container);
            if (a instanceof arv) {
                arv arv = (arv) a;
                String trim = arv.a.getText().toString().trim();
                dcb dcb = arv.b;
                if (dcb.c == null) {
                    dcd = defpackage.dcd.c;
                } else {
                    dcd = dcb.c;
                }
                if (trim.equals(dcd.a) || TextUtils.isEmpty(trim)) {
                    str = null;
                } else if (TextUtils.isEmpty(arv.b.b)) {
                    anc P = arb.P();
                    dii i3 = ((dii) defpackage.dcb.g.a(bg.ao)).i(((dii) defpackage.dcd.c.a(bg.ao)).h(trim));
                    if (i3.b) {
                        dih = i3.a;
                    } else {
                        dih dih2 = i3.a;
                        djz.a.a(dih2).c(dih2);
                        i3.b = true;
                        dih = i3.a;
                    }
                    dih dih3 = dih;
                    if (!defpackage.dih.a(dih3, Boolean.TRUE.booleanValue())) {
                        throw new dkw();
                    }
                    str = P.a((dcb) dih3).b;
                } else {
                    arb.P().d(arv.b.b, trim);
                    str = arv.b.b;
                }
                a(str);
                onBackPressed();
            }
        } else if (itemId == R.id.action_delete_task) {
            lc a2 = c().a(R.id.fragment_container);
            cld.b(a2 instanceof asi);
            asi asi = (asi) a2;
            String str2 = asi.W;
            String str3 = asi.U;
            asi.a(false);
            onBackPressed();
            String str4 = asi.U;
            String str5 = asi.W;
            if (!cru.d(str3, str4)) {
                Iterator it = any.get().c().d(str4).b().a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    dcf dcf = (dcf) it.next();
                    if (dcf.b.equals(str5)) {
                        i2 = dcf.c.size();
                        break;
                    }
                }
                ajl = new ajl(any.get().c().c(str4), i2 + 1);
            }
            any.get().c().a(str4, str5, ajl);
            if (this.i != null) {
                auj auj = this.i;
                if (auj.l() && !auj.C && auj.J != null && auj.J.getWindowToken() != null && auj.J.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    auj auj2 = this.i;
                    if (auj2.O()) {
                        auj2.taskAdapter.b(str5);
                        auj2.c(true);
                    }
                }
            }
            aju.a().b(str2);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final /* synthetic */ void b(aoe aoe) {
        if (this.q.a) {
            a(aoe);
        } else {
            this.q.a((cdm) new apv(this, aoe));
        }
    }
}
