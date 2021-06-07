package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: it  reason: default package */
/* compiled from: PG */
public class it extends mv {
    @Override // defpackage.mv
    public final boolean a(Object obj) {
        return obj instanceof je;
    }

    @Override // defpackage.mv
    public final Object b(Object obj) {
        if (obj != null) {
            return (je) ((je) obj).clone();
        }
        return null;
    }

    @Override // defpackage.mv
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        jo joVar = new jo();
        joVar.a((je) obj);
        return joVar;
    }

    @Override // defpackage.mv
    public final void a(Object obj, View view, ArrayList arrayList) {
        jo joVar = (jo) obj;
        ArrayList arrayList2 = joVar.d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(joVar, arrayList);
    }

    @Override // defpackage.mv
    public final void a(Object obj, View view) {
        if (view != null) {
            a(view, new Rect());
            ((je) obj).a(new jh((byte) 0));
        }
    }

    @Override // defpackage.mv
    public final void a(Object obj, ArrayList arrayList) {
        je jeVar = (je) obj;
        if (jeVar != null) {
            if (jeVar instanceof jo) {
                jo joVar = (jo) jeVar;
                int size = joVar.l.size();
                for (int i = 0; i < size; i++) {
                    a(joVar.a(i), arrayList);
                }
            } else if (!a(jeVar) && a((List) jeVar.d)) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jeVar.b((View) arrayList.get(i2));
                }
            }
        }
    }

    private static boolean a(je jeVar) {
        return !a(jeVar.c) || !a(null) || !a(null);
    }

    @Override // defpackage.mv
    public final Object a(Object obj, Object obj2, Object obj3) {
        jo joVar = new jo();
        if (obj != null) {
            joVar.a((je) obj);
        }
        if (obj2 != null) {
            joVar.a((je) obj2);
        }
        if (obj3 != null) {
            joVar.a((je) obj3);
        }
        return joVar;
    }

    @Override // defpackage.mv
    public final void b(Object obj, View view, ArrayList arrayList) {
        ((je) obj).a(new iu(view, arrayList));
    }

    @Override // defpackage.mv
    public final void a(ViewGroup viewGroup, Object obj) {
        je jeVar = (je) obj;
        if (!jk.b.contains(viewGroup) && sn.a.r(viewGroup)) {
            jk.b.add(viewGroup);
            if (jeVar == null) {
                jeVar = jk.a;
            }
            je jeVar2 = (je) jeVar.clone();
            ArrayList arrayList = (ArrayList) jk.a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((je) obj2).d(viewGroup);
                }
            }
            if (jeVar2 != null) {
                jeVar2.a(viewGroup, true);
            }
            if (((jd) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw new NoSuchMethodError();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            jk.a(viewGroup, jeVar2);
        }
    }

    @Override // defpackage.mv
    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((je) obj).a(new iv(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.mv
    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        jo joVar = (jo) obj;
        if (joVar != null) {
            joVar.d.clear();
            joVar.d.addAll(arrayList2);
            b(joVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.mv
    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        je jeVar = (je) obj;
        if (jeVar instanceof jo) {
            jo joVar = (jo) jeVar;
            int size = joVar.l.size();
            for (int i = 0; i < size; i++) {
                b(joVar.a(i), arrayList, arrayList2);
            }
        } else if (!a(jeVar)) {
            ArrayList arrayList3 = jeVar.d;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jeVar.b((View) arrayList2.get(i2));
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    jeVar.c((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // defpackage.mv
    public final void b(Object obj, View view) {
        if (obj != null) {
            ((je) obj).b(view);
        }
    }

    @Override // defpackage.mv
    public final void c(Object obj, View view) {
        if (obj != null) {
            ((je) obj).c(view);
        }
    }

    @Override // defpackage.mv
    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((je) obj).a(new jh((char) 0));
        }
    }
}
