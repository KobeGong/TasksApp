package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: tm  reason: default package */
/* compiled from: PG */
public final class tm {
    public static final tm a = new tm(16);
    public final Object b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private tm(int r4) {
        /*
            r3 = this;
            r1 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x0010
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            r0.<init>(r4, r1)
        L_0x000c:
            r3.<init>(r0)
            return
        L_0x0010:
            r0 = r1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.<init>(int):void");
    }

    private tm(Object obj) {
        this.b = obj;
    }

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = null;
        new tm(1);
        new tm(2);
        new tm(4);
        new tm(8);
        new tm(32);
        new tm(64);
        new tm(128);
        new tm(256);
        new tm(512);
        new tm(1024);
        new tm(2048);
        new tm(4096);
        new tm(8192);
        new tm(16384);
        new tm(32768);
        new tm(65536);
        new tm(131072);
        new tm(262144);
        new tm(524288);
        new tm(1048576);
        new tm(2097152);
        new tm(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction = null;
        }
        new tm(accessibilityAction);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction2 = null;
        }
        new tm(accessibilityAction2);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new tm(accessibilityAction3);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction4 = null;
        }
        new tm(accessibilityAction4);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction5 = null;
        }
        new tm(accessibilityAction5);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction6 = null;
        }
        new tm(accessibilityAction6);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction7 = null;
        }
        new tm(accessibilityAction7);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction8 = null;
        }
        new tm(accessibilityAction8);
        if (jd.a()) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction9 = null;
        }
        new tm(accessibilityAction9);
        if (jd.a()) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        new tm(accessibilityAction10);
    }
}
