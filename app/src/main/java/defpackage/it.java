package defpackage;

/* renamed from: it reason: default package */
/* compiled from: PG */
public class it extends defpackage.mv {
    public final boolean a(java.lang.Object obj) {
        return obj instanceof defpackage.je;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (obj != null) {
            return (defpackage.je) ((defpackage.je) obj).clone();
        }
        return null;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.jo joVar = new defpackage.jo();
        joVar.a((defpackage.je) obj);
        return joVar;
    }

    public final void a(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        defpackage.jo joVar = (defpackage.jo) obj;
        java.util.ArrayList arrayList2 = joVar.d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((java.util.List) arrayList2, (android.view.View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a((java.lang.Object) joVar, arrayList);
    }

    public final void a(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            defpackage.je jeVar = (defpackage.je) obj;
            a(view, new android.graphics.Rect());
            jeVar.a(new defpackage.jh(0));
        }
    }

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList) {
        defpackage.je jeVar = (defpackage.je) obj;
        if (jeVar != null) {
            if (jeVar instanceof defpackage.jo) {
                defpackage.jo joVar = (defpackage.jo) jeVar;
                int size = joVar.l.size();
                for (int i = 0; i < size; i++) {
                    a((java.lang.Object) joVar.a(i), arrayList);
                }
            } else if (!a(jeVar) && a((java.util.List) jeVar.d)) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jeVar.b((android.view.View) arrayList.get(i2));
                }
            }
        }
    }

    private static boolean a(defpackage.je jeVar) {
        return !a((java.util.List) jeVar.c) || !a((java.util.List) null) || !a((java.util.List) null);
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.jo joVar = new defpackage.jo();
        if (obj != null) {
            joVar.a((defpackage.je) obj);
        }
        if (obj2 != null) {
            joVar.a((defpackage.je) obj2);
        }
        if (obj3 != null) {
            joVar.a((defpackage.je) obj3);
        }
        return joVar;
    }

    public final void b(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((defpackage.je) obj).a((defpackage.ji) new defpackage.iu(view, arrayList));
    }

    public final void a(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        defpackage.je jeVar = (defpackage.je) obj;
        if (!defpackage.jk.b.contains(viewGroup) && ViewCompat.a.r(viewGroup)) {
            defpackage.jk.b.add(viewGroup);
            if (jeVar == null) {
                jeVar = defpackage.jk.a;
            }
            defpackage.je jeVar2 = (defpackage.je) jeVar.clone();
            java.util.ArrayList arrayList = (java.util.ArrayList) defpackage.jk.a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj2 = arrayList2.get(i);
                    i++;
                    ((defpackage.je) obj2).d(viewGroup);
                }
            }
            if (jeVar2 != null) {
                jeVar2.a(viewGroup, true);
            }
            if (((defpackage.jd) viewGroup.getTag(2131755043)) != null) {
                throw new java.lang.NoSuchMethodError();
            }
            viewGroup.setTag(2131755043, null);
            defpackage.jk.a(viewGroup, jeVar2);
        }
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((defpackage.je) obj).a((defpackage.ji) new defpackage.iv(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        defpackage.jo joVar = (defpackage.jo) obj;
        if (joVar != null) {
            joVar.d.clear();
            joVar.d.addAll(arrayList2);
            b((java.lang.Object) joVar, arrayList, arrayList2);
        }
    }

    public final void b(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        defpackage.je jeVar = (defpackage.je) obj;
        if (jeVar instanceof defpackage.jo) {
            defpackage.jo joVar = (defpackage.jo) jeVar;
            int size = joVar.l.size();
            for (int i = 0; i < size; i++) {
                b((java.lang.Object) joVar.a(i), arrayList, arrayList2);
            }
        } else if (!a(jeVar)) {
            java.util.ArrayList arrayList3 = jeVar.d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jeVar.b((android.view.View) arrayList2.get(i2));
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    jeVar.c((android.view.View) arrayList.get(size3));
                }
            }
        }
    }

    public final void b(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((defpackage.je) obj).b(view);
        }
    }

    public final void c(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((defpackage.je) obj).c(view);
        }
    }

    public final void a(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((defpackage.je) obj).a(new defpackage.jh(0));
        }
    }
}
