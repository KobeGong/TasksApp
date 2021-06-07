package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: bay  reason: default package */
/* compiled from: PG */
public final class bay extends Fragment implements bax {
    private static WeakHashMap a = new WeakHashMap();
    private Map b = new qr();
    private int c = 0;
    private Bundle d;

    public static bay a(Activity activity) {
        bay bay;
        WeakReference weakReference = (WeakReference) a.get(activity);
        if (weakReference == null || (bay = (bay) weakReference.get()) == null) {
            try {
                bay = (bay) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (bay == null || bay.isRemoving()) {
                    bay = new bay();
                    activity.getFragmentManager().beginTransaction().add(bay, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                a.put(activity, new WeakReference(bay));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return bay;
    }

    @Override // defpackage.bax
    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.b.get(str));
    }

    @Override // defpackage.bax
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c > 0) {
                new Handler(Looper.getMainLooper()).post(new baz(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // defpackage.bax
    public final Activity g_() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Map.Entry entry : this.b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
