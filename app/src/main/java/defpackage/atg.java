package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: atg  reason: default package */
/* compiled from: PG */
public abstract class atg extends aet {
    private static final long m = ((long) "#jkl;sdf;ksdafhksd#".hashCode());
    private static final long n = ((long) "#jkl;sdf;ksdafhksf#".hashCode());
    public String a;
    public final List b = new ArrayList();
    public boolean c;
    public atl f;
    public atj g;
    public View h;
    public View i;
    public TextView j;
    public ImageView k;
    public TextView l;
    private boolean o;

    atg() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(ajq ajq);

    /* access modifiers changed from: protected */
    public abstract void b(afv afv, int i2);

    public abstract void b(dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract void c(dby dby);

    /* access modifiers changed from: protected */
    public abstract void c(String str);

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int d(String str);

    /* access modifiers changed from: protected */
    public abstract void d(dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean e(String str);

    public abstract Set f(int i2);

    /* access modifiers changed from: protected */
    public abstract boolean h(int i2);

    /* access modifiers changed from: protected */
    public abstract dby i(int i2);

    /* access modifiers changed from: protected */
    public abstract void j(int i2);

    @Override // defpackage.aet
    public long a(int i2) {
        dca dca;
        boolean z;
        boolean z2 = true;
        dby g2 = g(i2);
        if (g2 != null) {
            if (g2.e == null) {
                dca = dca.g;
            } else {
                dca = g2.e;
            }
            Object[] objArr = new Object[3];
            objArr[0] = g2.d;
            objArr[1] = Boolean.valueOf(dca.a);
            if (dca.d == null) {
                z2 = false;
            }
            if (!z2) {
                z = false;
            } else if (dca.d == null) {
                z = dmk.d;
            } else {
                z = dca.d;
            }
            objArr[2] = z;
            return (long) Arrays.hashCode(objArr);
        } else if (!this.o || i2 != a() - 1) {
            return m;
        } else {
            return n;
        }
    }

    @Override // defpackage.aet
    public final int a() {
        return (this.o ? 1 : 0) + h() + d();
    }

    public final int a(dby dby) {
        return a(dby.d);
    }

    public final int a(String str) {
        int a2;
        int d = d(str);
        if (d >= 0) {
            return d;
        }
        if (!this.c || (a2 = a(this.b, str)) < 0) {
            return -1;
        }
        return a2 + d() + 1;
    }

    @Override // defpackage.aet
    public int b(int i2) {
        if (!this.o || i2 != a() - 1) {
            return -1;
        }
        return 0;
    }

    public final void b(String str) {
        int a2 = a(str);
        if (a2 < 0 || a2 >= d()) {
            int a3 = a(this.b, str);
            if (a3 >= 0) {
                this.b.remove(a3);
                if (this.c && !this.b.isEmpty()) {
                    e(a3 + d() + 1);
                } else if (this.c && this.b.isEmpty()) {
                    b(d(), 2);
                } else if (!this.c && this.b.isEmpty()) {
                    e(d());
                }
            }
            f();
        } else {
            c(str);
        }
        g();
    }

    @Override // defpackage.aet
    public final void a(afv afv, int i2) {
        int d = d();
        if (d == i2) {
            atx atx = (atx) afv;
            atx.v();
            sn.a(atx.a, "");
            if (atx.q.getParent() != null) {
                ((FrameLayout) atx.q.getParent()).removeView(atx.q);
            }
            atx.p.removeAllViews();
            atx.p.addView(atx.q);
            atx.t();
            atx.p.setBackground(atx.q.getBackground());
        } else if (i2 > d) {
            dby g2 = g(i2);
            if (g2 != null) {
                ((atx) afv).a(g2, f(i2).size(), false, true);
            }
        } else {
            b(afv, i2);
        }
    }

    @Override // defpackage.aet
    public final void b(afv afv) {
        super.b(afv);
        if (afv instanceof atx) {
            ((atx) afv).v();
        }
    }

    /* access modifiers changed from: protected */
    public final dby g(int i2) {
        int d;
        int i3;
        if (i2 < 0 || (d = d()) == i2) {
            return null;
        }
        if (i2 < d) {
            return i(i2);
        }
        if (!this.c || (i2 - d) - 1 >= this.b.size()) {
            return null;
        }
        return (dby) this.b.get(i3);
    }

    /* access modifiers changed from: package-private */
    public final afv c(ViewGroup viewGroup, int i2) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            return new atk(from.inflate(R.layout.tasks_all_completed, viewGroup, false));
        }
        atx atx = new atx((TaskItemFrameLayout) from.inflate(R.layout.task, viewGroup, false), this.h, this.l);
        atx.v = new aug(this);
        return atx;
    }

    private final int h() {
        int i2 = 0;
        if (!this.b.isEmpty()) {
            i2 = 1;
        }
        if (this.c) {
            return i2 + this.b.size();
        }
        return i2;
    }

    static int a(List list, String str) {
        int i2 = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((dby) it.next()).d.equals(str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        int i2 = 0;
        if (!list.isEmpty()) {
            boolean isEmpty = this.b.isEmpty();
            this.b.addAll(0, list);
            int d = d();
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

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        dca dca;
        dih dih;
        boolean z2;
        dby g2 = g(i2);
        if (g2 != null) {
            String str = g2.d;
            if (z) {
                if (ajd.b(g2) && !e(g2.d)) {
                    b(str);
                    z2 = true;
                } else {
                    j(i2);
                    z2 = false;
                }
            } else {
                this.b.remove(g2);
                if (this.b.isEmpty()) {
                    b(i2 - 1, 2);
                } else {
                    e(i2);
                }
                dii dii = (dii) g2.a(bg.ao);
                dii.a((dih) g2);
                dii dii2 = dii;
                if (g2.e == null) {
                    dca = dca.g;
                } else {
                    dca = g2.e;
                }
                dii dii3 = (dii) dca.a(bg.ao);
                dii3.a((dih) dca);
                dii g3 = dii2.g(dii3.a(z));
                if (g3.b) {
                    dih = g3.a;
                } else {
                    dih dih2 = g3.a;
                    djz.a.a(dih2).c(dih2);
                    g3.b = true;
                    dih = g3.a;
                }
                dih dih3 = dih;
                if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                d((dby) dih3);
                z2 = false;
            }
            f();
            if (this.f != null) {
                if (z2) {
                    atl atl = this.f;
                    auj.N().a(atl.a.X, str, (Object) null);
                    atl.a.c(true);
                } else {
                    auj.N().a(this.f.a.X, str, z);
                    if (z) {
                        aju.a().b(str);
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

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.b.isEmpty()) {
            this.c = !this.c;
            int d = d();
            if (this.c) {
                this.g.a(true);
                a(d + 1, this.b.size());
                if (this.f != null) {
                    this.f.a.b.c(d + 1);
                }
            } else {
                this.g.a(false);
                b(d + 1, this.b.size());
            }
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.g != null) {
            atj atj = this.g;
            this.b.size();
            atj.a.j.setText(atj.a.h.getResources().getString(R.string.completed_task_header, Integer.valueOf(atj.a.b.size())));
            atg atg = atj.a;
            atg.j.setAccessibilityDelegate(new ati(atg));
        }
    }

    public final void g() {
        boolean z = this.o;
        boolean z2 = d() == 0 && h() > 0 && !this.c;
        if (z != z2) {
            this.o = z2;
            if (this.o) {
                d(a() - 1);
            } else {
                e(a());
            }
        }
    }
}
