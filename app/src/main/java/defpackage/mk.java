package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: mk  reason: default package */
/* compiled from: PG */
public final class mk {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final mv b = (Build.VERSION.SDK_INT >= 21 ? new mq() : null);
    private static final mv c = a();

    private static mv a() {
        try {
            return (mv) Class.forName("it").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static void a(lp lpVar, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        Object obj;
        Object obj2;
        Object a2;
        Rect rect;
        lc lcVar;
        lc lcVar2;
        mv a3;
        Object obj3;
        Object a4;
        Rect rect2;
        View view;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (lpVar.d > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                kv kvVar = (kv) arrayList.get(i3);
                if (!((Boolean) arrayList2.get(i3)).booleanValue()) {
                    int size = kvVar.b.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        a(kvVar, (kw) kvVar.b.get(i4), sparseArray, false, z);
                    }
                } else if (kvVar.a.f.a()) {
                    for (int size2 = kvVar.b.size() - 1; size2 >= 0; size2--) {
                        a(kvVar, (kw) kvVar.b.get(size2), sparseArray, true, z);
                    }
                }
            }
            if (sparseArray.size() != 0) {
                View view2 = new View(lpVar.e.b);
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    qr qrVar = new qr();
                    for (int i6 = i2 - 1; i6 >= i; i6--) {
                        kv kvVar2 = (kv) arrayList.get(i6);
                        if (kvVar2.b(keyAt)) {
                            boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
                            if (kvVar2.q != null) {
                                int size4 = kvVar2.q.size();
                                if (booleanValue) {
                                    arrayList3 = kvVar2.q;
                                    arrayList4 = kvVar2.r;
                                } else {
                                    ArrayList arrayList5 = kvVar2.q;
                                    arrayList3 = kvVar2.r;
                                    arrayList4 = arrayList5;
                                }
                                for (int i7 = 0; i7 < size4; i7++) {
                                    String str = (String) arrayList4.get(i7);
                                    String str2 = (String) arrayList3.get(i7);
                                    String str3 = (String) qrVar.remove(str2);
                                    if (str3 != null) {
                                        qrVar.put(str, str3);
                                    } else {
                                        qrVar.put(str, str2);
                                    }
                                }
                            }
                        }
                    }
                    mp mpVar = (mp) sparseArray.valueAt(i5);
                    if (z) {
                        ViewGroup viewGroup = lpVar.f.a() ? (ViewGroup) lpVar.f.a(keyAt) : null;
                        if (!(viewGroup == null || (a3 = a((lcVar2 = mpVar.d), (lcVar = mpVar.a))) == null)) {
                            boolean z2 = mpVar.b;
                            boolean z3 = mpVar.e;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            Object a5 = a(a3, lcVar, z2);
                            Object b2 = b(a3, lcVar2, z3);
                            lc lcVar3 = mpVar.a;
                            lc lcVar4 = mpVar.d;
                            if (lcVar3 != null) {
                                lcVar3.J.setVisibility(0);
                            }
                            if (lcVar3 == null || lcVar4 == null) {
                                obj3 = null;
                            } else {
                                boolean z4 = mpVar.b;
                                if (qrVar.isEmpty()) {
                                    a4 = null;
                                } else {
                                    a4 = a(a3, lcVar3, lcVar4, z4);
                                }
                                qr b3 = b(a3, qrVar, a4, mpVar);
                                qr a6 = a(a3, qrVar, a4, mpVar);
                                if (qrVar.isEmpty()) {
                                    a4 = null;
                                    if (b3 != null) {
                                        b3.clear();
                                    }
                                    if (a6 != null) {
                                        a6.clear();
                                    }
                                } else {
                                    a(arrayList7, b3, qrVar.keySet());
                                    a(arrayList6, a6, qrVar.values());
                                }
                                if (a5 == null && b2 == null && a4 == null) {
                                    obj3 = null;
                                } else {
                                    a(lcVar3, lcVar4, z4);
                                    if (a4 != null) {
                                        arrayList6.add(view2);
                                        a3.a(a4, view2, arrayList7);
                                        a(a3, a4, b2, b3, mpVar.e, mpVar.f);
                                        rect2 = new Rect();
                                        view = a(a6, mpVar, a5, z4);
                                        if (view != null) {
                                            a3.a(a5, rect2);
                                        }
                                    } else {
                                        rect2 = null;
                                        view = null;
                                    }
                                    nt.a(viewGroup, new mn(lcVar3, lcVar4, z4, a6, view, rect2));
                                    obj3 = a4;
                                }
                            }
                            if (a5 != null || obj3 != null || b2 != null) {
                                ArrayList a7 = a(a3, b2, lcVar2, arrayList7, view2);
                                ArrayList a8 = a(a3, a5, lcVar, arrayList6, view2);
                                a(a8, 4);
                                Object a9 = a(a3, a5, b2, obj3, lcVar, z2);
                                if (a9 != null) {
                                    if (lcVar2 != null && b2 != null && lcVar2.m && lcVar2.C && lcVar2.P) {
                                        lcVar2.b(true);
                                        a3.b(b2, lcVar2.J, a7);
                                        nt.a(lcVar2.I, new ml(a7));
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    int size5 = arrayList6.size();
                                    for (int i8 = 0; i8 < size5; i8++) {
                                        View view3 = (View) arrayList6.get(i8);
                                        arrayList8.add(sn.a.t(view3));
                                        sn.a(view3, (String) null);
                                    }
                                    a3.a(a9, a5, a8, b2, a7, obj3, arrayList6);
                                    a3.a(viewGroup, a9);
                                    int size6 = arrayList6.size();
                                    ArrayList arrayList9 = new ArrayList();
                                    for (int i9 = 0; i9 < size6; i9++) {
                                        View view4 = (View) arrayList7.get(i9);
                                        String t = sn.a.t(view4);
                                        arrayList9.add(t);
                                        if (t != null) {
                                            sn.a(view4, (String) null);
                                            String str4 = (String) qrVar.get(t);
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= size6) {
                                                    break;
                                                } else if (str4.equals(arrayList8.get(i10))) {
                                                    sn.a((View) arrayList6.get(i10), t);
                                                    break;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                    nt.a(viewGroup, new mw(size6, arrayList6, arrayList8, arrayList7, arrayList9));
                                    a(a8, 0);
                                    a3.a(obj3, arrayList7, arrayList6);
                                }
                            }
                        }
                    } else {
                        ViewGroup viewGroup2 = lpVar.f.a() ? (ViewGroup) lpVar.f.a(keyAt) : null;
                        if (viewGroup2 != null) {
                            lc lcVar5 = mpVar.a;
                            lc lcVar6 = mpVar.d;
                            mv a10 = a(lcVar6, lcVar5);
                            if (a10 != null) {
                                boolean z5 = mpVar.b;
                                boolean z6 = mpVar.e;
                                Object a11 = a(a10, lcVar5, z5);
                                Object b4 = b(a10, lcVar6, z6);
                                ArrayList arrayList10 = new ArrayList();
                                ArrayList arrayList11 = new ArrayList();
                                lc lcVar7 = mpVar.a;
                                lc lcVar8 = mpVar.d;
                                if (lcVar7 == null || lcVar8 == null) {
                                    obj = null;
                                } else {
                                    boolean z7 = mpVar.b;
                                    if (qrVar.isEmpty()) {
                                        a2 = null;
                                    } else {
                                        a2 = a(a10, lcVar7, lcVar8, z7);
                                    }
                                    qr b5 = b(a10, qrVar, a2, mpVar);
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
                                            rect = new Rect();
                                            a10.a(a2, view2, arrayList10);
                                            a(a10, a2, b4, b5, mpVar.e, mpVar.f);
                                            if (a11 != null) {
                                                a10.a(a11, rect);
                                            }
                                        } else {
                                            rect = null;
                                        }
                                        nt.a(viewGroup2, new mo(a10, qrVar, a2, mpVar, arrayList11, view2, lcVar7, lcVar8, z7, arrayList10, a11, rect));
                                        obj = a2;
                                    }
                                }
                                if (a11 != null || obj != null || b4 != null) {
                                    ArrayList a12 = a(a10, b4, lcVar6, arrayList10, view2);
                                    if (a12 == null || a12.isEmpty()) {
                                        obj2 = null;
                                    } else {
                                        obj2 = b4;
                                    }
                                    a10.b(a11, view2);
                                    Object a13 = a(a10, a11, obj2, obj, lcVar5, mpVar.b);
                                    if (a13 != null) {
                                        ArrayList arrayList12 = new ArrayList();
                                        a10.a(a13, a11, arrayList12, obj2, a12, obj, arrayList11);
                                        nt.a(viewGroup2, new mm(a11, a10, view2, lcVar5, arrayList11, arrayList12, a12, obj2));
                                        nt.a(viewGroup2, new mx(arrayList11, qrVar));
                                        a10.a(viewGroup2, a13);
                                        nt.a(viewGroup2, new my(arrayList11, qrVar));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static mv a(lc lcVar, lc lcVar2) {
        ArrayList arrayList = new ArrayList();
        if (lcVar != null) {
            Object y = lcVar.y();
            if (y != null) {
                arrayList.add(y);
            }
            Object x = lcVar.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object B = lcVar.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (lcVar2 != null) {
            Object w = lcVar2.w();
            if (w != null) {
                arrayList.add(w);
            }
            Object z = lcVar2.z();
            if (z != null) {
                arrayList.add(z);
            }
            lcVar2.A();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (b != null && a(b, arrayList)) {
            return b;
        }
        if (c != null && a(c, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(mv mvVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mvVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(mv mvVar, lc lcVar, lc lcVar2, boolean z) {
        Object A;
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

    private static Object a(mv mvVar, lc lcVar, boolean z) {
        Object w;
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

    private static Object b(mv mvVar, lc lcVar, boolean z) {
        Object y;
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

    private static void a(ArrayList arrayList, qr qrVar, Collection collection) {
        for (int size = qrVar.size() - 1; size >= 0; size--) {
            View view = (View) qrVar.c(size);
            if (collection.contains(sn.a.t(view))) {
                arrayList.add(view);
            }
        }
    }

    private static qr b(mv mvVar, qr qrVar, Object obj, mp mpVar) {
        ArrayList arrayList;
        if (qrVar.isEmpty() || obj == null) {
            qrVar.clear();
            return null;
        }
        lc lcVar = mpVar.d;
        qr qrVar2 = new qr();
        mvVar.a((Map) qrVar2, lcVar.J);
        kv kvVar = mpVar.f;
        if (mpVar.e) {
            lcVar.G();
            arrayList = kvVar.r;
        } else {
            lcVar.H();
            arrayList = kvVar.q;
        }
        qz.a((Map) qrVar2, (Collection) arrayList);
        qz.a((Map) qrVar, (Collection) qrVar2.keySet());
        return qrVar2;
    }

    static qr a(mv mvVar, qr qrVar, Object obj, mp mpVar) {
        ArrayList arrayList;
        lc lcVar = mpVar.a;
        View view = lcVar.J;
        if (qrVar.isEmpty() || obj == null || view == null) {
            qrVar.clear();
            return null;
        }
        qr qrVar2 = new qr();
        mvVar.a((Map) qrVar2, view);
        kv kvVar = mpVar.c;
        if (mpVar.b) {
            lcVar.H();
            arrayList = kvVar.q;
        } else {
            lcVar.G();
            arrayList = kvVar.r;
        }
        if (arrayList != null) {
            qz.a((Map) qrVar2, (Collection) arrayList);
            qz.a((Map) qrVar2, qrVar.values());
        }
        for (int size = qrVar.size() - 1; size >= 0; size--) {
            if (!qrVar2.containsKey((String) qrVar.c(size))) {
                qrVar.d(size);
            }
        }
        return qrVar2;
    }

    static View a(qr qrVar, mp mpVar, Object obj, boolean z) {
        String str;
        kv kvVar = mpVar.c;
        if (obj == null || qrVar == null || kvVar.q == null || kvVar.q.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) kvVar.q.get(0);
        } else {
            str = (String) kvVar.r.get(0);
        }
        return (View) qrVar.get(str);
    }

    private static void a(mv mvVar, Object obj, Object obj2, qr qrVar, boolean z, kv kvVar) {
        String str;
        if (kvVar.q != null && !kvVar.q.isEmpty()) {
            if (z) {
                str = (String) kvVar.r.get(0);
            } else {
                str = (String) kvVar.q.get(0);
            }
            View view = (View) qrVar.get(str);
            mvVar.a(obj, view);
            if (obj2 != null) {
                mvVar.a(obj2, view);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void a(lc lcVar, lc lcVar2, boolean z) {
        if (z) {
            lcVar2.G();
        } else {
            lcVar.G();
        }
    }

    static ArrayList a(mv mvVar, Object obj, lc lcVar, ArrayList arrayList, View view) {
        ArrayList arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = lcVar.J;
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

    static void a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static Object a(mv mvVar, Object obj, Object obj2, Object obj3, lc lcVar, boolean z) {
        if (!(obj == null || obj2 == null || lcVar == null)) {
            if (z) {
                if (lcVar.N != null) {
                    le leVar = lcVar.N;
                }
            } else if (lcVar.N != null) {
                le leVar2 = lcVar.N;
            }
        }
        return mvVar.a(obj2, obj, obj3);
    }

    private static void a(kv kvVar, kw kwVar, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        mp mpVar;
        mp mpVar2;
        lc lcVar = kwVar.b;
        if (lcVar != null && (i = lcVar.A) != 0) {
            switch (z ? a[kwVar.a] : kwVar.a) {
                case 1:
                case 7:
                    if (z2) {
                        z9 = lcVar.O;
                    } else {
                        z9 = !lcVar.m && !lcVar.C;
                    }
                    z4 = true;
                    z5 = false;
                    z6 = false;
                    z7 = z9;
                    break;
                case 2:
                default:
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    break;
                case 3:
                case 6:
                    if (z2) {
                        z3 = !lcVar.m && lcVar.J != null && lcVar.J.getVisibility() == 0 && lcVar.Q >= 0.0f;
                    } else {
                        z3 = lcVar.m && !lcVar.C;
                    }
                    z4 = false;
                    z5 = z3;
                    z6 = true;
                    z7 = false;
                    break;
                case 4:
                    if (z2) {
                        z8 = lcVar.P && lcVar.m && lcVar.C;
                    } else {
                        z8 = lcVar.m && !lcVar.C;
                    }
                    z4 = false;
                    z5 = z8;
                    z6 = true;
                    z7 = false;
                    break;
                case 5:
                    if (!z2) {
                        z10 = lcVar.C;
                    } else if (!lcVar.P || lcVar.C || !lcVar.m) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z4 = true;
                    z5 = false;
                    z6 = false;
                    z7 = z10;
                    break;
            }
            mp mpVar3 = (mp) sparseArray.get(i);
            if (z7) {
                mpVar = a(mpVar3, sparseArray, i);
                mpVar.a = lcVar;
                mpVar.b = z;
                mpVar.c = kvVar;
            } else {
                mpVar = mpVar3;
            }
            if (!z2 && z4) {
                if (mpVar != null && mpVar.d == lcVar) {
                    mpVar.d = null;
                }
                lp lpVar = kvVar.a;
                if (lcVar.d <= 0 && lpVar.d > 0 && !kvVar.s) {
                    lpVar.b(lcVar);
                    lpVar.a(lcVar, 1, 0, 0, false);
                }
            }
            if (!z5 || !(mpVar == null || mpVar.d == null)) {
                mpVar2 = mpVar;
            } else {
                mpVar2 = a(mpVar, sparseArray, i);
                mpVar2.d = lcVar;
                mpVar2.e = z;
                mpVar2.f = kvVar;
            }
            if (!z2 && z6 && mpVar2 != null && mpVar2.a == lcVar) {
                mpVar2.a = null;
            }
        }
    }

    private static mp a(mp mpVar, SparseArray sparseArray, int i) {
        if (mpVar != null) {
            return mpVar;
        }
        mp mpVar2 = new mp();
        sparseArray.put(i, mpVar2);
        return mpVar2;
    }
}
