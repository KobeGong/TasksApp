package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: wk  reason: default package */
/* compiled from: PG */
public final class wk extends ArrayAdapter {
    public wk(Context context, int i) {
        super(context, i, 16908308, (Object[]) null);
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final long getItemId(int i) {
        return (long) i;
    }
}
