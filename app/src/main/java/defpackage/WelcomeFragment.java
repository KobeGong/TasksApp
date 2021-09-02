package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aqa reason: default package */
/* compiled from: PG */
public final class WelcomeFragment extends Fragment {
    public android.view.View.OnLayoutChangeListener U;
    public int V;
    public boolean W = true;
    private android.view.View X;
    private android.view.View Y;
    private android.view.View Z;
    public android.view.View a;
    private android.view.View aa;
    private android.widget.ProgressBar ab;
    public android.widget.FrameLayout b;

    public static WelcomeFragment d(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("state", i - 1);
        WelcomeFragment aqa = new WelcomeFragment();
        aqa.e(bundle);
        aqa.V = i;
        return aqa;
    }

    public final android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.welcome_fragment, viewGroup, false);
        this.Z = this.a.findViewById(2131755363);
        this.Y = this.a.findViewById(2131755364);
        this.X = this.a.findViewById(2131755365);
        this.aa = this.a.findViewById(2131755366);
        this.b = (android.widget.FrameLayout) this.a.findViewById(2131755362);
        this.Z.setOnClickListener(new defpackage.aqb(this));
        this.Y.setOnClickListener(new defpackage.aqc(this));
        this.aa.setOnClickListener(new defpackage.aqd(this));
        this.X.setOnClickListener(new defpackage.aqe(this));
        this.U = new defpackage.aqf(this);
        if (this.V == 0) {
            this.V = h(bundle);
            if (this.V == 0) {
                this.V = h(this.i);
            }
        }
        N();
        return this.a;
    }

    public final void e() {
        super.e();
        this.a.removeOnLayoutChangeListener(this.U);
        if (this.W) {
            this.a.addOnLayoutChangeListener(this.U);
        }
    }

    public final void f() {
        this.a.removeOnLayoutChangeListener(this.U);
        super.f();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.V != 0) {
            bundle.putInt("state", this.V - 1);
        }
    }

    public final void e(int i) {
        this.V = i;
        if (this.J != null) {
            N();
        }
    }

    private static int h(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("state")) {
            return 0;
        }
        return defpackage.bg.values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UOBGE1PIUT31EDLN6BRLD4NLEPBCCDNMQPA6E9GMERB5DPQ28KRKC5Q6AEO_0()[bundle.getInt("state")];
    }

    private final void N() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        a(this.Y, this.V == defpackage.bg.N);
        android.view.View view = this.Z;
        if (this.V == defpackage.bg.P) {
            z = true;
        } else {
            z = false;
        }
        a(view, z);
        android.view.View view2 = this.X;
        if (this.V == defpackage.bg.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(view2, z2);
        android.view.View view3 = this.aa;
        if (this.V != defpackage.bg.R) {
            z3 = false;
        }
        a(view3, z3);
        if (this.V != defpackage.bg.O && this.ab != null) {
            android.widget.ProgressBar progressBar = this.ab;
            progressBar.animate().alpha(0.0f).withEndAction(new defpackage.aqg(this, progressBar)).start();
            this.ab = null;
        } else if (this.V == defpackage.bg.O && this.ab == null) {
            this.ab = new android.widget.ProgressBar(getContext(), null, 16842873);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.ab.setAlpha(0.0f);
            this.b.addView(this.ab, layoutParams);
            this.ab.animate().alpha(1.0f).start();
        }
    }

    private static void a(android.view.View view, boolean z) {
        if (view.getVisibility() != 0 && !z) {
            return;
        }
        if (z) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).start();
            return;
        }
        view.animate().alpha(0.0f).withEndAction(new defpackage.aqh(view)).start();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        FragmentActivity j = getActivity();
        if (j instanceof defpackage.aqi) {
            ((defpackage.aqi) j).i();
        }
    }
}
