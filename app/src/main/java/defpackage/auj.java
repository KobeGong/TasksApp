package defpackage;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.provider.Settings;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: auj  reason: default package */
/* compiled from: PG */
public final class auj extends lc implements DatePickerDialog.OnDateSetListener {
    private static final ajr aa = ajr.MY_ORDER;
    private static Vibrator ab;
    private static Boolean ac;
    public View U;
    public Button V;
    public atg W;
    public String X;
    public ajr Y = aa;
    public String Z;
    public View a;
    private SwipeRefreshLayout ad;
    private SwipeRefreshLayout ae;
    private NestedScrollView af;
    private View ag;
    private View ah;
    private aht ai;
    private long aj = 0;
    private boolean ak = false;
    private alu al;
    private att am;
    public RecyclerView b;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Boolean bool;
        this.a = layoutInflater.inflate(R.layout.tasks_fragment, (ViewGroup) null);
        this.ad = (SwipeRefreshLayout) this.a.findViewById(R.id.tasks_refresh);
        this.ae = (SwipeRefreshLayout) this.a.findViewById(R.id.tasks_refresh_empty);
        this.b = (RecyclerView) this.a.findViewById(R.id.tasks_list);
        if (this.W != null) {
            bool = Boolean.valueOf(this.W.c);
        } else {
            bool = null;
        }
        this.W = null;
        this.ag = this.a.findViewById(R.id.empty_view);
        this.U = this.a.findViewById(R.id.tasks_not_synced);
        this.ah = this.a.findViewById(R.id.too_many_subtask_levels);
        this.V = (Button) this.a.findViewById(R.id.flatten_subtasks);
        this.ad.a = new auk(this);
        this.ae.a = new aul(this);
        this.b.a(new adw());
        RecyclerView recyclerView = this.b;
        auu auu = new auu(this);
        if (recyclerView.z != null) {
            recyclerView.z.d();
            recyclerView.z.h = null;
        }
        recyclerView.z = auu;
        if (recyclerView.z != null) {
            recyclerView.z.h = recyclerView.H;
        }
        this.V.setOnClickListener(new aum(this));
        if (ac == null) {
            ac = Boolean.valueOf(Settings.System.getInt(i().getContentResolver(), "haptic_feedback_enabled", 1) != 0);
            ab = (Vibrator) i().getSystemService("vibrator");
        }
        this.am = new att(ob.c(i(), R.color.task_complete_swipe_background), ob.c(i(), R.color.task_snooze_swipe_background), this.b.z.j);
        this.b.a(this.am);
        this.b.a(new ats(i()));
        this.af = (NestedScrollView) this.a.findViewById(R.id.tasks_refresh_empty_scrollable);
        this.al = new auv(this);
        a(this.X, this.Y, false);
        this.b.a(new auy(this.b));
        if (!(bool == null || this.W == null)) {
            this.W.a(bool.booleanValue());
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("taskListsLayout");
            if (parcelable != null) {
                this.b.l.a(parcelable);
            }
            if (this.W != null) {
                this.W.a(bundle.getBoolean("completedExpanded", this.W.c));
            }
        }
        this.b.a(new auw(this));
        this.af.a = new bdk(this);
        return this.a;
    }

    public final void b(View view) {
        lg j = j();
        if (j instanceof aux) {
            ((aux) j).c(view.canScrollVertically(-1));
        }
    }

    @Override // defpackage.lc
    public final void a(Context context) {
        super.a(context);
        cky.a((Activity) j(), dck.e);
    }

    @Override // defpackage.lc
    public final void s() {
        super.s();
        if (j() != null) {
            cos.a(j()).b.a(j().findViewById(16908290));
        }
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.X) && !this.ak && this.aj > 0;
    }

    public final void a(String str, ajr ajr, boolean z) {
        ajq d;
        dca dca;
        boolean z2 = false;
        if (ajr == null) {
            ajr = aa;
        }
        boolean z3 = !cru.d(this.X, str);
        boolean z4 = z3 || !cru.d(this.Y, ajr);
        this.X = str;
        this.Y = ajr;
        if (O()) {
            if (z4 || this.W == null) {
                if (this.W != null) {
                    this.W.f = null;
                }
                if (this.Y == ajr.BY_DUE_DATE) {
                    this.W = new atn();
                } else {
                    this.W = new atv();
                }
                atg atg = this.W;
                RecyclerView recyclerView = this.b;
                LayoutInflater from = LayoutInflater.from(this.a.getContext());
                if (atg.h == null) {
                    atg.h = from.inflate(R.layout.completed_header, (ViewGroup) recyclerView, false);
                    atg.j = (TextView) atg.h.findViewById(R.id.completed_count);
                    atg.k = (ImageView) atg.h.findViewById(R.id.expand);
                    atg.k.setImageResource(R.drawable.quantum_ic_stat_minus_1_grey600_24);
                    atg.i = atg.h.findViewById(R.id.completed_header);
                    atg.i.setOnClickListener(new ath(atg));
                    if (atg.g == null) {
                        atg.g = new atj(atg);
                    }
                    atg.f();
                    atg.l = (TextView) from.inflate(R.layout.task_drag_num_subtasks, (ViewGroup) recyclerView, false);
                }
                if (this.ai != null) {
                    RecyclerView recyclerView2 = new RecyclerView(this.a.getContext());
                    this.a.getContext();
                    recyclerView2.a(new adw());
                    this.ai.a(recyclerView2);
                }
                this.b.a(this.W);
                auh auh = new auh(this.W, ac.booleanValue() ? ab : null, this.a.getResources().getDimension(R.dimen.task_item_subtask_start_spacing), this.am);
                this.ai = new aht(auh);
                this.ai.a(this.b);
                this.b.setOnTouchListener(auh);
                this.W.f = new atl(this);
            }
            if (TextUtils.isEmpty(this.X)) {
                d = ajq.d();
            } else {
                d = any.a().c().d(this.X);
            }
            Iterator it = d.b().a.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterator it2 = ((dcf) it.next()).c.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((dcf) it2.next()).c.size() > 0) {
                            z2 = true;
                            break loop0;
                        }
                    }
                }
            }
            this.ak = z2;
            atg atg2 = this.W;
            atg2.b.clear();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (dby dby : d.a()) {
                if (dby.e == null) {
                    dca = dca.g;
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
            if (z3 && !TextUtils.isEmpty(this.X) && this.aj == 0) {
                this.U.animate().cancel();
                this.U.setAlpha(0.0f);
                a(true);
                cyi a2 = any.a().c().a(this.X);
                a2.a(new aup(this, a2), TaskApplication.b().a);
            }
            c(z);
            lg j = j();
            if (j instanceof aux) {
                ((aux) j).d(c());
            }
        }
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        alq.a().b(this.al);
        alq.a().a(this.al);
        a(this.X, this.Y, false);
    }

    @Override // defpackage.lc
    public final void f() {
        alq.a().b(this.al);
        super.f();
    }

    @Override // defpackage.lc
    public final void d(Bundle bundle) {
        super.d(bundle);
        bundle.putParcelable("taskListsLayout", this.b.l.c());
        if (this.W != null) {
            bundle.putBoolean("completedExpanded", this.W.c);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (O()) {
            this.ad.a(z);
            this.ae.a(z);
        }
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        dih dih;
        dca dca;
        dih dih2;
        dca dca2;
        if (!TextUtils.isEmpty(this.Z)) {
            dii g = ((dii) dmk.d.a(bg.ao)).e(i).f(i2 + 1).g(i3);
            if (g.b) {
                dih = g.a;
            } else {
                dih dih3 = g.a;
                djz.a.a(dih3).c(dih3);
                g.b = true;
                dih = g.a;
            }
            dih dih4 = dih;
            if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dmk dmk = (dmk) dih4;
            dby a2 = any.a().c().a(this.X, this.Z);
            if (a2 != null) {
                any.a().c().a(this.X, this.Z, dmk);
                atg atg = this.W;
                dii dii = (dii) a2.a(bg.ao);
                dii.a((dih) a2);
                dii dii2 = dii;
                if (a2.e == null) {
                    dca = dca.g;
                } else {
                    dca = a2.e;
                }
                dii dii3 = (dii) dca.a(bg.ao);
                dii3.a((dih) dca);
                dii g2 = dii2.g(dii3.a(dmk));
                if (g2.b) {
                    dih2 = g2.a;
                } else {
                    dih dih5 = g2.a;
                    djz.a.a(dih5).c(dih5);
                    g2.b = true;
                    dih2 = g2.a;
                }
                dih dih6 = dih2;
                if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dby dby = (dby) dih6;
                if (dby.e == null) {
                    dca2 = dca.g;
                } else {
                    dca2 = dby.e;
                }
                if (dca2.a) {
                    int a3 = atg.a(atg.b, dby.d);
                    if (a3 >= 0) {
                        atg.b.set(a3, dby);
                        if (atg.c) {
                            atg.c(atg.d() + 1 + a3);
                        }
                    }
                } else {
                    atg.c(dby);
                }
                aju.a().a(a2.d);
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
        boolean isEmpty = TextUtils.isEmpty(this.X);
        boolean z5 = this.W.a() == 0;
        if (this.aj == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (isEmpty || z5 || this.ak) {
            z3 = true;
        } else {
            z3 = false;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.ad;
        if (!z3) {
            z4 = true;
        } else {
            z4 = false;
        }
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
            b((View) this.af);
            return;
        }
        b((View) this.b);
    }

    private static void a(View view, boolean z, boolean z2) {
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
            view.animate().alpha(0.0f).withEndAction(new aun(view)).start();
        }
    }

    public static anc N() {
        return any.a().c();
    }

    public final boolean O() {
        return this.a != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void P() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(any.a().c().c());
        if (!TextUtils.isEmpty(this.X)) {
            arrayList.add(any.a().c().a(this.X));
        }
        new cye(csp.a((Iterable) arrayList)).a(new auo(this), TaskApplication.b().a);
    }
}
