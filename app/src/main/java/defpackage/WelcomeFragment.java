package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.apps.tasks.R;

/* renamed from: aqa reason: default package */
/* compiled from: PG */
public final class WelcomeFragment extends Fragment {
    public View.OnLayoutChangeListener U;
    public int state;
    public boolean W = true;
    private View getStartView;
    private View signInView;
    private View retryButton;
    public View rootView;
    private View updateGpsView;
    private android.widget.ProgressBar progressBar;
    public FrameLayout buttonBar;

    public static WelcomeFragment newInstance(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("state", i - 1);
        WelcomeFragment aqa = new WelcomeFragment();
        aqa.e(bundle);
        aqa.state = i;
        return aqa;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.rootView = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.welcome_fragment, viewGroup, false);
        this.retryButton = this.rootView.findViewById(R.id.welcome_retry_button);
        this.signInView = this.rootView.findViewById(R.id.welcome_sign_in);
        this.getStartView = this.rootView.findViewById(R.id.welcome_get_started);
        this.updateGpsView = this.rootView.findViewById(R.id.welcome_update_gps);
        this.buttonBar = this.rootView.findViewById(R.id.welcome_button_bar);
        this.retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRetryClick();
            }
        });
        this.signInView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("account_types", new String[]{"com.google"});
                if (mHost == null) {
                    throw new IllegalStateException("Fragment " + WelcomeFragment.this + " not attached to Activity");
                }
                mHost.startActivityForResult(WelcomeFragment.this, intent, -1);
            }
        });
        this.updateGpsView.setOnClickListener(new defpackage.aqd(this));
        this.getStartView.setOnClickListener(new defpackage.aqe(this));
        this.U = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int left, int i2, int i3, int bottom, int i5, int i6, int i7, int i8) {
                if (W && bottom > 0) {
                    W = false;
                    rootView.requestRectangleOnScreen(new Rect(0, bottom - 1, 1, bottom));
                    rootView.removeOnLayoutChangeListener(U);
                }
            }
        };
        if (this.state == 0) {
            this.state = h(bundle);
            if (this.state == 0) {
                this.state = h(this.i);
            }
        }
        invalidateViews();
        return this.rootView;
    }

    public final void onStart() {
        super.onStart();
        this.rootView.removeOnLayoutChangeListener(this.U);
        if (this.W) {
            this.rootView.addOnLayoutChangeListener(this.U);
        }
    }

    public final void onStop() {
        this.rootView.removeOnLayoutChangeListener(this.U);
        super.onStop();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.state != 0) {
            bundle.putInt("state", this.state - 1);
        }
    }

    public final void setState(int state) {
        this.state = state;
        if (this.mView != null) {
            invalidateViews();
        }
    }

    private static int h(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("state")) {
            return 0;
        }
        return bundle.getInt("state") + 1;
    }

    private void invalidateViews() {
        animateViewVisibility(this.signInView, this.state == 1);
        View view = this.retryButton;
        boolean z = this.state == 3;
        animateViewVisibility(view, z);
        View view2 = this.getStartView;
        boolean z2 = this.state == 4;
        animateViewVisibility(view2, z2);
        View view3 = this.updateGpsView;
        boolean z3 = true;
        if (this.state != 5) {
            z3 = false;
        }
        animateViewVisibility(view3, z3);
        if (this.state != 2 && this.progressBar != null) {
            android.widget.ProgressBar progressBar = this.progressBar;
            progressBar.animate().alpha(0.0f).withEndAction(new Runnable() {
                @Override
                public void run() {
                    buttonBar.removeView(progressBar);
                }
            }).start();
            this.progressBar = null;
        } else if (this.state == 2 && this.progressBar == null) {
            this.progressBar = new android.widget.ProgressBar(getContext(), null, 16842873);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.progressBar.setAlpha(0.0f);
            this.buttonBar.addView(this.progressBar, layoutParams);
            this.progressBar.animate().alpha(1.0f).start();
        }
    }

    private static void animateViewVisibility(View view, boolean show) {
        if (view.getVisibility() != View.VISIBLE && !show) {
            return;
        }
        if (show) {
            view.setVisibility(View.VISIBLE);
            view.animate().alpha(1.0f).start();
            return;
        }
        view.animate().alpha(0.0f).withEndAction(new Runnable() {
            @Override
            public void run() {
                view.setVisibility(View.GONE);
            }
        }).start();
    }

    /* access modifiers changed from: 0000 */
    public final void onRetryClick() {
        FragmentActivity j = getActivity();
        if (j instanceof defpackage.aqi) {
            ((defpackage.aqi) j).i();
        }
    }
}
