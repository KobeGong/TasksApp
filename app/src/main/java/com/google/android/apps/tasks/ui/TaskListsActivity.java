package com.google.android.apps.tasks.ui;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;

import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;

import java.util.Iterator;
import java.util.concurrent.Executor;

import defpackage.AbsAccountSetupResult;
import defpackage.AbsDeviceOwner;
import defpackage.AddTaskFragment;
import defpackage.BaseTaskAdapter;
import defpackage.BottomSheetMenuDialogFragment;
import defpackage.ClsToolbarLP;
import defpackage.EditListFragment;
import defpackage.EditTaskFragment;
import defpackage.Fragment;
import defpackage.FragmentTransaction;
import defpackage.TasksFragment;
import defpackage.ViewCompat;
import defpackage.WelcomeFragment;
import defpackage.dcb;

/* compiled from: PG */
public class TaskListsActivity extends defpackage.aql implements defpackage.alh, android.app.DatePickerDialog.OnDateSetListener, defpackage.aop, defpackage.aqi, defpackage.ash, defpackage.atf, defpackage.aux, defpackage.ays {
    private defpackage.wl permissionTipDialog;
    private TasksAppBarLayout appBarLayout;
    private boolean C;
    private android.view.View splashView;
    private Executor executor;
    private android.widget.FrameLayout navViewContainer;
    private NavigationView G;
    private defpackage.cdm H;
    private defpackage.cdm I;
    public defpackage.dcb h;
    public TasksFragment tasksFragment;
    public CollapsingToolbarLayout collapsingToolbarLayout;
    public android.view.View fab;
    public boolean l;
    public defpackage.ayp m;
    public Fragment selectedFragment;
    public defpackage.cde o;
    public defpackage.aou p;
    public defpackage.cdl q;
    private defpackage.alu t;
    private CoordinatorLayout coordinatorLayout;
    private NestedScrollView nestedScrollView;
    private Toolbar toolbar;
    private BottomAppBar bottomAppBar;
    private android.view.View bottomAppBarShadow;
    private boolean fabHide;

    /* access modifiers changed from: protected */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.crk crk = defpackage.crk.a;
        if (crk.a()) {
            android.os.StrictMode.setThreadPolicy(((defpackage.all) crk.b()).a());
        }
        setContentView(R.layout.app_bar_task_lists);
        this.coordinatorLayout = (CoordinatorLayout) findViewById(R.id.app_bar_coordinator);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        setToolbarNavigationUp(false);
        this.collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        this.collapsingToolbarLayout.a("");
        this.collapsingToolbarLayout.expandedTitleMarginBottom = (int) getResources().getDimension(R.dimen.app_bar_expanded_bottom_margin);
        this.collapsingToolbarLayout.requestLayout();
        this.collapsingToolbarLayout.a = (int) getResources().getDimension(R.dimen.app_bar_expanded_top_margin);
        this.collapsingToolbarLayout.requestLayout();
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
        this.navViewContainer = new android.widget.FrameLayout(this);
        this.navViewContainer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        defpackage.cdj cdj = TaskApplication.getApplication().d;
        this.g.addObserver(new defpackage.cdc(this, cdj));
        this.g.addObserver(TaskApplication.getApplication().e);
        this.H = new defpackage.apu(this);
        this.q = cdj.a();
        this.o = new defpackage.cde(this, cdj, this.navViewContainer);
        this.m = a.a();
        this.tasksFragment = (TasksFragment) getSupportFragmentManager().findFragmentByTag("tasksfragment");
        if (this.tasksFragment == null) {
            this.tasksFragment = new TasksFragment();
        }
        this.nestedScrollView = (NestedScrollView) findViewById(R.id.scrollable_content);
        this.t = new defpackage.aps(this);
        this.fab = findViewById(R.id.fab);
        this.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AddTaskFragment().a(getSupportFragmentManager(), "AddTaskBottomSheetDialogFragment");
            }
        });
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
        this.bottomAppBar.getMenu().clear();
        this.bottomAppBar.inflateMenu(R.menu.bottom_bar_menu);
        this.bottomAppBar.mOnMenuItemClickListener = new defpackage.apn(this);
        setBottomAppbarShown(false);
        f(true);
        this.executor = defpackage.cub.a((Executor) TaskApplication.getApplication().a);
        this.nestedScrollView.a = new defpackage.apt(this);
    }

    public final void b(boolean z2) {
        if (this.appBarLayout.f != z2) {
            this.appBarLayout.f = z2;
            ViewCompat.setElevation(this.appBarLayout, (float) (this.appBarLayout.f ? this.appBarLayout.getResources().getDimensionPixelOffset(R.dimen.app_bar_elevation) : 0));
        }
    }

    public final void c(boolean z2) {
        if (this.selectedFragment instanceof TasksFragment) {
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        a((AbsDeviceOwner) this.q.c());
    }

    public final void a(java.util.List<dcb> list, java.lang.String str) {
        defpackage.dcd dcd;
        java.lang.Integer num;
        java.lang.Integer num2 = null;
        boolean z2 = false;
        NavigationView navigationView = (NavigationView) getLayoutInflater().inflate(R.layout.navigation_view_tasks_lists, null);
        navigationView.presenter.addHeaderView(new android.view.View(this));
        this.p = new defpackage.aou();
        navigationView.e = new defpackage.ft(this, navigationView);
        defpackage.aou aou = this.p;
        boolean z3 = this.C;
        aou.a.clear();
        if (list != null) {
            aou.a.addAll(list);
        }
        navigationView.menu.clear();
        int i2 = 0;
        while (i2 < aou.a.size()) {
            defpackage.dcb dcb = aou.a.get(i2);
            int i3 = i2 + 3;
            if (dcb.c == null) {
                dcd = defpackage.dcd.c;
            } else {
                dcd = dcb.c;
            }
            navigationView.menu.add(0, i3, i2, dcd.a).setCheckable(true).setChecked(false);
            if (num2 != null || str == null || !dcb.b.equals(str)) {
                num = num2;
            } else {
                num = i2 + 3;
            }
            i2++;
            num2 = num;
        }
        MenuItem icon = navigationView.menu.add(1, 0, aou.a.size(), R.string.navigation_drawer_create_list).setIcon(R.drawable.quantum_ic_add_grey600_18);
        if (!z3) {
            z2 = true;
        }
        icon.setEnabled(z2);
        navigationView.menu.add(2, 1, aou.a.size() + 1, R.string.navigation_drawer_send_feedback).setIcon(R.drawable.quantum_ic_feedback_grey600_18);
        navigationView.menu.add(3, 2, aou.a.size() + 2, R.string.navigation_drawer_licences);
        if (num2 != null) {
            navigationView.a(num2);
        }
        this.navViewContainer.removeAllViews();
        this.navViewContainer.addView(navigationView);
        this.G = navigationView;
    }

    public final void a(defpackage.axq axq) {
        if (!r()) {
            android.widget.Toast.makeText(getApplicationContext(), "Unable to get accounts. App won't work.", 0).show();
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, int i2) {
        showFragment(EditTaskFragment.newInstance(str, str2, true, i2));
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        showFragment(EditTaskFragment.newInstance(str, str2, false, -1));
    }

    public final void d(boolean z2) {
        if (this.selectedFragment instanceof TasksFragment) {
            hideFAB(z2);
            Fragment fragment = getSupportFragmentManager().findFragmentByTag("BottomSheetMenuDialogFragment");
            if (fragment instanceof BottomSheetMenuDialogFragment) {
                ((BottomSheetMenuDialogFragment) fragment).c(z2);
            }
        }
    }

    public void onDateSet(android.widget.DatePicker datePicker, int i2, int i3, int i4) {
        Fragment a = getSupportFragmentManager().findFragmentByTag("AddTaskBottomSheetDialogFragment");
        if (a == null) {
            a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        }
        if (a instanceof android.app.DatePickerDialog.OnDateSetListener) {
            ((android.app.DatePickerDialog.OnDateSetListener) a).onDateSet(datePicker, i2, i3, i4);
        }
    }

    public final void a(defpackage.dcb dcb) {
        Fragment a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if (a instanceof defpackage.atf) {
            ((defpackage.atf) a).a(dcb);
        }
    }

    public final void a(defpackage.dca dca) {
        defpackage.dih dih;
        boolean z2 = false;
        if (tasksFragment.O()) {
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
            defpackage.dby a = TasksFragment.N().a(tasksFragment.X, dby, 0, null);
            boolean z3 = tasksFragment.taskAdapter.getItemCount() == 0;
            BaseTaskAdapter atg = tasksFragment.taskAdapter;
            if (!defpackage.ajd.a(a)) {
                z2 = true;
            }
            defpackage.cld.a(z2);
            atg.b(a);
            atg.g();
            if (z3) {
                tasksFragment.c(true);
            }
            tasksFragment.recyclerView.c(tasksFragment.taskAdapter.a(a));
        }
    }

    public final void i() {
        a((AbsDeviceOwner) this.q.c());
    }

    private void setToolbarNavigationUp(boolean z2) {
        if (z2) {
            this.toolbar.c(R.drawable.quantum_ic_arrow_back_grey600_24);
            this.toolbar.b(R.string.a11y_back_to_list);
        } else {
            this.toolbar.setNavigationIcon(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        if (q()) {
            this.executor.execute(new defpackage.aoh(defpackage.aju.a(this, intent), new defpackage.apr(this)));
        }
    }

    public final void a(AbsDeviceOwner cdu) {
        this.executor.execute(new defpackage.aoh(new defpackage.aox(this, cdu, true)));
    }

    private final AbsDeviceOwner getDeviceOwnerByName(java.lang.String str) {
        for (AbsDeviceOwner cdu : this.q.availableAccounts) {
            if (cdu.accountName().equals(str)) {
                return cdu;
            }
        }
        return null;
    }

    public final void a(defpackage.aoe aoe) {
        AbsDeviceOwner b = getDeviceOwnerByName(aoe.a(this));
        if (b == null) {
            b = (AbsDeviceOwner) this.q.c();
        }
        if (b == null) {
            java.util.List list = this.q.availableAccounts;
            if (!list.isEmpty()) {
                b = (AbsDeviceOwner) list.get(0);
            }
        }
        a(b, true, aoe);
    }

    private final boolean b(AbsDeviceOwner cdu) {
        return cdu != null && defpackage.ajd.getAccountByName(this, cdu.accountName()) != null;
    }

    public final void a(AbsDeviceOwner deviceOwner, boolean z2, defpackage.aoe aoe) {
        boolean z3;
        int versionCode;
        if (!b(deviceOwner)) {
            AbsDeviceOwner cdu2 = (AbsDeviceOwner) this.q.e();
            if (!b(cdu2)) {
                cdu2 = (AbsDeviceOwner) this.q.g();
                if (!b(cdu2)) {
                    Iterator<Account> it = defpackage.ajd.a(this).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        deviceOwner = getDeviceOwnerByName(it.next().name);
                        if (deviceOwner != null) {
                            break;
                        }
                    }
                }
            }
            deviceOwner = cdu2;
        }
        if (deviceOwner == null) {
            f(true);
            s();
            this.I = new defpackage.apw(this);
            this.q.a(this.I);
            showWelcomeFragment(defpackage.bg.N);
            aoe.a((java.lang.String) null);
            hideSplashView();
            return;
        }
        Fragment mainFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        z3 = defpackage.any.get().c() != null && deviceOwner.accountName().equals(defpackage.any.get().c().b());
        if (!z3 || !(mainFragment instanceof WelcomeFragment) || z2) {
            if (!z3) {
                this.tasksFragment.a(null, null, true);
                this.h = null;
                this.collapsingToolbarLayout.a("");
                a((java.util.List) null, null);
                hideFAB(false);
                this.C = true;
                setBottomAppbarShown(false);
            }
            getWindow().addFlags(16);
            this.q.b(this.H);
            this.q.a(deviceOwner);
            this.q.a(this.H);
            defpackage.cyu cyu = new defpackage.cyu();
            defpackage.any.get().d.b(deviceOwner.accountName());
            Account account = defpackage.ajd.getAccountByName(this, deviceOwner.accountName());
            if (account == null) {
                cyu.a(AbsAccountSetupResult.failure());
            } else {
                if (this.s != null && this.s.b()) {
                    this.s.a(3);
                }
                defpackage.aiq.get().a(account.name);
                defpackage.alm.a();
                defpackage.alq.get().accountName = account.name;
                defpackage.any.get().c(account);
                ((defpackage.ajy) defpackage.ajt.a().b()).a(account.name);
                defpackage.cyi b2 = defpackage.any.get().b();
                defpackage.cyi a3 = defpackage.ain.a(this, account.name);
                defpackage.cyl cyl = TaskApplication.getApplication().a;
                try {
                    versionCode = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    defpackage.azb.a("Package info not found for given package name. Cannot get version code", e, new java.lang.String[0]);
                    versionCode = 0;
                }
                new defpackage.cye(defpackage.csp.a(new defpackage.cyi[]{b2, a3})).a(new defpackage.aqo(this, versionCode, a3, cyu, getResources().getConfiguration().locale), cyl);
            }
            cyu.a(new defpackage.aoy(this, aoe, deviceOwner, cyu), TaskApplication.getApplication().a);
            return;
        }
        aoe.a(deviceOwner.accountName());
        hideSplashView();
    }

    private final void s() {
        if (this.I != null) {
            this.q.b(this.I);
        }
    }

    /* access modifiers changed from: protected */
    public final void j() {
        defpackage.anc c = defpackage.any.get().c();
        if (c != null && !c.a()) {
            c.a.a.c();
            a((AbsDeviceOwner) this.q.c());
        }
    }

    /* access modifiers changed from: protected */
    public final void k() {
        showWelcomeFragment(defpackage.bg.R);
    }

    /* access modifiers changed from: protected */
    public final void l() {
        showWelcomeFragment(defpackage.bg.O);
    }

    public final void showWelcomeFragment(int state) {
        WelcomeFragment welcomeFragment;
        hideSplashView();
        if (this.selectedFragment instanceof WelcomeFragment) {
            welcomeFragment = (WelcomeFragment) this.selectedFragment;
            welcomeFragment.setState(state);
        } else {
            welcomeFragment = WelcomeFragment.newInstance(state);
            if (Build.VERSION.SDK_INT >= 21 && this.selectedFragment != null && !(this.selectedFragment instanceof WelcomeFragment)) {
                this.selectedFragment.setExitTransition(new android.transition.Fade());
                welcomeFragment.setEnterTranstion(new android.transition.Fade());
            }
        }
        setFragmentSelected(welcomeFragment);
        FragmentTransaction a = getSupportFragmentManager().beginTransaction();
        a.replace(R.id.fragment_container, welcomeFragment, "cannotInitializeAccount");
        a.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public final android.view.View m() {
        return this.coordinatorLayout;
    }

    public final void showFragment(Fragment fragment) {
        setFragmentSelected(fragment);
        if (Build.VERSION.SDK_INT >= 21) {
            fragment.setEnterTranstion(new android.transition.Fade());
            this.tasksFragment.setExitTransition(new android.transition.Fade());
        }
        getSupportFragmentManager().beginTransaction()
                .replace(fragment)
                .addToBackStack()
                .commit();
        if (fragment instanceof defpackage.arb) {
            ((defpackage.arb) fragment).O();
        }
    }

    public final void setFragmentSelected(Fragment fragment) {
        this.selectedFragment = fragment;
        b(false);
        this.toolbar.getMenu().clear();
        if (fragment instanceof EditTaskFragment) {
            this.toolbar.inflateMenu(R.menu.task_lists_edit_task);
        } else if (fragment instanceof EditListFragment) {
            this.toolbar.inflateMenu(R.menu.task_list_edit);
        }
        this.toolbar.setNavigationIcon(null);
        this.toolbar.setSubtitle("");
        defpackage.ha appbarLayoutLp = (defpackage.ha) this.appBarLayout.getLayoutParams();
        LockableAppBarLayoutBehavior lockableAppBarLayoutBehavior = (LockableAppBarLayoutBehavior) appbarLayoutLp.a;
        lockableAppBarLayoutBehavior.d = false;
        if (fragment == null || (fragment instanceof TasksFragment)) {
            c(this.h);
            setBottomAppbarShown(fragment != null);
            boolean z2 = fragment == null;
            f(z2);
            boolean z3 = fragment != null && ((TasksFragment) fragment).c();
            hideFAB(z3);
            setToolbarNavigationUp(false);
            appbarLayoutLp.height = (int) getResources().getDimension(R.dimen.app_bar_expanded_height);
            ClsToolbarLP clsToolbarLP = (ClsToolbarLP) this.collapsingToolbarLayout.getLayoutParams();
            if (clsToolbarLP.scrollFlags != 29) {
                clsToolbarLP.scrollFlags = 29;
                lockableAppBarLayoutBehavior.setTopAndBottomOffset((this.collapsingToolbarLayout.getMinimumHeight() + 1) - appbarLayoutLp.height);
                this.nestedScrollView.c(1);
            }
        } else if (fragment instanceof WelcomeFragment) {
            f(true);
            this.appBarLayout.getLayoutParams().height = 0;
            boolean z4 = true;
            if (((WelcomeFragment) fragment).state != defpackage.bg.P) {
                z4 = false;
            }
            setBottomAppbarShown(z4);
            this.collapsingToolbarLayout.a("");
            hideFAB(false);
            setToolbarNavigationUp(false);
            a((java.util.List) null, null);
        } else {
            f(false);
            setBottomAppbarShown(false);
            this.collapsingToolbarLayout.a("");
            if (fragment instanceof EditListFragment) {
                EditListFragment arv = (EditListFragment) fragment;
                Toolbar toolbar = this.toolbar;
                android.os.Bundle bundle = arv.i;
                toolbar.setSubtitle(toolbar.getContext().getText(bundle == null || TextUtils.isEmpty(bundle.getString("list_id")) ? R.string.list_add_title : R.string.list_edit_title));
                ((ClsToolbarLP) this.collapsingToolbarLayout.getLayoutParams()).scrollFlags = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                lockableAppBarLayoutBehavior.d = true;
                this.appBarLayout.a(false, false, true);
            } else {
                ((ClsToolbarLP) this.collapsingToolbarLayout.getLayoutParams()).scrollFlags = 19;
                this.appBarLayout.getLayoutParams().height = this.collapsingToolbarLayout.getMinimumHeight() + 1;
                this.appBarLayout.a(true, false, true);
            }
            hideFAB(false);
            setToolbarNavigationUp(true);
            if (fragment instanceof EditListFragment) {
                this.toolbar.c(R.drawable.quantum_ic_clear_grey600_24);
            } else if (fragment instanceof EditTaskFragment) {
                this.toolbar.c(R.drawable.quantum_ic_arrow_back_grey600_24);
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
        if (this.h.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = this.h.c;
        }
        java.lang.String str = dcd.a;
        this.collapsingToolbarLayout.a(str);
        this.collapsingToolbarLayout.setContentDescription(str);
    }

    private final void f(boolean z2) {
        this.C = z2;
        MenuItem item = this.bottomAppBar.getMenu().getItem(0);
        item.setEnabled(!z2);
    }

    private final void setBottomAppbarShown(boolean z2) {
        if (z2) {
            this.bottomAppBar.setVisibility(View.VISIBLE);
            this.bottomAppBarShadow.setVisibility(View.VISIBLE);
        } else {
            this.bottomAppBar.setVisibility(View.GONE);
            this.bottomAppBarShadow.setVisibility(View.GONE);
        }
    }

    public final void a(java.lang.String str) {
        defpackage.dcb dcb;
        java.util.List<defpackage.dcb> d = defpackage.any.get().c().d();
        java.lang.String str2 = d.get(0).b;
        if (TextUtils.isEmpty(str)) {
            str = this.tasksFragment.X;
        }
        if (TextUtils.isEmpty(str)) {
            str = defpackage.ain.b(this, defpackage.any.get().c().b()).a();
        }
        if (TextUtils.isEmpty(str)) {
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
            defpackage.any.get().c().a(dcb.b);
            this.tasksFragment.a(dcb.b, defpackage.ain.b(this, defpackage.any.get().c().b()).b(dcb.b), true);
        }
        Fragment a = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if (a == null || (a instanceof TasksFragment)) {
            c(this.h);
        }
        defpackage.ain.b(this, defpackage.any.get().c().b()).a(dcb.b);
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
        defpackage.dcb c = defpackage.any.get().c().c(ajn.a());
        if (c != null) {
            b(c);
        }
    }

    private final java.lang.Runnable t() {
        defpackage.cyu cyu = new defpackage.cyu();
        this.executor.execute(new defpackage.apd(cyu));
        return new defpackage.ape(cyu);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        setFragmentSelected(getSupportFragmentManager().findFragmentById(R.id.fragment_container));
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
            if (defpackage.crk.a.a() && defpackage.ob.a(this, "android.permission.ACCESS_FINE_LOCATION") != PackageManager.PERMISSION_GRANTED) {
                if (defpackage.kq.a(this, "android.permission.ACCESS_FINE_LOCATION")) {
                    if (this.permissionTipDialog != null) {
                        this.permissionTipDialog.dismiss();
                    }
                    defpackage.xk xkVar = new defpackage.xk(this);
                    xkVar.b(R.string.location_permission_rationale);
                    xkVar.a(android.R.string.ok, new defpackage.aoz(this));
                    this.permissionTipDialog = xkVar.a();
                    defpackage.ajd.a(this.permissionTipDialog);
                } else {
                    defpackage.kq.a(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"});
                }
            }
            android.content.Context applicationContext = TaskApplication.getApplication().getApplicationContext();
            defpackage.aju.a().a(applicationContext, defpackage.ajd.a(applicationContext));
            Intent intent = getIntent();
            setIntent(new Intent());
            this.executor.execute(new defpackage.aoh(defpackage.aju.a(this, intent), new defpackage.apq(this)));
            this.q.b(this.H);
            this.q.a(this.H);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        defpackage.alq.get().b(this.t);
        defpackage.alq.get().a(this.t);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        defpackage.alq.get().b(this.t);
        super.onPause();
    }

    public void onBackPressed() {
        defpackage.ln c = getSupportFragmentManager();
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        boolean z2 = fragment instanceof WelcomeFragment && ((WelcomeFragment) fragment).state == defpackage.bg.Q && !defpackage.aiw.getInstance(this).isOnboardingDismiss();
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
                setFragmentSelected(this.tasksFragment);
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
                    java.lang.String str = this.tasksFragment.X;
                    if (!TextUtils.isEmpty(str)) {
                        EditListFragment arv = new EditListFragment();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("list_id", str);
                        arv.e(bundle);
                        showFragment(arv);
                        return;
                    }
                    return;
                case 3:
                    java.lang.String str2 = this.tasksFragment.X;
                    if (!TextUtils.isEmpty(str2)) {
                        int size = defpackage.any.get().c().d(str2).getTasks().size();
                        if (size == 0) {
                            defpackage.any.get().c().a(str2, size, defpackage.ajn.a(str2));
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
                    for (defpackage.dby a2 : defpackage.any.get().c().d(this.h.b).getTasks()) {
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
            this.tasksFragment.a(this.h.b, orderType, true);
            defpackage.ain b = defpackage.ain.b(this, defpackage.any.get().c().b());
            java.lang.String str = this.h.b;
            android.content.SharedPreferences.Editor edit = b.preferences.edit();
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

    public final void hideSplashView() {
        if (this.splashView != null && this.splashView.getVisibility() == View.VISIBLE) {
            this.splashView.animate().alpha(0.0f).setStartDelay(250).withEndAction(new Runnable() {
                @Override
                public void run() {
                    removeSplash();
                }
            }).start();
        }
    }

    private final void hideFAB(boolean z2) {
        if (this.fabHide != z2) {
            if (this.fabHide) {
                this.fab.setClickable(false);
                this.fab.animate().alpha(0.0f).setListener(new defpackage.apy(this));
            } else {
                this.fab.setClickable(true);
                this.fab.animate().alpha(1.0f).setListener(new defpackage.apz(this));
            }
            this.fabHide = z2;
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
            if (a instanceof EditListFragment) {
                EditListFragment arv = (EditListFragment) a;
                java.lang.String trim = arv.a.getText().toString().trim();
                defpackage.dcb dcb = arv.b;
                if (dcb.c == null) {
                    dcd = defpackage.dcd.c;
                } else {
                    dcd = dcb.c;
                }
                if (trim.equals(dcd.a) || TextUtils.isEmpty(trim)) {
                    str = null;
                } else if (TextUtils.isEmpty(arv.b.b)) {
                    defpackage.anc P = EditListFragment.P();
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
                    EditListFragment.P().d(arv.b.b, trim);
                    str = arv.b.b;
                }
                a(str);
                onBackPressed();
            }
        } else if (itemId == R.id.action_delete_task) {
            Fragment a2 = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
            defpackage.cld.b(a2 instanceof EditTaskFragment);
            EditTaskFragment asi = (EditTaskFragment) a2;
            java.lang.String str2 = asi.taskId;
            java.lang.String str3 = asi.listId;
            asi.a(false);
            onBackPressed();
            java.lang.String str4 = asi.listId;
            java.lang.String str5 = asi.taskId;
            if (!defpackage.cru.equals(str3, str4)) {
                java.util.Iterator it = defpackage.any.get().c().d(str4).getStructure().a.iterator();
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
                ajl = new defpackage.ajl(defpackage.any.get().c().c(str4), i2 + 1);
            }
            defpackage.any.get().c().a(str4, str5, ajl);
            if (this.tasksFragment != null) {
                TasksFragment auj = this.tasksFragment;
                if (auj.l() && !auj.mHidden && auj.mView != null && auj.mView.getWindowToken() != null && auj.mView.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    TasksFragment auj2 = this.tasksFragment;
                    if (auj2.O()) {
                        auj2.taskAdapter.b(str5);
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
