package defpackage;

/* renamed from: lb reason: default package */
/* compiled from: PG */
public class lb extends Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private int U = 0;
    private boolean V = true;
    private int W = -1;
    private android.app.Dialog X;
    private boolean Y;
    private boolean Z;
    public int a = 0;
    private boolean aa;
    public boolean b = true;

    public final void a(defpackage.ln lnVar, java.lang.String str) {
        this.Z = false;
        this.aa = true;
        defpackage.mj a2 = lnVar.a();
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
            defpackage.mj a2 = this.t.a();
            a2.c(this);
            if (z) {
                a2.c();
            } else {
                a2.b();
            }
        }
    }

    public void a(android.content.Context context) {
        super.a(context);
        if (!this.aa) {
            this.Z = false;
        }
    }

    public final void d() {
        super.d();
        if (!this.aa && !this.Z) {
            this.Z = true;
        }
    }

    public final void a(android.os.Bundle bundle) {
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

    public final android.view.LayoutInflater b(android.os.Bundle bundle) {
        if (!this.b) {
            return super.b(bundle);
        }
        this.X = c();
        if (this.X == null) {
            return (android.view.LayoutInflater) this.u.mContext.getSystemService("layout_inflater");
        }
        a(this.X, this.U);
        return (android.view.LayoutInflater) this.X.getContext().getSystemService("layout_inflater");
    }

    public void a(android.app.Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public android.app.Dialog c() {
        return new android.app.Dialog(getActivity(), this.a);
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (!this.Y) {
            a(true);
        }
    }

    public void c(android.os.Bundle bundle) {
        super.c(bundle);
        if (this.b) {
            android.view.View view = this.J;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
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
            if (bundle != null) {
                android.os.Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.X.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public final void e() {
        super.e();
        if (this.X != null) {
            this.Y = false;
            this.X.show();
        }
    }

    public void d(android.os.Bundle bundle) {
        super.d(bundle);
        if (this.X != null) {
            android.os.Bundle onSaveInstanceState = this.X.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
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

    public final void f() {
        super.f();
        if (this.X != null) {
            this.X.hide();
        }
    }

    public final void g() {
        super.g();
        if (this.X != null) {
            this.Y = true;
            this.X.dismiss();
            this.X = null;
        }
    }
}
