package defpackage;

import android.animation.Animator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: je  reason: default package */
/* compiled from: PG */
public abstract class je implements Cloneable {
    private static final int[] l = {2, 1, 3, 4};
    private static final ja m = new ja((byte) 0);
    private static ThreadLocal o = new ThreadLocal();
    public long a = -1;
    public long b = -1;
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public js e = new js();
    public js f = new js();
    public jo g = null;
    public int[] h = l;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k = new ArrayList();
    private String n = getClass().getName();
    private int p = 0;
    private boolean q = false;
    private boolean r = false;
    private ArrayList s = null;
    private ArrayList t = new ArrayList();

    public abstract void a(jr jrVar);

    public abstract void b(jr jrVar);

    public je a(long j2) {
        this.b = j2;
        return this;
    }

    public je b(long j2) {
        this.a = j2;
        return this;
    }

    public String[] a() {
        return null;
    }

    public Animator a(ViewGroup viewGroup, jr jrVar, jr jrVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, js jsVar, js jsVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator a2;
        View view;
        jr jrVar;
        Animator animator;
        qr b2 = b();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jr jrVar2 = (jr) arrayList.get(i2);
            jr jrVar3 = (jr) arrayList2.get(i2);
            jr jrVar4 = (jrVar2 == null || jrVar2.c.contains(this)) ? jrVar2 : null;
            if (jrVar3 != null && !jrVar3.c.contains(this)) {
                jrVar3 = null;
            }
            if (jrVar4 != null || jrVar3 != null) {
                if ((jrVar4 == null || jrVar3 == null || a(jrVar4, jrVar3)) && (a2 = a(viewGroup, jrVar4, jrVar3)) != null) {
                    jr jrVar5 = null;
                    if (jrVar3 != null) {
                        View view2 = jrVar3.b;
                        String[] a3 = a();
                        if (!(view2 == null || a3 == null || a3.length <= 0)) {
                            jr jrVar6 = new jr();
                            jrVar6.b = view2;
                            jr jrVar7 = (jr) jsVar2.a.get(view2);
                            if (jrVar7 != null) {
                                for (int i3 = 0; i3 < a3.length; i3++) {
                                    jrVar6.a.put(a3[i3], jrVar7.a.get(a3[i3]));
                                }
                            }
                            int size2 = b2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                lo loVar = (lo) b2.get((Animator) b2.b(i4));
                                if (loVar.c != null && loVar.a == view2 && loVar.b.equals(this.n) && loVar.c.equals(jrVar6)) {
                                    jrVar = jrVar6;
                                    view = view2;
                                    animator = null;
                                    break;
                                }
                            }
                            jrVar5 = jrVar6;
                        }
                        jrVar = jrVar5;
                        view = view2;
                        animator = a2;
                    } else {
                        view = jrVar4.b;
                        jrVar = null;
                        animator = a2;
                    }
                    if (animator != null) {
                        b2.put(animator, new lo(view, this.n, this, kb.a.a(viewGroup), jrVar));
                        this.t.add(animator);
                    }
                }
            }
        }
        if (Long.MAX_VALUE != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator2 = (Animator) this.t.get(sparseIntArray.keyAt(i5));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator2.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        int id = view.getId();
        if ((this.c.size() != 0 || this.d.size() != 0) && !this.c.contains(Integer.valueOf(id)) && !this.d.contains(view)) {
            return false;
        }
        return true;
    }

    static qr b() {
        qr qrVar = (qr) o.get();
        if (qrVar != null) {
            return qrVar;
        }
        qr qrVar2 = new qr();
        o.set(qrVar2);
        return qrVar2;
    }

    /* access modifiers changed from: protected */
    public void c() {
        d();
        qr b2 = b();
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (b2.containsKey(animator)) {
                d();
                if (animator != null) {
                    animator.addListener(new jf(this, b2));
                    if (animator == null) {
                        e();
                    } else {
                        if (this.b >= 0) {
                            animator.setDuration(this.b);
                        }
                        if (this.a >= 0) {
                            animator.setStartDelay(this.a);
                        }
                        animator.addListener(new jg(this));
                        animator.start();
                    }
                }
            }
        }
        this.t.clear();
        e();
    }

    public je b(View view) {
        this.d.add(view);
        return this;
    }

    public je c(View view) {
        this.d.remove(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.c.size() > 0 || this.d.size() > 0) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                View findViewById = viewGroup.findViewById(((Integer) this.c.get(i2)).intValue());
                if (findViewById != null) {
                    jr jrVar = new jr();
                    jrVar.b = findViewById;
                    if (z) {
                        a(jrVar);
                    } else {
                        b(jrVar);
                    }
                    jrVar.c.add(this);
                    c(jrVar);
                    if (z) {
                        a(this.e, findViewById, jrVar);
                    } else {
                        a(this.f, findViewById, jrVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                View view = (View) this.d.get(i3);
                jr jrVar2 = new jr();
                jrVar2.b = view;
                if (z) {
                    a(jrVar2);
                } else {
                    b(jrVar2);
                }
                jrVar2.c.add(this);
                c(jrVar2);
                if (z) {
                    a(this.e, view, jrVar2);
                } else {
                    a(this.f, view, jrVar2);
                }
            }
            return;
        }
        c(viewGroup, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.js r7, android.view.View r8, defpackage.jr r9) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je.a(js, android.view.View, jr):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z) {
            this.e.a.clear();
            this.e.b.clear();
            this.e.c.c();
            return;
        }
        this.f.a.clear();
        this.f.b.clear();
        this.f.c.c();
    }

    private final void c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                jr jrVar = new jr();
                jrVar.b = view;
                if (z) {
                    a(jrVar);
                } else {
                    b(jrVar);
                }
                jrVar.c.add(this);
                c(jrVar);
                if (z) {
                    a(this.e, view, jrVar);
                } else {
                    a(this.f, view, jrVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    c(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public final jr a(View view, boolean z) {
        while (this.g != null) {
            this = this.g;
        }
        return (jr) (z ? this.e : this.f).a.get(view);
    }

    /* access modifiers changed from: package-private */
    public final jr b(View view, boolean z) {
        jr jrVar;
        while (this.g != null) {
            this = this.g;
        }
        ArrayList arrayList = z ? this.i : this.j;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            jr jrVar2 = (jr) arrayList.get(i2);
            if (jrVar2 == null) {
                return null;
            }
            if (jrVar2.b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            jrVar = (jr) (z ? this.j : this.i).get(i2);
        } else {
            jrVar = null;
        }
        return jrVar;
    }

    public void d(View view) {
        if (!this.r) {
            qr b2 = b();
            int size = b2.size();
            kp a2 = kb.a.a(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                lo loVar = (lo) b2.c(i2);
                if (loVar.a != null && a2.equals(loVar.d)) {
                    ib.a.a((Animator) b2.b(i2));
                }
            }
            if (this.s != null && this.s.size() > 0) {
                ArrayList arrayList = (ArrayList) this.s.clone();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((ji) arrayList.get(i3)).a();
                }
            }
            this.q = true;
        }
    }

    public void e(View view) {
        if (this.q) {
            if (!this.r) {
                qr b2 = b();
                int size = b2.size();
                kp a2 = kb.a.a(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    lo loVar = (lo) b2.c(i2);
                    if (loVar.a != null && a2.equals(loVar.d)) {
                        ib.a.b((Animator) b2.b(i2));
                    }
                }
                if (this.s != null && this.s.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.s.clone();
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((ji) arrayList.get(i3)).b();
                    }
                }
            }
            this.q = false;
        }
    }

    public boolean a(jr jrVar, jr jrVar2) {
        if (!(jrVar == null || jrVar2 == null)) {
            String[] a2 = a();
            if (a2 != null) {
                for (String str : a2) {
                    if (a(jrVar, jrVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            for (String str2 : jrVar.a.keySet()) {
                if (a(jrVar, jrVar2, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(jr jrVar, jr jrVar2, String str) {
        Object obj = jrVar.a.get(str);
        Object obj2 = jrVar2.a.get(str);
        if ((obj != null || obj2 != null) && (obj == null || obj2 == null || !obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.p == 0) {
            if (this.s != null && this.s.size() > 0) {
                ArrayList arrayList = (ArrayList) this.s.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ji) arrayList.get(i2)).c();
                }
            }
            this.r = false;
        }
        this.p++;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.p--;
        if (this.p == 0) {
            if (this.s != null && this.s.size() > 0) {
                ArrayList arrayList = (ArrayList) this.s.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ji) arrayList.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.e.c.b(); i3++) {
                View view = (View) this.e.c.b(i3);
                if (view != null) {
                    sn.a(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f.c.b(); i4++) {
                View view2 = (View) this.f.c.b(i4);
                if (view2 != null) {
                    sn.a(view2, false);
                }
            }
            this.r = true;
        }
    }

    public je a(ji jiVar) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(jiVar);
        return this;
    }

    public je b(ji jiVar) {
        if (this.s != null) {
            this.s.remove(jiVar);
            if (this.s.size() == 0) {
                this.s = null;
            }
        }
        return this;
    }

    public void a(jh jhVar) {
    }

    /* access modifiers changed from: package-private */
    public void c(jr jrVar) {
    }

    public String toString() {
        return a("");
    }

    /* renamed from: f */
    public je clone() {
        try {
            je jeVar = (je) super.clone();
            jeVar.t = new ArrayList();
            jeVar.e = new js();
            jeVar.f = new js();
            jeVar.i = null;
            jeVar.j = null;
            return jeVar;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2;
        String str3 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str3 = str3 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str3 = str3 + "dly(" + this.a + ") ";
        }
        if (this.c.size() <= 0 && this.d.size() <= 0) {
            return str3;
        }
        String str4 = str3 + "tgts(";
        if (this.c.size() > 0) {
            str2 = str4;
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                if (i2 > 0) {
                    str2 = str2 + ", ";
                }
                str2 = str2 + this.c.get(i2);
            }
        } else {
            str2 = str4;
        }
        if (this.d.size() > 0) {
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                if (i3 > 0) {
                    str2 = str2 + ", ";
                }
                str2 = str2 + this.d.get(i3);
            }
        }
        return str2 + ")";
    }
}
