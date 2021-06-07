package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mq  reason: default package */
/* compiled from: PG */
final class mq extends mv {
    mq() {
    }

    @Override // defpackage.mv
    public final boolean a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.mv
    public final Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.mv
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.mv
    public final void a(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((List) targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        a(transitionSet, arrayList);
    }

    @Override // defpackage.mv
    public final void a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((Transition) obj).setEpicenterCallback(new mr(rect));
        }
    }

    @Override // defpackage.mv
    public final void a(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    a(transitionSet.getTransitionAt(i), arrayList);
                }
            } else if (!a(transition) && a((List) transition.getTargets())) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transition.addTarget((View) arrayList.get(i2));
                }
            }
        }
    }

    private static boolean a(Transition transition) {
        return !a(transition.getTargetIds()) || !a(transition.getTargetNames()) || !a(transition.getTargetTypes());
    }

    @Override // defpackage.mv
    public final Object a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // defpackage.mv
    public final void b(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new ms(view, arrayList));
    }

    @Override // defpackage.mv
    public final void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.mv
    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new mt(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.mv
    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            b(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.mv
    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                b(transitionSet.getTransitionAt(i), arrayList, arrayList2);
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition.addTarget((View) arrayList2.get(i2));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.mv
    public final void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // defpackage.mv
    public final void c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // defpackage.mv
    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new mu(rect));
        }
    }
}
