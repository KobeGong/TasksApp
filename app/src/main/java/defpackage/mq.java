package defpackage;

/* renamed from: mq reason: default package */
/* compiled from: PG */
final class mq extends defpackage.mv {
    mq() {
    }

    public final boolean a(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    public final void a(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(targets, (android.view.View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        a((java.lang.Object) transitionSet, arrayList);
    }

    public final void a(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.transition.Transition transition = (android.transition.Transition) obj;
            android.graphics.Rect rect = new android.graphics.Rect();
            a(view, rect);
            transition.setEpicenterCallback(new defpackage.mr(rect));
        }
    }

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition != null) {
            if (transition instanceof android.transition.TransitionSet) {
                android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    a((java.lang.Object) transitionSet.getTransitionAt(i), arrayList);
                }
            } else if (!a(transition) && a(transition.getTargets())) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transition.addTarget((android.view.View) arrayList.get(i2));
                }
            }
        }
    }

    private static boolean a(android.transition.Transition transition) {
        return !a(transition.getTargetIds()) || !a(transition.getTargetNames()) || !a(transition.getTargetTypes());
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((android.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((android.transition.Transition) obj3);
        }
        return transitionSet;
    }

    public final void b(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new defpackage.ms(view, arrayList));
    }

    public final void a(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((android.transition.Transition) obj).addListener(new defpackage.mt(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            b((java.lang.Object) transitionSet, arrayList, arrayList2);
        }
    }

    public final void b(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                b((java.lang.Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
            }
        } else if (!a(transition)) {
            java.util.List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transition.addTarget((android.view.View) arrayList2.get(i2));
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget((android.view.View) arrayList.get(size2));
                }
            }
        }
    }

    public final void b(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).addTarget(view);
        }
    }

    public final void c(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).removeTarget(view);
        }
    }

    public final void a(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((android.transition.Transition) obj).setEpicenterCallback(new defpackage.mu(rect));
        }
    }
}
