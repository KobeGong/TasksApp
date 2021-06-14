package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.tasks.R;

/* renamed from: aqa  reason: default package */
/* compiled from: PG */
public final class aqa extends lc {
    public View.OnLayoutChangeListener U;
    public int V;
    public boolean W = true;
    private View X;
    private View Y;
    private View Z;
    public View a;
    private View aa;
    private ProgressBar ab;
    public FrameLayout b;

    public static aqa d(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("state", i - 1);
        aqa aqa = new aqa();
        aqa.e(bundle);
        aqa.V = i;
        return aqa;
    }

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.welcome_fragment, viewGroup, false);
        this.Z = this.a.findViewById(com.google.android.apps.tasks.R.id.welcome_retry_button);
        this.Y = this.a.findViewById(com.google.android.apps.tasks.R.id.welcome_sign_in);
        this.X = this.a.findViewById(com.google.android.apps.tasks.R.id.welcome_get_started);
        this.aa = this.a.findViewById(com.google.android.apps.tasks.R.id.welcome_update_gps);
        this.b = (FrameLayout) this.a.findViewById(com.google.android.apps.tasks.R.id.welcome_button_bar);
        this.Z.setOnClickListener(new aqb(this));
        this.Y.setOnClickListener(new aqc(this));
        this.aa.setOnClickListener(new aqd(this));
        this.X.setOnClickListener(new aqe(this));
        this.U = new aqf(this);
        if (this.V == 0) {
            this.V = h(bundle);
            if (this.V == 0) {
                this.V = h(this.i);
            }
        }
        N();
        return this.a;
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        this.a.removeOnLayoutChangeListener(this.U);
        if (this.W) {
            this.a.addOnLayoutChangeListener(this.U);
        }
    }

    @Override // defpackage.lc
    public final void f() {
        this.a.removeOnLayoutChangeListener(this.U);
        super.f();
    }

    @Override // defpackage.lc
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
        return bg.values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UOBGE1PIUT31EDLN6BRLD4NLEPBCCDNMQPA6E9GMERB5DPQ28KRKC5Q6AEO_0()[bundle.getInt("state")];
    }

    private final void N() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        a(this.Y, this.V == bg.N);
        View view = this.Z;
        if (this.V == bg.P) {
            z = true;
        } else {
            z = false;
        }
        a(view, z);
        View view2 = this.X;
        if (this.V == bg.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(view2, z2);
        View view3 = this.aa;
        if (this.V != bg.R) {
            z3 = false;
        }
        a(view3, z3);
        if (this.V != bg.O && this.ab != null) {
            ProgressBar progressBar = this.ab;
            progressBar.animate().alpha(0.0f).withEndAction(new aqg(this, progressBar)).start();
            this.ab = null;
        } else if (this.V == bg.O && this.ab == null) {
            this.ab = new ProgressBar(i(), null, 16842873);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.ab.setAlpha(0.0f);
            this.b.addView(this.ab, layoutParams);
            this.ab.animate().alpha(1.0f).start();
        }
    }

    private static void a(View view, boolean z) {
        if (view.getVisibility() != 0 && !z) {
            return;
        }
        if (z) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).start();
            return;
        }
        view.animate().alpha(0.0f).withEndAction(new aqh(view)).start();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        lg j = j();
        if (j instanceof aqi) {
            ((aqi) j).i();
        }
    }
}
