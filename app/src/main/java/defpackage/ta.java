package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.tasks.R;

/* renamed from: ta  reason: default package */
/* compiled from: PG */
public class ta {
    ta() {
    }

    public boolean a(ViewGroup viewGroup) {
        Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && sn.a.t(viewGroup) == null) ? false : true;
    }

    ta(byte b) {
        this();
    }
}
