package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: ko  reason: default package */
/* compiled from: PG */
final class ko {
    private final WindowId a;

    ko(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ko) && ((ko) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
