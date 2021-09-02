package defpackage;

/* renamed from: ai reason: default package */
/* compiled from: PG */
public final class ai extends android.app.Fragment {
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(defpackage.v.ON_CREATE);
    }

    public final void onStart() {
        super.onStart();
        a(defpackage.v.ON_START);
    }

    public final void onResume() {
        super.onResume();
        a(defpackage.v.ON_RESUME);
    }

    public final void onPause() {
        super.onPause();
        a(defpackage.v.ON_PAUSE);
    }

    public final void onStop() {
        super.onStop();
        a(defpackage.v.ON_STOP);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(defpackage.v.ON_DESTROY);
    }

    private final void a(defpackage.v vVar) {
        android.app.Activity activity = getActivity();
        if (activity instanceof defpackage.aa) {
            ((defpackage.aa) activity).b().a(vVar);
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle a = ((LifecycleOwner) activity).getLifecycle();
            if (a instanceof defpackage.z) {
                ((defpackage.z) a).a(vVar);
            }
        }
    }
}
