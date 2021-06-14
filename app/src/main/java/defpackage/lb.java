package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: lb  reason: default package */
/* compiled from: PG */
public class lb extends lc implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private int U = 0;
    private boolean V = true;
    private int W = -1;
    private Dialog X;
    private boolean Y;
    private boolean Z;
    public int a = 0;
    private boolean aa;
    public boolean b = true;

    public final void a(ln lnVar, String str) {
        this.Z = false;
        this.aa = true;
        mj a2 = lnVar.a();
        a2.a(this, str);
        a2.b();
    }

    public final void a(boolean z) {
        if (!this.Z) {
            this.Z = true;
            this.aa = false;
            if (this.X != null) {
                this.X.dismiss();
            }
            this.Y = true;
            if (this.W >= 0) {
                this.t.b(this.W);
                this.W = -1;
                return;
            }
            mj a2 = this.t.a();
            a2.c(this);
            if (z) {
                a2.c();
            } else {
                a2.b();
            }
        }
    }

    @Override // defpackage.lc
    public void a(Context context) {
        super.a(context);
        if (!this.aa) {
            this.Z = false;
        }
    }

    @Override // defpackage.lc
    public final void d() {
        super.d();
        if (!this.aa && !this.Z) {
            this.Z = true;
        }
    }

    @Override // defpackage.lc
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.b = this.A == 0;
        if (bundle != null) {
            this.U = bundle.getInt("android:style", 0);
            this.a = bundle.getInt("android:theme", 0);
            this.V = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.W = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.lc
    public final LayoutInflater b(Bundle bundle) {
        if (!this.b) {
            return super.b(bundle);
        }
        this.X = c();
        if (this.X == null) {
            return (LayoutInflater) this.u.b.getSystemService("layout_inflater");
        }
        a(this.X, this.U);
        return (LayoutInflater) this.X.getContext().getSystemService("layout_inflater");
    }

    public void a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            default:
                return;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog c() {
        return new Dialog(getActivity(), this.a);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.Y) {
            a(true);
        }
    }

    @Override // defpackage.lc
    public void c(Bundle bundle) {
        Bundle bundle2;
        super.c(bundle);
        if (this.b) {
            View view = this.J;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.X.setContentView(view);
            }
            FragmentActivity j = getActivity();
            if (j != null) {
                this.X.setOwnerActivity(j);
            }
            this.X.setCancelable(this.V);
            this.X.setOnCancelListener(this);
            this.X.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.X.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        if (this.X != null) {
            this.Y = false;
            this.X.show();
        }
    }

    @Override // defpackage.lc
    public void d(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.d(bundle);
        if (!(this.X == null || (onSaveInstanceState = this.X.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        if (this.U != 0) {
            bundle.putInt("android:style", this.U);
        }
        if (this.a != 0) {
            bundle.putInt("android:theme", this.a);
        }
        if (!this.V) {
            bundle.putBoolean("android:cancelable", this.V);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", this.b);
        }
        if (this.W != -1) {
            bundle.putInt("android:backStackId", this.W);
        }
    }

    @Override // defpackage.lc
    public final void f() {
        super.f();
        if (this.X != null) {
            this.X.hide();
        }
    }

    @Override // defpackage.lc
    public final void g() {
        super.g();
        if (this.X != null) {
            this.Y = true;
            this.X.dismiss();
            this.X = null;
        }
    }
}
