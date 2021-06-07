package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: uw  reason: default package */
/* compiled from: PG */
public final class uw extends tw {
    private final ListView f;

    public uw(ListView listView) {
        super(listView);
        this.f = listView;
    }

    @Override // defpackage.tw
    public final void a(int i) {
        View childAt;
        ListView listView = this.f;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }

    @Override // defpackage.tw
    public final boolean b() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[RETURN, SYNTHETIC] */
    @Override // defpackage.tw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r7) {
        /*
            r6 = this;
            r0 = 0
            android.widget.ListView r1 = r6.f
            int r2 = r1.getCount()
            if (r2 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            int r3 = r1.getChildCount()
            int r4 = r1.getFirstVisiblePosition()
            int r5 = r4 + r3
            if (r7 <= 0) goto L_0x002a
            if (r5 < r2) goto L_0x0028
            int r2 = r3 + -1
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getBottom()
            int r1 = r1.getHeight()
            if (r2 <= r1) goto L_0x0009
        L_0x0028:
            r0 = 1
            goto L_0x0009
        L_0x002a:
            if (r7 >= 0) goto L_0x0009
            if (r4 > 0) goto L_0x0028
            android.view.View r1 = r1.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0028
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw.b(int):boolean");
    }
}