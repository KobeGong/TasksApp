package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* renamed from: ai  reason: default package */
/* compiled from: PG */
public final class ai extends Fragment {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(v.ON_CREATE);
    }

    public final void onStart() {
        super.onStart();
        a(v.ON_START);
    }

    public final void onResume() {
        super.onResume();
        a(v.ON_RESUME);
    }

    public final void onPause() {
        super.onPause();
        a(v.ON_PAUSE);
    }

    public final void onStop() {
        super.onStop();
        a(v.ON_STOP);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(v.ON_DESTROY);
    }

    private final void a(v vVar) {
        Activity activity = getActivity();
        if (activity instanceof aa) {
            ((aa) activity).b().a(vVar);
        } else if (activity instanceof y) {
            u a = ((y) activity).a();
            if (a instanceof z) {
                ((z) a).a(vVar);
            }
        }
    }
}
