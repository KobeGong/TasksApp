package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* renamed from: cfb  reason: default package */
/* compiled from: PG */
public final class cfb {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final cdf d;
    private final cei e;

    cfb(View view, cdf cdf, cei cei) {
        this.a = (ImageView) view.findViewById(R.id.account_avatar);
        this.b = (TextView) view.findViewById(R.id.account_display_name);
        this.c = (TextView) view.findViewById(R.id.account_name);
        this.d = (cdf) cky.a(cdf);
        this.e = (cei) cky.a(cei);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        boolean z;
        int i = 0;
        this.e.a(this.a, obj, this.a.getWidth());
        String b2 = ((cdu) obj).b();
        String a2 = b2 == null ? null : a((CharSequence) b2);
        String a3 = ((cdu) obj).a();
        String a4 = a3 == null ? a2 : a((CharSequence) a3);
        this.b.setText(a4);
        if (a2 == null || a2.equals(a4)) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.c;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (z) {
            this.c.setText(a2);
        }
    }

    private static String a(CharSequence charSequence) {
        return charSequence.toString().replace('-', (char) 8209);
    }
}
