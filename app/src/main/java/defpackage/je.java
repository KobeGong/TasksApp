package defpackage;

/* renamed from: je reason: default package */
/* compiled from: PG */
public abstract class je implements java.lang.Cloneable {
    private static final int[] l = {2, 1, 3, 4};
    private static final defpackage.ja m = new defpackage.ja(0);
    private static java.lang.ThreadLocal o = new java.lang.ThreadLocal();
    public long a = -1;
    public long b = -1;
    public java.util.ArrayList c = new java.util.ArrayList();
    public java.util.ArrayList d = new java.util.ArrayList();
    public defpackage.js e = new defpackage.js();
    public defpackage.js f = new defpackage.js();
    public defpackage.jo g = null;
    public int[] h = l;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public java.util.ArrayList k = new java.util.ArrayList();
    private java.lang.String n = getClass().getName();
    private int p = 0;
    private boolean q = false;
    private boolean r = false;
    private java.util.ArrayList s = null;
    private java.util.ArrayList t = new java.util.ArrayList();

    public abstract void a(defpackage.jr jrVar);

    public abstract void b(defpackage.jr jrVar);

    public defpackage.je a(long j2) {
        this.b = j2;
        return this;
    }

    public defpackage.je b(long j2) {
        this.a = j2;
        return this;
    }

    public java.lang.String[] a() {
        return null;
    }

    public android.animation.Animator a(android.view.ViewGroup viewGroup, defpackage.jr jrVar, defpackage.jr jrVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(android.view.ViewGroup viewGroup, defpackage.js jsVar, defpackage.js jsVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        defpackage.jr jrVar;
        android.view.View view;
        defpackage.jr jrVar2;
        android.animation.Animator animator;
        defpackage.qr b2 = b();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.jr jrVar3 = (defpackage.jr) arrayList.get(i2);
            defpackage.jr jrVar4 = (defpackage.jr) arrayList2.get(i2);
            if (jrVar3 == null || jrVar3.c.contains(this)) {
                jrVar = jrVar3;
            } else {
                jrVar = null;
            }
            if (jrVar4 != null && !jrVar4.c.contains(this)) {
                jrVar4 = null;
            }
            if (jrVar != null || jrVar4 != null) {
                if (jrVar == null || jrVar4 == null || a(jrVar, jrVar4)) {
                    android.animation.Animator a2 = a(viewGroup, jrVar, jrVar4);
                    if (a2 != null) {
                        defpackage.jr jrVar5 = null;
                        if (jrVar4 != null) {
                            android.view.View view2 = jrVar4.b;
                            java.lang.String[] a3 = a();
                            if (!(view2 == null || a3 == null || a3.length <= 0)) {
                                defpackage.jr jrVar6 = new defpackage.jr();
                                jrVar6.b = view2;
                                defpackage.jr jrVar7 = (defpackage.jr) jsVar2.a.get(view2);
                                if (jrVar7 != null) {
                                    for (int i3 = 0; i3 < a3.length; i3++) {
                                        jrVar6.a.put(a3[i3], jrVar7.a.get(a3[i3]));
                                    }
                                }
                                int size2 = b2.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    defpackage.lo loVar = (defpackage.lo) b2.get((android.animation.Animator) b2.b(i4));
                                    if (loVar.c != null && loVar.a == view2 && loVar.b.equals(this.n) && loVar.c.equals(jrVar6)) {
                                        jrVar2 = jrVar6;
                                        view = view2;
                                        animator = null;
                                        break;
                                    }
                                }
                                jrVar5 = jrVar6;
                            }
                            jrVar2 = jrVar5;
                            view = view2;
                            animator = a2;
                        } else {
                            view = jrVar.b;
                            jrVar2 = null;
                            animator = a2;
                        }
                        if (animator != null) {
                            b2.put(animator, new defpackage.lo(view, this.n, this, defpackage.kb.a.a(viewGroup), jrVar2));
                            this.t.add(animator);
                        }
                    }
                }
            }
        }
        if (Long.MAX_VALUE != 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < sparseIntArray.size()) {
                    android.animation.Animator animator2 = (android.animation.Animator) this.t.get(sparseIntArray.keyAt(i6));
                    animator2.setStartDelay((((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE) + animator2.getStartDelay());
                    i5 = i6 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(android.view.View view) {
        int id = view.getId();
        if ((this.c.size() != 0 || this.d.size() != 0) && !this.c.contains(java.lang.Integer.valueOf(id)) && !this.d.contains(view)) {
            return false;
        }
        return true;
    }

    static defpackage.qr b() {
        defpackage.qr qrVar = (defpackage.qr) o.get();
        if (qrVar != null) {
            return qrVar;
        }
        defpackage.qr qrVar2 = new defpackage.qr();
        o.set(qrVar2);
        return qrVar2;
    }

    /* access modifiers changed from: protected */
    public void c() {
        d();
        defpackage.qr b2 = b();
        java.util.ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            android.animation.Animator animator = (android.animation.Animator) obj;
            if (b2.containsKey(animator)) {
                d();
                if (animator != null) {
                    animator.addListener(new defpackage.jf(this, b2));
                    if (animator == null) {
                        e();
                    } else {
                        if (this.b >= 0) {
                            animator.setDuration(this.b);
                        }
                        if (this.a >= 0) {
                            animator.setStartDelay(this.a);
                        }
                        animator.addListener(new defpackage.jg(this));
                        animator.start();
                    }
                }
            }
        }
        this.t.clear();
        e();
    }

    public defpackage.je b(android.view.View view) {
        this.d.add(view);
        return this;
    }

    public defpackage.je c(android.view.View view) {
        this.d.remove(view);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.view.ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.c.size() > 0 || this.d.size() > 0) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                android.view.View findViewById = viewGroup.findViewById(((java.lang.Integer) this.c.get(i2)).intValue());
                if (findViewById != null) {
                    defpackage.jr jrVar = new defpackage.jr();
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
                android.view.View view = (android.view.View) this.d.get(i3);
                defpackage.jr jrVar2 = new defpackage.jr();
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

    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.js r7, android.view.View r8, defpackage.jr r9) {
        /*
            r1 = 0
            qr r0 = r7.a
            r0.put(r8, r9)
            int r0 = r8.getId()
            if (r0 < 0) goto L_0x0019
            android.util.SparseArray r2 = r7.b
            int r2 = r2.indexOfKey(r0)
            if (r2 < 0) goto L_0x0084
            android.util.SparseArray r2 = r7.b
            r2.put(r0, r1)
        L_0x0019:
            sw r0 = defpackage.sn.a
            java.lang.String r0 = r0.t(r8)
            if (r0 == 0) goto L_0x002e
            qr r2 = r7.d
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L_0x008a
            qr r2 = r7.d
            r2.put(r0, r1)
        L_0x002e:
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof android.widget.ListView
            if (r0 == 0) goto L_0x0083
            android.view.ViewParent r0 = r8.getParent()
            android.widget.ListView r0 = (android.widget.ListView) r0
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r2 = r2.hasStableIds()
            if (r2 == 0) goto L_0x0083
            int r2 = r0.getPositionForView(r8)
            long r2 = r0.getItemIdAtPosition(r2)
            qx r0 = r7.c
            boolean r4 = r0.b
            if (r4 == 0) goto L_0x0057
            r0.a()
        L_0x0057:
            long[] r4 = r0.c
            int r0 = r0.e
            int r0 = defpackage.qv.a(r4, r0, r2)
            if (r0 < 0) goto L_0x0095
            qx r0 = r7.c
            long[] r4 = r0.c
            int r5 = r0.e
            int r4 = defpackage.qv.a(r4, r5, r2)
            if (r4 < 0) goto L_0x0075
            java.lang.Object[] r5 = r0.d
            r5 = r5[r4]
            java.lang.Object r6 = defpackage.qx.a
            if (r5 != r6) goto L_0x0090
        L_0x0075:
            r0 = r1
        L_0x0076:
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0083
            r4 = 0
            defpackage.sn.a(r0, r4)
            qx r0 = r7.c
            r0.a(r2, r1)
        L_0x0083:
            return
        L_0x0084:
            android.util.SparseArray r2 = r7.b
            r2.put(r0, r8)
            goto L_0x0019
        L_0x008a:
            qr r2 = r7.d
            r2.put(r0, r8)
            goto L_0x002e
        L_0x0090:
            java.lang.Object[] r0 = r0.d
            r0 = r0[r4]
            goto L_0x0076
        L_0x0095:
            r0 = 1
            defpackage.sn.a(r8, r0)
            qx r0 = r7.c
            r0.a(r2, r8)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je.a(js, android.view.View, jr):void");
    }

    /* access modifiers changed from: 0000 */
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

    private final void c(android.view.View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof android.view.ViewGroup) {
                defpackage.jr jrVar = new defpackage.jr();
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
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    c(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public final defpackage.jr a(android.view.View view, boolean z) {
        while (this.g != null) {
            this = this.g;
        }
        return (defpackage.jr) (z ? this.e : this.f).a.get(view);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.jr b(android.view.View view, boolean z) {
        defpackage.jr jrVar;
        while (this.g != null) {
            this = this.g;
        }
        java.util.ArrayList arrayList = z ? this.i : this.j;
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
            defpackage.jr jrVar2 = (defpackage.jr) arrayList.get(i2);
            if (jrVar2 == null) {
                return null;
            }
            if (jrVar2.b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            jrVar = (defpackage.jr) (z ? this.j : this.i).get(i2);
        } else {
            jrVar = null;
        }
        return jrVar;
    }

    public void d(android.view.View view) {
        if (!this.r) {
            defpackage.qr b2 = b();
            int size = b2.size();
            defpackage.kp a2 = defpackage.kb.a.a(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                defpackage.lo loVar = (defpackage.lo) b2.c(i2);
                if (loVar.a != null && a2.equals(loVar.d)) {
                    defpackage.ib.a.a((android.animation.Animator) b2.b(i2));
                }
            }
            if (this.s != null && this.s.size() > 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.s.clone();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((defpackage.ji) arrayList.get(i3)).a();
                }
            }
            this.q = true;
        }
    }

    public void e(android.view.View view) {
        if (this.q) {
            if (!this.r) {
                defpackage.qr b2 = b();
                int size = b2.size();
                defpackage.kp a2 = defpackage.kb.a.a(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    defpackage.lo loVar = (defpackage.lo) b2.c(i2);
                    if (loVar.a != null && a2.equals(loVar.d)) {
                        defpackage.ib.a.b((android.animation.Animator) b2.b(i2));
                    }
                }
                if (this.s != null && this.s.size() > 0) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.s.clone();
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((defpackage.ji) arrayList.get(i3)).b();
                    }
                }
            }
            this.q = false;
        }
    }

    public boolean a(defpackage.jr jrVar, defpackage.jr jrVar2) {
        if (!(jrVar == null || jrVar2 == null)) {
            java.lang.String[] a2 = a();
            if (a2 != null) {
                for (java.lang.String a3 : a2) {
                    if (a(jrVar, jrVar2, a3)) {
                        return true;
                    }
                }
                return false;
            }
            for (java.lang.String a4 : jrVar.a.keySet()) {
                if (a(jrVar, jrVar2, a4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(defpackage.jr jrVar, defpackage.jr jrVar2, java.lang.String str) {
        java.lang.Object obj = jrVar.a.get(str);
        java.lang.Object obj2 = jrVar2.a.get(str);
        if ((obj != null || obj2 != null) && (obj == null || obj2 == null || !obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.p == 0) {
            if (this.s != null && this.s.size() > 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.s.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((defpackage.ji) arrayList.get(i2)).c();
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
                java.util.ArrayList arrayList = (java.util.ArrayList) this.s.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((defpackage.ji) arrayList.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.e.c.b(); i3++) {
                android.view.View view = (android.view.View) this.e.c.b(i3);
                if (view != null) {
                    defpackage.sn.a(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f.c.b(); i4++) {
                android.view.View view2 = (android.view.View) this.f.c.b(i4);
                if (view2 != null) {
                    defpackage.sn.a(view2, false);
                }
            }
            this.r = true;
        }
    }

    public defpackage.je a(defpackage.ji jiVar) {
        if (this.s == null) {
            this.s = new java.util.ArrayList();
        }
        this.s.add(jiVar);
        return this;
    }

    public defpackage.je b(defpackage.ji jiVar) {
        if (this.s != null) {
            this.s.remove(jiVar);
            if (this.s.size() == 0) {
                this.s = null;
            }
        }
        return this;
    }

    public void a(defpackage.jh jhVar) {
    }

    /* access modifiers changed from: 0000 */
    public void c(defpackage.jr jrVar) {
    }

    public java.lang.String toString() {
        return a("");
    }

    /* renamed from: f */
    public defpackage.je clone() {
        try {
            defpackage.je jeVar = (defpackage.je) super.clone();
            jeVar.t = new java.util.ArrayList();
            jeVar.e = new defpackage.js();
            jeVar.f = new defpackage.js();
            jeVar.i = null;
            jeVar.j = null;
            return jeVar;
        } catch (java.lang.CloneNotSupportedException e2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = str + getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str3 = str3 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str3 = str3 + "dly(" + this.a + ") ";
        }
        if (this.c.size() <= 0 && this.d.size() <= 0) {
            return str3;
        }
        java.lang.String str4 = str3 + "tgts(";
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
