package defpackage;

/* renamed from: auj reason: default package */
/* compiled from: PG */
/* compiled from: TasksFragment */
public final class TasksFragment extends Fragment implements android.app.DatePickerDialog.OnDateSetListener {
    private static final defpackage.ajr aa = defpackage.ajr.MY_ORDER;
    private static android.os.Vibrator ab;
    private static java.lang.Boolean ac;
    public android.view.View U;
    public android.widget.Button V;
    public defpackage.atg W;
    public java.lang.String X;
    public defpackage.ajr Y = aa;
    public java.lang.String Z;
    public android.view.View a;
    private android.support.v4.widget.SwipeRefreshLayout ad;
    private android.support.v4.widget.SwipeRefreshLayout ae;
    private android.support.v4.widget.NestedScrollView af;
    private android.view.View ag;
    private android.view.View ah;
    private defpackage.aht ai;
    private long aj = 0;
    private boolean ak = false;
    private defpackage.alu al;
    private defpackage.att am;
    public android.support.v7.widget.RecyclerView recyclerView;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.Boolean bool;
        this.a = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.tasks_fragment, null);
        this.ad = this.a.findViewById(com.google.android.apps.tasks.R.id.tasks_refresh);
        this.ae = this.a.findViewById(com.google.android.apps.tasks.R.id.tasks_refresh_empty);
        this.recyclerView = this.a.findViewById(com.google.android.apps.tasks.R.id.tasks_list);
        if (this.W != null) {
            bool = this.W.c;
        } else {
            bool = null;
        }
        this.W = null;
        this.ag = this.a.findViewById(com.google.android.apps.tasks.R.id.empty_view);
        this.U = this.a.findViewById(com.google.android.apps.tasks.R.id.tasks_not_synced);
        this.ah = this.a.findViewById(com.google.android.apps.tasks.R.id.too_many_subtask_levels);
        this.V = this.a.findViewById(com.google.android.apps.tasks.R.id.flatten_subtasks);
        this.ad.a = new defpackage.auk(this);
        this.ae.a = new defpackage.aul(this);
        this.recyclerView.a(new adw());
        android.support.v7.widget.RecyclerView recyclerView = this.recyclerView;
        defpackage.auu auu = new defpackage.auu(this);
        if (recyclerView.z != null) {
            recyclerView.z.d();
            recyclerView.z.h = null;
        }
        recyclerView.z = auu;
        if (recyclerView.z != null) {
            recyclerView.z.h = recyclerView.H;
        }
        this.V.setOnClickListener(new defpackage.aum(this));
        if (ac == null) {
            ac = android.provider.Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled", 1) != 0;
            ab = (android.os.Vibrator) getContext().getSystemService("vibrator");
        }
        this.am = new defpackage.att(defpackage.ob.c(getContext(), 2131624494), defpackage.ob.c(getContext(), com.google.android.apps.tasks.R.color.task_snooze_swipe_background), this.recyclerView.z.j);
        this.recyclerView.a(this.am);
        this.recyclerView.a(new ats(getContext()));
        this.af = this.a.findViewById(com.google.android.apps.tasks.R.id.tasks_refresh_empty_scrollable);
        this.al = new defpackage.auv(this);
        a(this.X, this.Y, false);
        this.recyclerView.a(new auy(this.recyclerView));
        if (!(bool == null || this.W == null)) {
            this.W.a(bool);
        }
        if (bundle != null) {
            android.os.Parcelable parcelable = bundle.getParcelable("taskListsLayout");
            if (parcelable != null) {
                this.recyclerView.l.a(parcelable);
            }
            if (this.W != null) {
                this.W.a(bundle.getBoolean("completedExpanded", this.W.c));
            }
        }
        this.recyclerView.a(new auw(this));
        this.af.a = new defpackage.bdk(this);
        return this.a;
    }

    public final void b(android.view.View view) {
        FragmentActivity j = getActivity();
        if (j instanceof defpackage.aux) {
            ((defpackage.aux) j).c(view.canScrollVertically(-1));
        }
    }

    public final void a(android.content.Context context) {
        super.a(context);
        defpackage.cky.a(getActivity(), defpackage.dck.e);
    }

    public final void s() {
        super.s();
        if (getActivity() != null) {
            defpackage.cos.a(getActivity()).b.a(getActivity().findViewById(16908290));
        }
    }

    public final boolean c() {
        return !android.text.TextUtils.isEmpty(this.X) && !this.ak && this.aj > 0;
    }

    public final void a(java.lang.String str, defpackage.ajr ajr, boolean z) {
        boolean z2;
        defpackage.ajq d;
        defpackage.dca dca;
        boolean z3 = false;
        if (ajr == null) {
            ajr = aa;
        }
        boolean z4 = !defpackage.cru.d(this.X, str);
        z2 = z4 || !cru.d(this.Y, ajr);
        this.X = str;
        this.Y = ajr;
        if (O()) {
            if (z2 || this.W == null) {
                if (this.W != null) {
                    this.W.f = null;
                }
                if (this.Y == defpackage.ajr.BY_DUE_DATE) {
                    this.W = new defpackage.atn();
                } else {
                    this.W = new defpackage.atv();
                }
                defpackage.atg atg = this.W;
                android.support.v7.widget.RecyclerView recyclerView = this.recyclerView;
                android.view.LayoutInflater from = android.view.LayoutInflater.from(this.a.getContext());
                if (atg.h == null) {
                    atg.h = from.inflate(com.google.android.apps.tasks.R.layout.completed_header, recyclerView, false);
                    atg.j = atg.h.findViewById(com.google.android.apps.tasks.R.id.completed_count);
                    atg.k = atg.h.findViewById(com.google.android.apps.tasks.R.id.expand);
                    atg.k.setImageResource(com.google.android.apps.tasks.R.drawable.quantum_ic_stat_minus_1_grey600_24);
                    atg.i = atg.h.findViewById(com.google.android.apps.tasks.R.id.completed_header);
                    atg.i.setOnClickListener(new defpackage.ath(atg));
                    if (atg.g == null) {
                        atg.g = new defpackage.atj(atg);
                    }
                    atg.f();
                    atg.l = (android.widget.TextView) from.inflate(com.google.android.apps.tasks.R.layout.task_drag_num_subtasks, recyclerView, false);
                }
                if (this.ai != null) {
                    android.support.v7.widget.RecyclerView recyclerView2 = new android.support.v7.widget.RecyclerView(this.a.getContext());
                    this.a.getContext();
                    recyclerView2.a(new adw());
                    this.ai.a(recyclerView2);
                }
                this.recyclerView.a(this.W);
                defpackage.auh auh = new defpackage.auh(this.W, ac ? ab : null, this.a.getResources().getDimension(com.google.android.apps.tasks.R.dimen.task_item_subtask_start_spacing), this.am);
                this.ai = new defpackage.aht(auh);
                this.ai.a(this.recyclerView);
                this.recyclerView.setOnTouchListener(auh);
                this.W.f = new defpackage.atl(this);
            }
            if (android.text.TextUtils.isEmpty(this.X)) {
                d = defpackage.ajq.d();
            } else {
                d = defpackage.any.a().c().d(this.X);
            }
            java.util.Iterator it = d.b().a.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Iterator it2 = ((defpackage.dcf) it.next()).c.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((defpackage.dcf) it2.next()).c.size() > 0) {
                            z3 = true;
                            break loop0;
                        }
                    }
                }
            }
            this.ak = z3;
            defpackage.atg atg2 = this.W;
            atg2.b.clear();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (defpackage.dby dby : d.a()) {
                if (dby.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = dby.e;
                }
                if (dca.a) {
                    atg2.b.add(dby);
                } else {
                    linkedHashMap.put(dby.d, dby);
                }
            }
            atg2.f();
            atg2.a(d);
            atg2.d.b();
            atg2.g();
            this.aj = d.c();
            if (z4 && !android.text.TextUtils.isEmpty(this.X) && this.aj == 0) {
                this.U.animate().cancel();
                this.U.setAlpha(0.0f);
                a(true);
                defpackage.cyi a2 = defpackage.any.a().c().a(this.X);
                a2.a(new defpackage.aup(this, a2), com.google.android.apps.tasks.common.TaskApplication.getApplication().a);
            }
            c(z);
            FragmentActivity j = getActivity();
            if (j instanceof defpackage.aux) {
                ((defpackage.aux) j).d(c());
            }
        }
    }

    public final void e() {
        super.e();
        defpackage.alq.a().b(this.al);
        defpackage.alq.a().a(this.al);
        a(this.X, this.Y, false);
    }

    public final void f() {
        defpackage.alq.a().b(this.al);
        super.f();
    }

    public final void d(android.os.Bundle bundle) {
        super.d(bundle);
        bundle.putParcelable("taskListsLayout", this.recyclerView.l.c());
        if (this.W != null) {
            bundle.putBoolean("completedExpanded", this.W.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        if (O()) {
            this.ad.a(z);
            this.ae.a(z);
        }
    }

    public final void onDateSet(android.widget.DatePicker datePicker, int i, int i2, int i3) {
        defpackage.dih dih;
        defpackage.dca dca;
        defpackage.dih dih2;
        defpackage.dca dca2;
        if (!android.text.TextUtils.isEmpty(this.Z)) {
            defpackage.dii g = ((defpackage.dii) defpackage.dmk.d.a(defpackage.bg.ao)).e(i).f(i2 + 1).g(i3);
            if (g.b) {
                dih = g.a;
            } else {
                defpackage.dih dih3 = g.a;
                defpackage.djz.a.a(dih3).c(dih3);
                g.b = true;
                dih = g.a;
            }
            defpackage.dih dih4 = dih;
            if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dmk dmk = (defpackage.dmk) dih4;
            defpackage.dby a2 = defpackage.any.a().c().a(this.X, this.Z);
            if (a2 != null) {
                defpackage.any.a().c().a(this.X, this.Z, dmk);
                defpackage.atg atg = this.W;
                defpackage.dii dii = (defpackage.dii) a2.a(defpackage.bg.ao);
                dii.a(a2);
                defpackage.dii dii2 = dii;
                if (a2.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = a2.e;
                }
                defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
                dii3.a(dca);
                defpackage.dii g2 = dii2.g(dii3.a(dmk));
                if (g2.b) {
                    dih2 = g2.a;
                } else {
                    defpackage.dih dih5 = g2.a;
                    defpackage.djz.a.a(dih5).c(dih5);
                    g2.b = true;
                    dih2 = g2.a;
                }
                defpackage.dih dih6 = dih2;
                if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.dby dby = (defpackage.dby) dih6;
                if (dby.e == null) {
                    dca2 = defpackage.dca.g;
                } else {
                    dca2 = dby.e;
                }
                if (dca2.a) {
                    int a3 = defpackage.atg.a(atg.b, dby.d);
                    if (a3 >= 0) {
                        atg.b.set(a3, dby);
                        if (atg.c) {
                            atg.c(atg.d() + 1 + a3);
                        }
                    }
                } else {
                    atg.c(dby);
                }
                defpackage.aju.a().a(a2.d);
            }
        }
    }

    public final void c(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2 = 8;
        int i3 = 0;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.X);
        boolean z5 = this.W.a() == 0;
        z2 = this.aj == 0;
        z3 = isEmpty || z5 || this.ak;
        android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout = this.ad;
        z4 = !z3;
        a(swipeRefreshLayout, z4, z);
        a(this.ae, z3, z);
        if (z3) {
            if (isEmpty) {
                i3 = 8;
                i = 8;
            } else if (z2) {
                i = 8;
                i3 = 8;
                i2 = 0;
            } else if (z5) {
                i = 0;
                i3 = 8;
            } else {
                i = 8;
            }
            this.ag.setVisibility(i);
            this.U.setVisibility(i2);
            this.ah.setVisibility(i3);
            this.V.setEnabled(true);
            b(this.af);
            return;
        }
        b(this.recyclerView);
    }

    private static void a(android.view.View view, boolean z, boolean z2) {
        float f;
        int i = 0;
        if (!z2) {
            view.clearAnimation();
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            view.setAlpha(f);
        } else if (z) {
            view.clearAnimation();
            view.setVisibility(0);
            view.animate().alpha(1.0f).start();
        } else {
            view.clearAnimation();
            view.animate().alpha(0.0f).withEndAction(new defpackage.aun(view)).start();
        }
    }

    public static defpackage.anc N() {
        return defpackage.any.a().c();
    }

    public final boolean O() {
        return this.a != null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void P() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(defpackage.any.a().c().c());
        if (!android.text.TextUtils.isEmpty(this.X)) {
            arrayList.add(defpackage.any.a().c().a(this.X));
        }
        new defpackage.cye(defpackage.csp.a((java.lang.Iterable) arrayList)).a(new defpackage.auo(this), com.google.android.apps.tasks.common.TaskApplication.getApplication().a);
    }
}
