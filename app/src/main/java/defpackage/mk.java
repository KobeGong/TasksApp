package defpackage;

/* renamed from: mk reason: default package */
/* compiled from: PG */
final class mk {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final defpackage.mv b = (android.os.Build.VERSION.SDK_INT >= 21 ? new defpackage.mq() : null);
    private static final defpackage.mv c = a();

    private static defpackage.mv a() {
        try {
            return (defpackage.mv) java.lang.Class.forName("it").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            return null;
        }
    }

    static void a(FragmentManagerImpl lpVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, int i2, boolean z) {
        android.view.ViewGroup viewGroup;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object a2;
        android.graphics.Rect rect;
        android.view.ViewGroup viewGroup2;
        java.lang.Object obj3;
        java.lang.Object a3;
        android.graphics.Rect rect2;
        android.view.View view;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        if (lpVar.d > 0) {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                BackStackRecord kvVar = (BackStackRecord) arrayList.get(i3);
                if (!((java.lang.Boolean) arrayList2.get(i3)).booleanValue()) {
                    int size = kvVar.ops.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        a(kvVar, (FragmentTransactionOP) kvVar.ops.get(i4), sparseArray, false, z);
                    }
                } else if (kvVar.mManager.f.onHasView()) {
                    for (int size2 = kvVar.ops.size() - 1; size2 >= 0; size2--) {
                        a(kvVar, (FragmentTransactionOP) kvVar.ops.get(size2), sparseArray, true, z);
                    }
                }
            }
            if (sparseArray.size() != 0) {
                android.view.View view2 = new android.view.View(lpVar.mHost.mContext);
                int size3 = sparseArray.size();
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < size3) {
                        int keyAt = sparseArray.keyAt(i6);
                        defpackage.qr qrVar = new defpackage.qr();
                        int i7 = i2 - 1;
                        while (true) {
                            int i8 = i7;
                            if (i8 < i) {
                                break;
                            }
                            BackStackRecord kvVar2 = (BackStackRecord) arrayList.get(i8);
                            if (kvVar2.b(keyAt)) {
                                boolean booleanValue = ((java.lang.Boolean) arrayList2.get(i8)).booleanValue();
                                if (kvVar2.q != null) {
                                    int size4 = kvVar2.q.size();
                                    if (booleanValue) {
                                        arrayList3 = kvVar2.q;
                                        arrayList4 = kvVar2.r;
                                    } else {
                                        java.util.ArrayList arrayList5 = kvVar2.q;
                                        arrayList3 = kvVar2.r;
                                        arrayList4 = arrayList5;
                                    }
                                    for (int i9 = 0; i9 < size4; i9++) {
                                        java.lang.String str = (java.lang.String) arrayList4.get(i9);
                                        java.lang.String str2 = (java.lang.String) arrayList3.get(i9);
                                        java.lang.String str3 = (java.lang.String) qrVar.remove(str2);
                                        if (str3 != null) {
                                            qrVar.put(str, str3);
                                        } else {
                                            qrVar.put(str, str2);
                                        }
                                    }
                                }
                            }
                            i7 = i8 - 1;
                        }
                        defpackage.mp mpVar = (defpackage.mp) sparseArray.valueAt(i6);
                        if (z) {
                            if (lpVar.f.onHasView()) {
                                viewGroup2 = (android.view.ViewGroup) lpVar.f.onFindViewById(keyAt);
                            } else {
                                viewGroup2 = null;
                            }
                            if (viewGroup2 != null) {
                                Fragment lcVar = mpVar.a;
                                Fragment lcVar2 = mpVar.d;
                                defpackage.mv a4 = a(lcVar2, lcVar);
                                if (a4 != null) {
                                    boolean z2 = mpVar.b;
                                    boolean z3 = mpVar.e;
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    java.lang.Object a5 = a(a4, lcVar, z2);
                                    java.lang.Object b2 = b(a4, lcVar2, z3);
                                    Fragment lcVar3 = mpVar.a;
                                    Fragment lcVar4 = mpVar.d;
                                    if (lcVar3 != null) {
                                        lcVar3.mView.setVisibility(0);
                                    }
                                    if (lcVar3 == null || lcVar4 == null) {
                                        obj3 = null;
                                    } else {
                                        boolean z4 = mpVar.b;
                                        if (qrVar.isEmpty()) {
                                            a3 = null;
                                        } else {
                                            a3 = a(a4, lcVar3, lcVar4, z4);
                                        }
                                        defpackage.qr b3 = b(a4, qrVar, a3, mpVar);
                                        defpackage.qr a6 = a(a4, qrVar, a3, mpVar);
                                        if (qrVar.isEmpty()) {
                                            a3 = null;
                                            if (b3 != null) {
                                                b3.clear();
                                            }
                                            if (a6 != null) {
                                                a6.clear();
                                            }
                                        } else {
                                            a(arrayList7, b3, (java.util.Collection) qrVar.keySet());
                                            a(arrayList6, a6, qrVar.values());
                                        }
                                        if (a5 == null && b2 == null && a3 == null) {
                                            obj3 = null;
                                        } else {
                                            a(lcVar3, lcVar4, z4);
                                            if (a3 != null) {
                                                arrayList6.add(view2);
                                                a4.a(a3, view2, arrayList7);
                                                a(a4, a3, b2, b3, mpVar.e, mpVar.f);
                                                rect2 = new android.graphics.Rect();
                                                view = a(a6, mpVar, a5, z4);
                                                if (view != null) {
                                                    a4.a(a5, rect2);
                                                }
                                            } else {
                                                rect2 = null;
                                                view = null;
                                            }
                                            defpackage.nt.a(viewGroup2, new defpackage.mn(lcVar3, lcVar4, z4, a6, view, rect2));
                                            obj3 = a3;
                                        }
                                    }
                                    if (a5 != null || obj3 != null || b2 != null) {
                                        java.util.ArrayList a7 = a(a4, b2, lcVar2, arrayList7, view2);
                                        java.util.ArrayList a8 = a(a4, a5, lcVar, arrayList6, view2);
                                        a(a8, 4);
                                        java.lang.Object a9 = a(a4, a5, b2, obj3, lcVar, z2);
                                        if (a9 != null) {
                                            if (lcVar2 != null && b2 != null && lcVar2.m && lcVar2.mHidden && lcVar2.mHiddenChanged) {
                                                lcVar2.b(true);
                                                a4.b(b2, lcVar2.mView, a7);
                                                defpackage.nt.a(lcVar2.I, new defpackage.ml(a7));
                                            }
                                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                            int size5 = arrayList6.size();
                                            for (int i10 = 0; i10 < size5; i10++) {
                                                android.view.View view3 = (android.view.View) arrayList6.get(i10);
                                                arrayList8.add(ViewCompat.a.t(view3));
                                                ViewCompat.a(view3, (java.lang.String) null);
                                            }
                                            a4.a(a9, a5, a8, b2, a7, obj3, arrayList6);
                                            a4.a(viewGroup2, a9);
                                            int size6 = arrayList6.size();
                                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                            for (int i11 = 0; i11 < size6; i11++) {
                                                android.view.View view4 = (android.view.View) arrayList7.get(i11);
                                                java.lang.String t = ViewCompat.a.t(view4);
                                                arrayList9.add(t);
                                                if (t != null) {
                                                    ViewCompat.a(view4, (java.lang.String) null);
                                                    java.lang.String str4 = (java.lang.String) qrVar.get(t);
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 >= size6) {
                                                            break;
                                                        } else if (str4.equals(arrayList8.get(i12))) {
                                                            ViewCompat.a((android.view.View) arrayList6.get(i12), t);
                                                            break;
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                }
                                            }
                                            defpackage.nt.a(viewGroup2, new defpackage.mw(size6, arrayList6, arrayList8, arrayList7, arrayList9));
                                            a(a8, 0);
                                            a4.a(obj3, arrayList7, arrayList6);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (lpVar.f.onHasView()) {
                                viewGroup = (android.view.ViewGroup) lpVar.f.onFindViewById(keyAt);
                            } else {
                                viewGroup = null;
                            }
                            if (viewGroup != null) {
                                Fragment lcVar5 = mpVar.a;
                                Fragment lcVar6 = mpVar.d;
                                defpackage.mv a10 = a(lcVar6, lcVar5);
                                if (a10 != null) {
                                    boolean z5 = mpVar.b;
                                    boolean z6 = mpVar.e;
                                    java.lang.Object a11 = a(a10, lcVar5, z5);
                                    java.lang.Object b4 = b(a10, lcVar6, z6);
                                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                                    Fragment lcVar7 = mpVar.a;
                                    Fragment lcVar8 = mpVar.d;
                                    if (lcVar7 == null || lcVar8 == null) {
                                        obj = null;
                                    } else {
                                        boolean z7 = mpVar.b;
                                        if (qrVar.isEmpty()) {
                                            a2 = null;
                                        } else {
                                            a2 = a(a10, lcVar7, lcVar8, z7);
                                        }
                                        defpackage.qr b5 = b(a10, qrVar, a2, mpVar);
                                        if (qrVar.isEmpty()) {
                                            a2 = null;
                                        } else {
                                            arrayList10.addAll(b5.values());
                                        }
                                        if (a11 == null && b4 == null && a2 == null) {
                                            obj = null;
                                        } else {
                                            a(lcVar7, lcVar8, z7);
                                            if (a2 != null) {
                                                rect = new android.graphics.Rect();
                                                a10.a(a2, view2, arrayList10);
                                                a(a10, a2, b4, b5, mpVar.e, mpVar.f);
                                                if (a11 != null) {
                                                    a10.a(a11, rect);
                                                }
                                            } else {
                                                rect = null;
                                            }
                                            defpackage.nt.a(viewGroup, new defpackage.mo(a10, qrVar, a2, mpVar, arrayList11, view2, lcVar7, lcVar8, z7, arrayList10, a11, rect));
                                            obj = a2;
                                        }
                                    }
                                    if (a11 != null || obj != null || b4 != null) {
                                        java.util.ArrayList a12 = a(a10, b4, lcVar6, arrayList10, view2);
                                        if (a12 == null || a12.isEmpty()) {
                                            obj2 = null;
                                        } else {
                                            obj2 = b4;
                                        }
                                        a10.b(a11, view2);
                                        java.lang.Object a13 = a(a10, a11, obj2, obj, lcVar5, mpVar.b);
                                        if (a13 != null) {
                                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                                            a10.a(a13, a11, arrayList12, obj2, a12, obj, arrayList11);
                                            defpackage.nt.a(viewGroup, new defpackage.mm(a11, a10, view2, lcVar5, arrayList11, arrayList12, a12, obj2));
                                            defpackage.nt.a(viewGroup, new defpackage.mx(arrayList11, qrVar));
                                            a10.a(viewGroup, a13);
                                            defpackage.nt.a(viewGroup, new defpackage.my(arrayList11, qrVar));
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i6 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private static defpackage.mv a(Fragment lcVar, Fragment lcVar2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (lcVar != null) {
            java.lang.Object y = lcVar.y();
            if (y != null) {
                arrayList.add(y);
            }
            java.lang.Object x = lcVar.x();
            if (x != null) {
                arrayList.add(x);
            }
            java.lang.Object B = lcVar.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (lcVar2 != null) {
            java.lang.Object w = lcVar2.w();
            if (w != null) {
                arrayList.add(w);
            }
            java.lang.Object z = lcVar2.z();
            if (z != null) {
                arrayList.add(z);
            }
            lcVar2.A();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (b != null && a(b, (java.util.List) arrayList)) {
            return b;
        }
        if (c != null && a(c, (java.util.List) arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new java.lang.IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(defpackage.mv mvVar, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mvVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.Object a(defpackage.mv mvVar, Fragment lcVar, Fragment lcVar2, boolean z) {
        java.lang.Object A;
        if (lcVar == null || lcVar2 == null) {
            return null;
        }
        if (z) {
            A = lcVar2.B();
        } else {
            A = lcVar.A();
        }
        return mvVar.c(mvVar.b(A));
    }

    private static java.lang.Object a(defpackage.mv mvVar, Fragment lcVar, boolean z) {
        java.lang.Object w;
        if (lcVar == null) {
            return null;
        }
        if (z) {
            w = lcVar.z();
        } else {
            w = lcVar.w();
        }
        return mvVar.b(w);
    }

    private static java.lang.Object b(defpackage.mv mvVar, Fragment lcVar, boolean z) {
        java.lang.Object y;
        if (lcVar == null) {
            return null;
        }
        if (z) {
            y = lcVar.x();
        } else {
            y = lcVar.y();
        }
        return mvVar.b(y);
    }

    private static void a(java.util.ArrayList arrayList, defpackage.qr qrVar, java.util.Collection collection) {
        for (int size = qrVar.size() - 1; size >= 0; size--) {
            android.view.View view = (android.view.View) qrVar.c(size);
            if (collection.contains(ViewCompat.a.t(view))) {
                arrayList.add(view);
            }
        }
    }

    private static defpackage.qr b(defpackage.mv mvVar, defpackage.qr qrVar, java.lang.Object obj, defpackage.mp mpVar) {
        java.util.ArrayList arrayList;
        if (qrVar.isEmpty() || obj == null) {
            qrVar.clear();
            return null;
        }
        Fragment lcVar = mpVar.d;
        defpackage.qr qrVar2 = new defpackage.qr();
        mvVar.a((java.util.Map) qrVar2, lcVar.mView);
        BackStackRecord kvVar = mpVar.f;
        if (mpVar.e) {
            lcVar.G();
            arrayList = kvVar.r;
        } else {
            lcVar.H();
            arrayList = kvVar.q;
        }
        defpackage.qz.a((java.util.Map) qrVar2, (java.util.Collection) arrayList);
        defpackage.qz.a((java.util.Map) qrVar, (java.util.Collection) qrVar2.keySet());
        return qrVar2;
    }

    static defpackage.qr a(defpackage.mv mvVar, defpackage.qr qrVar, java.lang.Object obj, defpackage.mp mpVar) {
        java.util.ArrayList arrayList;
        Fragment lcVar = mpVar.a;
        android.view.View view = lcVar.mView;
        if (qrVar.isEmpty() || obj == null || view == null) {
            qrVar.clear();
            return null;
        }
        defpackage.qr qrVar2 = new defpackage.qr();
        mvVar.a((java.util.Map) qrVar2, view);
        BackStackRecord kvVar = mpVar.c;
        if (mpVar.b) {
            lcVar.H();
            arrayList = kvVar.q;
        } else {
            lcVar.G();
            arrayList = kvVar.r;
        }
        if (arrayList != null) {
            defpackage.qz.a((java.util.Map) qrVar2, (java.util.Collection) arrayList);
            defpackage.qz.a((java.util.Map) qrVar2, qrVar.values());
        }
        for (int size = qrVar.size() - 1; size >= 0; size--) {
            if (!qrVar2.containsKey((java.lang.String) qrVar.c(size))) {
                qrVar.d(size);
            }
        }
        return qrVar2;
    }

    static android.view.View a(defpackage.qr qrVar, defpackage.mp mpVar, java.lang.Object obj, boolean z) {
        java.lang.String str;
        BackStackRecord kvVar = mpVar.c;
        if (obj == null || qrVar == null || kvVar.q == null || kvVar.q.isEmpty()) {
            return null;
        }
        if (z) {
            str = (java.lang.String) kvVar.q.get(0);
        } else {
            str = (java.lang.String) kvVar.r.get(0);
        }
        return (android.view.View) qrVar.get(str);
    }

    private static void a(defpackage.mv mvVar, java.lang.Object obj, java.lang.Object obj2, defpackage.qr qrVar, boolean z, BackStackRecord kvVar) {
        java.lang.String str;
        if (kvVar.q != null && !kvVar.q.isEmpty()) {
            if (z) {
                str = (java.lang.String) kvVar.r.get(0);
            } else {
                str = (java.lang.String) kvVar.q.get(0);
            }
            android.view.View view = (android.view.View) qrVar.get(str);
            mvVar.a(obj, view);
            if (obj2 != null) {
                mvVar.a(obj2, view);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void a(Fragment lcVar, Fragment lcVar2, boolean z) {
        if (z) {
            lcVar2.G();
        } else {
            lcVar.G();
        }
    }

    static java.util.ArrayList a(defpackage.mv mvVar, java.lang.Object obj, Fragment lcVar, java.util.ArrayList arrayList, android.view.View view) {
        java.util.ArrayList arrayList2 = null;
        if (obj != null) {
            arrayList2 = new java.util.ArrayList();
            android.view.View view2 = lcVar.mView;
            if (view2 != null) {
                mvVar.a(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                mvVar.a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    static void a(java.util.ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((android.view.View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static java.lang.Object a(defpackage.mv mvVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, Fragment lcVar, boolean z) {
        if (!(obj == null || obj2 == null || lcVar == null)) {
            if (z) {
                if (lcVar.N != null) {
                    defpackage.le leVar = lcVar.N;
                }
            } else if (lcVar.N != null) {
                defpackage.le leVar2 = lcVar.N;
            }
        }
        return mvVar.a(obj2, obj, obj3);
    }

    private static void a(BackStackRecord kvVar, FragmentTransactionOP kwVar, android.util.SparseArray sparseArray, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        defpackage.mp mpVar;
        defpackage.mp mpVar2;
        Fragment lcVar = kwVar.b;
        if (lcVar != null) {
            int i = lcVar.mFragmentId;
            if (i != 0) {
                switch (z ? a[kwVar.mCmd] : kwVar.mCmd) {
                    case 1:
                    case 7:
                        boolean z8 = z2 ? lcVar.O : !lcVar.m && !lcVar.mHidden;
                        z3 = true;
                        z4 = false;
                        z5 = false;
                        z6 = z8;
                        break;
                    case 3:
                    case 6:
                        boolean z9 = z2 ? !lcVar.m && lcVar.mView != null && lcVar.mView.getVisibility() == 0 && lcVar.Q >= 0.0f : lcVar.m && !lcVar.mHidden;
                        z3 = false;
                        z4 = z9;
                        z5 = true;
                        z6 = false;
                        break;
                    case 4:
                        boolean z10 = z2 ? lcVar.mHiddenChanged && lcVar.m && lcVar.mHidden : lcVar.m && !lcVar.mHidden;
                        z3 = false;
                        z4 = z10;
                        z5 = true;
                        z6 = false;
                        break;
                    case 5:
                        if (!z2) {
                            z7 = lcVar.mHidden;
                        } else if (!lcVar.mHiddenChanged || lcVar.mHidden || !lcVar.m) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        z3 = true;
                        z4 = false;
                        z5 = false;
                        z6 = z7;
                        break;
                    default:
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                        break;
                }
                defpackage.mp mpVar3 = (defpackage.mp) sparseArray.get(i);
                if (z6) {
                    mpVar = a(mpVar3, sparseArray, i);
                    mpVar.a = lcVar;
                    mpVar.b = z;
                    mpVar.c = kvVar;
                } else {
                    mpVar = mpVar3;
                }
                if (!z2 && z3) {
                    if (mpVar != null && mpVar.d == lcVar) {
                        mpVar.d = null;
                    }
                    FragmentManagerImpl lpVar = kvVar.mManager;
                    if (lcVar.d <= 0 && lpVar.d > 0 && !kvVar.mReorderingAllowed) {
                        lpVar.b(lcVar);
                        lpVar.a(lcVar, 1, 0, 0, false);
                    }
                }
                if (!z4 || !(mpVar == null || mpVar.d == null)) {
                    mpVar2 = mpVar;
                } else {
                    mpVar2 = a(mpVar, sparseArray, i);
                    mpVar2.d = lcVar;
                    mpVar2.e = z;
                    mpVar2.f = kvVar;
                }
                if (!z2 && z5 && mpVar2 != null && mpVar2.a == lcVar) {
                    mpVar2.a = null;
                }
            }
        }
    }

    private static defpackage.mp a(defpackage.mp mpVar, android.util.SparseArray sparseArray, int i) {
        if (mpVar != null) {
            return mpVar;
        }
        defpackage.mp mpVar2 = new defpackage.mp();
        sparseArray.put(i, mpVar2);
        return mpVar2;
    }
}
