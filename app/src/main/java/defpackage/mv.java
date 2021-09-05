package defpackage;

/* renamed from: mv reason: default package */
/* compiled from: PG */
public abstract class mv {
    public abstract java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract void a(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract void a(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void a(java.lang.Object obj, android.view.View view);

    public abstract void a(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void a(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3);

    public abstract void a(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void a(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract boolean a(java.lang.Object obj);

    public abstract java.lang.Object b(java.lang.Object obj);

    public abstract void b(java.lang.Object obj, android.view.View view);

    public abstract void b(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void b(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract java.lang.Object c(java.lang.Object obj);

    public abstract void c(java.lang.Object obj, android.view.View view);

    public static void a(android.view.View view, android.graphics.Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.ArrayList arrayList, android.view.View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (defpackage.sy.a.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.Map map, android.view.View view) {
        if (view.getVisibility() == 0) {
            java.lang.String t = ViewCompat.a.t(view);
            if (t != null) {
                map.put(t, view);
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void a(java.util.List list, android.view.View view) {
        int size = list.size();
        if (!a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                android.view.View view2 = (android.view.View) list.get(i);
                if (view2 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        android.view.View childAt = viewGroup.getChildAt(i2);
                        if (!a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean a(java.util.List list, android.view.View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(java.util.List list) {
        return list == null || list.isEmpty();
    }
}
