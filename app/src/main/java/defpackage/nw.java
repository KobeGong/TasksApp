package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: nw  reason: default package */
/* compiled from: PG */
public final class nw implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public nw(Context context) {
        this.b = context;
    }

    public final nw a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent a2 = jd.a(this.b, componentName);
            while (a2 != null) {
                this.a.add(size, a2);
                a2 = jd.a(this.b, a2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }

    static {
        new ny((byte) 0);
    }
}
