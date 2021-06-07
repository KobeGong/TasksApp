package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

@Deprecated
/* renamed from: ee  reason: default package */
/* compiled from: PG */
public class ee extends xg {
    public boolean a;
    public boolean b;
    public boolean c;
    private BottomSheetBehavior d;
    private ea e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ee(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 2130771970(0x7f010002, float:1.7147045E38)
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L_0x0029
            int r6 = r0.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r4.a = r3
            r4.b = r3
            ea r0 = new ea
            r0.<init>(r4)
            r4.e = r0
            r4.a()
            return
        L_0x0029:
            r6 = 2132017584(0x7f1401b0, float:1.967345E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, defpackage.xg
    public void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.xg
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, defpackage.xg
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // defpackage.xg
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            if (this.d != null) {
                this.d.e = z;
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.d != null) {
            this.d.b(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private final View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof ha)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        gx gxVar = ((ha) layoutParams2).a;
        if (!(gxVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        this.d = (BottomSheetBehavior) gxVar;
        this.d.k = this.e;
        this.d.e = this.a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ef(this));
        sn.a(frameLayout2, new eg(this));
        frameLayout2.setOnTouchListener(new eh());
        return frameLayout;
    }

    public ee(Context context, int i, byte b2) {
        this(context, i);
    }
}
