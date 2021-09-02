package defpackage;

/* renamed from: tm reason: default package */
/* compiled from: PG */
public final class tm {
    public static final defpackage.tm a = new defpackage.tm(16);
    public final java.lang.Object b;

    private tm(int i) {
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            accessibilityAction = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            accessibilityAction = null;
        }
        this((java.lang.Object) accessibilityAction);
    }

    private tm(java.lang.Object obj) {
        this.b = obj;
    }

    static {
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = null;
        new defpackage.tm(1);
        new defpackage.tm(2);
        new defpackage.tm(4);
        new defpackage.tm(8);
        new defpackage.tm(32);
        new defpackage.tm(64);
        new defpackage.tm(128);
        new defpackage.tm(256);
        new defpackage.tm(512);
        new defpackage.tm(1024);
        new defpackage.tm(2048);
        new defpackage.tm(4096);
        new defpackage.tm(8192);
        new defpackage.tm(16384);
        new defpackage.tm(32768);
        new defpackage.tm(65536);
        new defpackage.tm(131072);
        new defpackage.tm(262144);
        new defpackage.tm(524288);
        new defpackage.tm(1048576);
        new defpackage.tm(2097152);
        new defpackage.tm((java.lang.Object) android.os.Build.VERSION.SDK_INT >= 23 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction2 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction2 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction2);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction3 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction3);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction4 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction4 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction4);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction5 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction5 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction5);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            accessibilityAction6 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction6 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction6);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            accessibilityAction7 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction7 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction7);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            accessibilityAction8 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction8 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction8);
        if (defpackage.jd.a()) {
            accessibilityAction9 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction9 = null;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction9);
        if (defpackage.jd.a()) {
            accessibilityAction10 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        new defpackage.tm((java.lang.Object) accessibilityAction10);
    }
}
