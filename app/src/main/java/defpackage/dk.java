package defpackage;

/* renamed from: dk reason: default package */
/* compiled from: PG */
public final class dk {
    private static final int[] a = {16843848};

    public static void a(android.view.View view) {
        view.setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
    }

    public static void a(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        android.content.res.TypedArray a2 = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, a, 0, 2132017714);
        try {
            if (a2.hasValue(0)) {
                view.setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context, a2.getResourceId(0, 0)));
            }
        } finally {
            a2.recycle();
        }
    }

    public static void a(android.view.View view, float f) {
        int integer = view.getResources().getInteger(2131820546);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        stateListAnimator.addState(new int[]{16842766, 2130772113, -2130772112}, android.animation.ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration((long) integer));
        stateListAnimator.addState(new int[]{16842766}, android.animation.ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration((long) integer));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
