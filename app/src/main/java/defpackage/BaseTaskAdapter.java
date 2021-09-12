package defpackage;

import android.view.LayoutInflater;

import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout;

/* renamed from: atg reason: default package */
/* compiled from: PG */
public abstract class BaseTaskAdapter extends RecyclerViewAdapter {
    private static final long m = ((long) "#jkl;sdf;ksdafhksd#".hashCode());
    private static final long n = ((long) "#jkl;sdf;ksdafhksf#".hashCode());
    public java.lang.String a;
    public final java.util.List<dby> tasks = new java.util.ArrayList<>();
    public boolean c;
    public defpackage.atl f;
    public defpackage.atj g;
    public android.view.View rootView;
    public android.view.View completeHeaderView;
    public android.widget.TextView completeCountView;
    public android.widget.ImageView expandView;
    public android.widget.TextView l;
    private boolean o;

    BaseTaskAdapter() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(AbsTaskListStructure ajq);

    /* access modifiers changed from: protected */
    public abstract void b(RecyclerViewHolder afv, int i2);

    public abstract void b(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract void c(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract void c(java.lang.String str);

    /* access modifiers changed from: protected */
    public abstract int getCount();

    /* access modifiers changed from: protected */
    public abstract int d(java.lang.String str);

    /* access modifiers changed from: protected */
    public abstract void d(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean e(java.lang.String str);

    public abstract java.util.Set f(int i2);

    /* access modifiers changed from: protected */
    public abstract boolean h(int i2);

    /* access modifiers changed from: protected */
    public abstract defpackage.dby i(int i2);

    /* access modifiers changed from: protected */
    public abstract void j(int i2);

    public long getItemId(int i2) {
        defpackage.dca dca;
        java.lang.Object valueOf;
        boolean z = true;
        defpackage.dby g2 = g(i2);
        if (g2 != null) {
            if (g2.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = g2.e;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = g2.d;
            objArr[1] = dca.a;
            if (dca.d == null) {
                z = false;
            }
            if (!z) {
                valueOf = false;
            } else if (dca.d == null) {
                valueOf = defpackage.dmk.d;
            } else {
                valueOf = dca.d;
            }
            objArr[2] = valueOf;
            return (long) java.util.Arrays.hashCode(objArr);
        } else if (!this.o || i2 != getItemCount() - 1) {
            return m;
        } else {
            return n;
        }
    }

    public final int getItemCount() {
        return (this.o ? 1 : 0) + h() + getCount();
    }

    public final int a(defpackage.dby dby) {
        return a(dby.d);
    }

    public final int a(java.lang.String str) {
        int d = d(str);
        if (d >= 0) {
            return d;
        }
        if (this.c) {
            int a2 = a(this.tasks, str);
            if (a2 >= 0) {
                return a2 + getCount() + 1;
            }
        }
        return -1;
    }

    public int getItemViewType(int i2) {
        if (!this.o || i2 != getItemCount() - 1) {
            return -1;
        }
        return 0;
    }

    public final void b(java.lang.String str) {
        int a2 = a(str);
        if (a2 < 0 || a2 >= getCount()) {
            int a3 = a(this.tasks, str);
            if (a3 >= 0) {
                this.tasks.remove(a3);
                if (this.c && !this.tasks.isEmpty()) {
                    e(a3 + getCount() + 1);
                } else if (this.c && this.tasks.isEmpty()) {
                    b(getCount(), 2);
                } else if (!this.c && this.tasks.isEmpty()) {
                    e(getCount());
                }
            }
            f();
        } else {
            c(str);
        }
        g();
    }

    public final void onBindViewHolder(RecyclerViewHolder viewHolder, int position) {
        int d = getCount();
        if (d == position) {
            defpackage.atx atx = (defpackage.atx) viewHolder;
            atx.v();
            ViewCompat.a(atx.itemView, "");
            if (atx.q.getParent() != null) {
                ((android.widget.FrameLayout) atx.q.getParent()).removeView(atx.q);
            }
            atx.p.removeAllViews();
            atx.p.addView(atx.q);
            atx.t();
            atx.p.setBackground(atx.q.getBackground());
        } else if (position > d) {
            defpackage.dby g2 = g(position);
            if (g2 != null) {
                ((defpackage.atx) viewHolder).a(g2, f(position).size(), false, true);
            }
        } else {
            b(viewHolder, position);
        }
    }

    public final void b(RecyclerViewHolder afv) {
        super.b(afv);
        if (afv instanceof defpackage.atx) {
            ((defpackage.atx) afv).v();
        }
    }

    /* access modifiers changed from: protected */
    public final defpackage.dby g(int i2) {
        if (i2 < 0) {
            return null;
        }
        int d = getCount();
        if (d == i2) {
            return null;
        }
        if (i2 < d) {
            return i(i2);
        }
        if (!this.c) {
            return null;
        }
        int i3 = (i2 - d) - 1;
        if (i3 < this.tasks.size()) {
            return (defpackage.dby) this.tasks.get(i3);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final RecyclerViewHolder c(android.view.ViewGroup viewGroup, int position) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (position == 0) {
            return new defpackage.atk(from.inflate(R.layout.tasks_all_completed, viewGroup, false));
        }
        defpackage.atx atx = new defpackage.atx((TaskItemFrameLayout) from.inflate(R.layout.task, viewGroup, false), this.rootView, this.l);
        atx.v = new defpackage.aug(this);
        return atx;
    }

    private final int h() {
        int i2 = 0;
        if (!this.tasks.isEmpty()) {
            i2 = 1;
        }
        if (this.c) {
            return i2 + this.tasks.size();
        }
        return i2;
    }

    static int a(java.util.List list, java.lang.String str) {
        int i2 = 0;
        java.util.Iterator it = list.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return -1;
            }
            if (((defpackage.dby) it.next()).d.equals(str)) {
                return i3;
            }
            i2 = i3 + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.List list) {
        int i2 = 0;
        if (!list.isEmpty()) {
            boolean isEmpty = this.tasks.isEmpty();
            this.tasks.addAll(0, list);
            int d = getCount();
            if (isEmpty) {
                i2 = 1;
            } else {
                d++;
            }
            if (this.c) {
                i2 += list.size();
            }
            if (i2 > 0) {
                a(d, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z) {
        defpackage.dca dca;
        defpackage.dih dih;
        boolean z2;
        defpackage.dby g2 = g(i2);
        if (g2 != null) {
            java.lang.String str = g2.d;
            if (z) {
                if (defpackage.ajd.b(g2) && !e(g2.d)) {
                    b(str);
                    z2 = true;
                } else {
                    j(i2);
                    z2 = false;
                }
            } else {
                this.tasks.remove(g2);
                if (this.tasks.isEmpty()) {
                    b(i2 - 1, 2);
                } else {
                    e(i2);
                }
                defpackage.dii dii = (defpackage.dii) g2.a(defpackage.bg.ao);
                dii.a((defpackage.dih) g2);
                defpackage.dii dii2 = dii;
                if (g2.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = g2.e;
                }
                defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
                dii3.a((defpackage.dih) dca);
                defpackage.dii g3 = dii2.g(dii3.a(z));
                if (g3.b) {
                    dih = g3.a;
                } else {
                    defpackage.dih dih2 = g3.a;
                    defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                    g3.b = true;
                    dih = g3.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                d((defpackage.dby) dih3);
                z2 = false;
            }
            f();
            if (this.f != null) {
                if (z2) {
                    defpackage.atl atl = this.f;
                    TasksFragment.N().a(atl.a.X, str, (java.lang.Object) null);
                    atl.a.c(true);
                } else {
                    TasksFragment.N().a(this.f.a.X, str, z);
                    if (z) {
                        defpackage.aju.a().b(str);
                    }
                }
            }
            g();
        }
    }

    public final void a(boolean z) {
        if (this.c != z) {
            e();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (!this.tasks.isEmpty()) {
            this.c = !this.c;
            int d = getCount();
            if (this.c) {
                this.g.a(true);
                a(d + 1, this.tasks.size());
                if (this.f != null) {
                    this.f.a.recyclerView.c(d + 1);
                }
            } else {
                this.g.a(false);
                b(d + 1, this.tasks.size());
            }
            g();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        if (this.g != null) {
            defpackage.atj atj = this.g;
            this.tasks.size();
            atj.a.completeCountView.setText(atj.a.rootView.getResources().getString(R.string.completed_task_header, atj.a.tasks.size()));
            BaseTaskAdapter atg = atj.a;
            atg.completeCountView.setAccessibilityDelegate(new defpackage.ati(atg));
        }
    }

    public final void g() {
        boolean z = this.o;
        boolean z2 = getCount() == 0 && h() > 0 && !this.c;
        if (z != z2) {
            this.o = z2;
            if (this.o) {
                d(getItemCount() - 1);
            } else {
                e(getItemCount());
            }
        }
    }
}
